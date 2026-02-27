 public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destFile = "destination.txt";

        int byteData;
        // Part 1: Copy from source to destination using Byte Streams
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {

            // TODO: Declare an integer variable to hold the byte read
            int byteData;
            

            // TODO: Read from 'fis' until it returns -1
            // TODO: Write the byte read to 'fos'
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);}


        } catch (IOException e) {
        } 
        catch (IOException e) 
        {
            System.out.println("Error during file copy: " + e.getMessage());
            return; // Exit if copy fails
        }
@@ -30,8 +34,13 @@ public static void main(String[] args) {

            // TODO: Read from 'fis' and print each byte as a character to the console
            // Hint: use (char) to cast the integer byte to a character before printing
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData);
            }

        } catch (IOException e) {
        } 
        catch (IOException e) 
        {
            System.out.println("Error reading destination file: " + e.getMessage());
        }
    }