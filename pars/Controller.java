class Controller{
	Model model;
	Controller(View view)
	{model=new Model(view);
		System.out.println("Controller");
	}
}