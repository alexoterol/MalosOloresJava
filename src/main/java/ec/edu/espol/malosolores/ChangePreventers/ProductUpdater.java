/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.malosolores.ChangePreventers;

/**
 *
 * @author alexo
 */
// SHOTGUN SURGERY
public class ProductUpdater {
    public void updateProductDetails(Product product) {
        new InventoryService().updateInventory(product);
        new ProductService().updateProduct(product);
        new PricingService().updatePricing(product);
    }
}