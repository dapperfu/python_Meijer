package androidx.appcompat.app;

import Z.n0;
import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.appcompat.widget.J;
import androidx.core.view.ViewCompat;
import com.fullstory.FS;
import i.C14587j;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class r {

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?>[] f46200b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f46201c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f46202d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f46203e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f46204f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f46205g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h, reason: collision with root package name */
    private static final n0<String, Constructor<? extends View>> f46206h = new n0<>();

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f46207a = new Object[2];

    private static class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final View f46208a;

        /* renamed from: b, reason: collision with root package name */
        private final String f46209b;

        /* renamed from: c, reason: collision with root package name */
        private Method f46210c;

        /* renamed from: d, reason: collision with root package name */
        private Context f46211d;

        private void a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f46209b, View.class)) != null) {
                        this.f46210c = method;
                        this.f46211d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id2 = this.f46208a.getId();
            if (id2 == -1) {
                str = "";
            } else {
                str = " with id '" + this.f46208a.getContext().getResources().getResourceEntryName(id2) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f46209b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f46208a.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (this.f46210c == null) {
                a(this.f46208a.getContext());
            }
            try {
                this.f46210c.invoke(this.f46211d, view);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }

        public a(View view, String str) {
            this.f46208a = view;
            this.f46209b = str;
        }
    }

    protected View q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    private void a(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f46202d);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            ViewCompat.n0(view, typedArrayObtainStyledAttributes.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f46203e);
        if (typedArrayObtainStyledAttributes2.hasValue(0)) {
            ViewCompat.p0(view, typedArrayObtainStyledAttributes2.getString(0));
        }
        typedArrayObtainStyledAttributes2.recycle();
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f46204f);
        if (typedArrayObtainStyledAttributes3.hasValue(0)) {
            ViewCompat.D0(view, typedArrayObtainStyledAttributes3.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes3.recycle();
    }

    private View s(Context context, String str, String str2) throws InflateException, NoSuchMethodException, SecurityException, ClassNotFoundException {
        String str3;
        n0<String, Constructor<? extends View>> n0Var = f46206h;
        Constructor<? extends View> constructor = n0Var.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f46200b);
            n0Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f46207a);
    }

    private View t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f46207a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return s(context, str, null);
            }
            int i10 = 0;
            while (true) {
                String[] strArr = f46205g;
                if (i10 >= strArr.length) {
                    return null;
                }
                View viewS = s(context, str, strArr[i10]);
                if (viewS != null) {
                    return viewS;
                }
                i10++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f46207a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context u(Context context, AttributeSet attributeSet, boolean z10, boolean z11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14587j.f136680y3, 0, 0);
        int resourceId = z10 ? typedArrayObtainStyledAttributes.getResourceId(C14587j.f136685z3, 0) : 0;
        if (z11 && resourceId == 0 && (resourceId = typedArrayObtainStyledAttributes.getResourceId(C14587j.f136447A3, 0)) != 0) {
            FS.log_i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == 0 || ((context instanceof androidx.appcompat.view.d) && ((androidx.appcompat.view.d) context).c() == resourceId)) ? context : new androidx.appcompat.view.d(context, resourceId);
    }

    private void v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    protected AppCompatAutoCompleteTextView c(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    protected AppCompatButton d(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    protected AppCompatCheckBox e(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    protected AppCompatCheckedTextView f(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckedTextView(context, attributeSet);
    }

    protected AppCompatEditText g(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    protected AppCompatImageButton h(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    protected AppCompatImageView i(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    protected AppCompatMultiAutoCompleteTextView j(Context context, AttributeSet attributeSet) {
        return new AppCompatMultiAutoCompleteTextView(context, attributeSet);
    }

    protected AppCompatRadioButton k(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    protected AppCompatRatingBar l(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    protected AppCompatSeekBar m(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    protected AppCompatSpinner n(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    protected AppCompatTextView o(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    protected AppCompatToggleButton p(Context context, AttributeSet attributeSet) {
        return new AppCompatToggleButton(context, attributeSet);
    }

    public final View r(View view, String str, Context context, AttributeSet attributeSet, boolean z10, boolean z11, boolean z12, boolean z13) {
        Context context2;
        View viewL;
        context2 = (!z10 || view == null) ? context : view.getContext();
        if (z11 || z12) {
            context2 = u(context2, attributeSet, z11, z12);
        }
        if (z13) {
            context2 = J.b(context2);
        }
        str.getClass();
        switch (str) {
            case "RatingBar":
                viewL = l(context2, attributeSet);
                v(viewL, str);
                break;
            case "CheckedTextView":
                viewL = f(context2, attributeSet);
                v(viewL, str);
                break;
            case "MultiAutoCompleteTextView":
                viewL = j(context2, attributeSet);
                v(viewL, str);
                break;
            case "TextView":
                viewL = o(context2, attributeSet);
                v(viewL, str);
                break;
            case "ImageButton":
                viewL = h(context2, attributeSet);
                v(viewL, str);
                break;
            case "SeekBar":
                viewL = m(context2, attributeSet);
                v(viewL, str);
                break;
            case "Spinner":
                viewL = n(context2, attributeSet);
                v(viewL, str);
                break;
            case "RadioButton":
                viewL = k(context2, attributeSet);
                v(viewL, str);
                break;
            case "ToggleButton":
                viewL = p(context2, attributeSet);
                v(viewL, str);
                break;
            case "ImageView":
                viewL = i(context2, attributeSet);
                v(viewL, str);
                break;
            case "AutoCompleteTextView":
                viewL = c(context2, attributeSet);
                v(viewL, str);
                break;
            case "CheckBox":
                viewL = e(context2, attributeSet);
                v(viewL, str);
                break;
            case "EditText":
                viewL = g(context2, attributeSet);
                v(viewL, str);
                break;
            case "Button":
                viewL = d(context2, attributeSet);
                v(viewL, str);
                break;
            default:
                viewL = q(context2, str, attributeSet);
                break;
        }
        if (viewL == null && context != context2) {
            viewL = t(context2, str, attributeSet);
        }
        if (viewL != null) {
            b(viewL, attributeSet);
            a(context2, viewL, attributeSet);
        }
        return viewL;
    }

    private void b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && view.hasOnClickListeners()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f46201c);
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
