/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yasay
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    int costbir = 10;
    int costiki = 25;
    int costuc = 250;
    int costdort = 2500;
    int costbes = 25000;
    int costalti = 50000;
    int gemcostbir = 10;
    int gemcostiki = 25;
    int gemcostuc = 250;
    int gemcostdort = 2500;
    int gemcostbes = 25000;
    int gemcostalti = 50000;
    int adds = 1;
    int stone;
    int gem;
    int statclick;
    boolean minedwith1;
    boolean minedwith2;
    boolean minedwith3;
    int ownedgreg = 0;
    int flagone = 1;
    double case1;
    double case2;
    double case3;
    double case4;
    double case5;
    int gregadds = 1;
    int gregstat = 0;
    int upgreg1 = 300;
    int upgreg2 = 50000;
    double gprize3;
    double gprize2;
    double gprize1;
    int gfgems = 0;
    String bir = "12345";
    int bircheck = 0;
    String iki = "darkgreen";
    int ikicheck = 0;
    String uc = "fishknowseverything";
    int uccheck = 0;
    String dort = "code";
    int dortcheck = 0;
    String bes = "yigithan";
    int bescheck = 0;
    String alti = "pleasegems";
    int alticheck = 0;
    String yedi = "ineedgreg";
    int yedicheck = 0;
    String sekiz = "-1";
    int sekizcheck = 0;
    String dokuz = "10billionpoints";
    int dokuzcheck = 0;
    String on = "mine";
    int oncheck = 0;
    String onbir = "/kill @a";
    int onbircheck = 0;
    String oniki = "iamkira";
    int onikicheck = 0;
    String onuc = "666";
    int onuccheck = 0;
    int unlockgemshop = 0;
    int unlockluckybox = 0;
    int unlockgregpanel = 0;
    int readyforprestige = 0;
    int prestigenum = 1;
    int prestigesignal = 4000000;
    int convertgem;
    int convertgemcost;
    int boostlimits;
    int currentboostusage = 0;
    int microboosprice = 50;
    int macroboostprice = 65;
    int smallboostprice = 80;
    double microboostmultiplier = 1.6;
    double macroboostmultiplier = 1.8;
    double smallboostmultiplier = 2.0;
    boolean microused, macroused, smallused = false;

    public Main() {
        initComponents();
        girispaneli.setVisible(true);
        anapanel.setVisible(false);
        stoneshoppanel.setVisible(false);
        gemshoppanel.setVisible(false);
        gregpanel1.setVisible(false);
        gregpanel2.setVisible(false);
        luckyboxpanel.setVisible(false);
        statpanel.setVisible(false);
        settingspanel.setVisible(false);
        anapanelbuttongemshop.setVisible(false);
        anapanelbuttonluckybox.setVisible(false);
        anapanelbuttongregpanel.setVisible(false);
        prestigepanel.setVisible(false);
        anapanelbuttonprestigepanel.setVisible(false);
        prestigepanellastasktext.setVisible(false);
        prestigepanelyes.setVisible(false);
        prestigepanelno.setVisible(false);
        remainingboostlabel.setVisible(microused || macroused || smallused);
        isboostactivelabel.setVisible(false);

        //initial stone shop setup
        stoneshopupgradetext.setText("█Very Small upgrade(+1 x " + prestigenum + ") = " + costbir + " stone");
        stoneshopupgradetext1.setText("█Small upgrade(+3 x " + prestigenum + ") = " + costiki + " stone");
        stoneshopupgradetext2.setText("█Medium upgrade(+40 x " + prestigenum + ") = " + costuc + " stone");
        stoneshopupgradetext3.setText("█Big upgrade(+500 x " + prestigenum + ") = " + costdort + " stone");
        stoneshopupgradetext4.setText("█Huge upgrade(+3000 x " + prestigenum + ") = " + costbes + " stone");
        stoneshopupgradetext5.setText("█BlingBling upgrade(+25000 x " + prestigenum + ") = " + costalti + " stone");
        //initial gem shop setup

        gemshopupgradetext2.setText("█Gem Attachment Upgrade(+100000 Stone x " + prestigenum + ") = " + gemcostbir + " gems.");
        gemshopupgradetext3.setText("█Gem Rune Upgrade(+250000 Stone x " + prestigenum + ") = " + gemcostiki + " gems.");
        gemshopupgradetext4.setText("█Gem Cloak Upgrade(+500000 Stone x " + prestigenum + ") = " + gemcostuc + " gems.");
        gemshopupgradetext5.setText("█Gem Armor Upgrade(+1000000 Stone x " + prestigenum + ") = " + gemcostdort + " gems.");
        gemshopupgradetext6.setText("█Gem Ring Upgrade(+1500000 Stone x " + prestigenum + ") = " + gemcostbes + " gems.");
        gemshopupgradetext7.setText("█Gem Relic Upgrade(+3000000 Stone x " + prestigenum + ") = " + gemcostalti + " gems.");
        counterupdateall();
        gregpanelupgradetext.setText("█Better drill for Greg(+1000 x " + prestigenum + ") = " + upgreg1 + " gems.");
        gregpanelupgradetext1.setText("█Better AI for Greg(+100k x " + prestigenum + ") = " + upgreg2 + " gems");
        microboostpricelabel.setText("" + microboosprice + " Gems");
        macroboostpricelabel.setText("" + macroboostprice + " Gems");
        smallboostpricelabel.setText("" + smallboostprice + " Gems");
    }

    public void anapanelac() {
        anapanel.setVisible(true);
        girispaneli.setVisible(false);
        stoneshoppanel.setVisible(false);
        gemshoppanel.setVisible(false);
        gregpanel1.setVisible(false);
        gregpanel2.setVisible(false);
        luckyboxpanel.setVisible(false);
        statpanel.setVisible(false);
        settingspanel.setVisible(false);
        prestigepanel.setVisible(false);
        counterupdateall();
    }
//Regular functions

    public void stoneadd() {
        if (microused) {
            stone += (int) (Math.round((double) adds * microboostmultiplier));
            currentboostusage++;
            statclick += 1;
        } else if (macroused) {
            stone += (int) (Math.round((double) adds * macroboostmultiplier));
            currentboostusage++;
            statclick += 1;
        } else if (smallused) {
            stone += (int) (Math.round((double) adds * smallboostmultiplier));
            currentboostusage++;
            statclick += 1;
        } else {
            stone += adds;
            statclick += 1;

        }
        remainingboostlabel.setText("Remaining boosted actions: " + (boostlimits - currentboostusage));
        remainingboostlabel.setVisible(microused || macroused || smallused);
        if (microused) {
            isboostactivelabel.setText("Micro boost is currently active.");
            isboostactivelabel.setVisible(true);
        } else if (macroused) {
            isboostactivelabel.setText("Macro boost is currently active.");
            isboostactivelabel.setVisible(true);
        } else if (smallused) {
            isboostactivelabel.setText("Small boost is currently active.");
            isboostactivelabel.setVisible(true);
        } else {
            isboostactivelabel.setText("No boosts are currently active.");
            isboostactivelabel.setVisible(false);
        }

    }

    public void correction() {
        if (stone < 0) {
            stone = 1999999999;

        }
        if (gem < 0) {
            gem = 1999999999;
        }
        if (currentboostusage >= boostlimits) {
            microused = false;
            macroused = false;
            smallused = false;
            currentboostusage = 0;
            boostlimits = 0;
        }
    }
//Regular functions end
    //STONE SHOP

    public void verysmall() {
        if (stone >= costbir) {
            stone -= costbir;
            costbir += costbir;
            adds += 1 * prestigenum;
            stoneshopupgradetext.setText("█Very Small upgrade(+1 x " + prestigenum + ") = " + costbir + " stone");

        } else {

        }

    }

    public void small() {
        if (stone >= costiki) {
            stone -= costiki;
            costiki += costiki;
            adds += 3 * prestigenum;
            stoneshopupgradetext1.setText("█Small upgrade(+3 x " + prestigenum + ") = " + costiki + " stone");
        } else {

        }
    }

    public void medium() {
        if (stone >= costuc) {
            stone -= costuc;
            costuc += costuc;
            adds += 40 * prestigenum;
            stoneshopupgradetext2.setText("█Medium upgrade(+40 x " + prestigenum + ") = " + costuc + " stone");

        } else {

        }
    }

    public void Big() {
        if (stone >= costdort) {
            stone -= costdort;
            costdort += costdort;
            adds += 500 * prestigenum;
            stoneshopupgradetext3.setText("█Big upgrade(+500 x " + prestigenum + ") = " + costdort + " stone");

        } else {

        }
    }

    public void Huge() {
        if (stone >= costbes) {
            stone -= costbes;
            costbes += costbes;
            adds += 3000 * prestigenum;
            stoneshopupgradetext4.setText("█Huge upgrade(+3000 x " + prestigenum + ") = " + costbes + " stone");

        } else {

        }
    }

    public void BlingBling() {
        if (stone >= costalti) {
            stone -= costalti;
            costalti += costalti;
            adds += 25000 * prestigenum;
            stoneshopupgradetext5.setText("█BlingBling upgrade(+25000 x " + prestigenum + ") = " + costalti + " stone");
        } else {

        }
    }

    //STONE SHOP END
    //GEM SHOP
    public void counterupdateall() {

        gemcounter.setText("Gem: " + gem);
        gemcounter1.setText("Gem: " + gem);
        gemcounter2.setText("Gem: " + gem);
        gemcounter3.setText("Gem: " + gem);
        gemcounter4.setText("Gem: " + gem);
        gemcounter5.setText("Gem: " + gem);
        gemcounter6.setText("Gem: " + gem);
        stonecounter.setText("Stone: " + stone);
        stonecounter1.setText("Stone: " + stone);
        stonecounter2.setText("Stone: " + stone);
        stonecounter3.setText("Stone: " + stone);
        stonecounter4.setText("Stone: " + stone);
        stonecounter5.setText("Stone: " + stone);
        stonecounter6.setText("Stone: " + stone);
        microboostpricelabel.setText("" + microboosprice + " Gems");
        macroboostpricelabel.setText("" + macroboostprice + " Gems");
        smallboostpricelabel.setText("" + smallboostprice + " Gems");
        slidervalue();
        correction();

    }

    public void gemconvert() {
        counterupdateall();
        if (stone >= convertgemcost) {
            stone -= convertgemcost;
            gem += convertgem;
        }
        counterupdateall();
    }

    public void slidervalue() {
        convertgem = gemconverterslider.getValue();
        convertgemcost = convertgem * 500000;
        selectedgemlabel.setText("" + convertgem);
        gemslidercost.setText("" + convertgemcost);
    }

    public void gematt() {
        if (gem >= gemcostbir) {
            gem -= gemcostbir;
            gemcostbir += gemcostbir;
            adds += 100000 * prestigenum;
            gemshopupgradetext2.setText("█Gem Attachment Upgrade(+100000 Stone x " + prestigenum + ") = " + gemcostbir + " gems.");

            counterupdateall();
        } else {

        }

    }

    public void gemrune() {
        if (gem >= gemcostiki) {
            gem -= gemcostiki;
            gemcostiki += gemcostiki;
            adds += 250000 * prestigenum;
            gemshopupgradetext3.setText("█Gem Rune Upgrade(+250000 Stone x " + prestigenum + ") = " + gemcostiki + " gems.");

            counterupdateall();
        } else {

        }
    }

    public void gemcloak() {
        if (gem >= gemcostuc) {
            gem -= gemcostuc;
            gemcostuc += gemcostuc;
            adds += 500000 * prestigenum;
            gemshopupgradetext4.setText("█Gem Cloak Upgrade(+500000 Stone x " + prestigenum + ") = " + gemcostuc + " gems.");
            counterupdateall();
        } else {

        }
    }

    public void gemarmor() {
        if (gem >= gemcostdort) {
            gem -= gemcostdort;
            gemcostdort += gemcostdort;
            adds += 1000000 * prestigenum;
            gemshopupgradetext5.setText("█Gem Armor Upgrade(+1000000 Stone x " + prestigenum + ") = " + gemcostdort + " gems.");
            counterupdateall();
        } else {

        }
    }

    public void gemring() {
        if (gem >= gemcostbes) {
            gem -= gemcostbes;
            gemcostbes += gemcostbes;
            adds += 1500000 * prestigenum;
            gemshopupgradetext6.setText("█Gem Ring Upgrade(+1500000 Stone x " + prestigenum + ") = " + gemcostbes + " gems.");
            counterupdateall();
        } else {

        }
    }

    public void gemrelic() {
        if (gem >= gemcostalti) {
            gem -= gemcostalti;
            gemcostalti += gemcostalti;
            adds += 3000000 * prestigenum;
            gemshopupgradetext7.setText("█Gem Relic Upgrade(+3000000 Stone x " + prestigenum + ") = " + gemcostalti + " gems.");
            counterupdateall();
        } else {

        }
    }

    //GEM SHOP END
    //STAT AREA
    public void clickedtimes() {

        statpaneltotalminetimes.setText("█You mined " + statclick + " times in total.");
    }

    public void stats() {
        stoneincome();
        clickedtimes();
        if (ownedgreg == 1) {
            statpanelgregadded.setText("█Greg mines " + gregadds * prestigenum + " stones per action.");
            statpanelgregminedintotal.setText("█Greg mined " + gregstat + " stones in total.");
            statpanelgregfoundgemsintotal.setText("█Greg found " + gfgems + " gems in total.");
            statpanelgregadded.setVisible(true);
            statpanelgregminedintotal.setVisible(true);
            statpanelgregfoundgemsintotal.setVisible(true);

        } else {
            statpanelgregadded.setVisible(false);
            statpanelgregminedintotal.setVisible(false);
            statpanelgregfoundgemsintotal.setVisible(false);
        }
    }

    public void stoneincome() {
        statpaneladdedstone.setText("█Every time you mine, you get " + adds + " stone");

    }

    //STAT AREA END
    //GREG AREA
    public void gregboost1() {
        counterupdateall();
        if (gem >= microboosprice && (!macroused && !smallused)) {
            gem -= microboosprice;
            microboosprice++;
            microused = true;
            boostlimits += 10;
        }
        counterupdateall();
    }

    public void gregboost2() {
        counterupdateall();
        if (gem >= macroboostprice && (!microused && !smallused)) {
            gem -= macroboostprice;
            macroboostprice++;
            macroused = true;
            boostlimits += 10;
        }
        counterupdateall();
    }

    public void gregboost3() {
        counterupdateall();
        if (gem >= smallboostprice && (!macroused && !microused)) {
            gem -= smallboostprice;
            smallboostprice++;
            smallused = true;
            boostlimits += 10;
        }
        counterupdateall();
    }

    public void buygreg() {
        if (flagone == 1) {
            if (gem >= 100) {
                gem -= 100;
                flagone -= 1;
                ownedgreg += 1;
            } else {

            }

        } else {

        }

    }

    public void gregsystem() {
        if (ownedgreg == 1) {
            stone += gregadds * prestigenum;
            gregstat += gregadds * prestigenum;
            correction();
            //Gregin rastgele sans ile buldugu ekstra GEM ler.
            gprize1 = Math.floor(Math.random() * 12000);
            gprize2 = Math.floor(Math.random() * 2000);
            gprize3 = Math.floor(Math.random() * 100);
            Math.round(gprize1);
            Math.round(gprize2);
            Math.round(gprize3);
            if (gprize1 <= 15) {

                gem += 500;
                gfgems += 500;
                if (gprize2 <= 70) {

                    gem += 12;
                    gfgems += 12;
                }
                if (gprize3 <= 40) {

                    gem += 3;
                    gfgems += 3;
                }
            }
        }
    }

    public void betterdrillforgreg() {
        if (ownedgreg == 1) {
            if (gem >= upgreg1) {
                gem -= upgreg1;
                upgreg1 += upgreg1;
                gregadds += 1000;
                gregpanelupgradetext.setText("█Better drill for Greg(+1000 x " + prestigenum + ") = " + upgreg1 + " gems.");

            } else {

            }
        } else {

        }
    }

    public void betteraiforgreg() {
        if (ownedgreg == 1) {
            if (gem >= upgreg2) {
                gem -= upgreg2;
                upgreg2 += upgreg2;
                gregadds += 100000;
                gregpanelupgradetext1.setText("█Better AI for Greg(+100k x " + prestigenum + ") = " + upgreg2 + " gems");
            } else {

            }
        } else {

        }
    }

    //GREG AREA END
//LUCKYBOX 
    public void case1() {
        if (stone >= 100) {
            stone -= 100;
            case1 = Math.floor(Math.random() * 100) + 50;
            Math.round(case1);
            if (case1 >= 100) {

                didwin.setText("You got " + case1 + " stones. You Profited.");

            } else {
                didwin.setText("You got " + case1 + " stones. You Lost.");
            }
            stone += case1;
        } else {

        }
    }

    public void case2() {
        if (stone >= 10000) {
            stone -= 10000;
            case2 = Math.floor(Math.random() * 10000) + 5000;
            Math.round(case2);
            if (case2 >= 10000) {
                didwin.setText("You got " + case2 + " stones. You Profited.");
            } else {
                didwin.setText("You got " + case2 + " stones. You Lost.");
            }
            stone += case2;
        } else {

        }
    }

    public void case3() {
        if (stone >= 500000) {
            stone -= 500000;
            case3 = Math.floor(Math.random() * 500000) + 225000;
            Math.round(case3);
            if (case3 >= 500000) {
                didwin.setText("You got " + case3 + " stones. You Profited.");
            } else {
                didwin.setText("You got " + case3 + " stones. You Lost.");
            }
            stone += case3;
        } else {

        }
    }

    public void case4() {
        if (gem >= 100) {
            gem -= 100;
            case4 = Math.floor(Math.random() * 100) + 45;
            Math.round(case4);
            if (case4 >= 100) {
                didwin.setText("You got " + case4 + " gems. You Profited.");
            } else {
                didwin.setText("You got " + case4 + " gems. You Lost.");
            }
            gem += case4;
        } else {

        }
    }

    public void case5() {
        if (gem >= 2500) {
            gem -= 2500;
            case5 = Math.floor(Math.random() * 2500) + 1050;
            Math.round(case5);
            if (case5 >= 2500) {
                didwin.setText("You got " + case5 + " gems. You Profited.");
            } else {
                didwin.setText("You got " + case5 + " gems. You Lost.");
            }
            gem += case5;
        } else {

        }
    }

    //LUCKYBOX END
    //Unlock Commands
    public void unlocktabs() {
        if (unlockgemshop == 0 && adds >= 10) {
            anapanelbuttongemshop.setVisible(true);
            unlockgemshop += 1;
        }
        if (unlockluckybox == 0 && adds >= 250) {
            anapanelbuttonluckybox.setVisible(true);
            unlockluckybox += 1;
        }
        if (unlockgregpanel == 0 && adds >= 100000) {
            anapanelbuttongregpanel.setVisible(true);
            unlockgregpanel += 1;
        }
    }

    //Unlock Commands End
    //Prestige System
    public void prestigeunlock() {
        if (adds >= prestigesignal) {
            readyforprestige = 1;
        }
        if (readyforprestige == 1) {
            anapanelbuttonprestigepanel.setVisible(true);
        }
    }

    public void doprestige() {

        if (readyforprestige == 1) {
            girispaneli.setVisible(true);
            anapanel.setVisible(false);
            stoneshoppanel.setVisible(false);
            gemshoppanel.setVisible(false);
            gregpanel1.setVisible(false);
            gregpanel2.setVisible(false);
            luckyboxpanel.setVisible(false);
            statpanel.setVisible(false);
            settingspanel.setVisible(false);
            anapanelbuttongemshop.setVisible(false);
            anapanelbuttonluckybox.setVisible(false);
            anapanelbuttongregpanel.setVisible(false);
            prestigepanel.setVisible(false);
            anapanelbuttonprestigepanel.setVisible(false);
            prestigepanellastasktext.setVisible(false);
            prestigepanelyes.setVisible(false);
            prestigepanelno.setVisible(false);
            prestigepanelmainbutton1.setVisible(true);
            costbir = 10;
            costiki = 25;
            costuc = 250;
            costdort = 2500;
            costbes = 25000;
            costalti = 50000;
            gemcostbir = 10;
            gemcostiki = 25;
            gemcostuc = 250;
            gemcostdort = 2500;
            gemcostbes = 25000;
            gemcostalti = 50000;
            adds = 1;
            adds = adds * prestigenum;
            stone = 0;
            gem = 0;
            ownedgreg = 0;
            flagone = 1;
            gregadds = 1;
            gregstat = 0;
            upgreg1 = 300;
            upgreg2 = 50000;
            gfgems = 0;
            dokuzcheck = 0;
            unlockgemshop = 0;
            unlockluckybox = 0;
            unlockgregpanel = 0;
            readyforprestige = 0;
            prestigenum += 1;
            prestigesignal += (prestigesignal / 2);
            microboosprice = 50;
            macroboostprice = 65;
            smallboostprice = 80;
            stoneshopupgradetext.setText("█Very Small upgrade(+1 x " + prestigenum + ") = " + costbir + " stone");
            stoneshopupgradetext1.setText("█Small upgrade(+3 x " + prestigenum + ") = " + costiki + " stone");
            stoneshopupgradetext2.setText("█Medium upgrade(+40 x " + prestigenum + ") = " + costuc + " stone");
            stoneshopupgradetext3.setText("█Big upgrade(+500 x " + prestigenum + ") = " + costdort + " stone");
            stoneshopupgradetext4.setText("█Huge upgrade(+3000 x " + prestigenum + ") = " + costbes + " stone");
            stoneshopupgradetext5.setText("█BlingBling upgrade(+25000 x " + prestigenum + ") = " + costalti + " stone");

            gemshopupgradetext2.setText("█Gem Attachment Upgrade(+100000 Stone x " + prestigenum + ") = " + gemcostbir + " gems.");
            gemshopupgradetext3.setText("█Gem Rune Upgrade(+250000 Stone x " + prestigenum + ") = " + gemcostiki + " gems.");
            gemshopupgradetext4.setText("█Gem Cloak Upgrade(+500000 Stone x " + prestigenum + ") = " + gemcostuc + " gems.");
            gemshopupgradetext5.setText("█Gem Armor Upgrade(+1000000 Stone x " + prestigenum + ") = " + gemcostdort + " gems.");
            gemshopupgradetext6.setText("█Gem Ring Upgrade(+1500000 Stone x " + prestigenum + ") = " + gemcostbes + " gems.");
            gemshopupgradetext7.setText("█Gem Relic Upgrade(+3000000 Stone x " + prestigenum + ") = " + gemcostalti + " gems.");
            counterupdateall();
            gregpanelupgradetext.setText("█Better drill for Greg(+1000 x " + prestigenum + ") = " + upgreg1 + " gems.");
            gregpanelupgradetext1.setText("█Better AI for Greg(+100k x " + prestigenum + ") = " + upgreg2 + " gems");
            microboostpricelabel.setText("" + microboosprice + " Gems");
            macroboostpricelabel.setText("" + macroboostprice + " Gems");
            smallboostpricelabel.setText("" + smallboostprice + " Gems");
            microused = false;
            macroused = false;
            smallused = false;
            currentboostusage = 0;
            boostlimits = 0;
        }
    }

    //Prestige System End
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        anapanel = new javax.swing.JPanel();
        anapanelbuttongregpanel = new javax.swing.JButton();
        anapanelbuttonstonneshop = new javax.swing.JButton();
        anapanelbuttongemshop = new javax.swing.JButton();
        anapanelbuttonluckybox = new javax.swing.JButton();
        anapanelbuttonnull4 = new javax.swing.JButton();
        anapanelbuttonnull5 = new javax.swing.JButton();
        anapanelbuttonmine = new javax.swing.JButton();
        stonecounter = new javax.swing.JLabel();
        gemcounter = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        anapanelbuttonprestigepanel = new javax.swing.JButton();
        remainingboostlabel = new javax.swing.JLabel();
        girispaneli = new javax.swing.JPanel();
        girispanelstartbutton = new javax.swing.JButton();
        girispaneltitle = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        stoneshoppanel = new javax.swing.JPanel();
        stoneshoppanelbuy = new javax.swing.JButton();
        stonecounter1 = new javax.swing.JLabel();
        gemcounter1 = new javax.swing.JLabel();
        stoneshopupgradetext = new javax.swing.JLabel();
        stoneshoppaneltitle = new javax.swing.JLabel();
        stoneshopbackbutton = new javax.swing.JButton();
        stoneshopupgradetext1 = new javax.swing.JLabel();
        stoneshoppanelbuy1 = new javax.swing.JButton();
        stoneshopupgradetext2 = new javax.swing.JLabel();
        stoneshoppanelbuy9 = new javax.swing.JButton();
        stoneshopupgradetext3 = new javax.swing.JLabel();
        stoneshoppanelbuy10 = new javax.swing.JButton();
        stoneshopupgradetext4 = new javax.swing.JLabel();
        stoneshoppanelbuy11 = new javax.swing.JButton();
        stoneshopupgradetext5 = new javax.swing.JLabel();
        stoneshoppanelbuy12 = new javax.swing.JButton();
        luckyboxpanel = new javax.swing.JPanel();
        luckyboxpanelbuy = new javax.swing.JButton();
        stonecounter3 = new javax.swing.JLabel();
        gemcounter5 = new javax.swing.JLabel();
        luckyboxpaneltext = new javax.swing.JLabel();
        stoneshoppaneltitle1 = new javax.swing.JLabel();
        stoneshopbackbutton1 = new javax.swing.JButton();
        luckyboxpanelbuy1 = new javax.swing.JButton();
        luckyboxpaneltext1 = new javax.swing.JLabel();
        luckyboxpaneltext2 = new javax.swing.JLabel();
        luckyboxpanelbuy2 = new javax.swing.JButton();
        luckyboxpaneltext3 = new javax.swing.JLabel();
        luckyboxpanelbuy3 = new javax.swing.JButton();
        luckyboxpaneltext4 = new javax.swing.JLabel();
        luckyboxpanelbuy4 = new javax.swing.JButton();
        didwin = new javax.swing.JLabel();
        statpanel = new javax.swing.JPanel();
        stonecounter6 = new javax.swing.JLabel();
        gemcounter6 = new javax.swing.JLabel();
        statpaneladdedstone = new javax.swing.JLabel();
        statpaneltitle = new javax.swing.JLabel();
        stoneshopbackbutton2 = new javax.swing.JButton();
        statpaneltotalminetimes = new javax.swing.JLabel();
        statpanelgregadded = new javax.swing.JLabel();
        statpanelgregminedintotal = new javax.swing.JLabel();
        statpanelgregfoundgemsintotal = new javax.swing.JLabel();
        isboostactivelabel = new javax.swing.JLabel();
        gregpanel1 = new javax.swing.JPanel();
        gregpanel1mainbuy = new javax.swing.JButton();
        stonecounter5 = new javax.swing.JLabel();
        gemcounter3 = new javax.swing.JLabel();
        gregpanelupgradetext5 = new javax.swing.JLabel();
        gregpaneltitle1 = new javax.swing.JLabel();
        gregpanel1backbutton = new javax.swing.JButton();
        gregpanel1infoline = new javax.swing.JLabel();
        gregpanel1infoline1 = new javax.swing.JLabel();
        gregpanel1infoline2 = new javax.swing.JLabel();
        gregpanel1infoline3 = new javax.swing.JLabel();
        gregpanel1infoline4 = new javax.swing.JLabel();
        gregpanel1infoline5 = new javax.swing.JLabel();
        gregpanel1infoline6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        gregpanel2 = new javax.swing.JPanel();
        gregpanelbuy = new javax.swing.JButton();
        stonecounter4 = new javax.swing.JLabel();
        gemcounter4 = new javax.swing.JLabel();
        gregpanelupgradetext = new javax.swing.JLabel();
        gregpaneltitle = new javax.swing.JLabel();
        gregpanel2backbutton = new javax.swing.JButton();
        gregpanelbuy1 = new javax.swing.JButton();
        gregpanelupgradetext1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        microboostpricelabel = new javax.swing.JLabel();
        microboostbuybutton = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        macroboostpricelabel = new javax.swing.JLabel();
        macroboostbuybutton = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        smallboostpricelabel = new javax.swing.JLabel();
        smallboostbuybutton = new javax.swing.JButton();
        gemshoppanel = new javax.swing.JPanel();
        stonecounter2 = new javax.swing.JLabel();
        gemcounter2 = new javax.swing.JLabel();
        gemshoppaneltitle = new javax.swing.JLabel();
        gemshopbackbutton = new javax.swing.JButton();
        gemshoppanelbuy2 = new javax.swing.JButton();
        gemshopupgradetext2 = new javax.swing.JLabel();
        gemshoppanelbuy3 = new javax.swing.JButton();
        gemshopupgradetext3 = new javax.swing.JLabel();
        gemshoppanelbuy4 = new javax.swing.JButton();
        gemshopupgradetext4 = new javax.swing.JLabel();
        gemshoppanelbuy5 = new javax.swing.JButton();
        gemshopupgradetext5 = new javax.swing.JLabel();
        gemshopupgradetext6 = new javax.swing.JLabel();
        gemshoppanelbuy6 = new javax.swing.JButton();
        gemshoppanelbuy7 = new javax.swing.JButton();
        gemshopupgradetext7 = new javax.swing.JLabel();
        gemconverterslider = new javax.swing.JSlider();
        convertbutton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        selectedgemlabel = new javax.swing.JLabel();
        gemslidercost = new javax.swing.JLabel();
        settingspanel = new javax.swing.JPanel();
        gregpaneltitle2 = new javax.swing.JLabel();
        settingspanelbackbutton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        notification = new javax.swing.JLabel();
        prestigepanel = new javax.swing.JPanel();
        prestigepaneltitle = new javax.swing.JLabel();
        prestigepanelbackbutton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        prestigepanelno = new javax.swing.JButton();
        prestigepanelmainbutton1 = new javax.swing.JButton();
        prestigepanelyes = new javax.swing.JButton();
        prestigepanellastasktext = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        anapanel.setBackground(new java.awt.Color(210, 210, 240));

        anapanelbuttongregpanel.setBackground(new java.awt.Color(140, 240, 140));
        anapanelbuttongregpanel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        anapanelbuttongregpanel.setText("Greg Panel");
        anapanelbuttongregpanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anapanelbuttongregpanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anapanelbuttongregpanelActionPerformed(evt);
            }
        });

        anapanelbuttonstonneshop.setBackground(new java.awt.Color(0, 0, 0));
        anapanelbuttonstonneshop.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        anapanelbuttonstonneshop.setForeground(new java.awt.Color(240, 240, 240));
        anapanelbuttonstonneshop.setText("Stone Shop");
        anapanelbuttonstonneshop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anapanelbuttonstonneshop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anapanelbuttonstonneshopActionPerformed(evt);
            }
        });

        anapanelbuttongemshop.setBackground(new java.awt.Color(240, 40, 240));
        anapanelbuttongemshop.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        anapanelbuttongemshop.setText("Gem Shop");
        anapanelbuttongemshop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anapanelbuttongemshop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anapanelbuttongemshopActionPerformed(evt);
            }
        });

        anapanelbuttonluckybox.setBackground(new java.awt.Color(240, 240, 50));
        anapanelbuttonluckybox.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        anapanelbuttonluckybox.setText("Lucky Box");
        anapanelbuttonluckybox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anapanelbuttonluckybox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anapanelbuttonluckyboxActionPerformed(evt);
            }
        });

        anapanelbuttonnull4.setBackground(new java.awt.Color(240, 140, 140));
        anapanelbuttonnull4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        anapanelbuttonnull4.setText("Stats");
        anapanelbuttonnull4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anapanelbuttonnull4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anapanelbuttonnull4ActionPerformed(evt);
            }
        });

        anapanelbuttonnull5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        anapanelbuttonnull5.setText("Settings");
        anapanelbuttonnull5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anapanelbuttonnull5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anapanelbuttonnull5ActionPerformed(evt);
            }
        });

        anapanelbuttonmine.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        anapanelbuttonmine.setForeground(new java.awt.Color(100, 0, 0));
        anapanelbuttonmine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/realbuttonyasasmall.jpeg"))); // NOI18N
        anapanelbuttonmine.setText("MINE STONE");
        anapanelbuttonmine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anapanelbuttonmine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anapanelbuttonmineActionPerformed(evt);
            }
        });

        stonecounter.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        stonecounter.setText("Stone: ");
        stonecounter.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        gemcounter.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        gemcounter.setForeground(new java.awt.Color(153, 0, 153));
        gemcounter.setText("Gem: ");
        gemcounter.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Made by: Yigithan Yasa");

        anapanelbuttonprestigepanel.setBackground(new java.awt.Color(100, 150, 100));
        anapanelbuttonprestigepanel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        anapanelbuttonprestigepanel.setForeground(new java.awt.Color(240, 240, 240));
        anapanelbuttonprestigepanel.setText("Prestige");
        anapanelbuttonprestigepanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anapanelbuttonprestigepanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anapanelbuttonprestigepanelActionPerformed(evt);
            }
        });

        remainingboostlabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        remainingboostlabel.setForeground(new java.awt.Color(0, 204, 51));
        remainingboostlabel.setText("Boosted actions: xx");

        javax.swing.GroupLayout anapanelLayout = new javax.swing.GroupLayout(anapanel);
        anapanel.setLayout(anapanelLayout);
        anapanelLayout.setHorizontalGroup(
            anapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(anapanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(anapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(anapanelLayout.createSequentialGroup()
                        .addComponent(anapanelbuttonstonneshop, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(anapanelbuttonprestigepanel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(anapanelbuttongregpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anapanelbuttonnull4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anapanelbuttonluckybox, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anapanelbuttonnull5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anapanelbuttongemshop, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 272, Short.MAX_VALUE)
                .addGroup(anapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, anapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(gemcounter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stonecounter, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE))
                    .addGroup(anapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, anapanelLayout.createSequentialGroup()
                            .addComponent(anapanelbuttonmine, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(41, 41, 41))
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(remainingboostlabel))
                .addContainerGap())
        );
        anapanelLayout.setVerticalGroup(
            anapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(anapanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(anapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(anapanelLayout.createSequentialGroup()
                        .addGroup(anapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(anapanelLayout.createSequentialGroup()
                                .addGap(0, 9, Short.MAX_VALUE)
                                .addComponent(anapanelbuttonprestigepanel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(anapanelLayout.createSequentialGroup()
                                .addComponent(anapanelbuttonstonneshop, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(4, 4, 4)
                        .addComponent(anapanelbuttongemshop, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(anapanelbuttongregpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(anapanelbuttonluckybox, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(anapanelbuttonnull4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(anapanelbuttonnull5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(anapanelLayout.createSequentialGroup()
                        .addComponent(stonecounter, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gemcounter, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(anapanelbuttonmine, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(remainingboostlabel)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        girispaneli.setBackground(new java.awt.Color(210, 210, 240));

        girispanelstartbutton.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        girispanelstartbutton.setForeground(new java.awt.Color(0, 100, 0));
        girispanelstartbutton.setText("START");
        girispanelstartbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girispanelstartbuttonActionPerformed(evt);
            }
        });

        girispaneltitle.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 36)); // NOI18N
        girispaneltitle.setForeground(new java.awt.Color(240, 0, 0));
        girispaneltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        girispaneltitle.setText("WELCOME TO NIRVANA");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Made By: Yigithan Yasa");

        javax.swing.GroupLayout girispaneliLayout = new javax.swing.GroupLayout(girispaneli);
        girispaneli.setLayout(girispaneliLayout);
        girispaneliLayout.setHorizontalGroup(
            girispaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, girispaneliLayout.createSequentialGroup()
                .addContainerGap(258, Short.MAX_VALUE)
                .addGroup(girispaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(girispaneltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(girispaneliLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(girispaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(girispanelstartbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(221, 221, 221))
        );
        girispaneliLayout.setVerticalGroup(
            girispaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girispaneliLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(girispaneltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(girispanelstartbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        stoneshoppanel.setBackground(new java.awt.Color(190, 190, 190));

        stoneshoppanelbuy.setBackground(new java.awt.Color(0, 0, 0));
        stoneshoppanelbuy.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        stoneshoppanelbuy.setForeground(new java.awt.Color(240, 240, 240));
        stoneshoppanelbuy.setText("BUY");
        stoneshoppanelbuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stoneshoppanelbuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stoneshoppanelbuyActionPerformed(evt);
            }
        });

        stonecounter1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        stonecounter1.setText("Stone: ");
        stonecounter1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        gemcounter1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        gemcounter1.setForeground(new java.awt.Color(153, 0, 153));
        gemcounter1.setText("Gem: ");
        gemcounter1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        stoneshopupgradetext.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        stoneshopupgradetext.setText("Exampleupgrade(+x) = 10 Stone");

        stoneshoppaneltitle.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        stoneshoppaneltitle.setText("STONE SHOP");

        stoneshopbackbutton.setBackground(new java.awt.Color(0, 0, 0));
        stoneshopbackbutton.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        stoneshopbackbutton.setForeground(new java.awt.Color(240, 0, 0));
        stoneshopbackbutton.setText("Back>");
        stoneshopbackbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stoneshopbackbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stoneshopbackbuttonActionPerformed(evt);
            }
        });

        stoneshopupgradetext1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        stoneshopupgradetext1.setText("Exampleupgrade(+x) = 10 Stone");

        stoneshoppanelbuy1.setBackground(new java.awt.Color(0, 0, 0));
        stoneshoppanelbuy1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        stoneshoppanelbuy1.setForeground(new java.awt.Color(240, 240, 240));
        stoneshoppanelbuy1.setText("BUY");
        stoneshoppanelbuy1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stoneshoppanelbuy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stoneshoppanelbuy1ActionPerformed(evt);
            }
        });

        stoneshopupgradetext2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        stoneshopupgradetext2.setText("Exampleupgrade(+x) = 10 Stone");

        stoneshoppanelbuy9.setBackground(new java.awt.Color(0, 0, 0));
        stoneshoppanelbuy9.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        stoneshoppanelbuy9.setForeground(new java.awt.Color(240, 240, 240));
        stoneshoppanelbuy9.setText("BUY");
        stoneshoppanelbuy9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stoneshoppanelbuy9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stoneshoppanelbuy9ActionPerformed(evt);
            }
        });

        stoneshopupgradetext3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        stoneshopupgradetext3.setText("Exampleupgrade(+x) = 10 Stone");

        stoneshoppanelbuy10.setBackground(new java.awt.Color(0, 0, 0));
        stoneshoppanelbuy10.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        stoneshoppanelbuy10.setForeground(new java.awt.Color(240, 240, 240));
        stoneshoppanelbuy10.setText("BUY");
        stoneshoppanelbuy10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stoneshoppanelbuy10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stoneshoppanelbuy10ActionPerformed(evt);
            }
        });

        stoneshopupgradetext4.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        stoneshopupgradetext4.setText("Exampleupgrade(+x) = 10 Stone");

        stoneshoppanelbuy11.setBackground(new java.awt.Color(0, 0, 0));
        stoneshoppanelbuy11.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        stoneshoppanelbuy11.setForeground(new java.awt.Color(240, 240, 240));
        stoneshoppanelbuy11.setText("BUY");
        stoneshoppanelbuy11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stoneshoppanelbuy11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stoneshoppanelbuy11ActionPerformed(evt);
            }
        });

        stoneshopupgradetext5.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        stoneshopupgradetext5.setText("Exampleupgrade(+x) = 10 Stone");

        stoneshoppanelbuy12.setBackground(new java.awt.Color(0, 0, 0));
        stoneshoppanelbuy12.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        stoneshoppanelbuy12.setForeground(new java.awt.Color(240, 240, 240));
        stoneshoppanelbuy12.setText("BUY");
        stoneshoppanelbuy12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stoneshoppanelbuy12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stoneshoppanelbuy12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout stoneshoppanelLayout = new javax.swing.GroupLayout(stoneshoppanel);
        stoneshoppanel.setLayout(stoneshoppanelLayout);
        stoneshoppanelLayout.setHorizontalGroup(
            stoneshoppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stoneshoppanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(stoneshoppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(stoneshoppanelLayout.createSequentialGroup()
                        .addComponent(stoneshopupgradetext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stoneshoppanelbuy))
                    .addComponent(stoneshoppaneltitle)
                    .addGroup(stoneshoppanelLayout.createSequentialGroup()
                        .addComponent(stoneshopupgradetext1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stoneshoppanelbuy1))
                    .addGroup(stoneshoppanelLayout.createSequentialGroup()
                        .addComponent(stoneshopupgradetext2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stoneshoppanelbuy9))
                    .addGroup(stoneshoppanelLayout.createSequentialGroup()
                        .addComponent(stoneshopupgradetext3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stoneshoppanelbuy10))
                    .addGroup(stoneshoppanelLayout.createSequentialGroup()
                        .addComponent(stoneshopupgradetext4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stoneshoppanelbuy11))
                    .addGroup(stoneshoppanelLayout.createSequentialGroup()
                        .addComponent(stoneshopupgradetext5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stoneshoppanelbuy12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 326, Short.MAX_VALUE)
                .addGroup(stoneshoppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stoneshoppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(gemcounter1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stonecounter1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                    .addComponent(stoneshopbackbutton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        stoneshoppanelLayout.setVerticalGroup(
            stoneshoppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stoneshoppanelLayout.createSequentialGroup()
                .addGroup(stoneshoppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(stoneshoppanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(stonecounter1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(stoneshoppanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(stoneshoppaneltitle)))
                .addGap(18, 18, 18)
                .addGroup(stoneshoppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gemcounter1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stoneshopupgradetext)
                    .addComponent(stoneshoppanelbuy, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(stoneshoppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stoneshopupgradetext1)
                    .addComponent(stoneshoppanelbuy1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(stoneshoppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stoneshopupgradetext2)
                    .addComponent(stoneshoppanelbuy9, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(stoneshoppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stoneshopupgradetext3)
                    .addComponent(stoneshoppanelbuy10, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(stoneshoppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stoneshopupgradetext4)
                    .addComponent(stoneshoppanelbuy11, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(stoneshoppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stoneshopupgradetext5)
                    .addComponent(stoneshoppanelbuy12, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(stoneshopbackbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1570, 1570, 1570))
        );

        luckyboxpanel.setBackground(new java.awt.Color(240, 240, 190));

        luckyboxpanelbuy.setBackground(new java.awt.Color(0, 0, 0));
        luckyboxpanelbuy.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        luckyboxpanelbuy.setForeground(new java.awt.Color(240, 240, 240));
        luckyboxpanelbuy.setText("BUY");
        luckyboxpanelbuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        luckyboxpanelbuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luckyboxpanelbuyActionPerformed(evt);
            }
        });

        stonecounter3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        stonecounter3.setText("Stone: ");
        stonecounter3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        gemcounter5.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        gemcounter5.setForeground(new java.awt.Color(153, 0, 153));
        gemcounter5.setText("Gem: ");
        gemcounter5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        luckyboxpaneltext.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        luckyboxpaneltext.setText("█Cheap lucky box = 100 stones.");

        stoneshoppaneltitle1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        stoneshoppaneltitle1.setText("LUCKY BOX");

        stoneshopbackbutton1.setBackground(new java.awt.Color(0, 0, 0));
        stoneshopbackbutton1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        stoneshopbackbutton1.setForeground(new java.awt.Color(240, 0, 0));
        stoneshopbackbutton1.setText("Back>");
        stoneshopbackbutton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stoneshopbackbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stoneshopbackbutton1ActionPerformed(evt);
            }
        });

        luckyboxpanelbuy1.setBackground(new java.awt.Color(0, 0, 0));
        luckyboxpanelbuy1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        luckyboxpanelbuy1.setForeground(new java.awt.Color(240, 240, 240));
        luckyboxpanelbuy1.setText("BUY");
        luckyboxpanelbuy1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        luckyboxpanelbuy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luckyboxpanelbuy1ActionPerformed(evt);
            }
        });

        luckyboxpaneltext1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        luckyboxpaneltext1.setForeground(new java.awt.Color(0, 0, 211));
        luckyboxpaneltext1.setText("█Normal lucky box = 10000 stones.");

        luckyboxpaneltext2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        luckyboxpaneltext2.setForeground(new java.awt.Color(111, 0, 0));
        luckyboxpaneltext2.setText("█Strong lucky box = 500000 stones.");

        luckyboxpanelbuy2.setBackground(new java.awt.Color(0, 0, 0));
        luckyboxpanelbuy2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        luckyboxpanelbuy2.setForeground(new java.awt.Color(240, 240, 240));
        luckyboxpanelbuy2.setText("BUY");
        luckyboxpanelbuy2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        luckyboxpanelbuy2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luckyboxpanelbuy2ActionPerformed(evt);
            }
        });

        luckyboxpaneltext3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        luckyboxpaneltext3.setForeground(new java.awt.Color(150, 0, 150));
        luckyboxpaneltext3.setText("█Gem lucky box = 100 Gems.");

        luckyboxpanelbuy3.setBackground(new java.awt.Color(0, 0, 0));
        luckyboxpanelbuy3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        luckyboxpanelbuy3.setForeground(new java.awt.Color(240, 240, 240));
        luckyboxpanelbuy3.setText("BUY");
        luckyboxpanelbuy3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        luckyboxpanelbuy3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luckyboxpanelbuy3ActionPerformed(evt);
            }
        });

        luckyboxpaneltext4.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        luckyboxpaneltext4.setForeground(new java.awt.Color(222, 0, 222));
        luckyboxpaneltext4.setText("█Strong Gem lucky box = 2500 gems.");

        luckyboxpanelbuy4.setBackground(new java.awt.Color(0, 0, 0));
        luckyboxpanelbuy4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        luckyboxpanelbuy4.setForeground(new java.awt.Color(240, 240, 240));
        luckyboxpanelbuy4.setText("BUY");
        luckyboxpanelbuy4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        luckyboxpanelbuy4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luckyboxpanelbuy4ActionPerformed(evt);
            }
        });

        didwin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        didwin.setText("Your last Unboxing: x");

        javax.swing.GroupLayout luckyboxpanelLayout = new javax.swing.GroupLayout(luckyboxpanel);
        luckyboxpanel.setLayout(luckyboxpanelLayout);
        luckyboxpanelLayout.setHorizontalGroup(
            luckyboxpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(luckyboxpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(luckyboxpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(luckyboxpanelLayout.createSequentialGroup()
                        .addComponent(didwin, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(luckyboxpanelLayout.createSequentialGroup()
                        .addGroup(luckyboxpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(luckyboxpanelLayout.createSequentialGroup()
                                .addComponent(luckyboxpaneltext)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(luckyboxpanelbuy))
                            .addComponent(stoneshoppaneltitle1)
                            .addGroup(luckyboxpanelLayout.createSequentialGroup()
                                .addComponent(luckyboxpaneltext1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(luckyboxpanelbuy1))
                            .addGroup(luckyboxpanelLayout.createSequentialGroup()
                                .addComponent(luckyboxpaneltext2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(luckyboxpanelbuy2))
                            .addGroup(luckyboxpanelLayout.createSequentialGroup()
                                .addComponent(luckyboxpaneltext3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(luckyboxpanelbuy3))
                            .addGroup(luckyboxpanelLayout.createSequentialGroup()
                                .addComponent(luckyboxpaneltext4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(luckyboxpanelbuy4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(luckyboxpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, luckyboxpanelLayout.createSequentialGroup()
                                .addGroup(luckyboxpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(gemcounter5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(stonecounter3, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, luckyboxpanelLayout.createSequentialGroup()
                                .addComponent(stoneshopbackbutton1)
                                .addGap(30, 30, 30))))))
        );
        luckyboxpanelLayout.setVerticalGroup(
            luckyboxpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(luckyboxpanelLayout.createSequentialGroup()
                .addGroup(luckyboxpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(luckyboxpanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(stonecounter3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(luckyboxpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(stoneshoppaneltitle1)))
                .addGap(24, 24, 24)
                .addGroup(luckyboxpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gemcounter5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(luckyboxpaneltext)
                    .addComponent(luckyboxpanelbuy, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(luckyboxpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(luckyboxpaneltext1)
                    .addComponent(luckyboxpanelbuy1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(luckyboxpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(luckyboxpaneltext2)
                    .addComponent(luckyboxpanelbuy2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(luckyboxpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(luckyboxpaneltext3)
                    .addComponent(luckyboxpanelbuy3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(luckyboxpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(luckyboxpaneltext4)
                    .addComponent(luckyboxpanelbuy4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(didwin, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(stoneshopbackbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        statpanel.setBackground(new java.awt.Color(220, 180, 150));

        stonecounter6.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        stonecounter6.setText("Stone: ");
        stonecounter6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        gemcounter6.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        gemcounter6.setForeground(new java.awt.Color(153, 0, 153));
        gemcounter6.setText("Gem: ");
        gemcounter6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        statpaneladdedstone.setBackground(new java.awt.Color(240, 124, 124));
        statpaneladdedstone.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        statpaneladdedstone.setText("Every time you mine, you get x Stones.");

        statpaneltitle.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        statpaneltitle.setText("YOUR STATS");

        stoneshopbackbutton2.setBackground(new java.awt.Color(0, 0, 0));
        stoneshopbackbutton2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        stoneshopbackbutton2.setForeground(new java.awt.Color(240, 0, 0));
        stoneshopbackbutton2.setText("Back>");
        stoneshopbackbutton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stoneshopbackbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stoneshopbackbutton2ActionPerformed(evt);
            }
        });

        statpaneltotalminetimes.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        statpaneltotalminetimes.setForeground(new java.awt.Color(255, 102, 102));
        statpaneltotalminetimes.setText("You mined x times in total.");

        statpanelgregadded.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        statpanelgregadded.setForeground(new java.awt.Color(51, 255, 51));
        statpanelgregadded.setText("Buy G.R.E.G to see more stats...");

        statpanelgregminedintotal.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        statpanelgregminedintotal.setForeground(new java.awt.Color(51, 255, 51));
        statpanelgregminedintotal.setText(" ");

        statpanelgregfoundgemsintotal.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        statpanelgregfoundgemsintotal.setForeground(new java.awt.Color(51, 255, 51));
        statpanelgregfoundgemsintotal.setText(" ");

        isboostactivelabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        isboostactivelabel.setForeground(new java.awt.Color(0, 204, 51));
        isboostactivelabel.setText("BlaBla boost is active");

        javax.swing.GroupLayout statpanelLayout = new javax.swing.GroupLayout(statpanel);
        statpanel.setLayout(statpanelLayout);
        statpanelLayout.setHorizontalGroup(
            statpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statpanelLayout.createSequentialGroup()
                        .addGroup(statpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statpaneltitle)
                            .addComponent(statpaneladdedstone, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statpaneltotalminetimes, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statpanelgregadded, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statpanelgregminedintotal, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statpanelgregfoundgemsintotal, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(statpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(gemcounter6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(stonecounter6, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statpanelLayout.createSequentialGroup()
                                .addComponent(stoneshopbackbutton2)
                                .addGap(20, 20, 20)))
                        .addContainerGap())
                    .addGroup(statpanelLayout.createSequentialGroup()
                        .addComponent(isboostactivelabel)
                        .addContainerGap(723, Short.MAX_VALUE))))
        );
        statpanelLayout.setVerticalGroup(
            statpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statpanelLayout.createSequentialGroup()
                .addGroup(statpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statpanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(stonecounter6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(statpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(statpaneltitle)))
                .addGap(18, 18, 18)
                .addComponent(gemcounter6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(statpaneladdedstone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statpaneltotalminetimes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(statpanelgregadded, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statpanelgregminedintotal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statpanelgregfoundgemsintotal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(isboostactivelabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(stoneshopbackbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        gregpanel1.setBackground(new java.awt.Color(210, 210, 240));

        gregpanel1mainbuy.setBackground(new java.awt.Color(0, 0, 0));
        gregpanel1mainbuy.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        gregpanel1mainbuy.setForeground(new java.awt.Color(90, 210, 80));
        gregpanel1mainbuy.setText("BUY");
        gregpanel1mainbuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gregpanel1mainbuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gregpanel1mainbuyActionPerformed(evt);
            }
        });

        stonecounter5.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        stonecounter5.setText("Stone: ");
        stonecounter5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        gemcounter3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        gemcounter3.setForeground(new java.awt.Color(153, 0, 153));
        gemcounter3.setText("Gem: ");
        gemcounter3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        gregpanelupgradetext5.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        gregpanelupgradetext5.setText("Do you want to buy G.R.E.G?");

        gregpaneltitle1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        gregpaneltitle1.setForeground(new java.awt.Color(90, 210, 90));
        gregpaneltitle1.setText("G.R.E.G Panel");

        gregpanel1backbutton.setBackground(new java.awt.Color(0, 0, 0));
        gregpanel1backbutton.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        gregpanel1backbutton.setForeground(new java.awt.Color(240, 0, 0));
        gregpanel1backbutton.setText("Back>");
        gregpanel1backbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gregpanel1backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gregpanel1backbuttonActionPerformed(evt);
            }
        });

        gregpanel1infoline.setBackground(new java.awt.Color(200, 240, 200));
        gregpanel1infoline.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gregpanel1infoline.setText("GREG is a robot helper that mines for you. It starts with +1 stone");

        gregpanel1infoline1.setBackground(new java.awt.Color(200, 240, 200));
        gregpanel1infoline1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gregpanel1infoline1.setText("per action(action means every time when you click any button).");

        gregpanel1infoline2.setBackground(new java.awt.Color(200, 240, 200));
        gregpanel1infoline2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gregpanel1infoline2.setText("You can upgrade it,  if you want it to be more efficient.");

        gregpanel1infoline3.setBackground(new java.awt.Color(200, 240, 200));
        gregpanel1infoline3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gregpanel1infoline3.setText("GREG can also find pile of gems for you randomly.");

        gregpanel1infoline4.setBackground(new java.awt.Color(200, 240, 200));
        gregpanel1infoline4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gregpanel1infoline4.setText("If you decide to buy it, you will no longer see this screen. Instead");

        gregpanel1infoline5.setBackground(new java.awt.Color(200, 240, 200));
        gregpanel1infoline5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gregpanel1infoline5.setText("you will see his upgrade options. The Stat screen will have 3 more");

        gregpanel1infoline6.setBackground(new java.awt.Color(200, 240, 200));
        gregpanel1infoline6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gregpanel1infoline6.setText("stats about greg when you buy it.");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 0, 200));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("100 Gems");

        javax.swing.GroupLayout gregpanel1Layout = new javax.swing.GroupLayout(gregpanel1);
        gregpanel1.setLayout(gregpanel1Layout);
        gregpanel1Layout.setHorizontalGroup(
            gregpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gregpanel1Layout.createSequentialGroup()
                .addGroup(gregpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gregpanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(gregpaneltitle1))
                    .addGroup(gregpanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(gregpanel1infoline, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gregpanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(gregpanel1infoline1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gregpanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(gregpanel1infoline2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gregpanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(gregpanel1infoline3, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gregpanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(gregpanel1infoline4, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gregpanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(gregpanel1infoline5, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gregpanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(gregpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gregpanel1infoline6, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(gregpanel1Layout.createSequentialGroup()
                                .addComponent(gregpanelupgradetext5)
                                .addGap(18, 18, 18)
                                .addGroup(gregpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(gregpanel1mainbuy, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(gregpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gregpanel1Layout.createSequentialGroup()
                        .addGroup(gregpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gemcounter3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stonecounter5, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gregpanel1Layout.createSequentialGroup()
                        .addComponent(gregpanel1backbutton)
                        .addGap(30, 30, 30))))
        );
        gregpanel1Layout.setVerticalGroup(
            gregpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gregpanel1Layout.createSequentialGroup()
                .addGroup(gregpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gregpanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(stonecounter5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gregpanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(gregpaneltitle1)))
                .addGroup(gregpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gregpanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(gemcounter3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gregpanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gregpanel1infoline, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gregpanel1infoline1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gregpanel1infoline2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gregpanel1infoline3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gregpanel1infoline4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gregpanel1infoline5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gregpanel1infoline6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gregpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gregpanelupgradetext5)
                    .addComponent(gregpanel1mainbuy, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(gregpanel1backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        gregpanel2.setBackground(new java.awt.Color(210, 210, 240));

        gregpanelbuy.setBackground(new java.awt.Color(0, 0, 0));
        gregpanelbuy.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        gregpanelbuy.setForeground(new java.awt.Color(90, 210, 80));
        gregpanelbuy.setText("BUY");
        gregpanelbuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gregpanelbuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gregpanelbuyActionPerformed(evt);
            }
        });

        stonecounter4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        stonecounter4.setText("Stone: ");
        stonecounter4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        gemcounter4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        gemcounter4.setForeground(new java.awt.Color(153, 0, 153));
        gemcounter4.setText("Gem: ");
        gemcounter4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        gregpanelupgradetext.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        gregpanelupgradetext.setText("Better Drill for Greg(+1000 SPA)= 300 Gems");

        gregpaneltitle.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        gregpaneltitle.setForeground(new java.awt.Color(90, 210, 90));
        gregpaneltitle.setText("G.R.E.G Panel");

        gregpanel2backbutton.setBackground(new java.awt.Color(0, 0, 0));
        gregpanel2backbutton.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        gregpanel2backbutton.setForeground(new java.awt.Color(240, 0, 0));
        gregpanel2backbutton.setText("Back>");
        gregpanel2backbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gregpanel2backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gregpanel2backbuttonActionPerformed(evt);
            }
        });

        gregpanelbuy1.setBackground(new java.awt.Color(0, 0, 0));
        gregpanelbuy1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        gregpanelbuy1.setForeground(new java.awt.Color(90, 210, 80));
        gregpanelbuy1.setText("BUY");
        gregpanelbuy1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gregpanelbuy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gregpanelbuy1ActionPerformed(evt);
            }
        });

        gregpanelupgradetext1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        gregpanelupgradetext1.setText("Better AI for Greg(+100k SPA)= 50000 Gems");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 51));
        jLabel15.setText("GREG BOOSTS");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 204, 0));
        jLabel16.setText("MICRO boost = adds 1.6x boost to your income for 10 actions. ");

        microboostpricelabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        microboostpricelabel.setForeground(new java.awt.Color(0, 153, 0));
        microboostpricelabel.setText("price");

        microboostbuybutton.setBackground(new java.awt.Color(0, 0, 0));
        microboostbuybutton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        microboostbuybutton.setForeground(new java.awt.Color(0, 153, 51));
        microboostbuybutton.setText("BUY");
        microboostbuybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                microboostbuybuttonActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 204, 0));
        jLabel17.setText("MACRO boost = adds 1.8x boost to your income for 10 actions. ");

        macroboostpricelabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        macroboostpricelabel.setForeground(new java.awt.Color(0, 153, 0));
        macroboostpricelabel.setText("price");

        macroboostbuybutton.setBackground(new java.awt.Color(0, 0, 0));
        macroboostbuybutton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        macroboostbuybutton.setForeground(new java.awt.Color(0, 153, 51));
        macroboostbuybutton.setText("BUY");
        macroboostbuybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                macroboostbuybuttonActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 204, 0));
        jLabel18.setText("SMALL boost = adds 2x boost to your income for 10 actions. ");

        smallboostpricelabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        smallboostpricelabel.setForeground(new java.awt.Color(0, 153, 0));
        smallboostpricelabel.setText("price");

        smallboostbuybutton.setBackground(new java.awt.Color(0, 0, 0));
        smallboostbuybutton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        smallboostbuybutton.setForeground(new java.awt.Color(0, 153, 51));
        smallboostbuybutton.setText("BUY");
        smallboostbuybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smallboostbuybuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gregpanel2Layout = new javax.swing.GroupLayout(gregpanel2);
        gregpanel2.setLayout(gregpanel2Layout);
        gregpanel2Layout.setHorizontalGroup(
            gregpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gregpanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gregpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gregpanel2Layout.createSequentialGroup()
                        .addGroup(gregpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gregpanel2Layout.createSequentialGroup()
                                .addComponent(gregpanelupgradetext)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gregpanelbuy))
                            .addComponent(gregpaneltitle)
                            .addGroup(gregpanel2Layout.createSequentialGroup()
                                .addComponent(gregpanelupgradetext1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gregpanelbuy1))
                            .addGroup(gregpanel2Layout.createSequentialGroup()
                                .addComponent(smallboostpricelabel)
                                .addGap(18, 18, 18)
                                .addComponent(smallboostbuybutton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                        .addGroup(gregpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gregpanel2Layout.createSequentialGroup()
                                .addGroup(gregpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(gemcounter4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(stonecounter4, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gregpanel2Layout.createSequentialGroup()
                                .addComponent(gregpanel2backbutton)
                                .addGap(30, 30, 30))))
                    .addGroup(gregpanel2Layout.createSequentialGroup()
                        .addGroup(gregpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gregpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel16)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, gregpanel2Layout.createSequentialGroup()
                                    .addComponent(microboostpricelabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(microboostbuybutton)))
                            .addComponent(jLabel15)
                            .addComponent(jLabel17)
                            .addGroup(gregpanel2Layout.createSequentialGroup()
                                .addComponent(macroboostpricelabel)
                                .addGap(18, 18, 18)
                                .addComponent(macroboostbuybutton))
                            .addComponent(jLabel18))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        gregpanel2Layout.setVerticalGroup(
            gregpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gregpanel2Layout.createSequentialGroup()
                .addGroup(gregpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gregpanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(stonecounter4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gregpanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(gregpaneltitle)))
                .addGap(18, 18, 18)
                .addGroup(gregpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gemcounter4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gregpanelupgradetext)
                    .addComponent(gregpanelbuy, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(gregpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gregpanelupgradetext1)
                    .addComponent(gregpanelbuy1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gregpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(microboostbuybutton)
                    .addComponent(microboostpricelabel))
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gregpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(macroboostpricelabel)
                    .addComponent(macroboostbuybutton))
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addGroup(gregpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gregpanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gregpanel2backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(gregpanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gregpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(smallboostpricelabel)
                            .addComponent(smallboostbuybutton))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        gemshoppanel.setBackground(new java.awt.Color(210, 190, 240));

        stonecounter2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        stonecounter2.setText("Stone: ");
        stonecounter2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        gemcounter2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        gemcounter2.setForeground(new java.awt.Color(153, 0, 153));
        gemcounter2.setText("Gem: ");
        gemcounter2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        gemshoppaneltitle.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        gemshoppaneltitle.setForeground(new java.awt.Color(240, 0, 240));
        gemshoppaneltitle.setText("GEM SHOP");

        gemshopbackbutton.setBackground(new java.awt.Color(0, 0, 0));
        gemshopbackbutton.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        gemshopbackbutton.setForeground(new java.awt.Color(240, 0, 0));
        gemshopbackbutton.setText("Back>");
        gemshopbackbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gemshopbackbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gemshopbackbuttonActionPerformed(evt);
            }
        });

        gemshoppanelbuy2.setBackground(new java.awt.Color(0, 0, 0));
        gemshoppanelbuy2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        gemshoppanelbuy2.setForeground(new java.awt.Color(240, 40, 240));
        gemshoppanelbuy2.setText("BUY");
        gemshoppanelbuy2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gemshoppanelbuy2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gemshoppanelbuy2ActionPerformed(evt);
            }
        });

        gemshopupgradetext2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        gemshopupgradetext2.setText("Exampleupgrade(+x) = 10 Stone");

        gemshoppanelbuy3.setBackground(new java.awt.Color(0, 0, 0));
        gemshoppanelbuy3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        gemshoppanelbuy3.setForeground(new java.awt.Color(240, 40, 240));
        gemshoppanelbuy3.setText("BUY");
        gemshoppanelbuy3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gemshoppanelbuy3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gemshoppanelbuy3ActionPerformed(evt);
            }
        });

        gemshopupgradetext3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        gemshopupgradetext3.setText("Exampleupgrade(+x) = 10 Stone");

        gemshoppanelbuy4.setBackground(new java.awt.Color(0, 0, 0));
        gemshoppanelbuy4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        gemshoppanelbuy4.setForeground(new java.awt.Color(240, 40, 240));
        gemshoppanelbuy4.setText("BUY");
        gemshoppanelbuy4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gemshoppanelbuy4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gemshoppanelbuy4ActionPerformed(evt);
            }
        });

        gemshopupgradetext4.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        gemshopupgradetext4.setText("Exampleupgrade(+x) = 10 Stone");

        gemshoppanelbuy5.setBackground(new java.awt.Color(0, 0, 0));
        gemshoppanelbuy5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        gemshoppanelbuy5.setForeground(new java.awt.Color(240, 40, 240));
        gemshoppanelbuy5.setText("BUY");
        gemshoppanelbuy5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gemshoppanelbuy5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gemshoppanelbuy5ActionPerformed(evt);
            }
        });

        gemshopupgradetext5.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        gemshopupgradetext5.setText("Exampleupgrade(+x) = 10 Stone");

        gemshopupgradetext6.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        gemshopupgradetext6.setText("Exampleupgrade(+x) = 10 Stone");

        gemshoppanelbuy6.setBackground(new java.awt.Color(0, 0, 0));
        gemshoppanelbuy6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        gemshoppanelbuy6.setForeground(new java.awt.Color(240, 40, 240));
        gemshoppanelbuy6.setText("BUY");
        gemshoppanelbuy6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gemshoppanelbuy6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gemshoppanelbuy6ActionPerformed(evt);
            }
        });

        gemshoppanelbuy7.setBackground(new java.awt.Color(0, 0, 0));
        gemshoppanelbuy7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        gemshoppanelbuy7.setForeground(new java.awt.Color(240, 40, 240));
        gemshoppanelbuy7.setText("BUY");
        gemshoppanelbuy7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gemshoppanelbuy7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gemshoppanelbuy7ActionPerformed(evt);
            }
        });

        gemshopupgradetext7.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        gemshopupgradetext7.setText("Exampleupgrade(+x) = 10 Stone");

        gemconverterslider.setBackground(new java.awt.Color(255, 51, 255));
        gemconverterslider.setForeground(new java.awt.Color(0, 0, 0));
        gemconverterslider.setMajorTickSpacing(15);
        gemconverterslider.setMaximum(1000);
        gemconverterslider.setMinimum(1);
        gemconverterslider.setPaintTicks(true);
        gemconverterslider.setSnapToTicks(true);
        gemconverterslider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                gemconvertersliderStateChanged(evt);
            }
        });

        convertbutton.setBackground(new java.awt.Color(0, 0, 0));
        convertbutton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        convertbutton.setForeground(new java.awt.Color(255, 0, 255));
        convertbutton.setText("CONVERT");
        convertbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertbuttonActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 255));
        jLabel13.setText("Selected GEM:");

        jLabel14.setBackground(new java.awt.Color(255, 0, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Cost:");

        selectedgemlabel.setBackground(new java.awt.Color(0, 0, 0));
        selectedgemlabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        selectedgemlabel.setForeground(new java.awt.Color(255, 0, 255));
        selectedgemlabel.setText("00");

        gemslidercost.setBackground(new java.awt.Color(255, 0, 255));
        gemslidercost.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gemslidercost.setText("00");

        javax.swing.GroupLayout gemshoppanelLayout = new javax.swing.GroupLayout(gemshoppanel);
        gemshoppanel.setLayout(gemshoppanelLayout);
        gemshoppanelLayout.setHorizontalGroup(
            gemshoppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gemshoppanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gemshoppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gemshoppaneltitle)
                    .addGroup(gemshoppanelLayout.createSequentialGroup()
                        .addComponent(gemshopupgradetext3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gemshoppanelbuy3))
                    .addGroup(gemshoppanelLayout.createSequentialGroup()
                        .addComponent(gemshopupgradetext4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gemshoppanelbuy4))
                    .addGroup(gemshoppanelLayout.createSequentialGroup()
                        .addComponent(gemshopupgradetext5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gemshoppanelbuy5))
                    .addGroup(gemshoppanelLayout.createSequentialGroup()
                        .addComponent(gemshopupgradetext6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gemshoppanelbuy6))
                    .addGroup(gemshoppanelLayout.createSequentialGroup()
                        .addComponent(gemshopupgradetext7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gemshoppanelbuy7))
                    .addGroup(gemshoppanelLayout.createSequentialGroup()
                        .addComponent(gemconverterslider, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(convertbutton))
                    .addGroup(gemshoppanelLayout.createSequentialGroup()
                        .addGroup(gemshoppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gemshopupgradetext2)
                            .addGroup(gemshoppanelLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectedgemlabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gemshoppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gemshoppanelbuy2)
                            .addGroup(gemshoppanelLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(gemslidercost)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addGroup(gemshoppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gemshoppanelLayout.createSequentialGroup()
                        .addGroup(gemshoppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gemcounter2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stonecounter2, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gemshoppanelLayout.createSequentialGroup()
                        .addComponent(gemshopbackbutton)
                        .addGap(30, 30, 30))))
        );
        gemshoppanelLayout.setVerticalGroup(
            gemshoppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gemshoppanelLayout.createSequentialGroup()
                .addGroup(gemshoppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gemshoppanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(stonecounter2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gemshoppanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(gemshoppaneltitle)))
                .addGroup(gemshoppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gemshoppanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(gemcounter2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gemshoppanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(gemshoppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(convertbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gemconverterslider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(gemshoppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gemshoppanelLayout.createSequentialGroup()
                        .addGroup(gemshoppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(selectedgemlabel))
                        .addGap(28, 28, 28)
                        .addGroup(gemshoppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gemshopupgradetext2)
                            .addComponent(gemshoppanelbuy2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(gemshoppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gemshopupgradetext3)
                            .addComponent(gemshoppanelbuy3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(gemshoppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gemshopupgradetext4)
                            .addComponent(gemshoppanelbuy4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(gemshoppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gemshopupgradetext5)
                            .addComponent(gemshoppanelbuy5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(gemshoppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gemshopupgradetext6)
                            .addComponent(gemshoppanelbuy6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(gemshoppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gemshopupgradetext7)
                            .addComponent(gemshoppanelbuy7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(gemshopbackbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(gemshoppanelLayout.createSequentialGroup()
                        .addGroup(gemshoppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(gemslidercost))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        settingspanel.setBackground(new java.awt.Color(210, 210, 240));

        gregpaneltitle2.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        gregpaneltitle2.setForeground(new java.awt.Color(24, 210, 190));
        gregpaneltitle2.setText("SETTINGS");

        settingspanelbackbutton.setBackground(new java.awt.Color(0, 0, 0));
        settingspanelbackbutton.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        settingspanelbackbutton.setForeground(new java.awt.Color(240, 0, 0));
        settingspanelbackbutton.setText("Back>");
        settingspanelbackbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingspanelbackbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingspanelbackbuttonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("TERMINAL:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Done");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("NOTIFICATION:");

        notification.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        notification.setForeground(new java.awt.Color(240, 0, 0));

        javax.swing.GroupLayout settingspanelLayout = new javax.swing.GroupLayout(settingspanel);
        settingspanel.setLayout(settingspanelLayout);
        settingspanelLayout.setHorizontalGroup(
            settingspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingspanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(settingspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingspanelLayout.createSequentialGroup()
                        .addComponent(gregpaneltitle2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(settingspanelbackbutton)
                        .addGap(30, 30, 30))
                    .addGroup(settingspanelLayout.createSequentialGroup()
                        .addGroup(settingspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(settingspanelLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addGroup(settingspanelLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(notification, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(430, Short.MAX_VALUE))))
        );
        settingspanelLayout.setVerticalGroup(
            settingspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingspanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gregpaneltitle2)
                .addGap(18, 18, 18)
                .addGroup(settingspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(settingspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notification, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                .addComponent(settingspanelbackbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        prestigepanel.setBackground(new java.awt.Color(100, 150, 100));

        prestigepaneltitle.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        prestigepaneltitle.setForeground(new java.awt.Color(240, 240, 240));
        prestigepaneltitle.setText("Prestige");

        prestigepanelbackbutton.setBackground(new java.awt.Color(0, 0, 0));
        prestigepanelbackbutton.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        prestigepanelbackbutton.setForeground(new java.awt.Color(240, 0, 0));
        prestigepanelbackbutton.setText("Back>");
        prestigepanelbackbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prestigepanelbackbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestigepanelbackbuttonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("█Prestige adds +1 to the multiplier in the upgrades.");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("█It makes you grow more efficiently.");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("█If you are stuck, this will help you a lot.");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 0, 0));
        jLabel9.setText("█You will lose all of your STONES and GEMS.");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 0, 0));
        jLabel10.setText("█This will RESET your income per mining.");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 0, 0));
        jLabel11.setText("█It will RESET all of your upgrades. This includes their prices too.");

        jLabel12.setBackground(new java.awt.Color(240, 0, 0));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 0, 0));
        jLabel12.setText("█This will RESET G.R.E.G and his upgrades,");

        prestigepanelno.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        prestigepanelno.setForeground(new java.awt.Color(240, 0, 0));
        prestigepanelno.setText("No");
        prestigepanelno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestigepanelnoActionPerformed(evt);
            }
        });

        prestigepanelmainbutton1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        prestigepanelmainbutton1.setForeground(new java.awt.Color(240, 0, 0));
        prestigepanelmainbutton1.setText("PRESTIGE");
        prestigepanelmainbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestigepanelmainbutton1ActionPerformed(evt);
            }
        });

        prestigepanelyes.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        prestigepanelyes.setForeground(new java.awt.Color(0, 240, 0));
        prestigepanelyes.setText("Yes");
        prestigepanelyes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestigepanelyesActionPerformed(evt);
            }
        });

        prestigepanellastasktext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        prestigepanellastasktext.setForeground(new java.awt.Color(240, 240, 240));
        prestigepanellastasktext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prestigepanellastasktext.setText("Are you sure?");

        javax.swing.GroupLayout prestigepanelLayout = new javax.swing.GroupLayout(prestigepanel);
        prestigepanel.setLayout(prestigepanelLayout);
        prestigepanelLayout.setHorizontalGroup(
            prestigepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prestigepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(prestigepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(prestigepanelLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(prestigepanelLayout.createSequentialGroup()
                        .addGroup(prestigepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(prestigepanelLayout.createSequentialGroup()
                                .addGroup(prestigepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addComponent(prestigepanelmainbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(prestigepanelLayout.createSequentialGroup()
                        .addGroup(prestigepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, prestigepanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(prestigepanelyes, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(prestigepanelno, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, prestigepanelLayout.createSequentialGroup()
                                .addComponent(prestigepaneltitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(prestigepanelbackbutton))
                            .addGroup(prestigepanelLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                                .addComponent(prestigepanellastasktext, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))))
        );
        prestigepanelLayout.setVerticalGroup(
            prestigepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prestigepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(prestigepaneltitle)
                .addGroup(prestigepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(prestigepanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(prestigepanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(prestigepanelmainbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(prestigepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(prestigepanelLayout.createSequentialGroup()
                        .addComponent(prestigepanellastasktext, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(prestigepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prestigepanelno, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prestigepanelyes, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(prestigepanelbackbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gregpanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(settingspanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stoneshoppanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gemshoppanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(girispaneli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(luckyboxpanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prestigepanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(statpanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gregpanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(anapanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(girispaneli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anapanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(luckyboxpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stoneshoppanel, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gemshoppanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(statpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(gregpanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(settingspanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(gregpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prestigepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void girispanelstartbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girispanelstartbuttonActionPerformed
        anapanelac();
        counterupdateall();
    }//GEN-LAST:event_girispanelstartbuttonActionPerformed

    private void stoneshoppanelbuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stoneshoppanelbuyActionPerformed
        verysmall();
        gregsystem();

        stonecounter.setText("Stone: " + stone);
        stonecounter1.setText("Stone: " + stone);
        stonecounter2.setText("Stone: " + stone);
        stonecounter3.setText("Stone: " + stone);
        stonecounter4.setText("Stone: " + stone);
        stonecounter5.setText("Stone: " + stone);
        stonecounter6.setText("Stone: " + stone);

    }//GEN-LAST:event_stoneshoppanelbuyActionPerformed

    private void stoneshopbackbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stoneshopbackbuttonActionPerformed
        gregsystem();
        anapanelac();

    }//GEN-LAST:event_stoneshopbackbuttonActionPerformed

    private void gemshopbackbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gemshopbackbuttonActionPerformed
        gregsystem();
        anapanelac();

    }//GEN-LAST:event_gemshopbackbuttonActionPerformed

    private void gemshoppanelbuy2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gemshoppanelbuy2ActionPerformed
        gregsystem();
        gematt();

    }//GEN-LAST:event_gemshoppanelbuy2ActionPerformed

    private void gemshoppanelbuy3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gemshoppanelbuy3ActionPerformed
        gregsystem();
        gemrune();

    }//GEN-LAST:event_gemshoppanelbuy3ActionPerformed

    private void gemshoppanelbuy4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gemshoppanelbuy4ActionPerformed
        gregsystem();
        gemcloak();

    }//GEN-LAST:event_gemshoppanelbuy4ActionPerformed

    private void gemshoppanelbuy5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gemshoppanelbuy5ActionPerformed
        gregsystem();
        gemarmor();

    }//GEN-LAST:event_gemshoppanelbuy5ActionPerformed

    private void gemshoppanelbuy6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gemshoppanelbuy6ActionPerformed
        gregsystem();
        gemring();

    }//GEN-LAST:event_gemshoppanelbuy6ActionPerformed

    private void gemshoppanelbuy7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gemshoppanelbuy7ActionPerformed
        gregsystem();
        gemrelic();

    }//GEN-LAST:event_gemshoppanelbuy7ActionPerformed

    private void stoneshoppanelbuy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stoneshoppanelbuy1ActionPerformed
        small();
        gregsystem();
        counterupdateall();

    }//GEN-LAST:event_stoneshoppanelbuy1ActionPerformed

    private void stoneshoppanelbuy9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stoneshoppanelbuy9ActionPerformed
        medium();
        gregsystem();
        counterupdateall();

    }//GEN-LAST:event_stoneshoppanelbuy9ActionPerformed

    private void stoneshoppanelbuy10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stoneshoppanelbuy10ActionPerformed
        Big();
        gregsystem();
        counterupdateall();

    }//GEN-LAST:event_stoneshoppanelbuy10ActionPerformed

    private void stoneshoppanelbuy11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stoneshoppanelbuy11ActionPerformed
        Huge();
        gregsystem();
        counterupdateall();

    }//GEN-LAST:event_stoneshoppanelbuy11ActionPerformed

    private void stoneshoppanelbuy12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stoneshoppanelbuy12ActionPerformed
        BlingBling();
        gregsystem();
        counterupdateall();

    }//GEN-LAST:event_stoneshoppanelbuy12ActionPerformed

    private void gregpanelbuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gregpanelbuyActionPerformed
        betterdrillforgreg();
        gregsystem();
        counterupdateall();

    }//GEN-LAST:event_gregpanelbuyActionPerformed

    private void gregpanel2backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gregpanel2backbuttonActionPerformed
        anapanelac();
    }//GEN-LAST:event_gregpanel2backbuttonActionPerformed

    private void gregpanelbuy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gregpanelbuy1ActionPerformed
        betteraiforgreg();
        gregsystem();
        counterupdateall();

    }//GEN-LAST:event_gregpanelbuy1ActionPerformed

    private void gregpanel1mainbuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gregpanel1mainbuyActionPerformed
        buygreg();
        counterupdateall();
        gregsystem();
        if (ownedgreg == 1) {
            gregpanel1.setVisible(false);
            gregpanel2.setVisible(true);
        }
    }//GEN-LAST:event_gregpanel1mainbuyActionPerformed

    private void gregpanel1backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gregpanel1backbuttonActionPerformed
        anapanelac();
    }//GEN-LAST:event_gregpanel1backbuttonActionPerformed

    private void luckyboxpanelbuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luckyboxpanelbuyActionPerformed
        gregsystem();
        case1();
        counterupdateall();
    }//GEN-LAST:event_luckyboxpanelbuyActionPerformed

    private void stoneshopbackbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stoneshopbackbutton1ActionPerformed
        anapanelac();
        gregsystem();
    }//GEN-LAST:event_stoneshopbackbutton1ActionPerformed

    private void luckyboxpanelbuy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luckyboxpanelbuy1ActionPerformed
        gregsystem();
        case2();
        counterupdateall();
    }//GEN-LAST:event_luckyboxpanelbuy1ActionPerformed

    private void luckyboxpanelbuy2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luckyboxpanelbuy2ActionPerformed
        gregsystem();
        case3();
        counterupdateall();
    }//GEN-LAST:event_luckyboxpanelbuy2ActionPerformed

    private void luckyboxpanelbuy3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luckyboxpanelbuy3ActionPerformed
        gregsystem();
        case4();
        counterupdateall();
    }//GEN-LAST:event_luckyboxpanelbuy3ActionPerformed

    private void luckyboxpanelbuy4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luckyboxpanelbuy4ActionPerformed
        gregsystem();
        case5();
        counterupdateall();
    }//GEN-LAST:event_luckyboxpanelbuy4ActionPerformed

    private void stoneshopbackbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stoneshopbackbutton2ActionPerformed
        anapanelac();
        gregsystem();
    }//GEN-LAST:event_stoneshopbackbutton2ActionPerformed

    private void settingspanelbackbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingspanelbackbuttonActionPerformed
        anapanelac();
        notification.setText(" ");
    }//GEN-LAST:event_settingspanelbackbuttonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //CheatCodes

        //sonra kaldirilacak sonsuz kullanimlik hile kodlari
        String adminbir = "lacarnuminflamare";
        if (jTextField1.getText().equals(adminbir)) {
            notification.setText("Admin hilesi aktive edildi. Merhabalar Yigithan Yasa.");
            stone += 1999999999;
            gem += 1999999999;
            counterupdateall();
        }
        //sonra kaldirilacak sonsuz kullanimlik hile kodlari END
        //Normal oyun ici kalici tek kullanimlik kodlar
        if (jTextField1.getText().equals(bir) && bircheck == 0) {
            notification.setText("You are trying so hard. +10000 Stones");
            stone += 10000;
            counterupdateall();
            bircheck += 1;
        }
        if (jTextField1.getText().equals(iki) && ikicheck == 0) {
            notification.setText("Tricky huh? +3 gems and +24000 Stones");
            stone += 24000;
            gem += 3;
            counterupdateall();
            ikicheck += 1;
        }
        if (jTextField1.getText().equals(uc) && uccheck == 0) {
            notification.setText("Scientifically incorrect but who cares. +500k Stones");
            stone += 500000;
            counterupdateall();
            uccheck += 1;
        }
        if (jTextField1.getText().equals(dort) && dortcheck == 0) {
            notification.setText("Big brain time! +1 Stone :l");
            stone += 1;
            counterupdateall();
            dortcheck += 1;
        }
        if (jTextField1.getText().equals(bes) && bescheck == 0) {
            notification.setText("Yes that's me! +2 Gems");
            gem += 2;
            counterupdateall();
            bescheck += 1;
        }
        if (jTextField1.getText().equals(alti) && alticheck == 0) {
            notification.setText("No begging!");
            gem += 1;
            counterupdateall();
            alticheck += 1;
        }
        if (jTextField1.getText().equals(yedi) && yedicheck == 0) {
            notification.setText("I can't give you 100 gems. Sorry man. +1000 Stones");
            stone += 1000;
            counterupdateall();
            yedicheck += 1;
        }
        if (jTextField1.getText().equals(sekiz) && sekizcheck == 0) {
            notification.setText("Always stay positive :> +1 Gem");
            gem += 1;
            counterupdateall();
            sekizcheck += 1;
        }
        if (jTextField1.getText().equals(dokuz) && dokuzcheck == 0) {
            notification.setText("Is that you Senku?? +500k Stone");
            stone += 500000;
            counterupdateall();
            dokuzcheck += 1;
        }
        if (jTextField1.getText().equals(on) && oncheck == 0) {
            notification.setText("Ummm there is a button for that..");
            counterupdateall();
            oncheck += 1;
        }
        if (jTextField1.getText().equals(onbir) && onbircheck == 0) {
            notification.setText("Respawn? -10000 Stone");
            if (stone >= 10000) {
                stone -= 10000;
            }
            counterupdateall();
            onbircheck += 1;
        }
        if (jTextField1.getText().equals(oniki) && onikicheck == 0) {
            notification.setText("No you are not! He is dead.");
            counterupdateall();
            onikicheck += 1;
        }
        if (jTextField1.getText().equals(onuc) && onuccheck == 0) {
            notification.setText("YOU HAVE BEEN ILLUMINATED BY THE SUFFERED SOULS");
            counterupdateall();
            onuccheck += 1;
        }
        //CHEAT CODES END

    }//GEN-LAST:event_jButton1ActionPerformed

    private void prestigepanelbackbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestigepanelbackbuttonActionPerformed
        gregsystem();
        anapanelac();
    }//GEN-LAST:event_prestigepanelbackbuttonActionPerformed

    private void prestigepanelnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestigepanelnoActionPerformed
        prestigepanelmainbutton1.setVisible(true);
        prestigepanelno.setVisible(false);
        prestigepanellastasktext.setVisible(false);
        prestigepanelyes.setVisible(false);
    }//GEN-LAST:event_prestigepanelnoActionPerformed

    private void prestigepanelmainbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestigepanelmainbutton1ActionPerformed
        prestigepanelmainbutton1.setVisible(false);
        prestigepanelno.setVisible(true);
        prestigepanellastasktext.setVisible(true);
        prestigepanelyes.setVisible(true);
    }//GEN-LAST:event_prestigepanelmainbutton1ActionPerformed

    private void prestigepanelyesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestigepanelyesActionPerformed
        doprestige();
        anapanelac();
        counterupdateall();
        correction();
    }//GEN-LAST:event_prestigepanelyesActionPerformed

    private void anapanelbuttonprestigepanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anapanelbuttonprestigepanelActionPerformed
        prestigepanel.setVisible(true);
        anapanel.setVisible(false);
    }//GEN-LAST:event_anapanelbuttonprestigepanelActionPerformed

    private void anapanelbuttonmineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anapanelbuttonmineActionPerformed
        stoneadd();
        correction();
        gregsystem();
        unlocktabs();
        prestigeunlock();
        stonecounter.setText("Stone: " + stone);
        stonecounter1.setText("Stone: " + stone);
        stonecounter2.setText("Stone: " + stone);
        stonecounter3.setText("Stone: " + stone);
        stonecounter4.setText("Stone: " + stone);
        stonecounter5.setText("Stone: " + stone);
        stonecounter6.setText("Stone: " + stone);
    }//GEN-LAST:event_anapanelbuttonmineActionPerformed

    private void anapanelbuttonnull5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anapanelbuttonnull5ActionPerformed
        settingspanel.setVisible(true);
        anapanel.setVisible(false);
        gregsystem();
        counterupdateall();
    }//GEN-LAST:event_anapanelbuttonnull5ActionPerformed

    private void anapanelbuttonnull4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anapanelbuttonnull4ActionPerformed
        stats();
        statpanel.setVisible(true);
        anapanel.setVisible(false);
        gregsystem();
        counterupdateall();
    }//GEN-LAST:event_anapanelbuttonnull4ActionPerformed

    private void anapanelbuttonluckyboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anapanelbuttonluckyboxActionPerformed
        luckyboxpanel.setVisible(true);
        anapanel.setVisible(false);
        gregsystem();
        counterupdateall();
        didwin.setText("");
    }//GEN-LAST:event_anapanelbuttonluckyboxActionPerformed

    private void anapanelbuttongemshopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anapanelbuttongemshopActionPerformed
        anapanel.setVisible(false);
        gemshoppanel.setVisible(true);
        gregsystem();
        counterupdateall();
    }//GEN-LAST:event_anapanelbuttongemshopActionPerformed

    private void anapanelbuttonstonneshopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anapanelbuttonstonneshopActionPerformed

        stoneshoppanel.setVisible(true);
        anapanel.setVisible(false);
        gregsystem();
        counterupdateall();
    }//GEN-LAST:event_anapanelbuttonstonneshopActionPerformed

    private void anapanelbuttongregpanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anapanelbuttongregpanelActionPerformed
        if (ownedgreg == 1) {
            gregpanel2.setVisible(true);
            anapanel.setVisible(false);
        } else {
            gregpanel1.setVisible(true);
            anapanel.setVisible(false);
        }
        gregsystem();
    }//GEN-LAST:event_anapanelbuttongregpanelActionPerformed

    private void convertbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertbuttonActionPerformed
        gemconvert();
    }//GEN-LAST:event_convertbuttonActionPerformed

    private void gemconvertersliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_gemconvertersliderStateChanged
        slidervalue();
    }//GEN-LAST:event_gemconvertersliderStateChanged

    private void microboostbuybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_microboostbuybuttonActionPerformed
        gregboost1();
    }//GEN-LAST:event_microboostbuybuttonActionPerformed

    private void macroboostbuybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_macroboostbuybuttonActionPerformed
        gregboost2();
    }//GEN-LAST:event_macroboostbuybuttonActionPerformed

    private void smallboostbuybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smallboostbuybuttonActionPerformed
        gregboost3();
    }//GEN-LAST:event_smallboostbuybuttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel anapanel;
    private javax.swing.JButton anapanelbuttongemshop;
    private javax.swing.JButton anapanelbuttongregpanel;
    private javax.swing.JButton anapanelbuttonluckybox;
    private javax.swing.JButton anapanelbuttonmine;
    private javax.swing.JButton anapanelbuttonnull4;
    private javax.swing.JButton anapanelbuttonnull5;
    private javax.swing.JButton anapanelbuttonprestigepanel;
    private javax.swing.JButton anapanelbuttonstonneshop;
    private javax.swing.JButton convertbutton;
    private javax.swing.JLabel didwin;
    private javax.swing.JSlider gemconverterslider;
    private javax.swing.JLabel gemcounter;
    private javax.swing.JLabel gemcounter1;
    private javax.swing.JLabel gemcounter2;
    private javax.swing.JLabel gemcounter3;
    private javax.swing.JLabel gemcounter4;
    private javax.swing.JLabel gemcounter5;
    private javax.swing.JLabel gemcounter6;
    private javax.swing.JButton gemshopbackbutton;
    private javax.swing.JPanel gemshoppanel;
    private javax.swing.JButton gemshoppanelbuy2;
    private javax.swing.JButton gemshoppanelbuy3;
    private javax.swing.JButton gemshoppanelbuy4;
    private javax.swing.JButton gemshoppanelbuy5;
    private javax.swing.JButton gemshoppanelbuy6;
    private javax.swing.JButton gemshoppanelbuy7;
    private javax.swing.JLabel gemshoppaneltitle;
    private javax.swing.JLabel gemshopupgradetext2;
    private javax.swing.JLabel gemshopupgradetext3;
    private javax.swing.JLabel gemshopupgradetext4;
    private javax.swing.JLabel gemshopupgradetext5;
    private javax.swing.JLabel gemshopupgradetext6;
    private javax.swing.JLabel gemshopupgradetext7;
    private javax.swing.JLabel gemslidercost;
    private javax.swing.JPanel girispaneli;
    private javax.swing.JButton girispanelstartbutton;
    private javax.swing.JLabel girispaneltitle;
    private javax.swing.JPanel gregpanel1;
    private javax.swing.JButton gregpanel1backbutton;
    private javax.swing.JLabel gregpanel1infoline;
    private javax.swing.JLabel gregpanel1infoline1;
    private javax.swing.JLabel gregpanel1infoline2;
    private javax.swing.JLabel gregpanel1infoline3;
    private javax.swing.JLabel gregpanel1infoline4;
    private javax.swing.JLabel gregpanel1infoline5;
    private javax.swing.JLabel gregpanel1infoline6;
    private javax.swing.JButton gregpanel1mainbuy;
    private javax.swing.JPanel gregpanel2;
    private javax.swing.JButton gregpanel2backbutton;
    private javax.swing.JButton gregpanelbuy;
    private javax.swing.JButton gregpanelbuy1;
    private javax.swing.JLabel gregpaneltitle;
    private javax.swing.JLabel gregpaneltitle1;
    private javax.swing.JLabel gregpaneltitle2;
    private javax.swing.JLabel gregpanelupgradetext;
    private javax.swing.JLabel gregpanelupgradetext1;
    private javax.swing.JLabel gregpanelupgradetext5;
    private javax.swing.JLabel isboostactivelabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel luckyboxpanel;
    private javax.swing.JButton luckyboxpanelbuy;
    private javax.swing.JButton luckyboxpanelbuy1;
    private javax.swing.JButton luckyboxpanelbuy2;
    private javax.swing.JButton luckyboxpanelbuy3;
    private javax.swing.JButton luckyboxpanelbuy4;
    private javax.swing.JLabel luckyboxpaneltext;
    private javax.swing.JLabel luckyboxpaneltext1;
    private javax.swing.JLabel luckyboxpaneltext2;
    private javax.swing.JLabel luckyboxpaneltext3;
    private javax.swing.JLabel luckyboxpaneltext4;
    private javax.swing.JButton macroboostbuybutton;
    private javax.swing.JLabel macroboostpricelabel;
    private javax.swing.JButton microboostbuybutton;
    private javax.swing.JLabel microboostpricelabel;
    private javax.swing.JLabel notification;
    private javax.swing.JPanel prestigepanel;
    private javax.swing.JButton prestigepanelbackbutton;
    private javax.swing.JLabel prestigepanellastasktext;
    private javax.swing.JButton prestigepanelmainbutton1;
    private javax.swing.JButton prestigepanelno;
    private javax.swing.JLabel prestigepaneltitle;
    private javax.swing.JButton prestigepanelyes;
    private javax.swing.JLabel remainingboostlabel;
    private javax.swing.JLabel selectedgemlabel;
    private javax.swing.JPanel settingspanel;
    private javax.swing.JButton settingspanelbackbutton;
    private javax.swing.JButton smallboostbuybutton;
    private javax.swing.JLabel smallboostpricelabel;
    private javax.swing.JPanel statpanel;
    private javax.swing.JLabel statpaneladdedstone;
    private javax.swing.JLabel statpanelgregadded;
    private javax.swing.JLabel statpanelgregfoundgemsintotal;
    private javax.swing.JLabel statpanelgregminedintotal;
    private javax.swing.JLabel statpaneltitle;
    private javax.swing.JLabel statpaneltotalminetimes;
    private javax.swing.JLabel stonecounter;
    private javax.swing.JLabel stonecounter1;
    private javax.swing.JLabel stonecounter2;
    private javax.swing.JLabel stonecounter3;
    private javax.swing.JLabel stonecounter4;
    private javax.swing.JLabel stonecounter5;
    private javax.swing.JLabel stonecounter6;
    private javax.swing.JButton stoneshopbackbutton;
    private javax.swing.JButton stoneshopbackbutton1;
    private javax.swing.JButton stoneshopbackbutton2;
    private javax.swing.JPanel stoneshoppanel;
    private javax.swing.JButton stoneshoppanelbuy;
    private javax.swing.JButton stoneshoppanelbuy1;
    private javax.swing.JButton stoneshoppanelbuy10;
    private javax.swing.JButton stoneshoppanelbuy11;
    private javax.swing.JButton stoneshoppanelbuy12;
    private javax.swing.JButton stoneshoppanelbuy9;
    private javax.swing.JLabel stoneshoppaneltitle;
    private javax.swing.JLabel stoneshoppaneltitle1;
    private javax.swing.JLabel stoneshopupgradetext;
    private javax.swing.JLabel stoneshopupgradetext1;
    private javax.swing.JLabel stoneshopupgradetext2;
    private javax.swing.JLabel stoneshopupgradetext3;
    private javax.swing.JLabel stoneshopupgradetext4;
    private javax.swing.JLabel stoneshopupgradetext5;
    // End of variables declaration//GEN-END:variables
}
