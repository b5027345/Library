package jwilliams

class BootStrap {

    def init = { servletContext ->

/*  def library1 = New Library (

building: 'Sheffield Main Library',
address: '210 Sheffield Road, Sheffield',
openingHours: '09:00 - 22:00',
location: 'Sheffield Centre',
studySpaces: '900'

).save()


def library2 = New Library (

building: 'Hallam Centre Library',
address: '100 Hallam Road, Sheffield',
openingHours: '07:00 - 24:00',
location: 'Hallam Square',
studySpaces: '500'

).save()

def lib1 = New Librarian (

name: 'John Doe',
email: 'j.doe@my.shu.ac.uk',
office: 'Office 42',
userName: 'jDoe',
password: 'password',
telephone: '07931325735',
library: library1

).save()


def lib2 = New Librarian (

name: 'Rebecca Smith',
email: 'r.smith@my.shu.ac.uk',
office: 'Office 5',
userName: 'rSmith',
password: 'password',
telephone: '07461426734',
library: library2

).save()

def cour1 = New Course (

title: 'Computing',
code: 'COM',
leader: 'Matthew Love',
department: 'ACES',
description: 'Computer Technology Course',
studyMode: 'Full Time'

).save()

def cour2 = New Course (

title: 'Art',
code: 'ART',
leader: 'Donald Trump',
department: 'ACES',
description: 'Arts Design Course',
studyMode: 'Full Time'

).save()

def stu1 = New Student (

name: 'John Smith',
email: 'j.smith@my.shu.ac.uk',
userName: 'jSmith',
password: 'password',
studentId: 'b5021876',
course: cour1,
library: library2

).save()

def stu2 = New Student (

name: 'Ken Bone',
email: 'k.bone@my.shu.ac.uk',
userName: 'kBone',
password: 'password',
studentId: 'b5092752',
course: cour2,
library: library1

).save()

def stu3 = New Student (

name: 'David Beckham',
email: 'd.beckham@my.shu.ac.uk',
userName: 'dBeckham',
password: 'password',
studentId: 'b5074839',
course: cour2,
library: library1

).save()

def book1 = New Book (

title: 'Dummys Guide To: Computing',
subject: 'Computing',
author: 'Sherlock Holmes',
isbn: '2298364',
dateBorrowed: new Date('08/02/2017'),
returnDate: new Date('05/03/2017'),
student: stu1,
overdue: false,
library: library2

).save()

def book2 = New Book (

title: 'Dance Dance',
subject: 'Dancing',
author: 'Michael Jackson',
isbn: '2873921',
dateBorrowed: new Date ('15/03/2017'),
returnDate: new Date ('28/03/2017'),
student: stu2,
overdue: false,
library: library1

).save()

def review1 = New BookReview (

book: book2,
dateCreated: new Date('29/03/2017'),
student: stu2,
review: 'I danced more because of this book.'

).save()

def review2 = New BookReview (

book: book1,
dateCreated: new Date('08/03/2017'),
student: stu1,
review: 'This Book made me smart again'

).save()

cour1.addToStudent(stu1)

Stu1.addToBooks(book1)

Stu2.addToBookReviews(book2)

library1.addToBooks(book2)

library2.addToLibrarians(lib2)

library2.addToStudents(Stu1)

Book1.addToBookReviews(review1) 

*/

}

    def destroy = {
    }
}
