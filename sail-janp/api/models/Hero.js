'use strict';
var bcrypt = require('bcrypt-nodejs');

var defaultAttValue = 5;

module.exports = {
    tableName: 'hero',
    attributes: {
        name: {
            type: 'string',
            required: true,
            unique: true
        },
        level: {
            type: 'int',
            defaultsTo: 1
        },
        baseHp: {
            type: 'int',
            required: true,
            defaultsTo: 100
        },
        atack: {
            type: 'int',
            required: true,
            defaultsTo: defaultAttValue
        },
        defense: {
            type: 'int',
            required: true,
            defaultsTo: defaultAttValue
        },
        speed: {
            type: 'int',
            required: true,
            defaultsTo: defaultAttValue
        },
        gold: {
            type: 'int',
            required: true,
            defaultsTo: defaultAttValue
        }
    }
};