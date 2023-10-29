/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.hortadidatica.persistencia;

import javax.swing.JOptionPane;

/**
 *
 * @author danilo
 */
public class ListaInicial {
    
    static DadoPlanta cultivoAlface = new DadoPlanta();
    
    static DadoPlanta cultivoBatata = new DadoPlanta();

    static DadoPlanta cultivoBrocolis = new DadoPlanta();

    static DadoPlanta cultivoCebola = new DadoPlanta(); 
    
    static DadoPlanta cultivoCebolinha = new DadoPlanta(); 

    static DadoPlanta cultivoCenoura = new DadoPlanta(); 

    static DadoPlanta cultivoCouve = new DadoPlanta(); 

    static DadoPlanta cultivoLimaoTaiti = new DadoPlanta(); 
    
    static DadoPlanta cultivoMandioca = new DadoPlanta();

    static DadoPlanta cultivoTomate = new DadoPlanta(); 

    public static void iniciarLista(){
        definirCultivo();
        try{
            DAO plantaDao = new DAO();
            plantaDao.cadastrar(cultivoAlface);
            plantaDao.cadastrar(cultivoBatata);
            plantaDao.cadastrar(cultivoBrocolis);
            plantaDao.cadastrar(cultivoCebola);
            plantaDao.cadastrar(cultivoCebolinha);
            plantaDao.cadastrar(cultivoCenoura);
            plantaDao.cadastrar(cultivoCouve);
            plantaDao.cadastrar(cultivoLimaoTaiti);
            plantaDao.cadastrar(cultivoMandioca);
            plantaDao.cadastrar(cultivoTomate);
            System.out.println("Lista inicial de plantas carregada com sucesso");

        }catch(Exception e){
            System.out.println( "Ocorreu um erro ao cadastrar a planta:\n" + e.getMessage());
        }  
    }
    
    public static void definirCultivo(){
        //Alface
        cultivoAlface.setNomePlanta("Alface");
        cultivoAlface.setFamiliaPlanta("Asteraceae");
        cultivoAlface.setEpocaPlanta("Todo ano");
        cultivoAlface.setTempoPlanta(45);
        cultivoAlface.setIrrigacaoPlanta("Mudas: 1x por dia - Adulto: 3x por semana"); 
        cultivoAlface.setIluminacaoPlanta("Luz Moderada (6hrs/dia)"); 
        cultivoAlface.setNutricionalPlanta("Vitamina A e C, além de sais minerais, como cálcio, ferro, fósforo e fibras. A cada 100g pode conter no maximo 15kcl."); 
        cultivoAlface.setObservacoesCultivo("O cultivo da alface é apropriados em regiões que possuem temperaturas amenas entre 20°C e 25°C. Variações de temperatura extremas podem ser prejudiciais para o desenvolvimento das folhas");
        //Batata
        cultivoBatata.setNomePlanta("Batata");
        cultivoBatata.setFamiliaPlanta("Solanaceae");
        cultivoBatata.setEpocaPlanta("Todo ano");
        cultivoBatata.setTempoPlanta(100);
        cultivoBatata.setIrrigacaoPlanta("Entre 250 e 550 mm. 2x no inverno e maior frequência no verão"); 
        cultivoBatata.setIluminacaoPlanta("Luz solar direta (6hrs/dia)"); 
        cultivoBatata.setNutricionalPlanta("A batata é boa fonte de vitamina C e de algumas vitaminas do complexo B, especialmente niacina, tiamina e vitamina B6"); 
        cultivoBatata.setObservacoesCultivo("A batata inglesa é um tubérculo (caule subterrâneo). Necessita de temperaturas amenas ( 15°C e 20°C) e luz solar direta");
        //Brócolis
        cultivoBrocolis.setNomePlanta("Brócolis");
        cultivoBrocolis.setFamiliaPlanta("Brassicaceae");
        cultivoBrocolis.setEpocaPlanta("Durante o outono ou início da primavera");
        cultivoBrocolis.setTempoPlanta(75);
        cultivoBrocolis.setIrrigacaoPlanta("A cada 4 ou 8 dias"); 
        cultivoBrocolis.setIluminacaoPlanta( "Luz solar direta(6hrs/dia)"); 
        cultivoBrocolis.setNutricionalPlanta("O brocolis e fonte das vitaminas A, C, E e K, além disso e fonte de ferro potássio, cálcio e fósforo."); 
        cultivoBrocolis.setObservacoesCultivo("O brócolis é um vegetal bienal crucífero que pertence que consiste em uma haste grossa cercada por folhas no topo de onde as cabeças verdes crescem. A cabeça consiste em uma massa de pequenas cabeças de flores que desenvolvem pequenas flores com quatro pétalas.");
        //Cebola
        cultivoCebola.setNomePlanta("Cebola");
        cultivoCebola.setFamiliaPlanta("Amaryllidaceae");
        cultivoCebola.setEpocaPlanta("De Março a Novembro");
        cultivoCebola.setTempoPlanta(150);
        cultivoCebola.setIrrigacaoPlanta("2 vezes ao dia"); 
        cultivoCebola.setIluminacaoPlanta( "Luz solar direta (6hrs/dia)"); 
        cultivoCebola.setNutricionalPlanta("A cebola é fonte de vitaminas e minerais, além da alicina, que possui propriedade bioativas antibacterianas, antivirais e antinflamatórias. É também a substância que causa lacrimejamento nos olhos"); 
        cultivoCebola.setObservacoesCultivo("Porção comestível são os catáfilos do bulbo subterrâneo. apresenta variação em formato, cor, pungência, tamanho e conservação pós-colheita.");
        //Cebolinha
        cultivoCebolinha.setNomePlanta("Cebolinha");
        cultivoCebolinha.setFamiliaPlanta("Amaryllidaceae");
        cultivoCebolinha.setEpocaPlanta("de Abril a Julho");
        cultivoCebolinha.setTempoPlanta(80);
        cultivoCebolinha.setIrrigacaoPlanta("2 vezes ao dia"); 
        cultivoCebolinha.setIluminacaoPlanta( "Luz solar direta (6hrs/dia)"); 
        cultivoCebolinha.setNutricionalPlanta("Possui vitamina A, B, C e K, além de diversos minerais e antioxidantes"); 
        cultivoCebolinha.setObservacoesCultivo("Cresce melhor em temperaturas indo de 13°C a 24°C, havendo cultivares que podem suportar baixas temperaturas e outros que podem crescer bem em altas temperaturas. Porém, em regiões de clima quente, não produzem flores ou sementes.");
        //Cenoura
        cultivoCenoura.setNomePlanta("Cenoura");
        cultivoCenoura.setFamiliaPlanta("Apiaceae");        
        cultivoCenoura.setEpocaPlanta("Todo o ano");
        cultivoCenoura.setTempoPlanta(100);
        cultivoCenoura.setIrrigacaoPlanta("Ao menos 1 vez ao dia"); 
        cultivoCenoura.setIluminacaoPlanta( "Luz solar direta (8hrs/dia)"); 
        cultivoCenoura.setNutricionalPlanta("As vitaminas A, C e carotenoides, encontradas na cenoura, são  potentes antioxidantes que protegem as células dos danos rovocados pelos radicais livres, diminuindo o risco de doenças cardiovasculares e câncer."); 
        cultivoCenoura.setObservacoesCultivo("Porção comestível é a raiz tuberosa, tendo como principais características a coloração intensa (devido aos carotenoides) e elevada concentração de carboidratos.");       
        //Couve
        cultivoCouve.setNomePlanta("Couve");
        cultivoCouve.setFamiliaPlanta("Brassicaceae");
        cultivoCouve.setEpocaPlanta("Todo o ano");
        cultivoCouve.setTempoPlanta(75);
        cultivoCouve.setIrrigacaoPlanta("A cada 4 ou 8 dias"); 
        cultivoCouve.setIluminacaoPlanta( "Luz solar direta (6hrs/dia)"); 
        cultivoCouve.setNutricionalPlanta("Possui vitaminas como vitamina C, além de ser rica em ferro, ácido fólico e fibras." ); 
        cultivoCouve.setObservacoesCultivo("Em regiões quentes, a recomendação é cultivar a hortaliça durante o outono e o inverno e em área com parte sombreada. Sob calor acentuado, a qualidade das folhas fica prejudicada, com crescimento reduzido e aparência e sabor alterados.");
        //Limao Taiti
        cultivoLimaoTaiti.setNomePlanta("Limão Taiti");
        cultivoLimaoTaiti.setFamiliaPlanta("Rutaceae");
        cultivoLimaoTaiti.setEpocaPlanta("Todo o ano");
        cultivoLimaoTaiti.setTempoPlanta(120);
        cultivoLimaoTaiti.setIrrigacaoPlanta("Mudas: a cada 3 dias - Adultos: a cada 20 dias"); 
        cultivoLimaoTaiti.setIluminacaoPlanta( "Luz solar direta (Entre 8hrs e 12hrs por dia)"); 
        cultivoLimaoTaiti.setNutricionalPlanta("Rico em vitamina A, B1, B2, B5 e C, ainda traz importantes sais minerais ao organismo, como potássio, cálcio, fósforo, sódio e ferro. Tem ação antibactericida, antioxidante, anti-inflamatória, antiviral, ajuda na digestão, combate vermes, ajuda no combate ao estresse, ansiedade e depressão."); 
        cultivoLimaoTaiti.setObservacoesCultivo("É recomendado para plantios de maior porte usar espaçamentos de 8m x 6m até 7m x 4m para favorecer o arejamento e a iluminação do pomar na fase adulta. É necessário realizar podas de limpeza ao longo do seu crescimento. Quando bem manejada, a limeira Taiti produz 100 quilos de frutos por safra.");
        //Mandioaca
        cultivoMandioca.setNomePlanta("Mandioca");
        cultivoMandioca.setFamiliaPlanta("Mandioca");
        cultivoMandioca.setEpocaPlanta("de Março a Setembro");
        cultivoMandioca.setTempoPlanta(360);
        cultivoMandioca.setIrrigacaoPlanta("A cada 15 dias"); 
        cultivoMandioca.setIluminacaoPlanta( "Luz solar direta (Entre 8hrs e 12hrs por dia)"); 
        cultivoMandioca.setNutricionalPlanta("Rico em substâncias importantes como fibras (ajudando na digestão), potássio, vitamina C, e resveratrol(antioxidante)"); 
        cultivoMandioca.setObservacoesCultivo("É um arbusto, mas as raizes são usadas como alimento. Possui grande capacidade de adaptação a solos mais soltos. Porém, deve-se dar preferência aos solos arenosos, pois além de permitirem o engrossamento das raízes, facilitam a colheita.");
        //Tomate
        cultivoTomate.setNomePlanta("Tomate");
        cultivoTomate.setFamiliaPlanta("Solanaceae");
        cultivoTomate.setEpocaPlanta("Todo ano");
        cultivoTomate.setTempoPlanta(110);
        cultivoTomate.setIrrigacaoPlanta("Mudas: 1x por dia - Adulto: 3x por semana"); 
        cultivoTomate.setIluminacaoPlanta( "Luz solar direta (8hrs por dia)"); 
        cultivoTomate.setNutricionalPlanta("Possui licopeno (caroteno antioxidante),  fibras, vitamina A, vitamina C, vitamina K, complexo B, sais minerais como fósforo, ferro, potássio e magnésio."); 
        cultivoTomate.setObservacoesCultivo("Conforme cresce, precisa ser sustentada para que seus galhos não quebrem, cresce bem em condições moderadas (irrigar mas manter solo drenado, temperatura moderada, etc.)"); 
    }

    
}
