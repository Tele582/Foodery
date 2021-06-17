package com.Foodery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.*;
import android.view.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.util.*;
import android.animation.*;

import java.util.*;

import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Timer;
import java.util.TimerTask;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.content.Intent;


public class MainActivity extends  AppCompatActivity  { 
	
	private Timer _timer = new Timer();
	
	private String typeWriterStr = "";
	private double typeWriterNum = 0;
	private String typeWriterStr2 = "";
	
	private LinearLayout linear1;
	private LinearLayout linear3;
	private LinearLayout linear2;
	private LinearLayout linear5;
	private LinearLayout linear4;
	private ImageView imageview1;
	private LinearLayout linear6;
	private ImageView imageview2;
	private LinearLayout linear7;
	private TextView textview1;
	
	private TimerTask t;
	private ObjectAnimator animator = new ObjectAnimator();
	private TimerTask time;
	private ObjectAnimator antt = new ObjectAnimator();
	private TimerTask teens;
	private Intent mint = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		textview1 = (TextView) findViewById(R.id.textview1);
	}
	
	private void initializeLogic() {
		_transparent_bar();
		_adbb(linear4, "#ffffff", "#ffffff", 45, 45, 0, 0);
		
		final MKLoader yy = new MKLoader(this);
		
		yy.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, android.widget.LinearLayout.LayoutParams.WRAP_CONTENT));
		
		yy.setType(9);
		
		yy.setColor("#FFFFFF");
		
		linear5.addView(yy);
		imageview2.setColorFilter(0xFFD32F2F, PorterDuff.Mode.MULTIPLY);
		linear6.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)35, (int)1, 0xFF263238, 0xFFFFFFFF));
		_setTypeWriter(textview1, "We deliver foods from local Restaurants...", 200);
		time = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						animator.setTarget(linear4);
						animator.setPropertyName("scaleY");
						animator.setFloatValues((float)(0));
						animator.setFloatValues((float)(0), (float)(20));
						animator.setDuration((int)(500));
						animator.setRepeatMode(ValueAnimator.RESTART);
						animator.setRepeatCount((int)(0));
						animator.setInterpolator(new LinearInterpolator());
						animator.start();
						antt.setTarget(linear4);
						antt.setPropertyName("scaleX");
						antt.setFloatValues((float)(0));
						antt.setFloatValues((float)(0), (float)(20));
						antt.setDuration((int)(500));
						antt.setRepeatMode(ValueAnimator.RESTART);
						antt.setRepeatCount((int)(0));
						antt.setInterpolator(new LinearInterpolator());
						antt.start();
					}
				});
			}
		};
		_timer.schedule(time, (int)(2500));
		teens = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						mint.setClass(getApplicationContext(), HomeActivity.class);
						startActivity(mint);
						finish();
					}
				});
			}
		};
		_timer.schedule(teens, (int)(4000));
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _adbb (final View _view, final String _color1, final String _color2, final double _tl, final double _tr, final double _bl, final double _br) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		gd.setColor(Color.parseColor(_color1));
		gd.setStroke(2, Color.parseColor(_color2));
		
		gd.setCornerRadii(new float[]{(int)_tl,(int)_tl,(int)_tr,(int)_tr,(int)_bl,(int)_bl,(int)_br,(int)_br});
		
		_view.setBackground(gd);
	}
	
	
	public void _transparent_bar () {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) { Window w = getWindow();  w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS); };
	}
	
	
	public void _MKloader_Library () {
	}
	
	
	public class Arc extends GraphicObject {
		  private RectF oval;
		  private float startAngle;
		  private float sweepAngle;
		  private boolean useCenter;
		
		  public void setOval(RectF oval) {
			    this.oval = oval;
			  }
		
		  public void setStartAngle(float startAngle) {
			    this.startAngle = startAngle;
			  }
		
		  public void setSweepAngle(float sweepAngle) {
			    this.sweepAngle = sweepAngle;
			  }
		
		  public void setUseCenter(boolean useCenter) {
			    this.useCenter = useCenter;
			  }
		
		  public float getStartAngle() {
			    return startAngle;
			  }
		
		  @Override public void draw(Canvas canvas) {
			    canvas.drawArc(oval, startAngle, sweepAngle, useCenter, paint);
			  }
	}
	
	
	
	public class Balloon extends LoaderView {
		  @Override public void initializeObjects() {
			
			  }
		
		  @Override public void setUpAnimation() {
			
			  }
		
		  @Override public void draw(Canvas canvas) {
			
			  }
	}
	
	
	public class Circle extends GraphicObject {
		  private PointF center;
		  private float radius;
		
		  public Circle() {
			    center = new PointF();
			  }
		
		  public void setRadius(float radius) {
			    this.radius = radius;
			  }
		
		  public void setCenter(float x, float y) {
			    center.set(x, y);
			  }
		
		  @Override public void draw(Canvas canvas) {
			    canvas.drawCircle(center.x, center.y, radius, paint);
			  }
	}
	
	
	public class ClassicSpinner extends LoaderView {
		  private Circle[] circles;
		  private int circlesSize;
		
		  public ClassicSpinner() {
			    circlesSize = 8;
			  }
		
		  @Override public void initializeObjects() {
			    final float size = Math.min(width, height);
			    final float circleRadius = size / 10.0f;
			    circles = new Circle[circlesSize];
			
			    for (int i = 0; i < circlesSize; i++) {
				      circles[i] = new Circle();
				      circles[i].setCenter(center.x, circleRadius);
				      circles[i].setColor(color);
				      circles[i].setAlpha(126);
				      circles[i].setRadius(circleRadius);
				    }
			  }
		
		  @Override public void setUpAnimation() {
			    for (int i = 0; i < circlesSize; i++) {
				      final int index = i;
				
				      ValueAnimator fadeAnimator = ValueAnimator.ofInt(126, 255, 126);
				      fadeAnimator.setRepeatCount(ValueAnimator.INFINITE);
				      fadeAnimator.setDuration(1000);
				      fadeAnimator.setStartDelay(index * 120);
				      fadeAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
					        @Override public void onAnimationUpdate(ValueAnimator animation) {
						          circles[index].setAlpha((int)animation.getAnimatedValue());
						          if (invalidateListener != null) {
							            invalidateListener.reDraw();
							          }
						        }
					      });
				
				      fadeAnimator.start();
				    }
			  }
		
		  @Override public void draw(Canvas canvas) {
			    for (int i = 0; i < circlesSize; i++) {
				      canvas.save();
				      canvas.rotate(45 * i, center.x, center.y);
				      circles[i].draw(canvas);
				      canvas.restore();
				    }
			  }
	}
	
	
	public class FishSpinner extends LoaderView {
		  private Circle[] circles;
		  private int numberOfCircle;
		  private float[] rotates;
		
		  public FishSpinner() {
			    numberOfCircle = 5;
			    rotates = new float[numberOfCircle];
			  }
		
		  @Override public void initializeObjects() {
			    final float size = Math.min(width, height);
			    final float circleRadius = size / 10.0f;
			    circles = new Circle[numberOfCircle];
			
			    for (int i = 0; i < numberOfCircle; i++) {
				      circles[i] = new Circle();
				      circles[i].setCenter(center.x, circleRadius);
				      circles[i].setColor(color);
				      circles[i].setRadius(circleRadius - circleRadius * i / 6);
				    }
			  }
		
		  @Override public void setUpAnimation() {
			    for (int i = 0; i < numberOfCircle; i++) {
				      final int index = i;
				
				      ValueAnimator fadeAnimator = ValueAnimator.ofFloat(0, 360);
				      fadeAnimator.setRepeatCount(ValueAnimator.INFINITE);
				      fadeAnimator.setDuration(1700);
				      fadeAnimator.setStartDelay(index * 100);
				      fadeAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
					        @Override public void onAnimationUpdate(ValueAnimator animation) {
						          rotates[index] = (float)animation.getAnimatedValue();
						          if (invalidateListener != null) {
							            invalidateListener.reDraw();
							          }
						        }
					      });
				
				      fadeAnimator.start();
				    }
			  }
		
		  @Override public void draw(Canvas canvas) {
			    for (int i = 0; i < numberOfCircle; i++) {
				      canvas.save();
				      canvas.rotate(rotates[i], center.x, center.y);
				      circles[i].draw(canvas);
				      canvas.restore();
				    }
			  }
	}
	
	
	
	public abstract class GraphicObject {
		  protected Paint paint;
		
		  public GraphicObject() {
			    paint = new Paint();
			    paint.setAntiAlias(true);
			  }
		
		  public void setColor(int color) {
			    paint.setColor(color);
			  }
		
		  public void setAlpha(int alpha) {
			    paint.setAlpha(alpha);
			  }
		
		  public void setWidth(float width) {
			    paint.setStrokeWidth(width);
			  }
		
		  public void setStyle(Paint.Style style) {
			    paint.setStyle(style);
			  }
		
		  public abstract void draw(Canvas canvas);
	}
	
	
	public interface InvalidateListener {
		  void reDraw();
	}
	
	public class InvalidNumberOfPulseException extends Exception {
		
		  @Override public String getMessage() {
			    return "The number of pulse must be between 2 and 6";
			  }
	}
	
	
	public class Line extends GraphicObject {
		  private PointF point1;
		  private PointF point2;
		
		  public void setPoint1(PointF point1) {
			    this.point1 = point1;
			  }
		
		  public void setPoint2(PointF point2) {
			    this.point2 = point2;
			  }
		
		  public PointF getPoint1() {
			    return point1;
			  }
		
		  public PointF getPoint2() {
			    return point2;
			  }
		
		  @Override public void draw(Canvas canvas) {
			    canvas.drawLine(point1.x, point1.y, point2.x, point2.y, paint);
			  }
	}
	
	
	public class LineSpinner extends LoaderView {
		  private Line[] lines;
		  private int numberOfLine;
		
		  public LineSpinner() {
			    numberOfLine = 8;
			  }
		
		  @Override public void initializeObjects() {
			    int size = Math.min(width, height);
			    float lineWidth = size / 10f;
			    lines = new Line[numberOfLine];
			
			    for (int i = 0; i < numberOfLine; i++) {
				      lines[i] = new Line();
				      lines[i].setColor(color);
				      lines[i].setAlpha(126);
				      lines[i].setWidth(lineWidth);
				      lines[i].setPoint1(new PointF(center.x, center.y - size / 2f + lineWidth));
				      lines[i].setPoint2(new PointF(center.x, lines[i].getPoint1().y + 2 * lineWidth));
				    }
			  }
		
		  @Override public void setUpAnimation() {
			    for (int i = 0; i < numberOfLine; i++) {
				      final int index = i;
				
				      ValueAnimator fadeAnimator = ValueAnimator.ofInt(126, 255, 126);
				      fadeAnimator.setRepeatCount(ValueAnimator.INFINITE);
				      fadeAnimator.setDuration(1000);
				      fadeAnimator.setStartDelay(index * 120);
				      fadeAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
					        @Override public void onAnimationUpdate(ValueAnimator animation) {
						          lines[index].setAlpha((int)animation.getAnimatedValue());
						          if (invalidateListener != null) {
							            invalidateListener.reDraw();
							          }
						        }
					      });
				
				      fadeAnimator.start();
				    }
			  }
		
		  @Override public void draw(Canvas canvas) {
			    for (int i = 0; i < numberOfLine; i++) {
				      canvas.save();
				      canvas.rotate(45 * i, center.x, center.y);
				      lines[i].draw(canvas);
				      canvas.restore();
				    }
			  }
	}
	
	
	public class PhoneWave extends LoaderView {
		  private Arc[] arcs;
		  private int numberOfArc;
		
		  public PhoneWave() {
			    numberOfArc = 3;
			  }
		
		  @Override public void initializeObjects() {
			    float r = Math.min(width, height) / 2f;
			    arcs = new Arc[numberOfArc];
			
			    for (int i = 0; i < numberOfArc; i++) {
				      float d = r / 4 + i * r / 4;
				      arcs[i] = new Arc();
				      arcs[i].setColor(color);
				      arcs[i].setAlpha(126);
				      arcs[i].setOval(new RectF(center.x - d, center.y - d + r / 3, center.x + d, center.y + d + r / 3));
				      arcs[i].setStartAngle(225);
				      arcs[i].setSweepAngle(90);
				      arcs[i].setStyle(Paint.Style.STROKE);
				      arcs[i].setWidth(r / 10f);
				    }
			  }
		
		  @Override public void setUpAnimation() {
			    for (int i = 0; i < numberOfArc; i++) {
				      final int index = i;
				
				      ValueAnimator fadeAnimator = ValueAnimator.ofInt(126, 255, 126);
				      fadeAnimator.setRepeatCount(ValueAnimator.INFINITE);
				      fadeAnimator.setDuration(1000);
				      fadeAnimator.setStartDelay(i * 120);
				      fadeAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
					        @Override public void onAnimationUpdate(ValueAnimator animation) {
						          arcs[index].setAlpha((int)animation.getAnimatedValue());
						          if (invalidateListener != null) {
							            invalidateListener.reDraw();
							          }
						        }
					      });
				
				      fadeAnimator.start();
				    }
			  }
		
		  @Override public void draw(Canvas canvas) {
			    for (int i = 0; i < numberOfArc; i++) {
				      arcs[i].draw(canvas);
				    }
			  }
	}
	
	
	public class Pulse extends LoaderView {
		  private Line[] lines;
		  private int numberOfLines;
		  private float lineWidth;
		  private float lineDistance;
		  private float[] scaleY;
		
		  public Pulse(int numberOfLines) throws InvalidNumberOfPulseException {
			    if (numberOfLines < 3 || numberOfLines > 5) {
				      throw new InvalidNumberOfPulseException();
				    }
			
			    this.numberOfLines = numberOfLines;
			    lines = new Line[numberOfLines];
			    scaleY = new float[numberOfLines];
			  }
		
		  @Override public void initializeObjects() {
			    lineWidth = width / (2 * numberOfLines);
			    lineDistance = lineWidth / 4f;
			    float firstX = (width - (lineWidth * numberOfLines + lineDistance * (numberOfLines - 1))) / 2f + lineWidth / 2f;
			    for (int i = 0; i < numberOfLines; i++) {
				      lines[i] = new Line();
				      lines[i].setColor(color);
				      lines[i].setWidth(lineWidth);
				      lines[i].setPoint1(new PointF(firstX, center.y - height / 4f));
				      lines[i].setPoint2(new PointF(firstX, center.y + height / 4f));
				    }
			  }
		
		  @Override public void setUpAnimation() {
			    for (int i = 0; i < numberOfLines; i++) {
				      final int index = i;
				      ValueAnimator scaleAnimator = ValueAnimator.ofFloat(1f, 1.5f, 1f);
				      scaleAnimator.setDuration(1000);
				      scaleAnimator.setStartDelay(i * 120);
				      scaleAnimator.setRepeatCount(ValueAnimator.INFINITE);
				      scaleAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
					        @Override public void onAnimationUpdate(ValueAnimator animation) {
						          scaleY[index] = (float)animation.getAnimatedValue();
						          if (invalidateListener != null) {
							            invalidateListener.reDraw();
							          }
						        }
					      });
				
				      scaleAnimator.start();
				    }
			  }
		
		  @Override public void draw(Canvas canvas) {
			    for (int i = 0; i < numberOfLines; i++) {
				      canvas.save();
				      canvas.translate(i * (lineWidth + lineDistance), 0);
				      canvas.scale(1, scaleY[i], lines[i].getPoint1().x, center.y);
				      lines[i].draw(canvas);
				      canvas.restore();
				    }
			  }
	}
	
	
	public class Radar extends LoaderView {
		  private Line line;
		  private float degree;
		
		  @Override public void initializeObjects() {
			    final float size = Math.min(width, height);
			    line = new Line();
			    line.setPoint1(center);
			    line.setPoint2(new PointF(0, size / 2f));
			    line.setColor(color);
			    line.setWidth(5);
			  }
		
		  @Override public void setUpAnimation() {
			    ValueAnimator animator = ValueAnimator.ofFloat(0, 359);
			    animator.setDuration(1000);
			    animator.setRepeatCount(ValueAnimator.INFINITE);
			    animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
				      @Override public void onAnimationUpdate(ValueAnimator animation) {
					        degree = (float)animation.getAnimatedValue();
					        if (invalidateListener != null) {
						          invalidateListener.reDraw();
						        }
					      }
				    });
			
			    animator.start();
			  }
		
		  @Override public void draw(Canvas canvas) {
			    canvas.save();
			    canvas.rotate(degree, center.x, center.y);
			    line.draw(canvas);
			    canvas.restore();
			  }
	}
	
	
	public class Sharingan extends LoaderView {
		  private Circle eye;
		  private Circle eyeBound;
		  private Circle[] sharingans;
		  private int numberOfSharingan;
		  private float rotate;
		  private float scale;
		  private float eyeBoundRadius;
		  private float eyeBoundRadiusScale;
		
		  public Sharingan() {
			    numberOfSharingan = 3;
			  }
		
		  @Override public void initializeObjects() {
			    float r = Math.min(width, height) / 2f;
			    eyeBoundRadius = r / 1.5f;
			
			    eye = new Circle();
			    eye.setCenter(center.x, center.y);
			    eye.setColor(color);
			    eye.setRadius(r / 4);
			
			    eyeBound = new Circle();
			    eyeBound.setCenter(center.x, center.y);
			    eyeBound.setColor(color);
			    eyeBound.setRadius(eyeBoundRadius);
			    eyeBound.setStyle(Paint.Style.STROKE);
			    eyeBound.setWidth(r / 20f);
			
			    sharingans = new Circle[numberOfSharingan];
			    for (int i = 0; i < numberOfSharingan; i++) {
				      sharingans[i] = new Circle();
				      sharingans[i].setCenter(center.x, center.y - eyeBoundRadius);
				      sharingans[i].setColor(color);
				      sharingans[i].setRadius(r / 6);
				    }
			  }
		
		  @Override public void setUpAnimation() {
			    ValueAnimator rotateAnimator = ValueAnimator.ofFloat(0, 360);
			    rotateAnimator.setDuration(1500);
			    rotateAnimator.setRepeatCount(ValueAnimator.INFINITE);
			    rotateAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
				      @Override public void onAnimationUpdate(ValueAnimator animation) {
					        rotate = (float)animation.getAnimatedValue();
					        if (invalidateListener != null) {
						          invalidateListener.reDraw();
						        }
					      }
				    });
			
			    ValueAnimator scaleAnimator = ValueAnimator.ofFloat(1f, 0.8f, 1f);
			    scaleAnimator.setDuration(1000);
			    scaleAnimator.setRepeatCount(ValueAnimator.INFINITE);
			    scaleAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
				      @Override public void onAnimationUpdate(ValueAnimator animation) {
					        scale = (float)animation.getAnimatedValue();
					        if (invalidateListener != null) {
						          invalidateListener.reDraw();
						        }
					      }
				    });
			
			    AnimatorSet animatorSet = new AnimatorSet();
			    animatorSet.play(rotateAnimator).with(scaleAnimator);
			    animatorSet.start();
			  }
		
		  @Override public void draw(Canvas canvas) {
			    canvas.save();
			    canvas.scale(scale, scale, center.x, center.y);
			    canvas.rotate(rotate, center.x, center.y);
			    eye.draw(canvas);
			    eyeBound.draw(canvas);
			    for (int i = 0; i < numberOfSharingan; i++) {
				      canvas.save();
				      canvas.rotate(i * 120, center.x, center.y);
				      sharingans[i].draw(canvas);
				      canvas.restore();
				    }
			    canvas.restore();
			  }
	}
	
	
	public class TwinFishesSpinner extends LoaderView {
		  private Circle[] circles;
		  private int numberOfCircle;
		  private float[] rotates;
		
		  public TwinFishesSpinner() {
			    numberOfCircle = 10;
			    rotates = new float[numberOfCircle];
			  }
		
		  @Override public void initializeObjects() {
			    final float size = Math.min(width, height);
			    final float circleRadius = size / 10.0f;
			    circles = new Circle[numberOfCircle];
			
			    for (int i = 0; i < numberOfCircle / 2; i++) {
				      circles[i] = new Circle();
				      circles[i].setCenter(center.x, circleRadius);
				      circles[i].setColor(color);
				      circles[i].setRadius(circleRadius - circleRadius * i / 6);
				    }
			
			    for (int i = numberOfCircle / 2; i < numberOfCircle; i++) {
				      circles[i] = new Circle();
				      circles[i].setCenter(center.x, size - circleRadius);
				      circles[i].setColor(color);
				      circles[i].setRadius(circleRadius - circleRadius * (i - 5) / 6);
				    }
			  }
		
		  @Override public void setUpAnimation() {
			    for (int i = 0; i < numberOfCircle; i++) {
				      final int index = i;
				
				      ValueAnimator fadeAnimator = ValueAnimator.ofFloat(0, 360);
				      fadeAnimator.setRepeatCount(ValueAnimator.INFINITE);
				      fadeAnimator.setDuration(1700);
				      fadeAnimator.setStartDelay((index >= 5 ? index - 5 : index) * 100);
				      fadeAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
					        @Override public void onAnimationUpdate(ValueAnimator animation) {
						          rotates[index] = (float)animation.getAnimatedValue();
						          if (invalidateListener != null) {
							            invalidateListener.reDraw();
							          }
						        }
					      });
				
				      fadeAnimator.start();
				    }
			  }
		
		  @Override public void draw(Canvas canvas) {
			    for (int i = 0; i < numberOfCircle; i++) {
				      canvas.save();
				      canvas.rotate(rotates[i], center.x, center.y);
				      circles[i].draw(canvas);
				      canvas.restore();
				    }
			  }
	}
	
	
	public class Whirlpool extends LoaderView {
		  private Arc[] arcs;
		  private int numberOfArc;
		  private float[] rotates;
		
		  public Whirlpool() {
			    numberOfArc = 3;
			  }
		
		  @Override public void initializeObjects() {
			    float r = Math.min(width, height) / 2f;
			    arcs = new Arc[numberOfArc];
			    rotates = new float[numberOfArc];
			
			    for (int i = 0; i < numberOfArc; i++) {
				      float d = r / 4 + i * r / 4;
				      arcs[i] = new Arc();
				      arcs[i].setColor(color);
				      arcs[i].setOval(new RectF(center.x - d, center.y - d, center.x + d, center.y + d));
				      arcs[i].setStartAngle(i * 45);
				      arcs[i].setSweepAngle(i * 45 + 90);
				      arcs[i].setStyle(Paint.Style.STROKE);
				      arcs[i].setWidth(r / 10f);
				    }
			  }
		
		  @Override public void setUpAnimation() {
			    for (int i = numberOfArc - 1; i >= 0; i--) {
				      final int index = i;
				
				      ValueAnimator fadeAnimator = ValueAnimator.ofFloat(arcs[i].getStartAngle(),
				          arcs[i].getStartAngle() + 360* (i % 2 == 0 ? -1 : 1));
				      fadeAnimator.setRepeatCount(ValueAnimator.INFINITE);
				      fadeAnimator.setDuration((i + 1) * 500);
				      fadeAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
					        @Override public void onAnimationUpdate(ValueAnimator animation) {
						          rotates[index] = (float)animation.getAnimatedValue();
						          if (invalidateListener != null) {
							            invalidateListener.reDraw();
							          }
						        }
					      });
				
				      fadeAnimator.start();
				    }
			  }
		
		  @Override public void draw(Canvas canvas) {
			    for (int i = 0; i < numberOfArc; i++) {
				      canvas.save();
				      canvas.rotate(rotates[i], center.x, center.y);
				      arcs[i].draw(canvas);
				      canvas.restore();
				    }
			  }
	}
	
	
	
	public class Worm extends LoaderView {
		  private Circle[] circles;
		  private int circlesSize;
		  private float radius;
		  private int[] transformations;
		
		  public Worm() {
			    circlesSize = 5;
			    transformations = new int[]{-2, -1, 0, 1, 2};
			  }
		
		  @Override public void initializeObjects() {
			    circles = new Circle[circlesSize];
			    radius = width / 10f - width / 100f;
			
			    for (int i = 0; i < circlesSize; i++) {
				      circles[i] = new Circle();
				      circles[i].setColor(color);
				      circles[i].setRadius(radius);
				      circles[i].setCenter(center.x, center.y);
				    }
			  }
		
		  @Override public void setUpAnimation() {
			    for (int i = 0; i < circlesSize; i++) {
				      final int index = i;
				      ValueAnimator translateAnimator = ValueAnimator.ofFloat(center.y, height / 4f, height * 3 / 4f, center.y);
				      translateAnimator.setDuration(1000);
				      translateAnimator.setStartDelay(index * 120);
				      translateAnimator.setRepeatCount(ValueAnimator.INFINITE);
				      translateAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
					        @Override public void onAnimationUpdate(ValueAnimator animation) {
						          circles[index].setCenter(center.x, (float)animation.getAnimatedValue());
						          if (invalidateListener != null) {
							            invalidateListener.reDraw();
							          }
						        }
					      });
				
				      translateAnimator.start();
				    }
			  }
		
		  @Override public void draw(Canvas canvas) {
			    for (int i = 0; i < circlesSize; i++) {
				      canvas.save();
				      canvas.translate(2 * radius * transformations[i], 0);
				      circles[i].draw(canvas);
				      canvas.restore();
				    }
			  }
	}
	
	
	
	public abstract class LoaderView {
		  protected int color;
		  protected int width, height;
		  protected int desiredWidth, desiredHeight;
		  protected PointF center;
		  protected InvalidateListener invalidateListener;
		
		  public LoaderView() {
			    this.desiredWidth = 150;
			    this.desiredHeight = 150;
			  }
		
		  public void setColor(int color) {
			    this.color = color;
			  }
		
		  public void setSize(int width, int height) {
			    this.width = width;
			    this.height = height;
			    this.center = new PointF(width / 2.0f, height / 2.0f);
			  }
		
		  public void setInvalidateListener(InvalidateListener invalidateListener) {
			    this.invalidateListener = invalidateListener;
			  }
		
		  public int getDesiredWidth() {
			    return desiredWidth;
			  }
		
		  public int getDesiredHeight() {
			    return desiredHeight;
			  }
		
		  public abstract void initializeObjects();
		
		  public abstract void setUpAnimation();
		
		  public abstract void draw(Canvas canvas);
		
		  public boolean isDetached() {
			    return invalidateListener == null;
			  }
		
		  public void onDetach() {
			    if (invalidateListener != null) {
				      invalidateListener = null;
				    }
			  }
	}
	
	
	public static class LoaderGenerator {
		  public static LoaderView generateLoaderView(int type) {
			    MainActivity aan = new MainActivity();
			    switch (type) {
				      case 0:
				        return aan.new ClassicSpinner();
				      case 1:
				        return aan.new FishSpinner();
				      case 2:
				        return aan.new LineSpinner();
				      case 3:
				        try {
					          return aan.new Pulse(3);
					        } catch (InvalidNumberOfPulseException e) {
					          e.printStackTrace();
					        }
				      case 4:
				        try {
					          return aan.new Pulse(4);
					        } catch (InvalidNumberOfPulseException e) {
					          e.printStackTrace();
					        }
				      case 5:
				        try {
					          return aan.new Pulse(5);
					        } catch (InvalidNumberOfPulseException e) {
					          e.printStackTrace();
					        }
				      case 6:
				        return aan.new Radar();
				      case 7:
				        return aan.new TwinFishesSpinner();
				      case 8:
				        return aan.new Worm();
				      case 9:
				        return aan.new Whirlpool();
				      case 10:
				        return aan.new PhoneWave();
				      case 11:
				        return aan.new Sharingan();
				      default:
				        return aan.new ClassicSpinner();
				    }
			  }
		
		  public static LoaderView generateLoaderView(String type) {
			    MainActivity aan = new MainActivity();
			    switch (type) {
				      case "ClassicSpinner":
				        return aan.new ClassicSpinner();
				      case "FishSpinner":
				        return aan.new FishSpinner();
				      case "LineSpinner":
				        return aan.new LineSpinner();
				      case "ThreePulse":
				        try {
					          return aan.new Pulse(3);
					        } catch (InvalidNumberOfPulseException e) {
					          e.printStackTrace();
					        }
				      case "FourPulse":
				        try {
					          return aan.new Pulse(4);
					        } catch (InvalidNumberOfPulseException e) {
					          e.printStackTrace();
					        }
				      case "FivePulse":
				        try {
					          return aan.new Pulse(5);
					        } catch (InvalidNumberOfPulseException e) {
					          e.printStackTrace();
					        }
				      case "Radar":
				        return aan.new Radar();
				      case "TwinFishesSpinner":
				        return aan.new TwinFishesSpinner();
				      case "Worm":
				        return aan.new Worm();
				      case "Whirlpool":
				        return aan.new Whirlpool();
				      case "PhoneWave":
				        return aan.new PhoneWave();
				      case "Sharingan":
				        return aan.new Sharingan();
				      default:
				        return aan.new ClassicSpinner();
				    }
			  }
	}
	
	
	public class MKLoader extends View implements InvalidateListener {
		  private int setLoaderType;
		  private String setLoaderColor;
		  private LoaderView loaderView;
		
		  public MKLoader(Context context) {
			    super(context);
			    initialize(context, null, 0);
			  }
		
		  public MKLoader(Context context, AttributeSet attrs) {
			    super(context, attrs);
			    initialize(context, attrs, 0);
			  }
		
		  public MKLoader(Context context, AttributeSet attrs, int defStyleAttr) {
			    super(context, attrs, defStyleAttr);
			    initialize(context, attrs, defStyleAttr);
			  }
		
		  private void initialize(Context context, AttributeSet attrs, int defStyleAttr) {
			    //TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.MKLoader);
			    //int loaderType = typedArray.getInt(R.styleable.MKLoader_mk_type,-1);
			    //int loaderType = -1;
			    //loaderView = LoaderGenerator.generateLoaderView(setLoaderType);
			    //loaderView.setColor(Color.parseColor("#ffffff"));
			    //loaderView.setColor(typedArray.getColor(R.styleable.MKLoader_mk_color, Color.parseColor("#ffffff")));
			    //typedArray.recycle();
			  }
		
		  public void setType(int _type) {
				 this.setLoaderType = _type;
				 loaderView = LoaderGenerator.generateLoaderView(setLoaderType);
			  }
		  public void setColor(String _color) {
			  	this.setLoaderColor = _color;
			      loaderView.setColor(Color.parseColor(setLoaderColor));
			  }
		
		  @Override protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
			    final int measuredWidth = resolveSize(loaderView.getDesiredWidth(), widthMeasureSpec);
			    final int measuredHeight = resolveSize(loaderView.getDesiredHeight(), heightMeasureSpec);
			
			    setMeasuredDimension(measuredWidth, measuredHeight);
			  }
		
		  @Override protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
			    super.onLayout(changed, left, top, right, bottom);
			    loaderView.setSize(getWidth(), getHeight());
			    loaderView.initializeObjects();
			    loaderView.setUpAnimation();
			  }
		
		  @Override protected void onDraw(Canvas canvas) {
			    super.onDraw(canvas);
			    loaderView.draw(canvas);
			  }
		
		  @Override public void reDraw() {
			    invalidate();
			  }
		
		  @Override protected void onAttachedToWindow() {
			    super.onAttachedToWindow();
			    if (loaderView != null && loaderView.isDetached()) {
				      loaderView.setInvalidateListener(this);
				    }
			  }
		
		  @Override protected void onDetachedFromWindow() {
			    super.onDetachedFromWindow();
			    if (loaderView != null) {
				      loaderView.onDetach();
				    }
			  }
	}
	{
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
