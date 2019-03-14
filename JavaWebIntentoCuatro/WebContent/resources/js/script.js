

window.onload = function () {

const name = document.getElementById('name');
const cardnumber = document.getElementById('cardnumber');
const cardnumber1 = document.getElementById('cardnumber1');
//const expirationdate = document.getElementById('expirationdate');
// const securitycode = document.getElementById('securitycode');
const output = document.getElementById('output');
const ccicon = document.getElementById('ccicon');
const ccsingle = document.getElementById('ccsingle');
const generatecard = document.getElementById('generatecard');


let cctype = null;

//Mask the Credit Card Number Input
var cardnumber_mask = new IMask(cardnumber, {
    mask: [
        
        {
            mask: '0000 0000 0000 0000',
            cardtype: 'Unknown'
        }
    ],


    dispatch: function (appended, dynamicMasked) {
        var number = (dynamicMasked.value + appended).replace(/\D/g, '');

        for (var i = 0; i < dynamicMasked.compiledMasks.length; i++) {
            let re = new RegExp(dynamicMasked.compiledMasks[i].regex);
            if (number.match(re) != null) {
                return dynamicMasked.compiledMasks[i];
            }
        }
    }
});



var cardnumber1_mask = new IMask(cardnumber1, {
    mask: [
      
        {
            mask: '000000',
            cardtype: 'Unknown'
        }
    ],

  
    dispatch: function (appended, dynamicMasked) {
        var number = (dynamicMasked.value + appended).replace(/\D/g, '');

        for (var i = 0; i < dynamicMasked.compiledMasks.length; i++) {
            let re = new RegExp(dynamicMasked.compiledMasks[i].regex);
            if (number.match(re) != null) {
                return dynamicMasked.compiledMasks[i];
            }
        }
    }
});




//Mask the security code
var securitycode_mask = new IMask(securitycode, {
    mask: 'Recargar',
});


//define the color swap function
const swapColor = function (basecolor) {
    document.querySelectorAll('.lightcolor')
        .forEach(function (input) {
            input.setAttribute('class', '');
            input.setAttribute('class', 'lightcolor ' + basecolor);
        });
    document.querySelectorAll('.darkcolor')
        .forEach(function (input) {
            input.setAttribute('class', '');
            input.setAttribute('class', 'darkcolor ' + basecolor + 'dark');
        });
};




// CREDIT CARD IMAGE JS
 document.querySelector('.preload').classList.remove('preload');



//On Input Change Events
name.addEventListener('input', function () {
 
        document.getElementById('svgname').innerHTML = this.value;
     
});

cardnumber_mask.on('accept', function () {
    if (cardnumber_mask.value.length == 0) {
        document.getElementById('svgnumber').innerHTML = '0000 0000 0000 0000';
    } else {
        document.getElementById('svgnumber').innerHTML = cardnumber_mask.value;
    }
});

//expirationdate_mask.on('accept', function () {
//   
//});


securitycode_mask.on('focus', function () {
    if (securitycode_mask.value.length == 0) {

    } else {
        document.getElementById('svgsecurity').innerHTML = securitycode_mask.value;
    }
});


};

$( '#securitycode' ).click(function() {

  $( this ).toggleClass( 'loading' );
  $('#tarjeta').toggleClass('flipped');
});



