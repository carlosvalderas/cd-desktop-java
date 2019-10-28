package Formularios;

import com.digitalpersona.onetouch.DPFPDataPurpose;
import com.digitalpersona.onetouch.DPFPFeatureSet;
import com.digitalpersona.onetouch.DPFPGlobal;
import com.digitalpersona.onetouch.DPFPSample;
import com.digitalpersona.onetouch.DPFPTemplate;
import com.digitalpersona.onetouch.capture.DPFPCapture;
import com.digitalpersona.onetouch.capture.event.DPFPDataAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPDataEvent;
import com.digitalpersona.onetouch.capture.event.DPFPErrorAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPErrorEvent;
import com.digitalpersona.onetouch.capture.event.DPFPReaderStatusAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPReaderStatusEvent;
import com.digitalpersona.onetouch.capture.event.DPFPSensorAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPSensorEvent;
import com.digitalpersona.onetouch.processing.DPFPEnrollment;
import com.digitalpersona.onetouch.processing.DPFPFeatureExtraction;
import com.digitalpersona.onetouch.processing.DPFPImageQualityException;
import com.digitalpersona.onetouch.verification.DPFPVerification;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import BD.ConexionBD;
import com.digitalpersona.onetouch.verification.DPFPVerificationResult;
import java.awt.Toolkit;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import javax.swing.Timer;
import java.util.TimerTask;
/**
 *
 * @author ING JARC
 */
public class asistencia extends javax.swing.JDialog {
    private static String DATE_FORMAT_NOW;

    /** Creates new form CapturaHuella */
    public asistencia() {
        try {
         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
         } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Imposible modificar el tema visual", "Lookandfeel inválido.",
         JOptionPane.ERROR_MESSAGE);
         }
        initComponents();
        setIcon();
        txtArea.setEditable(false);
        
        //txtArea2.setText(fecha+"   ");
        
    }
        private void setIcon()
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/icon.png")));
    }
    
    public class cronometro implements ActionListener{
        public void actionPerformed(ActionEvent evt){
            GregorianCalendar tiempo = new GregorianCalendar();
            int hora,minutos,segundos;
            hora = tiempo.get(Calendar.HOUR_OF_DAY);
            minutos = tiempo.get(Calendar.MINUTE);
            segundos = tiempo.get(Calendar.SECOND);
            
            int d,m,y;
            d = tiempo.get(Calendar.DAY_OF_MONTH);
            m = tiempo.get(Calendar.MONTH);
            y = tiempo.get(Calendar.YEAR);
            
            jLabel5.setText(String.valueOf(hora));
            jLabel2.setText(String.valueOf(minutos));
            jLabel4.setText(String.valueOf(segundos));
            
            jLabel6.setText(d+"/"+(m+1)+"/"+y);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        txtArea3 = new javax.swing.JTextArea();
        panBtns = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        txtArea3.setEditable(false);
        txtArea3.setColumns(20);
        txtArea3.setFont(new java.awt.Font("Lucida Sans", 1, 10)); // NOI18N
        txtArea3.setRows(5);
        txtArea3.setMaximumSize(new java.awt.Dimension(214748, 2147483647));
        jScrollPane4.setViewportView(txtArea3);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Control de Asistencia");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panBtns.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        panBtns.setPreferredSize(new java.awt.Dimension(400, 190));
        panBtns.setLayout(new java.awt.BorderLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(366, 90));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        panBtns.add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel4.setLayout(new java.awt.BorderLayout());

        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Lucida Sans", 1, 10)); // NOI18N
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        jPanel4.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        panBtns.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(panBtns, java.awt.BorderLayout.SOUTH);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText(":");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("00");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText(":");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setText("00");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setText("00");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setText("00/00/0000");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(102, 0, 0));
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel6)
                .addGap(18, 62, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);
        jPanel1.getAccessibleContext().setAccessibleName("");

        setSize(new java.awt.Dimension(521, 499));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //System.exit(0);
        //this.dispose();
}//GEN-LAST:event_btnSalirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        btnSalir.hide();
        Iniciar();
	start();
        EstadoHuellas();
        btnSalir.grabFocus();
        timer = new Timer(1000, new cronometro());
        timer.start();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        stop();
    }//GEN-LAST:event_formWindowClosing

//Varible que permite iniciar el dispositivo de lector de huella conectado
// con sus distintos metodos.
private DPFPCapture Lector = DPFPGlobal.getCaptureFactory().createCapture();

//Varible que permite establecer las capturas de la huellas, para determina sus caracteristicas
// y poder estimar la creacion de un template de la huella para luego poder guardarla
private DPFPEnrollment Reclutador = DPFPGlobal.getEnrollmentFactory().createEnrollment();

//Esta variable tambien captura una huella del lector y crea sus caracteristcas para auntetificarla
// o verificarla con alguna guardada en la BD
private DPFPVerification Verificador = DPFPGlobal.getVerificationFactory().createVerification();

//Variable que para crear el template de la huella luego de que se hallan creado las caracteriticas
// necesarias de la huella si no ha ocurrido ningun problema
private DPFPTemplate template;
public static String TEMPLATE_PROPERTY = "template";
int n = 1;
protected void Iniciar(){
   Lector.addDataListener(new DPFPDataAdapter() {
    @Override public void dataAcquired(final DPFPDataEvent e) {
    SwingUtilities.invokeLater(new Runnable() {	public void run() {
    EnviarTexto("La Huella Digital ha sido Capturada");
    //if (n == 1)
    //{
        ProcesarCaptura(e.getSample());
        //setTemplate(Reclutador.getTemplate());
        n = 1;
    //}

    // Comprobar la calidad de la muestra de la huella y lo añade a su reclutador si es bueno
    if (featuresinscripcion != null)
        try{
        System.out.println("Las Caracteristicas de la Huella han sido creada");
        Reclutador.addFeatures(featuresinscripcion);// Agregar las caracteristicas de la huella a la plantilla a crear

        }catch (DPFPImageQualityException ex) {
        System.err.println("Error: "+ex.getMessage());
        }
    
    try {
        identificarHuella();
        Reclutador.clear();
        } catch (IOException ex) {
        Logger.getLogger(CapturaHuella.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(asistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }});}
   });

   Lector.addReaderStatusListener(new DPFPReaderStatusAdapter() {
    @Override public void readerConnected(final DPFPReaderStatusEvent e) {
    SwingUtilities.invokeLater(new Runnable() {	public void run() {
    EnviarTexto("El Sensor de Huella Digital esta Activado o Conectado");
    }});}
    @Override public void readerDisconnected(final DPFPReaderStatusEvent e) {
    SwingUtilities.invokeLater(new Runnable() {	public void run() {
    EnviarTexto("El Sensor de Huella Digital esta Desactivado o no Conectado");
    }});}
   });

   Lector.addSensorListener(new DPFPSensorAdapter() {
    @Override public void fingerTouched(final DPFPSensorEvent e) {
    SwingUtilities.invokeLater(new Runnable() {	public void run() {
    EnviarTexto("El dedo ha sido colocado sobre el Lector de Huella");
    }});}
    @Override public void fingerGone(final DPFPSensorEvent e) {
    SwingUtilities.invokeLater(new Runnable() {	public void run() {
    //EnviarTexto("El dedo ha sido quitado del Lector de Huella");
    }});}
   });

   Lector.addErrorListener(new DPFPErrorAdapter(){
    public void errorReader(final DPFPErrorEvent e){
    SwingUtilities.invokeLater(new Runnable() {  public void run() {
    EnviarTexto("Error: "+e.getError());
    }});}
   });
}

 public DPFPFeatureSet featuresinscripcion;
 public DPFPFeatureSet featuresverificacion;

 public  void ProcesarCaptura(DPFPSample sample)
 {
 // Procesar la muestra de la huella y crear un conjunto de características con el propósito de inscripción.
 featuresinscripcion = extraerCaracteristicas(sample, DPFPDataPurpose.DATA_PURPOSE_ENROLLMENT);

 // Procesar la muestra de la huella y crear un conjunto de características con el propósito de verificacion.
 featuresverificacion = extraerCaracteristicas(sample, DPFPDataPurpose.DATA_PURPOSE_VERIFICATION);

 // Comprobar la calidad de la muestra de la huella y lo añade a su reclutador si es bueno
 if (featuresinscripcion != null)
     try{
     System.out.println("Las Caracteristicas de la Huella han sido creada");
     Reclutador.addFeatures(featuresinscripcion);// Agregar las caracteristicas de la huella a la plantilla a crear


     }catch (DPFPImageQualityException ex) {
     System.err.println("Error: "+ex.getMessage());
     }

     finally {
     EstadoHuellas();
     setTemplate(Reclutador.getTemplate());
     // Comprueba si la plantilla se ha creado.
     }
}

 public  DPFPFeatureSet extraerCaracteristicas(DPFPSample sample, DPFPDataPurpose purpose){
     DPFPFeatureExtraction extractor = DPFPGlobal.getFeatureExtractionFactory().createFeatureExtraction();
     try {
      return extractor.createFeatureSet(sample, purpose);
     } catch (DPFPImageQualityException e) {
      return null;
     }
}

  public  Image CrearImagenHuella(DPFPSample sample) {
	return DPFPGlobal.getSampleConversionFactory().createImage(sample);
}

public  void EstadoHuellas(){
	//EnviarTexto("Muestra de Huellas Necesarias para Guardar Template "+ Reclutador.getFeaturesNeeded());
        
}

public void EnviarTexto(String string) {
        txtArea.append(string + "\n");
}

public  void start(){
	Lector.startCapture();
	EnviarTexto("Utilizando el Lector de Huella Dactilar ");
}

public  void stop(){
        Lector.stopCapture();
        EnviarTexto("No se está usando el Lector de Huella Dactilar ");
}

    public DPFPTemplate getTemplate() {
        return template;
    }

    public void setTemplate(DPFPTemplate template) {
        DPFPTemplate old = this.template;
	this.template = template;
	firePropertyChange(TEMPLATE_PROPERTY, old, template);
    }

ConexionBD con=new ConexionBD();
 /*
  * Guarda los datos de la huella digital actual en la base de datos
  */
    
   
/**
* Verifica la huella digital actual contra otra en la base de datos
*/
 
 /**
  * Identifica a una persona registrada por medio de su huella digital
  * 
  * 
  * 
  */


/*
public class countdown{ 
temporizador Timer ; 
public countdown() { 
timer = new Timer (); 
timer.schedule ( new DisplayCountdown (), 0 , 1000) ; 
} }
public class DisplayCountdown extends TimerTask{
int segundos = 60 ; 
public void run () { 
if ( segundos > 0 ) { 
System.out.println ( segundos + " segundos restantes ") ; 
segundos --; 
} else { 
System.out.println ( " Countdown terminado " ) ;
} } } 
*/

  public void identificarHuella() throws IOException, ParseException{
     try {
       //Establece los valores para la sentencia SQL
       Connection c=con.conectar();

       //Obtiene todas las huellas de la bd
       PreparedStatement identificarStmt = c.prepareStatement("SELECT huella,estado_id_estado,Nombres,apellido_p,id_usuario FROM usuario");
       
       ResultSet rs = identificarStmt.executeQuery();

       //Si se encuentra el nombre en la base de datos
       while(rs.next()){
        //Lee la plantilla de la base de datos
        byte templateBuffer[] = rs.getBytes("huella");
        String nombre=rs.getString("Nombres");
        String apellido=rs.getString("apellido_p");
        int id_user =rs.getInt("id_usuario");
        int estado_id_estado = rs.getInt("estado_id_estado");
        
        //Crea una nueva plantilla a partir de la guardada en la base de datos
        DPFPTemplate referenceTemplate = DPFPGlobal.getTemplateFactory().createTemplate(templateBuffer);
        //Envia la plantilla creada al objeto contendor de Template del componente de huella digital
        setTemplate(referenceTemplate);

        // Compara las caracteriticas de la huella recientemente capturda con la
        // alguna plantilla guardada en la base de datos que coincide con ese tipo
        DPFPVerificationResult result = Verificador.verify(featuresverificacion, getTemplate());

        //compara las plantilas (actual vs bd)
        //Si encuentra correspondencia dibuja el mapa
        //e indica el nombre de la persona que coincidió.
        
        if (result.isVerified())
        {
        if (estado_id_estado==1){
        //crea la imagen de los datos guardado de las huellas guardadas en la base de datos
        //JOptionPane.showMessageDialog(null, "Las huella capturada es de "+nombre+" "+apellido,"Verificacion de Huella", JOptionPane.INFORMATION_MESSAGE);
        Date date = new Date(System.currentTimeMillis());
         DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
         DateFormat df2 = new SimpleDateFormat("HH:mm:ss");
         DateFormat df3 = new SimpleDateFormat("yyy-MM-dd");

         Calendar calendar = Calendar.getInstance();
         java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());

         
        GregorianCalendar cd = new GregorianCalendar();
        java.sql.Date now = 
        new java.sql.Date( cd.getTime().getTime() ); 

        SimpleDateFormat lol = new SimpleDateFormat("yyyy-MM-dd"); 
        String poop = lol.format(now); 
        PreparedStatement entradasalidaStmt = c.prepareStatement("SELECT * FROM asistencia WHERE usuario_id_usuario="+id_user+" AND fecha='"+poop+"'");
        ResultSet xy = entradasalidaStmt.executeQuery();
        int estado = 1;
        int count = 0;
        while(xy.next())
        {
            count = xy.getRow();
            //JOptionPane.showMessageDialog(null,"ENTRADA "+count,"Como guardar una Huella ",JOptionPane.PLAIN_MESSAGE,null);
            
            //JOptionPane.showMessageDialog(null,"SALIDA "+count,"Como guardar una Huella",JOptionPane.PLAIN_MESSAGE,null);
        }
        if(count != 0)
        {
            if(count%2!=0)
            {
                jTextArea1.setText(df1.format(date)+"\n"+nombre+" "+apellido+"\n"+df2.format(date)+"\n"+"Salida");
                estado = 4;
            }
            else
            {
                jTextArea1.setText(df1.format(date)+"\n"+nombre+" "+apellido+"\n"+df2.format(date)+"\n"+"Entrada");
                estado = 1;
            }
        }
        else
        {
            jTextArea1.setText(df1.format(date)+"\n"+nombre+" "+apellido+"\n"+df2.format(date)+"\n"+"Entrada");
            estado = 1;
        }
        

        Connection x=con.conectar();
        PreparedStatement insertStmt = x.prepareStatement("INSERT INTO asistencia VALUES (NULL,?,?,?,?)");
        //PreparedStatement insertStmt = x.prepareStatement("INSERT INTO dummy VALUES (NULL, ?, ?)");
        insertStmt.setInt(1,id_user);
        insertStmt.setDate(2,startDate);
        insertStmt.setTime(3, new Time(date.getTime()));
        

        /*
        SimpleDateFormat parser = new SimpleDateFormat("HH:mm");
        Date hora0 = parser.parse("6:00");
        Date hora1 = parser.parse("8:10");

        Date hora11 = parser.parse("12:50");
        Date hora12 = parser.parse("1:10");

        Date hora2 = parser.parse("14:50");
        Date hora3 = parser.parse("15:10");

        Date horasalida = parser.parse("19:50");
        Date horaextrema = parser.parse("22:00");

        Date userDate = new Time(date.getTime());
        //Date userDate = parser.parse(userDate1);
        //if(userDate.before(hora1)&& userDate.after(hora2)){estado = 2;}
        if(userDate.after(hora0) && userDate.before(hora1))
        { 
            estado = 1;
        }
        if(userDate.after(hora1) && userDate.before(hora11)) ///////// AFTER = DESPUES
        {
                estado = 3;
        }
        if(userDate.after(hora11) && userDate.before(hora12)) /////// BEFORE = ANTES
        {
            estado = 4;
        }
        if(userDate.after(hora2) && userDate.before(hora3))
            {
                estado = 1;
            }
        if(userDate.after(hora3) && userDate.before(horasalida))
        {
            estado = 3;
        }
        if(userDate.after(horasalida) && userDate.before(horaextrema))
        {
            estado = 4;
        }*/



        insertStmt.setInt(4,estado);
        insertStmt.execute();
        insertStmt.close();



        return;
        
        } 
        else if (estado_id_estado == 2 || estado_id_estado == 5)
        {
            jTextArea1.setText("EMPLEADO DESVINCULADO");
            return;
        }
        else if(estado_id_estado == 3)
        {
            jTextArea1.setText("EMPLEADO CON LICENCIA \nNO PUEDE REGISTRAR ASISTENCIA");
            return;
        }
        else if(estado_id_estado == 4)
        {
            jTextArea1.setText("EMPLEADO EN VACACIONES \nNO PUEDE REGISTRAR ASISTENCIA");
            return;
        }
        else if(estado_id_estado == 6 || estado_id_estado == 7)
        {
            jTextArea1.setText("EMPLEADO EN POST O PRE NATAL \nNO PUEDE REGISTRAR ASISTENCIA");
            return;
        }
            
        }
        else 
        {
            jTextArea1.setText("HUELLA NO REGISTRADA");
        }
        
        
       }
       //Si no encuentra alguna huella correspondiente al nombre lo indica con un mensaje
       //JOptionPane.showMessageDialog(null, "No existe ningún registro que coincida con la huella", "Verificacion de Huella", JOptionPane.ERROR_MESSAGE);
       setTemplate(null);
       }catch(IllegalArgumentException ex)
       {
           System.err.println("Error en algun lado... "+ex.getMessage());
       } 
        catch (SQLException e) {
       //Si ocurre un error lo indica en la consola
       System.err.println("Error en algun lado... "+e.getMessage());
       }finally{
       con.desconectar();
       }
   }

/*
* @param args the command line arguments
*/
/*
public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new asistencia().setVisible(true);
            }
        });
}*/

    private Timer timer;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel panBtns;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextArea txtArea3;
    // End of variables declaration//GEN-END:variables

}
