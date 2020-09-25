var WidgetApiRest = SuperWidget.extend({

    //método iniciado quando a widget é carregada
    init: function() {
    },
  
    //BIND de eventos
    bindings: {
    	local: {
            'consultar-api': ['click_getAPI']
        },
        global: {}
    },
 
    getAPI: function() {
    	var that = this;
  	  
    	WCMAPI.Read({
    	    type: "GET",
    	    url: WCMAPI.getServerURL() + '/trabalhe_conosco/api/rest/vagas/abertas',
    	    async: true,
    	    success: function funcao(data) {
    	        FLUIGC.toast({
    	        	title: '',
    	        	message: data.chave_1,
    	        	type: 'success'
    	        });
    	    },
    	    
    	    error: function () {
    	        FLUIGC.toast({
    	        	title: '',
    	        	message: 'Erro ao fazer a integração',
    	        	type: 'danger'
    	        });
    	    }
    	});
    }

});

