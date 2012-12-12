package com.thoughtworks.offering.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping( value = "foo" )
final class FooController{

    @Autowired
    IFooService service;

    @RequestMapping( method = RequestMethod.GET )
    @ResponseBody
    public final List<Foo> getAll(){
        return service.getAll();
    }

    @RequestMapping( value = "/{id}", method = RequestMethod.GET )
    @ResponseBody
    public final Foo get( @PathVariable( "id" ) final Long id ){
        return service.getById( id );
    }

    @RequestMapping( method = RequestMethod.POST )
    @ResponseStatus( HttpStatus.CREATED )
    @ResponseBody
    public final Long create( @RequestBody final Foo entity ){
        return service.create( entity );
    }

    @RequestMapping( method = RequestMethod.PUT )
    @ResponseStatus( HttpStatus.OK )
    public final void update( @RequestBody final Foo entity ){
        service.update( entity );
    }

    @RequestMapping( value = "/{id}", method = RequestMethod.DELETE )
    @ResponseStatus( HttpStatus.OK )
    public final void delete( @PathVariable( "id" ) final Long id ){
        service.deleteById( id );
    }

}