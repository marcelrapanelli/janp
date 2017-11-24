'use strict';

app.controller('WriterController', function($interval, $scope, $rootScope, $http, alert, authToken, $state) {
    var vm = this;

    var textIndex = 0;
    var textLines = [
        "HÁ MUITO TEMPO ATRÁS EM UMA ILHA MUITO DISTANTE..",
        "HAVIA UMA LENDA SOBRE UM PORTAL QUE LEVAVA À UM MUNDO COMPLETAMENTE DIFERENTE DO QUAL CONHECEMOS..",
        "UM MUNDO DOMINADO POR MONSTROS, PELO MAL, PELA GUERRA E PELO ÓDIO..",
        "PAI: POSSO CONTAR COM VOCÊ FILHO?",
        "LUIZINHO: CLARO QUE SIM PAI!",
        "PAI: OTIMO, VOCÊ AINDA SERÁ O MAIOR LINGUICEIRO QUE TODO O MUNDO JA VIU! OBRIGADO FILHO.",
    ];

    var imageLines = [
        "http://orig15.deviantart.net/d2f8/f/2015/043/4/2/brainstorm_school___environment_design_demo_by_brainstormschool-d8hpi4j.jpg",
        "http://orig00.deviantart.net/09f4/f/2009/232/7/d/and_the_gate_opens___by_tonyholmsten.jpg",
        "https://vignette3.wikia.nocookie.net/future/images/4/48/Eiffel_tower_paris_sunset_ruins_apocalypse_artwork_desktop_1280x750_hd-wallpaper-25977.jpg/revision/latest?cb=20141102200554",
        "https://staticdelivery.nexusmods.com/mods/110/images/10955-2-1330076163.jpg",
        "https://staticdelivery.nexusmods.com/mods/110/images/10955-2-1330076163.jpg",
        "https://staticdelivery.nexusmods.com/mods/110/images/10955-2-1330076163.jpg",
    ];

    vm.isLastScript = false;
    vm.shouldDisable = false;

    vm.letteringShow = function() {
        $('#lettering').text("");

        if (textIndex == 0) {
            $('#imagesHere').hide();
        } else {
            $('#imagesHere').fadeOut(1);
        }

        vm.shouldDisable = true;
        var contentToShow = textLines[textIndex].split("");

        var c = 0;
        var writeTimer = $interval(function() {
            if (c == 0) {
                changeImageEffect();
            }
            if (c < contentToShow.length) {
                lettering.append(contentToShow[c]);
                c++;
            } else {
                console.log("Writing Finished", vm.shouldDisable);
                vm.shouldDisable = false;
                $interval.cancel(writeTimer);
            }
        }, 60);
        textIndex++;

        if (textIndex == textLines.length) {
            vm.isLastScript = true;
        }
    };

    var changeImageEffect = function() {
        vm.wierdImage = imageLines[textIndex - 1];
        $('#imagesHere').fadeIn(2000, "swing");
    };

    vm.letteringShow();
});