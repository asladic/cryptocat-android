package net.dirbaio.cryptocat;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CreditsFragment extends BoundFragment
{
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	                         Bundle savedInstanceState)
	{
		inflater = getAltInflater(inflater);
		View rootView = inflater.inflate(R.layout.fragment_credits, container, false);
		return rootView;
	}

}
