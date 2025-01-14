import java.util.HashSet;

public class OTPGenerator {

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000; // Generates a random number between 100000 and 999999
    }

    // method for all OTPs in the array are unique
    public static boolean areOTPsUnique(int[] otps) {
        HashSet<Integer> uniqueOTPs = new HashSet<>();
        for (int otp : otps) {
            if (!uniqueOTPs.add(otp)) {
                return false; // If add returns false, it means OTP is not unique
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];

        // Generate 10 OTPs and save them in the array
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
            System.out.println("Generated OTP " + (i + 1) + ": " + otpArray[i]);
        }
        boolean unique = areOTPsUnique(otpArray);
        System.out.println("Are all OTPs unique? " + unique);
    }
}
