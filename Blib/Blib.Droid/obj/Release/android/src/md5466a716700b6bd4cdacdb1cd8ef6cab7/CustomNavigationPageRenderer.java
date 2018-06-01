package md5466a716700b6bd4cdacdb1cd8ef6cab7;


public class CustomNavigationPageRenderer
	extends md5270abb39e60627f0f200893b490a1ade.NavigationPageRenderer
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onConfigurationChanged:(Landroid/content/res/Configuration;)V:GetOnConfigurationChanged_Landroid_content_res_Configuration_Handler\n" +
			"n_onViewRemoved:(Landroid/view/View;)V:GetOnViewRemoved_Landroid_view_View_Handler\n" +
			"n_onViewAdded:(Landroid/view/View;)V:GetOnViewAdded_Landroid_view_View_Handler\n" +
			"";
		mono.android.Runtime.register ("Blib.Interfaces.Renderers.CustomNavigationPageRenderer, Blib.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", CustomNavigationPageRenderer.class, __md_methods);
	}


	public CustomNavigationPageRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == CustomNavigationPageRenderer.class)
			mono.android.TypeManager.Activate ("Blib.Interfaces.Renderers.CustomNavigationPageRenderer, Blib.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public CustomNavigationPageRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == CustomNavigationPageRenderer.class)
			mono.android.TypeManager.Activate ("Blib.Interfaces.Renderers.CustomNavigationPageRenderer, Blib.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public CustomNavigationPageRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == CustomNavigationPageRenderer.class)
			mono.android.TypeManager.Activate ("Blib.Interfaces.Renderers.CustomNavigationPageRenderer, Blib.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public void onConfigurationChanged (android.content.res.Configuration p0)
	{
		n_onConfigurationChanged (p0);
	}

	private native void n_onConfigurationChanged (android.content.res.Configuration p0);


	public void onViewRemoved (android.view.View p0)
	{
		n_onViewRemoved (p0);
	}

	private native void n_onViewRemoved (android.view.View p0);


	public void onViewAdded (android.view.View p0)
	{
		n_onViewAdded (p0);
	}

	private native void n_onViewAdded (android.view.View p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}