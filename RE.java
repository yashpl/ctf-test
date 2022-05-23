// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class RE {
    
    public static void main(String[] args) {
        final long[] f5139 = new long[12];
        int f5140 = 0;
        //System.out.println("Hello, World!");
        

        char c = 16;
        char c2 = 24;
        char c3 = 0;
        String charSequence = ""+args[0]; // input from user
        
        
        int length = charSequence.length() >> 2;
        int i2 = 0;
        int count = 0;
        while (true) {
                count++;
                length--;
                if (length < 0) {
                    break;
                }
                int i3 = i2 * 4;
                f5139[i2] = (long) (charSequence.charAt(i3 + 3) << c2);
                long[] jArr = f5139;
                jArr[i2] = ((long) (charSequence.charAt(i3 + 2) << c)) | jArr[i2];
                long[] jArr2 = f5139;
                jArr2[i2] = ((long) (charSequence.charAt(i3 + 1) << '\b')) | jArr2[i2];
                long[] jArr3 = f5139;
                jArr3[i2] = jArr3[i2] | ((long) (charSequence.charAt(i3 + 0) << 0));
                i2++;
                c3 = 0;
                c = 16;
                c2 = 24;
            }
            long[] jArr4 = {40999019, 2789358025L, 656272715, 18374979, 3237618335L, 1762529471, 685548119, 382114257, 1436905469, 2126016673, 3318315423L, 797150821};
            int i4 = f5140;
            if (((m4687(f5139[f5140], 4294967296L)[c3] % 4294967296L) + 4294967296L) % 4294967296L == jArr4[i4]) {
                int i5 = i4 + 1;
                f5140 = i5;
                if (i5 >= f5139.length) {
                    System.out.println("true");
                }
            } else {
                System.out.println("false :" +count);
            }
            //throw new RuntimeException(e);
        
    }
    private static long[] m4687(long j, long j2) {
        if (j == 0) {
            return new long[]{0, 1};
        }
        long[] r0 = m4687(j2 % j, j);
        return new long[]{r0[1] - ((j2 / j) * r0[0]), r0[0]};
}
}