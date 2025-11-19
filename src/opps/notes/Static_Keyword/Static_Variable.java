package opps.notes.Static_Keyword;

public class Static_Variable {

}
/*
 * 👉 Static Variable:
 * - Normal variable (instance variable) har ek object ke liye alag copy banta hai.
 * - Lekin static variable sirf ek hi baar memory me allocate hota hai (class level).
 * - Matlab jitne bhi object banao, sab ek hi static variable ko share karenge.
 *
 * Usage:
 * - Jab hume data ko sab objects ke liye common rakhna ho.
 *   Example: company name, college name, bank IFSC code, etc.
 *
 * Memory Location:
 * - Static variable heap me nahi, "Method Area" (Class Area) me store hota hai.
 *
 * Access:
 * - Static variable ko hum object ke through bhi access kar sakte hain, 
 *   aur directly class ke naam se bhi (best practice).
 *   
 *   
 *   *****
 *   Static variable class-level hota hai, matlab ek hi copy memory me hoti hai.
 *
 *   Agar kisi bhi object ke through usko change karte ho, to sab objects ke liye 
 *   reflect ho jata hai, kyunki wo sab ek hi variable share kar rahe hain.
 *    
 *    *****
 *   
 */
