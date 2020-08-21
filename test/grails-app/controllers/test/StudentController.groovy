package test


import grails.rest.*
import grails.converters.*

class StudentController {
    def StudentService
	static responseFormats = ['json', 'xml']
	
    def index() {

     respond StudentService.list(params,request)

     }

    def show() {
        respond StudentService.single(params,request)
    }

    def save() {
        def student = StudentService.save(params,request)
        respond student
    }

    def update() {
        def student = StudentService.update(params,request)
        respond student
    }

    def delete() {
        def student = StudentService.delete(params,request)
        respond student
    }

}
