package com.janp.justanormalperson.services.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

@Component
public class FileService {

	private static final Logger LOG = LoggerFactory.getLogger(FileService.class);

	public List<File> list(String folder) {
		List<File> result = new ArrayList<>();

		File uploadFolder = new File(folder);

		if (!uploadFolder.isDirectory()) {
			LOG.error("The path " + folder + " is not a folder");
		} else {
			for (File file : uploadFolder.listFiles()) {
				if (file.isFile()) {
					LOG.info("Getting: " + file.getAbsolutePath());
					result.add(file);
				}
			}
		}

		return result;
	}

	public boolean deleteFile(File file){
		return file.delete();
	}
	
	public File convertMultipartToFile(MultipartFile multipartFile) {
		File file = new File(multipartFile.getOriginalFilename());

		try {
			file.createNewFile();
			FileOutputStream fileStream = new FileOutputStream(file);
			fileStream.write(multipartFile.getBytes());
			fileStream.close();
		} catch (IOException e) {
			LOG.error("Error when try parse Multipartfile to File [" + multipartFile.getOriginalFilename() + "]", e);
		}
		return file;
	}

	public File convertMultipartToFile(MultipartFile multipartFile, String folder) {
		String originalFilename = multipartFile.getOriginalFilename();
		LOG.debug("Trying to copy multipartFile [{}] to [{}]", originalFilename, folder);
		grantFolderExists(folder);
		File file = new File(folder + File.separator + originalFilename);

		try {
			file.createNewFile();
			FileOutputStream fileStream = new FileOutputStream(file);
			fileStream.write(multipartFile.getBytes());
			fileStream.close();
		} catch (IOException e) {
			LOG.error("Error when try parse MultipartFile to File [" + originalFilename + "]", e);
			throw new RuntimeException("Error trying to copy MultipartFile [" + originalFilename + "] to folder [" + folder + "]",e);
		}
		return file;
	}

	private void grantFolderExists(String pathToFolder){
		File folder = new File(pathToFolder);
		if(folder.exists()){
			return;
		}else{
			LOG.debug("FOLDER [{}] DOES NOT EXIST. Creating...", pathToFolder);
			folder.mkdirs();
		}
	}

	public void moveFile(final File fileToMove, final String newPath) {
		final Path origin = Paths.get(fileToMove.getPath());
		final Path target = Paths.get(newPath + File.separator + fileToMove.getName());

		LOG.info("Moving " + origin.toString() + " to " + target.toString());

		try {
			final File folder = new File(newPath);
			if (!folder.exists()) {
				folder.mkdirs();
			}
			Files.move(origin, target, StandardCopyOption.REPLACE_EXISTING);
		} catch (final IOException e) {
			throw new RuntimeException("Error moving file: " + fileToMove.getAbsolutePath() + " to " + newPath, e);
		}
	}
}