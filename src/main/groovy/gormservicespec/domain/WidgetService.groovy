package gormservicespec.domain

import grails.gorm.services.Service

@Service(Widget)
interface WidgetService {

    List<Widget> list()

    Widget save(int width, int height)
}
