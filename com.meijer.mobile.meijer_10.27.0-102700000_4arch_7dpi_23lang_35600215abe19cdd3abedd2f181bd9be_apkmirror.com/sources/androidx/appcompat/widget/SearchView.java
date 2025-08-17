package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import i.C14575a;
import i.C14578d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import u2.AbstractC17219a;
import w2.AbstractC17751a;

/* loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements androidx.appcompat.view.c {

    /* renamed from: e0, reason: collision with root package name */
    static final e f46762e0;

    /* renamed from: A, reason: collision with root package name */
    private int[] f46763A;

    /* renamed from: B, reason: collision with root package name */
    private final ImageView f46764B;

    /* renamed from: C, reason: collision with root package name */
    private final Drawable f46765C;

    /* renamed from: D, reason: collision with root package name */
    private final int f46766D;

    /* renamed from: E, reason: collision with root package name */
    private final int f46767E;

    /* renamed from: F, reason: collision with root package name */
    private final Intent f46768F;

    /* renamed from: G, reason: collision with root package name */
    private final Intent f46769G;

    /* renamed from: H, reason: collision with root package name */
    private final CharSequence f46770H;

    /* renamed from: I, reason: collision with root package name */
    View.OnFocusChangeListener f46771I;

    /* renamed from: J, reason: collision with root package name */
    private View.OnClickListener f46772J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f46773K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f46774L;

    /* renamed from: M, reason: collision with root package name */
    AbstractC17219a f46775M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f46776N;

    /* renamed from: O, reason: collision with root package name */
    private CharSequence f46777O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f46778P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f46779Q;

    /* renamed from: R, reason: collision with root package name */
    private int f46780R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f46781S;

    /* renamed from: T, reason: collision with root package name */
    private CharSequence f46782T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f46783U;

    /* renamed from: V, reason: collision with root package name */
    private int f46784V;

    /* renamed from: W, reason: collision with root package name */
    SearchableInfo f46785W;

    /* renamed from: a0, reason: collision with root package name */
    private Bundle f46786a0;

    /* renamed from: b0, reason: collision with root package name */
    private final Runnable f46787b0;

    /* renamed from: c0, reason: collision with root package name */
    private Runnable f46788c0;

    /* renamed from: d0, reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f46789d0;

    /* renamed from: p, reason: collision with root package name */
    final SearchAutoComplete f46790p;

    /* renamed from: q, reason: collision with root package name */
    private final View f46791q;

    /* renamed from: r, reason: collision with root package name */
    private final View f46792r;

    /* renamed from: s, reason: collision with root package name */
    final ImageView f46793s;

    /* renamed from: t, reason: collision with root package name */
    final ImageView f46794t;

    /* renamed from: u, reason: collision with root package name */
    final ImageView f46795u;

    /* renamed from: v, reason: collision with root package name */
    final ImageView f46796v;

    /* renamed from: w, reason: collision with root package name */
    private g f46797w;

    /* renamed from: x, reason: collision with root package name */
    private Rect f46798x;

    /* renamed from: y, reason: collision with root package name */
    private Rect f46799y;

    /* renamed from: z, reason: collision with root package name */
    private int[] f46800z;

    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* renamed from: e, reason: collision with root package name */
        private int f46801e;

        /* renamed from: f, reason: collision with root package name */
        private SearchView f46802f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f46803g;

        /* renamed from: h, reason: collision with root package name */
        final Runnable f46804h;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.c();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C14575a.f136537p);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f46802f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f46804h = new a();
            this.f46801e = getThreshold();
        }

        void b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f46762e0.c(this);
                return;
            }
            a.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        void c() {
            if (this.f46803g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f46803g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f46801e <= 0 || super.enoughToFilter();
        }

        void setSearchView(SearchView searchView) {
            this.f46802f = searchView;
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                if (i10 < 640 || i11 < 480) {
                    return 160;
                }
                return 192;
            }
            return 192;
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f46803g) {
                removeCallbacks(this.f46804h);
                post(this.f46804h);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z10, int i10, Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onFocusChanged(z10, i10, rect);
            this.f46802f.N();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f46802f.hasFocus() && getVisibility() == 0) {
                this.f46803g = true;
                if (SearchView.G(getContext())) {
                    b();
                }
            }
        }

        void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f46803g = false;
                removeCallbacks(this.f46804h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (inputMethodManager.isActive(this)) {
                    this.f46803g = false;
                    removeCallbacks(this.f46804h);
                    inputMethodManager.showSoftInput(this, 0);
                    return;
                }
                this.f46803g = true;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f46801e = i10;
        }
    }

    public interface b {
    }

    public interface c {
    }

    public interface d {
    }

    private static class e {

        /* renamed from: a, reason: collision with root package name */
        private Method f46806a;

        /* renamed from: b, reason: collision with root package name */
        private Method f46807b;

        /* renamed from: c, reason: collision with root package name */
        private Method f46808c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        e() throws NoSuchMethodException, SecurityException {
            this.f46806a = null;
            this.f46807b = null;
            this.f46808c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.f46806a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                this.f46807b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f46808c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            d();
            Method method = this.f46807b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            d();
            Method method = this.f46806a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            d();
            Method method = this.f46808c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    static class f extends AbstractC17751a {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        boolean f46809c;

        class a implements Parcelable.ClassLoaderCreator<f> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i10) {
                return new f[i10];
            }

            a() {
            }
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f46809c = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f46809c + "}";
        }

        @Override // w2.AbstractC17751a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f46809c));
        }
    }

    private static class g extends TouchDelegate {

        /* renamed from: a, reason: collision with root package name */
        private final View f46810a;

        /* renamed from: b, reason: collision with root package name */
        private final Rect f46811b;

        /* renamed from: c, reason: collision with root package name */
        private final Rect f46812c;

        /* renamed from: d, reason: collision with root package name */
        private final Rect f46813d;

        /* renamed from: e, reason: collision with root package name */
        private final int f46814e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f46815f;

        public void a(Rect rect, Rect rect2) {
            this.f46811b.set(rect);
            this.f46813d.set(rect);
            Rect rect3 = this.f46813d;
            int i10 = this.f46814e;
            rect3.inset(-i10, -i10);
            this.f46812c.set(rect2);
        }

        public g(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f46814e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f46811b = new Rect();
            this.f46813d = new Rect();
            this.f46812c = new Rect();
            a(rect, rect2);
            this.f46810a = view;
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action != 1 && action != 2) {
                    if (action == 3) {
                        z11 = this.f46815f;
                        this.f46815f = false;
                    }
                    z10 = true;
                    z12 = false;
                } else {
                    z11 = this.f46815f;
                    if (z11 && !this.f46813d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                }
                z12 = z11;
                z10 = true;
            } else if (this.f46811b.contains(x10, y10)) {
                this.f46815f = true;
                z10 = true;
            } else {
                z10 = true;
                z12 = false;
            }
            if (!z12) {
                return false;
            }
            if (z10 && !this.f46812c.contains(x10, y10)) {
                motionEvent.setLocation(this.f46810a.getWidth() / 2, this.f46810a.getHeight() / 2);
            } else {
                Rect rect = this.f46812c;
                motionEvent.setLocation(x10 - rect.left, y10 - rect.top);
            }
            return this.f46810a.dispatchTouchEvent(motionEvent);
        }
    }

    void I(int i10, String str, String str2) {
        getContext().startActivity(z("android.intent.action.SEARCH", null, null, str2, i10, str));
    }

    void L() {
        V(false);
        this.f46790p.requestFocus();
        this.f46790p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f46772J;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f46779Q = true;
        super.clearFocus();
        this.f46790p.clearFocus();
        this.f46790p.setImeVisibility(false);
        this.f46779Q = false;
    }

    public void setOnCloseListener(b bVar) {
    }

    public void setOnQueryTextListener(c cVar) {
    }

    public void setOnSuggestionListener(d dVar) {
    }

    static class a {
        static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    static {
        f46762e0 = Build.VERSION.SDK_INT < 29 ? new e() : null;
    }

    private void A() {
        this.f46790p.dismissDropDown();
    }

    private void C(View view, Rect rect) {
        view.getLocationInWindow(this.f46800z);
        getLocationInWindow(this.f46763A);
        int[] iArr = this.f46800z;
        int i10 = iArr[1];
        int[] iArr2 = this.f46763A;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    private CharSequence D(CharSequence charSequence) {
        if (!this.f46773K || this.f46765C == null) {
            return charSequence;
        }
        int textSize = (int) (this.f46790p.getTextSize() * 1.25d);
        this.f46765C.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f46765C), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean E() {
        SearchableInfo searchableInfo = this.f46785W;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            Intent intent = this.f46785W.getVoiceSearchLaunchWebSearch() ? this.f46768F : this.f46785W.getVoiceSearchLaunchRecognizer() ? this.f46769G : null;
            if (intent != null && getContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                return true;
            }
        }
        return false;
    }

    private boolean H() {
        return (this.f46776N || this.f46781S) && !F();
    }

    private void O() {
        post(this.f46787b0);
    }

    private void Q() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f46790p.getText());
        this.f46795u.setVisibility(!zIsEmpty || (this.f46773K && !this.f46783U) ? 0 : 8);
        Drawable drawable = this.f46795u.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void S() {
        this.f46790p.setThreshold(this.f46785W.getSuggestThreshold());
        this.f46790p.setImeOptions(this.f46785W.getImeOptions());
        int inputType = this.f46785W.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f46785W.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f46790p.setInputType(inputType);
        AbstractC17219a abstractC17219a = this.f46775M;
        if (abstractC17219a != null) {
            abstractC17219a.a(null);
        }
        if (this.f46785W.getSuggestAuthority() != null) {
            G g10 = new G(getContext(), this, this.f46785W, this.f46789d0);
            this.f46775M = g10;
            this.f46790p.setAdapter(g10);
            ((G) this.f46775M).x(this.f46778P ? 2 : 1);
        }
    }

    private void U(boolean z10) {
        this.f46794t.setVisibility((this.f46776N && H() && hasFocus() && (z10 || !this.f46781S)) ? 0 : 8);
    }

    private void V(boolean z10) {
        this.f46774L = z10;
        int i10 = 8;
        int i11 = z10 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f46790p.getText());
        this.f46793s.setVisibility(i11);
        U(!zIsEmpty);
        this.f46791q.setVisibility(z10 ? 8 : 0);
        if (this.f46764B.getDrawable() != null && !this.f46773K) {
            i10 = 0;
        }
        this.f46764B.setVisibility(i10);
        Q();
        W(zIsEmpty);
        T();
    }

    private void W(boolean z10) {
        int i10 = 8;
        if (this.f46781S && !F() && z10) {
            this.f46794t.setVisibility(8);
            i10 = 0;
        }
        this.f46796v.setVisibility(i10);
    }

    private void setQuery(CharSequence charSequence) {
        this.f46790p.setText(charSequence);
        this.f46790p.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    private Intent z(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f46782T);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f46786a0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f46785W.getSearchActivity());
        return intent;
    }

    void B() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            a.a(this.f46790p);
            return;
        }
        e eVar = f46762e0;
        eVar.b(this.f46790p);
        eVar.a(this.f46790p);
    }

    public boolean F() {
        return this.f46774L;
    }

    void J() {
        if (!TextUtils.isEmpty(this.f46790p.getText())) {
            this.f46790p.setText("");
            this.f46790p.requestFocus();
            this.f46790p.setImeVisibility(true);
        } else if (this.f46773K) {
            clearFocus();
            V(true);
        }
    }

    void M() {
        Editable text = this.f46790p.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f46785W != null) {
            I(0, null, text.toString());
        }
        this.f46790p.setImeVisibility(false);
        A();
    }

    public void P(CharSequence charSequence, boolean z10) {
        this.f46790p.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f46790p;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f46782T = charSequence;
        }
        if (!z10 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        M();
    }

    public int getImeOptions() {
        return this.f46790p.getImeOptions();
    }

    public int getInputType() {
        return this.f46790p.getInputType();
    }

    public int getMaxWidth() {
        return this.f46780R;
    }

    public CharSequence getQuery() {
        return this.f46790p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f46777O;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f46785W;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f46770H : getContext().getText(this.f46785W.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.f46767E;
    }

    int getSuggestionRowLayout() {
        return this.f46766D;
    }

    public AbstractC17219a getSuggestionsAdapter() {
        return this.f46775M;
    }

    @Override // androidx.appcompat.view.c
    public void onActionViewCollapsed() {
        P("", false);
        clearFocus();
        V(true);
        this.f46790p.setImeOptions(this.f46784V);
        this.f46783U = false;
    }

    @Override // androidx.appcompat.view.c
    public void onActionViewExpanded() {
        if (this.f46783U) {
            return;
        }
        this.f46783U = true;
        int imeOptions = this.f46790p.getImeOptions();
        this.f46784V = imeOptions;
        this.f46790p.setImeOptions(imeOptions | 33554432);
        this.f46790p.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f46787b0);
        post(this.f46788c0);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.a());
        V(fVar.f46809c);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (this.f46779Q || !isFocusable()) {
            return false;
        }
        if (F()) {
            return super.requestFocus(i10, rect);
        }
        boolean zRequestFocus = this.f46790p.requestFocus(i10, rect);
        if (zRequestFocus) {
            V(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f46786a0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            J();
        } else {
            L();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f46773K == z10) {
            return;
        }
        this.f46773K = z10;
        V(z10);
        R();
    }

    public void setImeOptions(int i10) {
        this.f46790p.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f46790p.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f46780R = i10;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f46771I = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f46772J = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f46777O = charSequence;
        R();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.f46778P = z10;
        AbstractC17219a abstractC17219a = this.f46775M;
        if (abstractC17219a instanceof G) {
            ((G) abstractC17219a).x(z10 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f46785W = searchableInfo;
        if (searchableInfo != null) {
            S();
            R();
        }
        boolean zE = E();
        this.f46781S = zE;
        if (zE) {
            this.f46790p.setPrivateImeOptions("nm");
        }
        V(F());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f46776N = z10;
        V(F());
    }

    public void setSuggestionsAdapter(AbstractC17219a abstractC17219a) {
        this.f46775M = abstractC17219a;
        this.f46790p.setAdapter(abstractC17219a);
    }

    static boolean G(Context context) {
        if (context.getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    private void R() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f46790p;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(D(queryHint));
    }

    private void T() {
        int i10;
        if (H() && (this.f46794t.getVisibility() == 0 || this.f46796v.getVisibility() == 0)) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f46792r.setVisibility(i10);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C14578d.f136561e);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C14578d.f136562f);
    }

    protected void K(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void N() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        V(F());
        O();
        if (this.f46790p.hasFocus()) {
            B();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            C(this.f46790p, this.f46798x);
            Rect rect = this.f46799y;
            Rect rect2 = this.f46798x;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            g gVar = this.f46797w;
            if (gVar == null) {
                g gVar2 = new g(this.f46799y, this.f46798x, this.f46790p);
                this.f46797w = gVar2;
                setTouchDelegate(gVar2);
                return;
            }
            gVar.a(this.f46799y, this.f46798x);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        if (F()) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824 && (i12 = this.f46780R) > 0) {
                    size = Math.min(i12, size);
                }
            } else {
                size = this.f46780R;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            }
        } else {
            int i13 = this.f46780R;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = getPreferredHeight();
            }
        } else {
            size2 = Math.min(getPreferredHeight(), size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.f46809c = F();
        return fVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        O();
    }
}
