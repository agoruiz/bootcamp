function palindrome(str) {
    var checkSpecial = str.replace(/[^A-Za-z0-9]/g, '');
    var checkPalindrome = checkSpecial.split('').reverse().join('');
    return checkSpecial == checkPalindrome;
  }
  console.log(palindrome("_eye"))