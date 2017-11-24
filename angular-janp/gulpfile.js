var gulp = require('gulp'),
    browserSync = require('browser-sync');

gulp.task('server', function() {
    var watcher = gulp.watch('app/**/*');
    var indexServerFile = 'index.html';
    console.log("Initializing Server. Index for application based on file '" + indexServerFile + "'");

    browserSync.init({
        server: {
            baseDir: 'app',
            index: indexServerFile
        },
        port: 3004,
        uiPort: 3005
    });

    watcher.on('change', function(event) {
        console.info('File [' + event.path + '] changed, reloading.');
        browserSync.reload();
    });
});

gulp.task('default', ['server'], function() {
    console.log("Gulp started with success.");
});