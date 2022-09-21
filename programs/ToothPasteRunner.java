class ToothPasteRunner{
	public static void main(String[] paste){
		System.out.println("main start");
		ToothPaste.setBrand("colgate");
		System.out.println("brand is "+ToothPaste.getBrand());
		ToothPaste.setWeight(48);
		System.out.println("weight in gram is "+ToothPaste.getWeight());
		ToothPaste.setColor("white");
		System.out.println("colour is "+ToothPaste.getcolor());
		ToothPaste.setPrice(30);
		System.out.println("mrp is "+ToothPaste.getPrice());
		ToothPaste.setMFD("23/05/2022");
		System.out.println("MFD is "+ToothPaste.getMFD());
		ToothPaste.setExpiaryDate("24 months from mfd");
		System.out.println("expiary date is "+ToothPaste.getExpiaryDate());
		ToothPaste.setUse("help protect against cavities");
		System.out.println("use is "+ToothPaste.getUse());
		ToothPaste.setTollfree(18004686502l);
		System.out.println("tollfree is "+ToothPaste.getTollfree());
		ToothPaste.setDirection("1.brush atleast twice a day 2.do not swallow");
		System.out.println("directions are "+ToothPaste.getDirection());
		ToothPaste.setWarning("keep out of reach of children under 6 years");
		System.out.println("warnings are "+ToothPaste.getWarning());
		ToothPaste.setType("active salt");
		System.out.println("type is "+ToothPaste.getType());
		ToothPaste.setExtra(true);
		System.out.println("extra = "+ToothPaste.isExtra());
		ToothPaste.setExtraWeight(12);
		System.out.println("extra weight is "+ToothPaste.getExtraWeight());
		ToothPaste.setNetWeight(60);
		System.out.println("netweight is "+ToothPaste.getNetWeight());
		ToothPaste.setBatchNo(12456774l);
		System.out.println("batch no is "+ToothPaste.getBatchNo());
		ToothPaste.setActiveIngredients("Sodium Fluoride 0.22%");
		System.out.println("ActiveIngredients "+ToothPaste.getActiveIngredients());
		ToothPaste.setInActiveIngredients(" Water, Hydrated Silica, Glycerin, Sorbitol, PVM/MA Copolymer, Sodium Lauryl Sulfate, Flavor, Cellulose Gum, Sodium Hydroxide, Propylene Glycol, Carrageenan, Sodium Saccharin, Titanium Dioxide");
		System.out.println("InActiveIngredients are "+ToothPaste.getInActiveIngredients());
		System.out.println("main end");
	}
}
