
package javaapplication94;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class JavaApplication94 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreSo = "os.name";
        String versionSo = "os.version";
        String arquitecturaSo = "os.arch";
        String caracterSo = "file.separator";
        String javaclaseSo = "java.class.path";
        String javahomeSo = "java.home";
        String javaSo = "java.vendor";
        String javaurlSo = "java.vendor.url";
        String javaversionSo = "java.version";
        String linesaparatorSo = "line.separator";
        String pathseoparatorSo = "path.separator";
        String directoriousuarioSo = "user.dir";
        String homeSo = "user.home";
        String nombreususario = "user.name";
        
        
        System.out.println("\n  Informacion sobre el SO: ");
        
        System.out.println("\nNombre del SO: " +System.getProperty(nombreSo));
                 
        System.out.println("Version del SO: " +System.getProperty(versionSo));
                 
        System.out.println("Arquitectura del SO: " +System.getProperty(arquitecturaSo));
        
        System.out.println("Arquitectura del SO: " +System.getProperty(caracterSo));
        
        System.out.println("Arquitectura del SO: " +System.getProperty(javaclaseSo));
        
        System.out.println("Arquitectura del SO: " +System.getProperty(javahomeSo));
        
        System.out.println("Arquitectura del SO: " +System.getProperty(javaSo));
        
        System.out.println("Arquitectura del SO: " +System.getProperty(javaurlSo));
        
        System.out.println("Arquitectura del SO: " +System.getProperty(javaversionSo));
        
        System.out.println("Arquitectura del SO: " +System.getProperty(linesaparatorSo));
        
        System.out.println("Arquitectura del SO: " +System.getProperty(pathseoparatorSo));
        
        System.out.println("Arquitectura del SO: " +System.getProperty(directoriousuarioSo));
        
        System.out.println("Arquitectura del SO: " +System.getProperty(homeSo));
        
        System.out.println("Arquitectura del SO: " +System.getProperty(nombreususario));
                 
                
                
    }

}
