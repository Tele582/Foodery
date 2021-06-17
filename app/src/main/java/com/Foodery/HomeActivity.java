package com.Foodery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import android.widget.LinearLayout;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.util.*;
import android.animation.*;

import java.util.*;
import java.util.HashMap;
import java.util.ArrayList;
import android.widget.TextView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import android.widget.ImageView;
import de.hdodenhof.circleimageview.*;
import java.util.Timer;
import java.util.TimerTask;
import android.view.View;


public class HomeActivity extends  AppCompatActivity  { 
	
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private DrawerLayout _drawer;
	private String typeWriterStr = "";
	private double typeWriterNum = 0;
	private String typeWriterStr2 = "";
	private boolean one = false;
	private HashMap<String, Object> map = new HashMap<>();
	
	private ArrayList<HashMap<String, Object>> foods = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear3;
	private TextView textview1;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private BottomNavigationView bottomnavigation1;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private TextView textview2;
	private TextView textview3;
	private LinearLayout linear8;
	private GridView gridview1;
	private ImageView imageview2;
	private ImageView imageview1;
	private LinearLayout _drawer_linear1;
	private LinearLayout _drawer_linear2;
	private CircleImageView _drawer_circleimageview1;
	private TextView _drawer_textview1;
	private LinearLayout _drawer_linear3;
	private LinearLayout _drawer_linear4;
	private LinearLayout _drawer_linear5;
	private LinearLayout _drawer_linear7;
	private TextView _drawer_textview2;
	private TextView _drawer_textview3;
	private TextView _drawer_textview5;
	private TextView _drawer_textview4;
	private TextView _drawer_textview8;
	private LinearLayout _drawer_linear8;
	private ImageView _drawer_imageview1;
	private TextView _drawer_textview9;
	
	private TimerTask t;
	private TimerTask spinning;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.home);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		_app_bar = (AppBarLayout) findViewById(R.id._app_bar);
		_coordinator = (CoordinatorLayout) findViewById(R.id._coordinator);
		_toolbar = (Toolbar) findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		_drawer = (DrawerLayout) findViewById(R.id._drawer);
		ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(HomeActivity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = (LinearLayout) findViewById(R.id._nav_view);
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		bottomnavigation1 = (BottomNavigationView) findViewById(R.id.bottomnavigation1);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		textview2 = (TextView) findViewById(R.id.textview2);
		textview3 = (TextView) findViewById(R.id.textview3);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		gridview1 = (GridView) findViewById(R.id.gridview1);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		_drawer_linear1 = (LinearLayout) _nav_view.findViewById(R.id.linear1);
		_drawer_linear2 = (LinearLayout) _nav_view.findViewById(R.id.linear2);
		_drawer_circleimageview1 = (CircleImageView) _nav_view.findViewById(R.id.circleimageview1);
		_drawer_textview1 = (TextView) _nav_view.findViewById(R.id.textview1);
		_drawer_linear3 = (LinearLayout) _nav_view.findViewById(R.id.linear3);
		_drawer_linear4 = (LinearLayout) _nav_view.findViewById(R.id.linear4);
		_drawer_linear5 = (LinearLayout) _nav_view.findViewById(R.id.linear5);
		_drawer_linear7 = (LinearLayout) _nav_view.findViewById(R.id.linear7);
		_drawer_textview2 = (TextView) _nav_view.findViewById(R.id.textview2);
		_drawer_textview3 = (TextView) _nav_view.findViewById(R.id.textview3);
		_drawer_textview5 = (TextView) _nav_view.findViewById(R.id.textview5);
		_drawer_textview4 = (TextView) _nav_view.findViewById(R.id.textview4);
		_drawer_textview8 = (TextView) _nav_view.findViewById(R.id.textview8);
		_drawer_linear8 = (LinearLayout) _nav_view.findViewById(R.id.linear8);
		_drawer_imageview1 = (ImageView) _nav_view.findViewById(R.id.imageview1);
		_drawer_textview9 = (TextView) _nav_view.findViewById(R.id.textview9);
		
		bottomnavigation1.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
			@Override
			public boolean onNavigationItemSelected(MenuItem item) {
				final int _itemId = item.getItemId();
				if (_itemId == 2) {
					_drawer.openDrawer(GravityCompat.START);
				}
				return true;
			}
		});
		
		_drawer_linear1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_drawer.closeDrawer(GravityCompat.START);
			}
		});
		
		_drawer_linear2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
	}
	
	private void initializeLogic() {
		getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
		getWindow().setStatusBarColor(0xFFFFFFFF);
		_transparent_bar();
		_Toolbar(false);
		_transparent_drawer();
		bottomnavigation1.getMenu().add(0, 1, 0, "Home").setIcon(R.drawable.icons_2);
		bottomnavigation1.getMenu().add(0, 2, 0, "Delivery").setIcon(R.drawable.icons_1);
		bottomnavigation1.getMenu().add(0, 3, 0, "more").setIcon(R.drawable.icons_3);
		_CardStyle(linear4, 0, 5, "#f44336", true);
		_CardStyle(linear8, 0, 5, "#f44336", true);
		_CardStyle(textview2, 0, 25, "#263238", true);
		_CardStyle(_drawer_textview1, 0, 25, "#f44336", false);
		_CardStyle(_drawer_linear2, 0, 35, "#ffffff", false);
		_drawer_imageview1.setColorFilter(0xFFF44336, PorterDuff.Mode.MULTIPLY);
		_setTypeWriter(textview2, "• Locate Your desired meal from around you!", 200);
		_CardStyle(linear6, 8, 3, "#ffffff", false);
		imageview1.setColorFilter(0xFFF44336, PorterDuff.Mode.MULTIPLY);
		spinning = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						if (one) {
							one = false;
							imageview1.setImageResource(R.drawable.ic_hdr_strong_whit);
							imageview2.setImageResource(R.drawable.artboard_1);
						}
						else {
							one = true;
							imageview1.setImageResource(R.drawable.ic_hdr_strong_white);
							imageview2.setImageResource(R.drawable.artboard_2);
						}
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(spinning, (int)(100), (int)(2500));
		_loadfoods();
		_listload();
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Override
	public void onBackPressed() {
		if (_drawer.isDrawerOpen(GravityCompat.START)) {
			_drawer.closeDrawer(GravityCompat.START);
		}
		else {
			super.onBackPressed();
		}
	}
	public void _transparent_bar () {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) { Window w = getWindow();  w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS); };
	}
	
	
	public void _CardStyle (final View _view, final double _shadow, final double _radius, final String _color, final boolean _touch) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		gd.setColor(Color.parseColor(_color));
		gd.setCornerRadius((int)_radius);
		_view.setBackground(gd);
		
		if (Build.VERSION.SDK_INT >= 21){
			_view.setElevation((int)_shadow);}
		if (_touch) {
			_view.setOnTouchListener(new View.OnTouchListener() {
				@Override
				public boolean onTouch(View v, MotionEvent event) {
					switch (event.getAction()){
						case MotionEvent.ACTION_DOWN:{
							ObjectAnimator scaleX = new ObjectAnimator();
							scaleX.setTarget(_view);
							scaleX.setPropertyName("scaleX");
							scaleX.setFloatValues(0.9f);
							scaleX.setDuration(100);
							scaleX.start();
							
							ObjectAnimator scaleY = new ObjectAnimator();
							scaleY.setTarget(_view);
							scaleY.setPropertyName("scaleY");
							scaleY.setFloatValues(0.9f);
							scaleY.setDuration(100);
							scaleY.start();
							break;
						}
						case MotionEvent.ACTION_UP:{
							
							ObjectAnimator scaleX = new ObjectAnimator();
							scaleX.setTarget(_view);
							scaleX.setPropertyName("scaleX");
							scaleX.setFloatValues((float)1);
							scaleX.setDuration(100);
							scaleX.start();
							
							ObjectAnimator scaleY = new ObjectAnimator();
							scaleY.setTarget(_view);
							scaleY.setPropertyName("scaleY");
							scaleY.setFloatValues((float)1);
							scaleY.setDuration(100);
							scaleY.start();
							
							break;
						}
					}
					return false;
				}
			});
		}
	}
	
	
	public void _transparent_drawer () {
		
		final LinearLayout _nav_view = (LinearLayout) findViewById(R.id._nav_view); _nav_view.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(Color.TRANSPARENT));
	}
	
	
	public void _Toolbar (final boolean _v) {
		if (_v) {
			getSupportActionBar().show();
		}
		else {
			getSupportActionBar().hide();
		}
	}
	
	
	public void _setTypeWriter (final TextView _textview, final String _text, final double _speed) {
		typeWriterStr = "";
		typeWriterNum = 0;
		t = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						if (!(typeWriterNum == _text.length())) {
							typeWriterStr2 = ""+_text;
							char typeWriterChar = typeWriterStr2.charAt((int) typeWriterNum);
							typeWriterStr = typeWriterStr+""+typeWriterChar;;
							_textview.setText(typeWriterStr);
							typeWriterNum++;
						}
						else {
							t.cancel();
						}
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(t, (int)(_speed), (int)(_speed));
	}
	
	
	public void _listload () {
		gridview1.setAdapter(new Gridview1Adapter(foods));
		gridview1.setNumColumns((int)2);
		gridview1.setColumnWidth((int)200);
		gridview1.setVerticalSpacing((int)10);
		gridview1.setHorizontalSpacing((int)10);
		gridview1.setStretchMode(GridView.STRETCH_COLUMN_WIDTH);
	}
	
	
	public void _loadfoods () {
		map = new HashMap<>();
		map.put("dx", "dy");
		foods.add(map);
		foods.add(map);
		foods.add(map);
		foods.add(map);
		foods.add(map);
		foods.add(map);
		foods.add(map);
		foods.add(map);
		foods.add(map);
		foods.add(map);
		foods.add(map);
		foods.add(map);
		foods.add(map);
		foods.add(map);
		foods.add(map);
		foods.add(map);
	}
	
	
	public class Gridview1Adapter extends BaseAdapter {
		ArrayList<HashMap<String, Object>> _data;
		public Gridview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		@Override
		public View getView(final int _position, View _v, ViewGroup _container) {
			LayoutInflater _inflater = (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View _view = _v;
			if (_view == null) {
				_view = _inflater.inflate(R.layout.foods, null);
			}
			
			final LinearLayout linear1 = (LinearLayout) _view.findViewById(R.id.linear1);
			final ImageView imageview1 = (ImageView) _view.findViewById(R.id.imageview1);
			final TextView textview1 = (TextView) _view.findViewById(R.id.textview1);
			final LinearLayout linear2 = (LinearLayout) _view.findViewById(R.id.linear2);
			final ImageView imageview2 = (ImageView) _view.findViewById(R.id.imageview2);
			final ImageView imageview3 = (ImageView) _view.findViewById(R.id.imageview3);
			final ImageView imageview4 = (ImageView) _view.findViewById(R.id.imageview4);
			
			imageview2.setColorFilter(0xFFF44336, PorterDuff.Mode.MULTIPLY);
			imageview3.setColorFilter(0xFFF44336, PorterDuff.Mode.MULTIPLY);
			imageview4.setColorFilter(0xFFF44336, PorterDuff.Mode.MULTIPLY);
			_CardStyle(linear1, 5, 35, "#ffffff", true);
			linear1.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					
				}
			});
			
			return _view;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
