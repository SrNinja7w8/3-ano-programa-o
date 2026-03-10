fun main() {
    //nomes dos produtos
    val produtos = arrayOf("arroz", "feijão", "macarrão")
    //preço dos produtos
    val produtos_preco = arrayOf(16, 14, 12)
   //comprador 1
   val pri_pro_list = arrayOf(intArrayOf(0, 4), intArrayOf(2, 3), intArrayOf(1, 5))
   //comprador 2
   val seg_pro_list = arrayOf(intArrayOf(0, 2), intArrayOf(1, 1), intArrayOf(2, 20))
   
   //lista de compradores
   var list_lists = arrayOf(pri_pro_list, seg_pro_list)
   var i = 1
  
   println("=== ${pri_pro_list.size} produtos em seu carrinho: ===")
   println("")
   
   //exibir o que os compradores compraram e o total e desconto se tiver
   for(pro in seg_pro_list) {
       if(produtos_preco[pro[0]]*pro[1] > 50) {
           var pre_disc = produtos_preco[pro[0]]*pro[1]*1.10
           println("${i}- ${produtos[pro[0]]} \npreço total(com desconto acima de 50 reais aplicado): ${pre_disc}")
           println("")
       } else {
           var pre_disc = produtos_preco[pro[0]]*pro[1]
           println("${i}- ${produtos[pro[0]]}, preço total(com desconto acima de 50 reais aplicado): ${pre_disc}")
           println("")
       }
        
        i++
   }
}
