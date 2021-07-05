/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

/**
 *
 * @author ricar
 */
public class Data {
    
    int dia;
    int ano;
    int mes;
    
    
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public Data(int dia, String mes, int ano){
        this.dia = dia;
        switch(mes){
            case "Janeiro":
                this.mes = 1;
            case "Fevereiro":
                this.mes = 2;
            case "Marco":
                this.mes = 3;
            case "Abril":
                this.mes = 4;
            case "Maio":
                this.mes = 5;
            case "Junho":
                this.mes = 6;
            case "Julho":
                this.mes = 7;
            case "Agosto":
                this.mes = 8;
            case "Setembro":
                this.mes = 9;
            case "Outubro":
                this.mes = 10;
            case "Novembro":
                this.mes = 11;
            case "Dezembro":
                this.mes = 12;
        }
        this.ano = ano;
    }
    
    public Data(int dias,int ano){
        this.ano = ano;
        
        int bissexto = 0;
        int resto = ano % 4;
        int resto100 = ano % 100;
        int resto400 = ano % 400;
        
        if ((resto == 0) && (resto100 != 0)){
            bissexto = 1;
        }else{
            if((resto != 0) && (resto400 == 0)){
                bissexto = 1;
            }
        }
        
        if(bissexto == 0){
            if (dias < 32){
                this.mes = 1;
                this.dia = dias;
            }else{
                if(dias >= 32 && dias < 61){
                    this.mes = 2;
                    this.dia = dias - 31;
                }else{
                    if(dias >= 61 && dias < 93){
                        this.mes = 3;
                        this.dia = dias - 60;
                    }else{
                        if(dias >= 93 && dias < 124){
                            this.mes = 4;
                            this.dia = dias - 92;
                        }else{
                            if(dias >= 124 && dias < 156){
                                this.mes = 5;
                                this.dia = dias - 123;
                            }else{
                                if(dias >= 156 && dias < 187){
                                    this.mes = 6;
                                    this.dia = dias - 155;
                                }else{
                                    if(dias >= 187 && dias < 219){
                                        this.mes = 7;
                                        this.dia = dias - 186;
                                    }else{
                                        if(dias >= 219 && dias < 251){
                                            this.mes = 8;
                                            this.dia = dias - 218;
                                        }else{
                                            if(dias >= 251 && dias < 282){
                                                this.mes = 9;
                                                this.dia = dias-250;
                                            }else{
                                                if(dias >= 282 && dias < 314){
                                                    this.mes = 10;
                                                    this.dia = dias - 281;
                                                }else{
                                                    if(dias >= 314 && dias < 345){
                                                        this.mes = 11;
                                                        this.dia = dias - 313;
                                                    }else{
                                                        this.mes = 12;
                                                        this.dia = dias - 344;
                                                    }
                                                }
                                            }
                                        }
                                        
                                    }
                                }
                            }
                        }
                    }
                }
            }
            
        }else{
            if (dias < 32){
                this.mes = 1;
            }else{
                if(dias >= 32 && dias < 62){
                    this.mes = 2;
                    this.dia = dias - 31;
                }else{
                    if(dias >= 62 && dias < 94){
                        this.mes = 3;
                        this.dia = dias - 61;
                    }else{
                        if(dias >= 94 && dias < 125){
                            this.mes = 4;
                            this.dia = dias - 93;
                        }else{
                            if(dias >= 125 && dias < 157){
                                this.mes = 5;
                                this.dia = dias - 124;
                            }else{
                                if(dias >= 157 && dias < 188){
                                    this.mes = 6;
                                    this.dia = dias - 156;
                                }else{
                                    if(dias >= 188 && dias < 220){
                                        this.mes = 7;
                                        this.dia = dias - 187;
                                    }else{
                                        if(dias >= 220 && dias < 252){
                                            this.mes = 8;
                                            this.dia = dias - 219;
                                        }else{
                                            if(dias >= 252 && dias < 283){
                                                this.mes = 9;
                                                this.dia = dias - 251;
                                            }else{
                                                if(dias >= 283 && dias < 315){
                                                    this.mes = 10;
                                                    this.dia = dias - 282;
                                                    
                                                }else{
                                                    if(dias >= 315 && dias < 346){
                                                        this.mes = 11;
                                                        this.dia = dias - 314;
                                                    }else{
                                                        this.mes = 12;
                                                        this.dia = dias - 345;
                                                    }
                                                }
                                            }
                                        }
                                        
                                    }
                                }
                            }
                        }
                    }
                }
            }
            
            
            
        }
    }
    
    String conversaoMes(){
        switch(mes){
            case 1:
                return "Janeiro";
            case 2:
                return "Fevereiro";
            case 3:
                return "Marco";
            case 4:
                return "Abril";
            case 5:
                return "Maio";
            case 6:
                return "Junho";
            case 7:
                return "Julho";
            case 8:
                return "Agosto";
            case 9:
                return "Setembro";
            case 10:
                return "Outubro";
            case 11:
                return "Novembro";
            case 12:
                return "Dezembro";
        }
        return "";
    }
    
    
    int conversaoDiasdoAno(){
        int[] calculo_normal = {0,60,92,123,155,186,218,250,281,313,344};
        int dias = 0;
        int bissexto = ehBissexto();
       
        dias = calculo_normal[mes-1] + dia + bissexto;
        
        return dias;
            
            
            
        }
        
    
    
    int ehBissexto(){
        int bissexto = 0;
        int resto = ano % 4;
        int resto100 = ano % 100;
        int resto400 = ano % 400;
        
        if ((resto == 0) && (resto100 != 0)){
            bissexto = 1;
        }else{
            if((resto != 0) && (resto400 == 0)){
                bissexto = 1;
            }
        }
        
        return bissexto;
    }
    
    
    void imprimirData(){
        String prefixDia = "";
        String prefixMes = "";
        String prefixDias = "";
        if (dia > 9) prefixDia = "0";
        if (mes > 9) prefixMes = "0";
        
        
        int dias = conversaoDiasdoAno();
        
        if (dias > 10 && dias < 100){
            prefixDias = "0";
        }else{
            if(dias < 10){
                prefixDias = "00";
            }
        }
        
        String mesString = conversaoMes();
        
        System.out.println("Data: " + prefixDia + dia + "/" + prefixMes + mes + "/" + ano);
        System.out.println("Data: " + mesString + " " + prefixDia + dia + "," + ano);
        System.out.println("Data: " + prefixDias + " " + ano);
        
        
        
        
    }
    
    
    
    
}
