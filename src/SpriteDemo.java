
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.image.ImageObserver;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class SpriteDemo extends JPanel {
	private static JFrame frame;
	private Image odeur;
	private Image waterSprite;
	private Image waterSpritenuit;
	private Image waterg;
	private Image grassSprite;
	private Image grassSpritenuit;
	private Image treeSprite;
	private Image buisson;
	private Image sable;
	private Image lion;
	private Image volcano;
	private Image montagne;
	private Image boutvolcan;
	private Image lave;
	private Image lac;
	private Image brule;
	private Image arbreneige;
	private Image arbreautomne;
	private Image arbrefeu;
	private Image feuille;
	private Image neige;
	private Image abeille;
	private Image fourmis;
	private Image chauvesouris;
	private Image Dory;
	private Image nemo;
	private Image girafe;
	private Image hyena;
	private Image insectenuit;
	private Image moustique;
	private Image oursblanc;
	private Image oursnoir;
	private Image panthere;
	private Image pinguin;
	private Image piranha;
	private Image poison;
	private Image pumba;
	private Image sauterelle;
	private Image biche;
	private Image mouton;
	private Image requin;
	private Image mouette;
	private Image hiboux;
	private Image pont;
	private Image herbe;
	private Image roche;
	private Image crabe;
	private Image timon;
	private Image brule1;
	private Image brule2;
	private Image brule3;
	private Image printemps;
	private int spriteLength = 40;
	int saison = 1;
	public static int nuit = 0;
	public static int[][] myWorld;
	public static int[][] newmyWorld;

	// JLabel label;
	public SpriteDemo() {

		try {
			printemps = ImageIO.read(new File("printemps.png"));
			odeur = ImageIO.read(new File("odeur.png"));
			buisson = ImageIO.read(new File("herbe.png"));
			waterSprite = ImageIO.read(new File("water.png"));
			waterg = ImageIO.read(new File("waterg.jpg"));
			waterSpritenuit = ImageIO.read(new File("water_nuit.jpg"));
			treeSprite = ImageIO.read(new File("tree.png"));
			grassSpritenuit = ImageIO.read(new File("fond_vert_nuit.jpg"));
			grassSprite = ImageIO.read(new File("fond_vert.jpg"));
			sable = ImageIO.read(new File("sable.png"));
			lion = ImageIO.read(new File("lion.png"));
			montagne = ImageIO.read(new File("montagne.png"));
			volcano = ImageIO.read(new File("volcano.png"));
			boutvolcan = ImageIO.read(new File("boutvolcan.png"));
			lave = ImageIO.read(new File("lave.png"));
			brule = ImageIO.read(new File("brule.png"));
			lac = ImageIO.read(new File("lac.jpg"));
			arbreneige = ImageIO.read(new File("arbrehiver.png"));
			neige = ImageIO.read(new File("neige.png"));
			abeille = ImageIO.read(new File("abeille.gif"));// 20
			fourmis = ImageIO.read(new File("ant.gif"));// 21
			chauvesouris = ImageIO.read(new File("chauve_souris.png"));// 22
			Dory = ImageIO.read(new File("Dory.gif"));// 23
			nemo = ImageIO.read(new File("nemo.png"));// 24
			girafe = ImageIO.read(new File("girafe.gif"));// 25
			hyena = ImageIO.read(new File("hyena.png"));// 26
			insectenuit = ImageIO.read(new File("insectenuit.gif"));// 27
			moustique = ImageIO.read(new File("Moustique.gif"));// 28
			oursblanc = ImageIO.read(new File("ours_polaire.png"));// 29
			oursnoir = ImageIO.read(new File("ours.png"));// 30
			panthere = ImageIO.read(new File("panthere.png"));// 31
			pinguin = ImageIO.read(new File("penguin.png"));// 32
			piranha = ImageIO.read(new File("piranha.gif"));// 33
			poison = ImageIO.read(new File("poison.gif"));// 34
			pumba = ImageIO.read(new File("girafon.png"));// 35
			sauterelle = ImageIO.read(new File("sauterelle.gif"));// 36
			biche = ImageIO.read(new File("biche.png"));// 37
			mouton = ImageIO.read(new File("sheep.png"));// 38
			requin = ImageIO.read(new File("requin.png"));// 39
			mouette = ImageIO.read(new File("mouette.png"));// 40
			hiboux = ImageIO.read(new File("hibouxx.png"));// 41
			pont = ImageIO.read(new File("pont.jpg"));// 42
			crabe = ImageIO.read(new File("crabe.png"));// 43
			brule1 = ImageIO.read(new File("brule1.png"));// 50
			brule2 = ImageIO.read(new File("brule2.png"));// 51
			brule3 = ImageIO.read(new File("brule3.png"));// 52
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
		frame = new JFrame("World of Sprite");
		frame.add(this);
		frame.setSize(400, 400);
		frame.setVisible(true);
		myWorld = new int[200][200];
		newmyWorld = new int[200][200];

		// -------------------------------------------------------------------------------INITIALISATION

		for (int i = 0; i != 120; i++) {// 120
			for (int j = 0; j != 64; j++) {// 64
				// paysage1
				// sable
				myWorld[i][j] = 0;
				if (j == 2 && (i >= 2 && i <= 70) || j == 29
						&& (i >= 2 && i <= 70) || (j >= 3 && j <= 29)
						&& (i == 2)) {
					myWorld[i][j] = 1; // sable
				}
				// fond_vert
				if ((j > 2 && j < 29) && (i > 2 && i < 55))
					myWorld[i][j] = 2;
				// paysage 2
				// sable
				if ((i >= 18 && i <= 80) && (j == 36 || j == 58)
						|| ((i == 18) && (j >= 36 && j <= 58))) {
					myWorld[i][j] = 1;
				}
				// fond_vert
				if ((j > 36 && j < 58) && (i > 18 && i < 75)) {
					myWorld[i][j] = 2;
				}
				// paysage 3
				// sable
				if ((i >= 70 && i <= 110) && (j == 2)
						|| (i == 110 && (j >= 2 && j <= 58))
						|| (j == 29 && (i >= 70 && i <= 80))
						|| ((j >= 29 && j <= 36) && (i == 80))
						|| ((j == 58) && (i >= 80 && i <= 110))) {
					myWorld[i][j] = 1;
				}
				// fond_vert
				if (((j > 2 && j < 29) && (i > 70 && i < 110))
						|| ((i > 80 && i < 110) && (j >= 29 && j < 58))) {
					myWorld[i][j] = 2;
				}
				if (i <= 100 && i >= 4 && j >= 3 && j <= 29 && j >= 3
						&& myWorld[i][j] == 0) {
					myWorld[i][j] = 2;
				}
				if (i <= 80 && i >= 18 && j >= 36 && j <= 58
						&& myWorld[i][j] == 0) {
					myWorld[i][j] = 2;
				}
			}
		}

		// crabe
		/*
		 * for(int i=0;i<120;i++){ for(int j=0;j<64;j++){
		 * if(myWorld[i][j]==1&&Math.random()<0.1){ myWorld[i][j]=43; } } }
		 */

		// biche
		// myWorld[20][16]=37;
		// myWorld[35][24]=37;
		// myWorld[70][56]=37;
		// nemo
		myWorld[26][32] = 24;
		myWorld[58][34] = 40;
		myWorld[8][56] = 24;
		// herbe
		// myWorld[90][19]=70;
		// ours
		myWorld[40][5] = 30;
		myWorld[47][9] = 30;
		myWorld[70][17] = 30;
		// hyene
		myWorld[43][38] = 26;
		myWorld[65][43] = 26;
		myWorld[49][47] = 26;
		// moustique
		myWorld[37][20] = 28;
		// panthere
		myWorld[24][22] = 31;
		// requin
		myWorld[29][33] = 39;
		myWorld[10][46] = 39;
		// mouette
		myWorld[50][32] = 40;
		// Pumba pumba=new Pumba(100,20);
		// myWorld[100][20]=35;
		// pont
		/*for (int i = 0; i < 120; i++) {
			for (int j = 0; j < 64; j++) {
				if ((i == 20 || i == 65) && j >= 29 && j <= 36) {
					myWorld[i][j] = 42;
				}
			}
		}*/
		// 4 flaques d'eau
		for (int i = 0; i < 120; i++) {
			for (int j = 0; j < 64; j++) {
				if (i >= 15 && i < 22 && j == 20
						|| (i >= 16 && i < 24 && j == 21)
						|| (i >= 18 && i < 23 && j == 22)
						|| (i >= 75 && i < 82 && j == 8)
						|| (i >= 76 && i < 84 && j == 9)
						|| (i >= 78 && i < 83 && j == 10)
						|| (i >= 35 && i < 42 && j == 52)
						|| (i >= 37 && i < 44 && j == 53)
						|| (i >= 38 && i < 43 && j == 54)
						|| (i >= 87 && i < 94 && j == 48)
						|| (i >= 88 && i < 96 && j == 49)
						|| (i >= 90 && i < 95 && j == 50)) {
					myWorld[i][j] = 12;
				}
			}
		}

		// grand point d'eau
		for (int t = 0; t < 120; t++) {
			for (int u = 0; u < 64; u++) {
				if (t >= 35 && t <= 60 && u >= 11 && u <= 20) {
					myWorld[t][u] = 12;
					if ((t == 35 && u == 11) || (t == 35 && u == 20)
							|| (t == 60 && u == 11) || (t == 60 && u == 20)) {
						myWorld[t][u] = 2;
					}
				}
				if (t >= 50 && t <= 75 && u >= 40 && u <= 49) {
					myWorld[t][u] = 12;
					if ((t == 50 && u == 40) || (t == 50 && u == 49)
							|| (t == 75 && u == 40) || (t == 75 && u == 49)) {
						myWorld[t][u] = 2;
					}
				}
			}
		}
		// volcan
		myWorld[26][53] = 8;
		myWorld[24][51] = 8;
		myWorld[25][52] = 8;
		myWorld[40][54] = 5; //23 55
	/*	myWorld[23][51] = 7;
		myWorld[23][52] = 7;
		myWorld[22][52] = 7;
		myWorld[24][52] = 7;
		myWorld[23][53] = 7;
		myWorld[22][53] = 7;
		myWorld[24][53] = 7;
		myWorld[21][53] = 7;
		myWorld[25][53] = 7;*/

		for (int i = 0; i != 120; i++) {
			for (int j = 0; j != 64; j++) {
				if (myWorld[i][j] == 2) {
					if (Math.random() < 0.05) { //0.05
						myWorld[i][j] = 3;
					}

					if (myWorld[i][j] == 2 && nuit == 1) {
						if (Math.random() < 0.02) {
							myWorld[i][j] = 41;
						}
					}
				}

				if (myWorld[i][j] == 2) {
					if (Math.random() < 0.25) {
						myWorld[i][j] = 78;
					}
				}
			}
		}
		// initialisation des animaux
		Lion l1 = new Lion(10, 10);
		Lion l2 = new Lion(20, 11);
		Lion l3 = new Lion(30, 12);
		Lion l5 = new Lion(50, 10);
		// Pumba pumba=new Pumba(110,20);
		Mouton m1 = new Mouton(50, 10);
		Lion p1 = new Lion(100, 50);
		Lion p2 = new Lion(95, 50);
		Insecte ins = new Insecte(63, 54);
		Pumba pum = new Pumba(65, 53);
		Biche bic = new Biche(20, 16);
		// Biche b1=new Biche(35,24);
		// Biche b2=new Biche(70,56);
		for (int i = 0; i < 10; i++) {

			new Pumba(67 + i, 54);
			new Mouton(95, 30 + i);
			new Mouton(25 + i, 40);
			new Lion(50 + i, 20);
		}

		System.out.println(Agent.lions.size());
		// maj dans nouveau tableau
		for (int i = 0; i != 120; i++) {
			for (int j = 0; j != 64; j++) {
				newmyWorld[i][j] = myWorld[i][j];
			}
		}

		// ----------------------------------------------------------------------------------------DYNAMIQUE

		int i = 1;
		int cpt = 1;
		int cptsaison = 1;
		while (i < 100000) {
			m1.vieillis();
			bic.vieillis();
			// saison et cycle jour/nuit
			if (i % 50 == 0) {
				cpt++;
				if (cpt % 2 == 0) {
					nuit = 1;
				} else {
					nuit = 0;
				}
			}

			if (i % 150 == 0) {
				cptsaison++;
				if (cptsaison % 3 == 1)
					saison = 1; // ete
				if (cptsaison % 3 == 2) {
					saison = 3;
				} // printemps
				if (cptsaison % 3 == 0) {
					saison = 2; // hiver
				}
			}

			for (int k = 0; k != 120; k++) {
				for (int l = 0; l != 64; l++) {
					if(saison==3&&newmyWorld[k][l]==2){
						if(Math.random()<0.4){
							newmyWorld[k][l]=78;//apparition d herbe
						}
					}
					
					if(saison==2&&newmyWorld[k][l]==78){
						if(Math.random()<0.01){
							newmyWorld[k][l]=2;//disparition d herbe
						}
					}
					
					
					
					l1.posi = k;
					l1.posj = l;
					m1.posi = k;
					m1.posj = l;
					ins.posi = k;
					ins.posj = l;
					pum.posi = k;
					pum.posj = l;
					bic.posi = k;
					bic.posj = l;

					// pumba.posi=k;pumba.posj=l;
					repaint();
					// lion
					if (myWorld[k][l] == 6) {
						l1.moveDefault();
					}
					if (myWorld[k][l] == 38) {
						m1.eat();
						m1.moveDefault();
					}
					if (myWorld[k][l] == 27) {
						ins.moveDefault();
						ins.autoReproduce();
					}
					if (myWorld[k][l] == 35) {
						pum.moveDefault();
					}
					if (myWorld[k][l] == 37) {
						bic.eat();
						bic.moveDefault();
					}

					// if(myWorld[k][l]==35){pumba.moveDefault1();}

					// volcan

					if (myWorld[k][l] != 0 && myWorld[k][l] != 12
							&& myWorld[k][l] != 1 && myWorld[k][l] != 5
							&& myWorld[k][l] != 7 && myWorld[k][l] != 42
							&& Math.random() < 0.57) {  //0.57
						if ((myWorld[k][l + 1] == 8 || myWorld[k - 1][l] == 8
								|| myWorld[k][l - 1] == 8 || myWorld[k + 1][l] == 8)) {
							if (myWorld[k][l] != 3) {
								newmyWorld[k][l] = 8;
							} else {
								newmyWorld[k][l] = 50;
							}
						}
					}

					if (myWorld[k][l] == 50) {
						newmyWorld[k][l] = 51;
					}
					if (myWorld[k][l] == 51) {
						newmyWorld[k][l] = 52;
					}
					if (myWorld[k][l] == 52) {
						newmyWorld[k][l] = 9;
					}
					if (myWorld[k][l] == 8) {
						newmyWorld[k][l] = 9;
					}
					if (myWorld[k][l] == 9) {
						newmyWorld[k][l] = 9;
					}

					if ((myWorld[k][l] == 9) && i % 180 == 0) {
						int repousse = (int) (Math.random() * 2);
						newmyWorld[k][l] = 2;
						if (repousse == 0 && Math.random() < 0.2)
							newmyWorld[k][l] = 78;
						if (repousse == 1 && Math.random() < 0.2)
							newmyWorld[k][l] = 3;
					}

					if ((myWorld[k][l] == 9 || myWorld[k][l] == 2)
							&& i % 200 == 0) {
						newmyWorld[18][49] = 5;
						newmyWorld[24][51] = 8;
					}
				}
			}

			// mise a jour

			for (int x = 0; x != 120; x++)
				for (int y = 0; y != 64; y++) {
					myWorld[x][y] = newmyWorld[x][y];
				}

			i++;
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
			}
		}

	}

	// -------------------------------------------------------------------------------------------------------------------------AFFICHAGE

	// ::::::::::::::::::::::::
	public int xToIso(int i, int j) {
		return ((i + 80 - j - 50) * spriteLength / 2) + 20;
	}

	public int yToIso(int i, int j) {
		return ((j) * spriteLength / 3) + 5;
	}

	// ::::::::::::::::::::::::

	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		for (int i = 0; i < myWorld.length; i++)
			for (int j = 0; j < myWorld[0].length; j++) {

				int x = xToIso(i, j);
				int y = yToIso(i, j);

				if (myWorld[i][j] == 6) { // lion6,water0,sable1,grass2,arbre3,montagne4,volcano5,boutvolcan7,lave8,brule9,lac12
					if (saison == 2) {
						g2.drawImage(neige, x, y, spriteLength, spriteLength,
								frame);// spriteLength*i spriteLength*j
					} else {
						if (nuit == 1) {
							g2.drawImage(grassSpritenuit, x, y, spriteLength,
									spriteLength, frame);
						} else {
							g2.drawImage(grassSprite, x, y, spriteLength,
									spriteLength, frame);
						}
					}
					g2.drawImage(lion, x, y, spriteLength - 80,
							spriteLength - 80, frame);
				}
				if (myWorld[i][j] == 0) {
					if (nuit == 1) {
						g2.drawImage(waterSpritenuit, x, y, spriteLength,
								spriteLength, frame);
					} else {
						g2.drawImage(waterSprite, x, y, spriteLength,
								spriteLength, frame);
					}

				}
				if (myWorld[i][j] == 1)
					g2.drawImage(sable, x, y, spriteLength, spriteLength, frame);
				if (myWorld[i][j] == 2) {
					if (nuit == 1) {
						g2.drawImage(grassSpritenuit, x, y, spriteLength,
								spriteLength, frame);
					} else {
						g2.drawImage(grassSprite, x, y, spriteLength,
								spriteLength, frame);
					}
					if (saison == 2) {
						g2.drawImage(neige, x, y, spriteLength, spriteLength,
								frame);
					}

				}
				if (myWorld[i][j] == 3) {
					if (nuit == 1) {
						g2.drawImage(grassSpritenuit, x, y, spriteLength,
								spriteLength, frame);
					} else {
						g2.drawImage(grassSprite, x, y, spriteLength,
								spriteLength, frame);
					}
					g2.drawImage(treeSprite, x, y, spriteLength - 100,
							spriteLength - 140, frame);

					if (saison == 2) {
						g2.drawImage(neige, x, y, spriteLength, spriteLength,
								frame);
						g2.drawImage(arbreneige, x, y, spriteLength - 100,
								spriteLength - 140, frame);
					}
					if (saison == 3) {
						g2.drawImage(printemps, x, y, spriteLength - 100,
								spriteLength - 140, frame);
					}

				}
				if (myWorld[i][j] == 4) {
					g2.drawImage(grassSprite, x, y, spriteLength, spriteLength,
							frame);
					g2.drawImage(montagne, x, y, spriteLength, spriteLength,
							frame);
				}
				if (myWorld[i][j] == 5) {
					if (saison == 2) {
						g2.drawImage(neige, x, y, spriteLength, spriteLength,
								frame);
					} else {
						if (nuit == 1) {
							g2.drawImage(grassSpritenuit, x, y, spriteLength,
									spriteLength, frame);
						} else {
							g2.drawImage(grassSprite, x, y, spriteLength,
									spriteLength, frame);
						}
					}
					g2.drawImage(volcano, x, y, spriteLength-350, spriteLength-500,
							frame);
				}
				if (myWorld[i][j] == 7) {
					if (nuit == 1) {
						g2.drawImage(grassSpritenuit, x, y, spriteLength,
								spriteLength, frame);
					} else {
						g2.drawImage(grassSprite, x, y, spriteLength,
								spriteLength, frame);
					}
					g2.drawImage(boutvolcan, x, y, spriteLength, spriteLength,
							frame);
				}
				if (myWorld[i][j] == 8) {
					if (nuit == 1) {
						g2.drawImage(grassSpritenuit, x, y, spriteLength,
								spriteLength, frame);
					} else {
						g2.drawImage(grassSprite, x, y, spriteLength,
								spriteLength, frame);
					}
					g2.drawImage(lave, x, y, spriteLength-100, spriteLength-100, frame);
				}
				if (myWorld[i][j] == 9) {
					if (nuit == 1) {
						g2.drawImage(grassSpritenuit, x, y, spriteLength,
								spriteLength, frame);
					} else {
						g2.drawImage(grassSprite, x, y, spriteLength,
								spriteLength, frame);
					}
					g2.drawImage(brule, x, y, spriteLength, spriteLength, frame);
				}
				if (myWorld[i][j] == 13) {// arbre neige
					g2.drawImage(neige, x, y, spriteLength, spriteLength, frame);
					g2.drawImage(arbreneige, x, y, spriteLength, spriteLength,
							frame);
				}
				if (myWorld[i][j] == 14) {// neige
					g2.drawImage(neige, x, y, spriteLength, spriteLength, frame);
				}
				if (myWorld[i][j] == 12) {

					g2.drawImage(lac, x, y, spriteLength, spriteLength, frame);

				}
				if (myWorld[i][j] == 20) {
					if (nuit == 1) {
						g2.drawImage(grassSpritenuit, x, y, spriteLength,
								spriteLength, frame);
					} else {
						g2.drawImage(grassSprite, x, y, spriteLength,
								spriteLength, frame);
					}
					g2.drawImage(abeille, x, y, spriteLength, spriteLength,
							frame);
				}
				if (myWorld[i][j] == 21) {
					if (nuit == 1) {
						g2.drawImage(grassSpritenuit, x, y, spriteLength,
								spriteLength, frame);
					} else {
						g2.drawImage(grassSprite, x, y, spriteLength,
								spriteLength, frame);
					}
					g2.drawImage(fourmis, x, y, spriteLength, spriteLength,
							frame);
				}
				if (myWorld[i][j] == 22) {
					if (nuit == 1) {
						g2.drawImage(grassSpritenuit, x, y, spriteLength,
								spriteLength, frame);
					} else {
						g2.drawImage(grassSprite, x, y, spriteLength,
								spriteLength, frame);
					}
					g2.drawImage(chauvesouris, x, y, spriteLength,
							spriteLength, frame);
				}
				if (myWorld[i][j] == 23) {
					if (nuit == 1) {
						g2.drawImage(waterSpritenuit, x, y, spriteLength,
								spriteLength, frame);
					} else {
						if (saison == 2) {
							g2.drawImage(waterSprite, x, y, spriteLength,
									spriteLength, frame);
						} else {
							g2.drawImage(waterSprite, x, y, spriteLength,
									spriteLength, frame);
						}
						g2.drawImage(Dory, x, y, spriteLength, spriteLength,
								frame);
					}
				}
				if (myWorld[i][j] == 24) {
					if (nuit == 1) {
						g2.drawImage(waterSpritenuit, x, y, spriteLength,
								spriteLength, frame);
					} else {
						if (saison == 2) {
							g2.drawImage(waterSprite, x, y, spriteLength,
									spriteLength, frame);
						} else {

							g2.drawImage(waterSprite, x, y, spriteLength,
									spriteLength, frame);
						}
						g2.drawImage(nemo, x, y, spriteLength + 70,
								spriteLength + 70, frame);
					}
				}
				if (myWorld[i][j] == 25) {
					if (nuit == 1) {
						g2.drawImage(grassSpritenuit, x, y, spriteLength,
								spriteLength, frame);
					} else {
						g2.drawImage(grassSprite, x, y, spriteLength,
								spriteLength, frame);
					}
					g2.drawImage(girafe, x, y, spriteLength, spriteLength,
							frame);
				}
				if (myWorld[i][j] == 26) {
					if (saison == 2) {
						g2.drawImage(neige, x, y, spriteLength, spriteLength,
								frame);
					} else {
						if (nuit == 1) {
							g2.drawImage(grassSpritenuit, x, y, spriteLength,
									spriteLength, frame);
						} else {
							g2.drawImage(grassSprite, x, y, spriteLength,
									spriteLength, frame);
						}
					}
					g2.drawImage(hyena, x, y, spriteLength-95, spriteLength-95, frame);
				}
				if (myWorld[i][j] == 27) {
					if (nuit == 1) {
						g2.drawImage(grassSpritenuit, x, y, spriteLength,
								spriteLength, frame);
					} else {
						g2.drawImage(grassSprite, x, y, spriteLength,
								spriteLength, frame);
					}
					g2.drawImage(insectenuit, x, y, spriteLength, spriteLength,
							frame);
				}
				if (myWorld[i][j] == 28) {
					if (saison == 2) {
						g2.drawImage(neige, x, y, spriteLength, spriteLength,
								frame);
					} else {
						if (nuit == 1) {
							g2.drawImage(grassSpritenuit, x, y, spriteLength,
									spriteLength, frame);
						} else {
							g2.drawImage(grassSprite, x, y, spriteLength,
									spriteLength, frame);
						}
					}
					g2.drawImage(moustique, x, y, spriteLength, spriteLength,
							frame);
				}
				if (myWorld[i][j] == 29) {
					if (saison == 2) {
						g2.drawImage(neige, x, y, spriteLength, spriteLength,
								frame);
					} else {
						if (nuit == 1) {
							g2.drawImage(grassSpritenuit, x, y, spriteLength,
									spriteLength, frame);
						} else {
							g2.drawImage(grassSprite, x, y, spriteLength,
									spriteLength, frame);
						}
					}
					g2.drawImage(oursblanc, x, y, spriteLength, spriteLength,
							frame);
				}
				if (myWorld[i][j] == 30) {
					if (saison == 2) {
						g2.drawImage(neige, x, y, spriteLength, spriteLength,
								frame);
					} else {
						if (nuit == 1) {
							g2.drawImage(grassSpritenuit, x, y, spriteLength,
									spriteLength, frame);
						} else {
							g2.drawImage(grassSprite, x, y, spriteLength,
									spriteLength, frame);
						}
					}
					g2.drawImage(oursnoir, x, y, spriteLength-90, spriteLength-80,
							frame);
				}
				if (myWorld[i][j] == 31) {
					if (saison == 2) {
						g2.drawImage(neige, x, y, spriteLength, spriteLength,
								frame);
					} else {
						if (nuit == 1) {
							g2.drawImage(grassSpritenuit, x, y, spriteLength,
									spriteLength, frame);
						} else {
							g2.drawImage(grassSprite, x, y, spriteLength,
									spriteLength, frame);
						}
					}
					g2.drawImage(panthere, x, y, spriteLength, spriteLength,
							frame);
				}
				if (myWorld[i][j] == 32) {
					g2.drawImage(waterSprite, x, y, spriteLength, spriteLength,
							frame);
					g2.drawImage(pinguin, x, y, spriteLength, spriteLength,
							frame);
				}
				if (myWorld[i][j] == 33) {
					if (nuit == 1) {
						g2.drawImage(waterSpritenuit, x, y, spriteLength,
								spriteLength, frame);
					} else {
						g2.drawImage(waterSprite, x, y, spriteLength,
								spriteLength, frame);
					}
					g2.drawImage(piranha, x, y, spriteLength, spriteLength,
							frame);
				}
				if (myWorld[i][j] == 34) {
					if (nuit == 1) {
						g2.drawImage(waterSpritenuit, x, y, spriteLength,
								spriteLength, frame);
					} else {
						g2.drawImage(grassSprite, x, y, spriteLength,
								spriteLength, frame);
					}
					g2.drawImage(poison, x, y, spriteLength, spriteLength,
							frame);
				}
				if (myWorld[i][j] == 35) {
					if (saison == 2) {
						g2.drawImage(neige, x, y, spriteLength, spriteLength,
								frame);
					} else {
						if (nuit == 1) {
							g2.drawImage(grassSpritenuit, x, y, spriteLength,
									spriteLength, frame);
						} else {
							g2.drawImage(grassSprite, x, y, spriteLength,
									spriteLength, frame);
						}
					}
					g2.drawImage(pumba, x, y, spriteLength - 120,
							spriteLength - 150, frame);
				}
				if (myWorld[i][j] == 36) {
					if (nuit == 1) {
						g2.drawImage(grassSpritenuit, x, y, spriteLength,
								spriteLength, frame);
					} else {
						g2.drawImage(grassSprite, x, y, spriteLength,
								spriteLength, frame);
					}
					g2.drawImage(sauterelle, x, y, spriteLength, spriteLength,
							frame);
				}
				if (myWorld[i][j] == 37) {
					if (saison == 2) {
						g2.drawImage(neige, x, y, spriteLength, spriteLength,
								frame);
					} else {
						if (nuit == 1) {
							g2.drawImage(grassSpritenuit, x, y, spriteLength,
									spriteLength, frame);
						} else {
							g2.drawImage(grassSprite, x, y, spriteLength,
									spriteLength, frame);
						}
					}
					g2.drawImage(biche, x, y, spriteLength - 70,
							spriteLength - 70, frame);
				}
				if (myWorld[i][j] == 38) {
					if (saison == 2) {
						g2.drawImage(neige, x, y, spriteLength, spriteLength,
								frame);
					} else {
						if (nuit == 1) {
							g2.drawImage(grassSpritenuit, x, y, spriteLength,
									spriteLength, frame);
						} else {
							g2.drawImage(grassSprite, x, y, spriteLength,
									spriteLength, frame);
						}
					}
					g2.drawImage(mouton, x, y, spriteLength - 70,
							spriteLength - 70, frame);
				}
				if (myWorld[i][j] == 39) {
					if (nuit == 1) {
						g2.drawImage(waterSpritenuit, x, y, spriteLength,
								spriteLength, frame);
					} else {
						if (saison == 2) {
							g2.drawImage(waterSprite, x, y, spriteLength,
									spriteLength, frame);
						} else {

							g2.drawImage(waterSprite, x, y, spriteLength,
									spriteLength, frame);
						}
						g2.drawImage(requin, x, y, spriteLength + 70,
								spriteLength + 70, frame);
					}
				}
				if (myWorld[i][j] == 40) {
					if (nuit == 1) {
						g2.drawImage(waterSpritenuit, x, y, spriteLength,
								spriteLength, frame);
					} else {
						if (saison == 2) {
							g2.drawImage(waterSprite, x, y, spriteLength,
									spriteLength, frame);
						} else {
							g2.drawImage(waterSprite, x, y, spriteLength,
									spriteLength, frame);
						}
						g2.drawImage(mouette, x, y, spriteLength, spriteLength,
								frame);
					}
				}
				if (myWorld[i][j] == 41) {
					if (nuit == 1) {
						g2.drawImage(grassSpritenuit, x, y, spriteLength,
								spriteLength, frame);
					} else {
						g2.drawImage(grassSprite, x, y, spriteLength,
								spriteLength, frame);
					}
					g2.drawImage(hiboux, x, y, spriteLength, spriteLength,
							frame);

					if (saison == 2) {
						g2.drawImage(neige, x, y, spriteLength, spriteLength,
								frame);
						g2.drawImage(hiboux, x, y, spriteLength, spriteLength,
								frame);
					}
				}

				if (myWorld[i][j] == 80) {
					if (nuit == 1) {
						g2.drawImage(grassSpritenuit, x, y, spriteLength,
								spriteLength, frame);
					} else {
						g2.drawImage(grassSprite, x, y, spriteLength,
								spriteLength, frame);
					}
					// g2.drawImage(odeur,x,y,spriteLength,spriteLength, frame);

					if (saison == 2) {
						g2.drawImage(neige, x, y, spriteLength, spriteLength,
								frame);
						// g2.drawImage(odeur,x,y,spriteLength,spriteLength,
						// frame);
					}
				}

				if (myWorld[i][j] == 42) {
					g2.drawImage(waterSprite, x, y, spriteLength, spriteLength,
							frame);
					g2.drawImage(pont, x, y, spriteLength, spriteLength, frame);
				}
				if (myWorld[i][j] == 43) {
					g2.drawImage(sable, x, y, spriteLength, spriteLength, frame);
					g2.drawImage(crabe, x, y, spriteLength, spriteLength, frame);
				}
				if (myWorld[i][j] == 50) {
					if (nuit == 1) {
						g2.drawImage(grassSpritenuit, x, y, spriteLength,
								spriteLength, frame);
					} else {
						g2.drawImage(grassSprite, x, y, spriteLength,
								spriteLength, frame);
					}
					g2.drawImage(brule1, x, y, spriteLength - 100,
							spriteLength - 140, frame);
				}
				if (myWorld[i][j] == 51) {
					if (nuit == 1) {
						g2.drawImage(grassSpritenuit, x, y, spriteLength,
								spriteLength, frame);
					} else {
						g2.drawImage(grassSprite, x, y, spriteLength,
								spriteLength, frame);
					}
					g2.drawImage(brule2, x, y, spriteLength - 100,
							spriteLength - 140, frame);
				}
				if (myWorld[i][j] == 52) {
					if (nuit == 1) {
						g2.drawImage(grassSpritenuit, x, y, spriteLength,
								spriteLength, frame);
					} else {
						g2.drawImage(grassSprite, x, y, spriteLength,
								spriteLength, frame);
					}
					g2.drawImage(brule3, x, y, spriteLength - 100,
							spriteLength - 140, frame);
				}

				if (myWorld[i][j] == 78) {
					if (nuit == 1) {
						g2.drawImage(grassSpritenuit, x, y, spriteLength,
								spriteLength, frame);
						g2.drawImage(buisson, x, y, spriteLength - 70,
								spriteLength - 70, frame);
					} else {

						g2.drawImage(grassSprite, x, y, spriteLength,
								spriteLength, frame);
						g2.drawImage(buisson, x, y, spriteLength - 70,
								spriteLength - 70, frame);
					}
					if (saison == 2) {
						g2.drawImage(neige, x, y, spriteLength, spriteLength,
								frame);
						g2.drawImage(buisson, x, y, spriteLength - 70,
								spriteLength - 70, frame);

					}
				}
			}
	}

	public static void main(String[] args) {
		new SpriteDemo();

	}
}
