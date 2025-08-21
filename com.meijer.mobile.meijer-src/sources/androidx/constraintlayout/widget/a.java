package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import com.fullstory.FS;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    String f53351a;

    /* renamed from: b, reason: collision with root package name */
    private b f53352b;

    /* renamed from: c, reason: collision with root package name */
    private int f53353c;

    /* renamed from: d, reason: collision with root package name */
    private float f53354d;

    /* renamed from: e, reason: collision with root package name */
    private String f53355e;

    /* renamed from: f, reason: collision with root package name */
    boolean f53356f;

    /* renamed from: g, reason: collision with root package name */
    private int f53357g;

    public enum b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    public a(String str, b bVar, Object obj) {
        this.f53351a = str;
        this.f53352b = bVar;
        d(obj);
    }

    /* renamed from: androidx.constraintlayout.widget.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C1102a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f53358a;

        static {
            int[] iArr = new int[b.values().length];
            f53358a = iArr;
            try {
                iArr[b.COLOR_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53358a[b.COLOR_DRAWABLE_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53358a[b.INT_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53358a[b.FLOAT_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f53358a[b.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f53358a[b.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f53358a[b.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static HashMap<String, a> a(HashMap<String, a> map, View view) {
        HashMap<String, a> map2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            a aVar = map.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    map2.put(str, new a(aVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    map2.put(str, new a(aVar, cls.getMethod("getMap" + str, null).invoke(view, null)));
                }
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (NoSuchMethodException e11) {
                e11.printStackTrace();
            } catch (InvocationTargetException e12) {
                e12.printStackTrace();
            }
        }
        return map2;
    }

    public static void c(View view, HashMap<String, a> map) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            a aVar = map.get(str);
            String str2 = "set" + str;
            try {
                int i10 = C1102a.f53358a[aVar.f53352b.ordinal()];
                Class cls2 = Integer.TYPE;
                Class cls3 = Float.TYPE;
                switch (i10) {
                    case 1:
                        cls.getMethod(str2, cls2).invoke(view, Integer.valueOf(aVar.f53357g));
                        break;
                    case 2:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f53357g);
                        method.invoke(view, colorDrawable);
                        break;
                    case 3:
                        cls.getMethod(str2, cls2).invoke(view, Integer.valueOf(aVar.f53353c));
                        break;
                    case 4:
                        cls.getMethod(str2, cls3).invoke(view, Float.valueOf(aVar.f53354d));
                        break;
                    case 5:
                        cls.getMethod(str2, CharSequence.class).invoke(view, aVar.f53355e);
                        break;
                    case 6:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.f53356f));
                        break;
                    case 7:
                        cls.getMethod(str2, cls3).invoke(view, Float.valueOf(aVar.f53354d));
                        break;
                }
            } catch (IllegalAccessException e10) {
                FS.log_e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e10.printStackTrace();
            } catch (NoSuchMethodException e11) {
                FS.log_e("TransitionLayout", e11.getMessage());
                FS.log_e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cls.getName());
                sb2.append(" must have a method ");
                sb2.append(str2);
                FS.log_e("TransitionLayout", sb2.toString());
            } catch (InvocationTargetException e12) {
                FS.log_e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e12.printStackTrace();
            }
        }
    }

    public void d(Object obj) {
        switch (C1102a.f53358a[this.f53352b.ordinal()]) {
            case 1:
            case 2:
                this.f53357g = ((Integer) obj).intValue();
                break;
            case 3:
                this.f53353c = ((Integer) obj).intValue();
                break;
            case 4:
                this.f53354d = ((Float) obj).floatValue();
                break;
            case 5:
                this.f53355e = (String) obj;
                break;
            case 6:
                this.f53356f = ((Boolean) obj).booleanValue();
                break;
            case 7:
                this.f53354d = ((Float) obj).floatValue();
                break;
        }
    }

    public static void b(Context context, XmlPullParser xmlPullParser, HashMap<String, a> map) {
        b bVar;
        Object string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), f.f53651a3);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string2 = null;
        Object objValueOf = null;
        b bVar2 = null;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == f.f53658b3) {
                string2 = typedArrayObtainStyledAttributes.getString(index);
                if (string2 != null && string2.length() > 0) {
                    string2 = Character.toUpperCase(string2.charAt(0)) + string2.substring(1);
                }
            } else if (index == f.f53665c3) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                bVar2 = b.BOOLEAN_TYPE;
            } else {
                if (index == f.f53679e3) {
                    bVar = b.COLOR_TYPE;
                    string = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == f.f53672d3) {
                    bVar = b.COLOR_DRAWABLE_TYPE;
                    string = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == f.f53707i3) {
                    bVar = b.DIMENSION_TYPE;
                    string = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == f.f53686f3) {
                    bVar = b.DIMENSION_TYPE;
                    string = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == f.f53693g3) {
                    bVar = b.FLOAT_TYPE;
                    string = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == f.f53700h3) {
                    bVar = b.INT_TYPE;
                    string = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == f.f53714j3) {
                    bVar = b.STRING_TYPE;
                    string = typedArrayObtainStyledAttributes.getString(index);
                }
                Object obj = string;
                bVar2 = bVar;
                objValueOf = obj;
            }
        }
        if (string2 != null && objValueOf != null) {
            map.put(string2, new a(string2, bVar2, objValueOf));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public a(a aVar, Object obj) {
        this.f53351a = aVar.f53351a;
        this.f53352b = aVar.f53352b;
        d(obj);
    }
}
