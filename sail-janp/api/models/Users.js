'use strict';
var bcrypt = require('bcrypt-nodejs');

module.exports = {
    tableName: 'Users',
    attributes: {
        email: {
            type: 'string',
            required: true,
            unique: true
        },
        password: {
            type: 'string',
            defaultsTo: 'teste@42'
        },
        name: {
            type: 'string',
            required: true
        }
    },
    beforeCreate: function(attributes, next) {
        var pass = attributes.password;
        password.generatePasswordWithBcrypt(pass, function(err, hash) {
            if (err) {
                return next(err);
            }
            attributes.password = hash;
            next();
        });
    }
};