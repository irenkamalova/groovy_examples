// literal Groovy string in single quote:
print 'Hello World (some quote "") still can be escaped \"\" '

def name = 'Irisha'

println ", my name is $name! Some quote: ' that still can be escapes \' "

def line = "My name is $name"

assert line.strings[0] == 'My name is '
assert line.values[0] == 'Irisha'


// triple form simular to Ruby and Perl
println '''Triple single 'quote" let here quotes
            And multiple lines!!! but \' \" it can'''

println """Triple 'double quote" let also placeHolders: $name
            And multiple lines!!!"""

def i = /x(\d*)y\.? $name /
def j = $/ x(\d*)y\.? $name /$
println i + ' - slashy is for regex'
println j


//How about characters?
char x = 'a'
assert x.getClass() == Character //success

def age = 5
def s = "My age is $age"

assert s.values[0] == 5
assert s.values[0].getClass() == Integer
// Will be failed! :
//assert s.getClass() == String.class

//Pures:
println '-' * 50 + '\n' + 'x' * 50 + '\n' + '-' * 50

println "StringBuffer:"

def fullName = 'Irina'
fullName <<= ' Kamalova'
assert fullName instanceof StringBuffer
String
fullName << ' Pulatovna'
println fullName