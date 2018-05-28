/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonnel;

import javax.swing.SwingUtilities;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * <b> Cette classe est l'interface correspondant a la page d'accueil</b>
 * 
 * @author anseea popescu
 */

public class Accueil extends javax.swing.JFrame {
    
    private DateEntreprise d;
    //private Timer timer = new Timer(1, this::timerActionListner);
    
    
    
    /**
     * Creates new form Accueil
     */
    
    private static Accueil instance = null;
    
    public static Accueil getInstance(DateEntreprise dateE) throws IOException, ParseException{
        if (instance == null){
            instance = new Accueil(dateE);
        }else{
            instance.setD(dateE);
        }
        if (!MissionDAO.hasloadM) {
            MissionDAO mDAO = new MissionDAO();
            mDAO.recupererMissions();
        }
        int nbencours = 0;
        int nbtot = 0;
        for (Mission m : MissionDAO.missions) {
            if (m.getStatut() == 3) {
                nbencours++;
            }
            nbtot++;
        };
        int fin = 0;
        if (nbtot != 0) {
            fin = (int) ((Double.parseDouble(String.valueOf(nbencours)) / Double.parseDouble(String.valueOf(nbtot)))*100);
        }
        progress.setValue(fin);
        int nbOccup = 0;
        int nbTotal = 0;
        if (!MissionDAO.hasloadP) {
            MissionDAO mDAO = new MissionDAO();
            mDAO.recupererParticipantsMissions();
        }
        if (!PersonnelDAO.hasloadP) {
            PersonnelDAO pDAO = new PersonnelDAO();
            pDAO.recupererPersonnels();
        }
        ArrayList<Integer> passes = new ArrayList<>();
        for (Personnel p : PersonnelDAO.personnels) {
            for (Mission m : MissionDAO.missions) {
                for (Integer i : m.getParticipants().keySet()) {
                    if (p.getId() == i && !passes.contains(p.getId())) {
                        nbOccup++;
                        passes.add(p.getId());
                    }
                }
            }
            nbTotal++;
        }
        int pourcent = (int) ((Double.parseDouble(String.valueOf(nbOccup)) / Double.parseDouble(String.valueOf(nbTotal)))*100);
        nb.setText(pourcent + " %");
        return instance;
    }
    
    public static Accueil getInstance() throws IOException, ParseException{
        if (instance == null){
            instance = new Accueil(new DateEntreprise());
        }
        if (!MissionDAO.hasloadM) {
            MissionDAO mDAO = new MissionDAO();
            mDAO.recupererMissions();
        }
        int nbencours = 0;
        int nbtot = 0;
        for (Mission m : MissionDAO.missions) {
            if (m.getStatut() == 3) {
                nbencours++;
            }
            nbtot++;
        };
        int fin = 0;
        if (nbtot != 0) {
            fin = (int) ((Double.parseDouble(String.valueOf(nbencours)) / Double.parseDouble(String.valueOf(nbtot)))*100);
        }
        progress.setValue(fin);
        int nbOccup = 0;
        int nbTotal = 0;
        if (!MissionDAO.hasloadP) {
            MissionDAO mDAO = new MissionDAO();
            mDAO.recupererParticipantsMissions();
        }
        if (!PersonnelDAO.hasloadP) {
            PersonnelDAO pDAO = new PersonnelDAO();
            pDAO.recupererPersonnels();
        }
        ArrayList<Integer> passes = new ArrayList<>();
        for (Personnel p : PersonnelDAO.personnels) {
            for (Mission m : MissionDAO.missions) {
                for (Integer i : m.getParticipants().keySet()) {
                    if (p.getId() == i && !passes.contains(p.getId())) {
                        nbOccup++;
                        passes.add(p.getId());
                    }
                }
            }
            nbTotal++;
        }
        int pourcent = (int) ((Double.parseDouble(String.valueOf(nbOccup)) / Double.parseDouble(String.valueOf(nbTotal)))*100);
        nb.setText(pourcent + " %");
        return instance;  
    }
    
    private Accueil(DateEntreprise dateE) throws IOException, ParseException {
        initComponents();
        setD(dateE);
        this.setSize(getWidth() + 16, getHeight() + 39);
        if (!MissionDAO.hasloadM) {
            MissionDAO mDAO = new MissionDAO();
            mDAO.recupererMissions();
        }
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        //System.out.println("LA DATE PG ACCUEIL " + date.getText());
        //timer.start();
        progress.setUI(new ProgressCircleUI());
        progress.setStringPainted(true);
        progress.setFont(progress.getFont().deriveFont(20f));
        int nbencours = 0;
        int nbtot = 0;
        for (Mission m : MissionDAO.missions) {
            if (m.getStatut() == 3) {
                nbencours++;
            }
            nbtot++;
        };
        int fin = 0;
        if (nbtot != 0) {
            fin = (int) ((Double.parseDouble(String.valueOf(nbencours)) / Double.parseDouble(String.valueOf(nbtot)))*100);
        }
        progress.setValue(fin);
        int nbOccup = 0;
        int nbTotal = 0;
        if (!MissionDAO.hasloadP) {
            MissionDAO mDAO = new MissionDAO();
            mDAO.recupererParticipantsMissions();
        }
        if (!PersonnelDAO.hasloadP) {
            PersonnelDAO pDAO = new PersonnelDAO();
            pDAO.recupererPersonnels();
        }
        ArrayList<Integer> passes = new ArrayList<>();
        for (Personnel p : PersonnelDAO.personnels) {
            for (Mission m : MissionDAO.missions) {
                for (Integer i : m.getParticipants().keySet()) {
                    if (p.getId() == i && !passes.contains(p.getId())) {
                        nbOccup++;
                        passes.add(p.getId());
                    }
                }
            }
            nbTotal++;
        }
        int pourcent = (int) ((Double.parseDouble(String.valueOf(nbOccup)) / Double.parseDouble(String.valueOf(nbTotal)))*100);
        nb.setText(pourcent + " %");
    }
    
    public void setD(DateEntreprise d) {
        this.d = d;
        date.setText(d.toString());
    }
    
    /**
     * Getter de la date de l'entreprise
     * @return 
     *          La date de l'entreprise
     */
    public DateEntreprise getDate(){
        return this.d;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidePanel = new javax.swing.JPanel();
        title = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tdB = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        personnel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        competences = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mission = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        param = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        bg = new javax.swing.JPanel();
        nbPersonnel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        nb = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        progress = new javax.swing.JProgressBar();
        text1 = new javax.swing.JLabel();
        TOP = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        text2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        gagnant1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        gagnant2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        gagnant3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MSSM");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        sidePanel.setBackground(new java.awt.Color(255, 255, 255));

        title.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setBackground(new java.awt.Color(255, 184, 140));
        jLabel9.setFont(new java.awt.Font("Nunito Sans Light", 0, 32)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 184, 140));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("M");

        jLabel10.setFont(new java.awt.Font("Nunito Sans Light", 0, 32)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(229, 101, 144));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("S");

        jLabel12.setFont(new java.awt.Font("Nunito Sans Light", 0, 32)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(229, 101, 144));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("M");

        jLabel11.setFont(new java.awt.Font("Nunito Sans Light", 0, 32)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 184, 140));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("S");

        javax.swing.GroupLayout titleLayout = new javax.swing.GroupLayout(title);
        title.setLayout(titleLayout);
        titleLayout.setHorizontalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, titleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titleLayout.setVerticalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        tdB.setBackground(new java.awt.Color(255, 255, 255));
        tdB.setPreferredSize(new java.awt.Dimension(217, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tdB1-rose.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Nunito Sans SemiBold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(74, 74, 74));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tableau de bord");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/line.png"))); // NOI18N

        javax.swing.GroupLayout tdBLayout = new javax.swing.GroupLayout(tdB);
        tdB.setLayout(tdBLayout);
        tdBLayout.setHorizontalGroup(
            tdBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tdBLayout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, Short.MAX_VALUE)
                .addGap(59, 59, 59))
        );
        tdBLayout.setVerticalGroup(
            tdBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tdBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tdBLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
            .addGroup(tdBLayout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        personnel.setBackground(new java.awt.Color(255, 255, 255));
        personnel.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));
        personnel.setPreferredSize(new java.awt.Dimension(139, 50));
        personnel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                personnelMousePressed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Nunito Sans SemiBold", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(182, 182, 183));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Personnel");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user1-gris.png"))); // NOI18N

        javax.swing.GroupLayout personnelLayout = new javax.swing.GroupLayout(personnel);
        personnel.setLayout(personnelLayout);
        personnelLayout.setHorizontalGroup(
            personnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personnelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(115, 115, 115))
        );
        personnelLayout.setVerticalGroup(
            personnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personnelLayout.createSequentialGroup()
                .addGroup(personnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(personnelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, personnelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)))
                .addContainerGap())
        );

        competences.setBackground(new java.awt.Color(255, 255, 255));
        competences.setPreferredSize(new java.awt.Dimension(174, 50));
        competences.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                competencesMousePressed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/skills1-gris.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Nunito Sans SemiBold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(182, 182, 183));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Compétences");

        javax.swing.GroupLayout competencesLayout = new javax.swing.GroupLayout(competences);
        competences.setLayout(competencesLayout);
        competencesLayout.setHorizontalGroup(
            competencesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(competencesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(87, 87, 87))
        );
        competencesLayout.setVerticalGroup(
            competencesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mission.setBackground(new java.awt.Color(255, 255, 255));
        mission.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));
        mission.setPreferredSize(new java.awt.Dimension(126, 50));
        mission.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                missionMousePressed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mission1-gris.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Nunito Sans", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(182, 182, 183));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Missions");

        javax.swing.GroupLayout missionLayout = new javax.swing.GroupLayout(mission);
        mission.setLayout(missionLayout);
        missionLayout.setHorizontalGroup(
            missionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(missionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(124, 124, 124))
        );
        missionLayout.setVerticalGroup(
            missionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(missionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        param.setBackground(new java.awt.Color(255, 255, 255));
        param.setPreferredSize(new java.awt.Dimension(240, 50));
        param.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                paramMousePressed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/param1-gris.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Nunito Sans SemiBold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(182, 182, 183));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Paramètres");

        javax.swing.GroupLayout paramLayout = new javax.swing.GroupLayout(param);
        param.setLayout(paramLayout);
        paramLayout.setHorizontalGroup(
            paramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paramLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(93, 93, 93))
        );
        paramLayout.setVerticalGroup(
            paramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paramLayout.createSequentialGroup()
                .addGroup(paramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        date.setFont(new java.awt.Font("Nunito Sans Light", 0, 18)); // NOI18N
        date.setForeground(new java.awt.Color(204, 204, 204));
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setText("jLabel1");

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePanelLayout.createSequentialGroup()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(param, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(competences, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(personnel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(tdB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(title, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mission, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                .addGap(3, 3, 3))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date)
                .addGap(99, 99, 99)
                .addComponent(tdB, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(personnel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(competences, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mission, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(param, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(271, 271, 271))
        );

        bg.setBackground(new java.awt.Color(248, 249, 250));

        nbPersonnel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nbuser1-gris.png"))); // NOI18N

        nb.setFont(new java.awt.Font("Nunito Sans SemiBold", 0, 22)); // NOI18N
        nb.setForeground(new java.awt.Color(74, 74, 74));
        nb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nb.setText("64 %");

        text.setFont(new java.awt.Font("Nunito Sans", 0, 18)); // NOI18N
        text.setForeground(new java.awt.Color(216, 216, 216));
        text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text.setText("TAUX DE PERSONNEL AFFECTE");

        javax.swing.GroupLayout nbPersonnelLayout = new javax.swing.GroupLayout(nbPersonnel);
        nbPersonnel.setLayout(nbPersonnelLayout);
        nbPersonnelLayout.setHorizontalGroup(
            nbPersonnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbPersonnelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nbPersonnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(text, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(nbPersonnelLayout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        nbPersonnelLayout.setVerticalGroup(
            nbPersonnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbPersonnelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nb, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        progress.setBackground(new java.awt.Color(255, 255, 255));
        progress.setFont(new java.awt.Font("Nunito Sans SemiBold", 0, 18)); // NOI18N
        progress.setForeground(new java.awt.Color(255, 184, 140));
        progress.setString("0");

        text1.setFont(new java.awt.Font("Nunito Sans", 0, 18)); // NOI18N
        text1.setForeground(new java.awt.Color(216, 216, 216));
        text1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text1.setText("MISSIONS EN COURS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(text1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(progress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(text1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(48, 48, 48))
        );

        TOP.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/leaderboard1-gris.png"))); // NOI18N

        text2.setFont(new java.awt.Font("Nunito Sans", 0, 18)); // NOI18N
        text2.setForeground(new java.awt.Color(216, 216, 216));
        text2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text2.setText("TOP UTILISATEURS");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.png"))); // NOI18N

        gagnant1.setFont(new java.awt.Font("Nunito Sans", 0, 14)); // NOI18N
        gagnant1.setText("jLabel19");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2.png"))); // NOI18N

        gagnant2.setFont(new java.awt.Font("Nunito Sans", 0, 14)); // NOI18N
        gagnant2.setText("jLabel21");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3.png"))); // NOI18N

        gagnant3.setFont(new java.awt.Font("Nunito Sans", 0, 14)); // NOI18N
        gagnant3.setText("jLabel23");

        javax.swing.GroupLayout TOPLayout = new javax.swing.GroupLayout(TOP);
        TOP.setLayout(TOPLayout);
        TOPLayout.setHorizontalGroup(
            TOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TOPLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(TOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TOPLayout.createSequentialGroup()
                        .addGroup(TOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(TOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gagnant2, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(gagnant3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gagnant1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(TOPLayout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(text2, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                        .addGap(21, 21, 21))))
        );
        TOPLayout.setVerticalGroup(
            TOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TOPLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(TOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(text2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(TOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TOPLayout.createSequentialGroup()
                        .addComponent(gagnant1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(TOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TOPLayout.createSequentialGroup()
                        .addComponent(gagnant2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(TOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TOPLayout.createSequentialGroup()
                        .addComponent(gagnant3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(156, 156, 156))
        );

        jLabel19.setFont(new java.awt.Font("Nunito Sans Light", 0, 30)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(74, 74, 74));
        jLabel19.setText("Staff Management : Missions & Skills ");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nbPersonnel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(TOP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(147, 147, 147))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGap(34, 34, 34)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(nbPersonnel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TOP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(960, 960, 960)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 202, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        SaveAllChanges s = new SaveAllChanges();
        int r = JOptionPane.showConfirmDialog(this, "Voulez-vous sauvegarder avant de quitter ? (Toute modification non sauvegardée sera perdue)");
        if (r == 0) {
            try {
                s.saveChanges();
            } catch (IOException ex) {
                Logger.getLogger(Menu_Personnel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(Menu_Personnel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (r == 2) {
            try {
                Accueil a = new Accueil(d);
                a.setVisible(true);         
            } catch (IOException ex) {
                Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowClosing

    private void paramMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paramMousePressed
        new Parametres().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_paramMousePressed

    private void personnelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personnelMousePressed
        try {
            Menu_Personnel m = new Menu_Personnel();
            m.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_personnelMousePressed

    private void missionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_missionMousePressed
        try {
            Menu_Mission m = new Menu_Mission();
            m.setVisible(true);
            this.dispose();
        } catch (ParseException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_missionMousePressed

    private void competencesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_competencesMousePressed
        try {
            Menu_Competences c = new Menu_Competences();
            c.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_competencesMousePressed

    /*private void timerActionListner(java.awt.event.ActionEvent evt) {                                      
        DateFormat clockFormat = new SimpleDateFormat("HH':'mm",Locale.FRANCE);
        Calendar cal = Calendar.getInstance();
        String c=clockFormat.format(cal.getTime());
        clock.setText(c);
    }*/
    
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
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        DateEntreprise d = new DateEntreprise(new Date());
        /* Create and display the form */
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new Accueil(d).setVisible(true);
                    //TestPieChart.initAndShowGUI();
                } catch (IOException ex) {
                    Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TOP;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel competences;
    private javax.swing.JLabel date;
    private javax.swing.JLabel gagnant1;
    private javax.swing.JLabel gagnant2;
    private javax.swing.JLabel gagnant3;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mission;
    private static javax.swing.JLabel nb;
    private javax.swing.JPanel nbPersonnel;
    private javax.swing.JPanel param;
    private javax.swing.JPanel personnel;
    private static javax.swing.JProgressBar progress;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JPanel tdB;
    private javax.swing.JLabel text;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JPanel title;
    // End of variables declaration//GEN-END:variables
}
