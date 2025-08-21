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
import i.C14578a;
import i.C14581d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import u2.AbstractC17346a;
import w2.AbstractC17821a;

/* loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements androidx.appcompat.view.c {

    /* renamed from: e0, reason: collision with root package name */
    static final e f46986e0;

    /* renamed from: A, reason: collision with root package name */
    private int[] f46987A;

    /* renamed from: B, reason: collision with root package name */
    private final ImageView f46988B;

    /* renamed from: C, reason: collision with root package name */
    private final Drawable f46989C;

    /* renamed from: D, reason: collision with root package name */
    private final int f46990D;

    /* renamed from: E, reason: collision with root package name */
    private final int f46991E;

    /* renamed from: F, reason: collision with root package name */
    private final Intent f46992F;

    /* renamed from: G, reason: collision with root package name */
    private final Intent f46993G;

    /* renamed from: H, reason: collision with root package name */
    private final CharSequence f46994H;

    /* renamed from: I, reason: collision with root package name */
    View.OnFocusChangeListener f46995I;

    /* renamed from: J, reason: collision with root package name */
    private View.OnClickListener f46996J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f46997K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f46998L;

    /* renamed from: M, reason: collision with root package name */
    AbstractC17346a f46999M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f47000N;

    /* renamed from: O, reason: collision with root package name */
    private CharSequence f47001O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f47002P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f47003Q;

    /* renamed from: R, reason: collision with root package name */
    private int f47004R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f47005S;

    /* renamed from: T, reason: collision with root package name */
    private CharSequence f47006T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f47007U;

    /* renamed from: V, reason: collision with root package name */
    private int f47008V;

    /* renamed from: W, reason: collision with root package name */
    SearchableInfo f47009W;

    /* renamed from: a0, reason: collision with root package name */
    private Bundle f47010a0;

    /* renamed from: b0, reason: collision with root package name */
    private final Runnable f47011b0;

    /* renamed from: c0, reason: collision with root package name */
    private Runnable f47012c0;

    /* renamed from: d0, reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f47013d0;

    /* renamed from: p, reason: collision with root package name */
    final SearchAutoComplete f47014p;

    /* renamed from: q, reason: collision with root package name */
    private final View f47015q;

    /* renamed from: r, reason: collision with root package name */
    private final View f47016r;

    /* renamed from: s, reason: collision with root package name */
    final ImageView f47017s;

    /* renamed from: t, reason: collision with root package name */
    final ImageView f47018t;

    /* renamed from: u, reason: collision with root package name */
    final ImageView f47019u;

    /* renamed from: v, reason: collision with root package name */
    final ImageView f47020v;

    /* renamed from: w, reason: collision with root package name */
    private g f47021w;

    /* renamed from: x, reason: collision with root package name */
    private Rect f47022x;

    /* renamed from: y, reason: collision with root package name */
    private Rect f47023y;

    /* renamed from: z, reason: collision with root package name */
    private int[] f47024z;

    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* renamed from: e, reason: collision with root package name */
        private int f47025e;

        /* renamed from: f, reason: collision with root package name */
        private SearchView f47026f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f47027g;

        /* renamed from: h, reason: collision with root package name */
        final Runnable f47028h;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.c();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C14578a.f136294p);
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
                        this.f47026f.clearFocus();
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
            this.f47028h = new a();
            this.f47025e = getThreshold();
        }

        void b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f46986e0.c(this);
                return;
            }
            a.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        void c() {
            if (this.f47027g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f47027g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f47025e <= 0 || super.enoughToFilter();
        }

        void setSearchView(SearchView searchView) {
            this.f47026f = searchView;
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
            if (this.f47027g) {
                removeCallbacks(this.f47028h);
                post(this.f47028h);
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
            this.f47026f.N();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f47026f.hasFocus() && getVisibility() == 0) {
                this.f47027g = true;
                if (SearchView.G(getContext())) {
                    b();
                }
            }
        }

        void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f47027g = false;
                removeCallbacks(this.f47028h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (inputMethodManager.isActive(this)) {
                    this.f47027g = false;
                    removeCallbacks(this.f47028h);
                    inputMethodManager.showSoftInput(this, 0);
                    return;
                }
                this.f47027g = true;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f47025e = i10;
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
        private Method f47030a;

        /* renamed from: b, reason: collision with root package name */
        private Method f47031b;

        /* renamed from: c, reason: collision with root package name */
        private Method f47032c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        e() throws NoSuchMethodException, SecurityException {
            this.f47030a = null;
            this.f47031b = null;
            this.f47032c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.f47030a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                this.f47031b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f47032c = method;
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
            Method method = this.f47031b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            d();
            Method method = this.f47030a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            d();
            Method method = this.f47032c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    static class f extends AbstractC17821a {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        boolean f47033c;

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
            this.f47033c = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f47033c + "}";
        }

        @Override // w2.AbstractC17821a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f47033c));
        }
    }

    private static class g extends TouchDelegate {

        /* renamed from: a, reason: collision with root package name */
        private final View f47034a;

        /* renamed from: b, reason: collision with root package name */
        private final Rect f47035b;

        /* renamed from: c, reason: collision with root package name */
        private final Rect f47036c;

        /* renamed from: d, reason: collision with root package name */
        private final Rect f47037d;

        /* renamed from: e, reason: collision with root package name */
        private final int f47038e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f47039f;

        public void a(Rect rect, Rect rect2) {
            this.f47035b.set(rect);
            this.f47037d.set(rect);
            Rect rect3 = this.f47037d;
            int i10 = this.f47038e;
            rect3.inset(-i10, -i10);
            this.f47036c.set(rect2);
        }

        public g(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f47038e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f47035b = new Rect();
            this.f47037d = new Rect();
            this.f47036c = new Rect();
            a(rect, rect2);
            this.f47034a = view;
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
                        z11 = this.f47039f;
                        this.f47039f = false;
                    }
                    z10 = true;
                    z12 = false;
                } else {
                    z11 = this.f47039f;
                    if (z11 && !this.f47037d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                }
                z12 = z11;
                z10 = true;
            } else if (this.f47035b.contains(x10, y10)) {
                this.f47039f = true;
                z10 = true;
            } else {
                z10 = true;
                z12 = false;
            }
            if (!z12) {
                return false;
            }
            if (z10 && !this.f47036c.contains(x10, y10)) {
                motionEvent.setLocation(this.f47034a.getWidth() / 2, this.f47034a.getHeight() / 2);
            } else {
                Rect rect = this.f47036c;
                motionEvent.setLocation(x10 - rect.left, y10 - rect.top);
            }
            return this.f47034a.dispatchTouchEvent(motionEvent);
        }
    }

    void I(int i10, String str, String str2) {
        getContext().startActivity(z("android.intent.action.SEARCH", null, null, str2, i10, str));
    }

    void L() {
        V(false);
        this.f47014p.requestFocus();
        this.f47014p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f46996J;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f47003Q = true;
        super.clearFocus();
        this.f47014p.clearFocus();
        this.f47014p.setImeVisibility(false);
        this.f47003Q = false;
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
        f46986e0 = Build.VERSION.SDK_INT < 29 ? new e() : null;
    }

    private void A() {
        this.f47014p.dismissDropDown();
    }

    private void C(View view, Rect rect) {
        view.getLocationInWindow(this.f47024z);
        getLocationInWindow(this.f46987A);
        int[] iArr = this.f47024z;
        int i10 = iArr[1];
        int[] iArr2 = this.f46987A;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    private CharSequence D(CharSequence charSequence) {
        if (!this.f46997K || this.f46989C == null) {
            return charSequence;
        }
        int textSize = (int) (this.f47014p.getTextSize() * 1.25d);
        this.f46989C.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f46989C), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean E() {
        SearchableInfo searchableInfo = this.f47009W;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            Intent intent = this.f47009W.getVoiceSearchLaunchWebSearch() ? this.f46992F : this.f47009W.getVoiceSearchLaunchRecognizer() ? this.f46993G : null;
            if (intent != null && getContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                return true;
            }
        }
        return false;
    }

    private boolean H() {
        return (this.f47000N || this.f47005S) && !F();
    }

    private void O() {
        post(this.f47011b0);
    }

    private void Q() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f47014p.getText());
        this.f47019u.setVisibility(!zIsEmpty || (this.f46997K && !this.f47007U) ? 0 : 8);
        Drawable drawable = this.f47019u.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void S() {
        this.f47014p.setThreshold(this.f47009W.getSuggestThreshold());
        this.f47014p.setImeOptions(this.f47009W.getImeOptions());
        int inputType = this.f47009W.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f47009W.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f47014p.setInputType(inputType);
        AbstractC17346a abstractC17346a = this.f46999M;
        if (abstractC17346a != null) {
            abstractC17346a.a(null);
        }
        if (this.f47009W.getSuggestAuthority() != null) {
            G g10 = new G(getContext(), this, this.f47009W, this.f47013d0);
            this.f46999M = g10;
            this.f47014p.setAdapter(g10);
            ((G) this.f46999M).x(this.f47002P ? 2 : 1);
        }
    }

    private void U(boolean z10) {
        this.f47018t.setVisibility((this.f47000N && H() && hasFocus() && (z10 || !this.f47005S)) ? 0 : 8);
    }

    private void V(boolean z10) {
        this.f46998L = z10;
        int i10 = 8;
        int i11 = z10 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f47014p.getText());
        this.f47017s.setVisibility(i11);
        U(!zIsEmpty);
        this.f47015q.setVisibility(z10 ? 8 : 0);
        if (this.f46988B.getDrawable() != null && !this.f46997K) {
            i10 = 0;
        }
        this.f46988B.setVisibility(i10);
        Q();
        W(zIsEmpty);
        T();
    }

    private void W(boolean z10) {
        int i10 = 8;
        if (this.f47005S && !F() && z10) {
            this.f47018t.setVisibility(8);
            i10 = 0;
        }
        this.f47020v.setVisibility(i10);
    }

    private void setQuery(CharSequence charSequence) {
        this.f47014p.setText(charSequence);
        this.f47014p.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    private Intent z(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f47006T);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f47010a0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f47009W.getSearchActivity());
        return intent;
    }

    void B() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            a.a(this.f47014p);
            return;
        }
        e eVar = f46986e0;
        eVar.b(this.f47014p);
        eVar.a(this.f47014p);
    }

    public boolean F() {
        return this.f46998L;
    }

    void J() {
        if (!TextUtils.isEmpty(this.f47014p.getText())) {
            this.f47014p.setText("");
            this.f47014p.requestFocus();
            this.f47014p.setImeVisibility(true);
        } else if (this.f46997K) {
            clearFocus();
            V(true);
        }
    }

    void M() {
        Editable text = this.f47014p.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f47009W != null) {
            I(0, null, text.toString());
        }
        this.f47014p.setImeVisibility(false);
        A();
    }

    public void P(CharSequence charSequence, boolean z10) {
        this.f47014p.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f47014p;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f47006T = charSequence;
        }
        if (!z10 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        M();
    }

    public int getImeOptions() {
        return this.f47014p.getImeOptions();
    }

    public int getInputType() {
        return this.f47014p.getInputType();
    }

    public int getMaxWidth() {
        return this.f47004R;
    }

    public CharSequence getQuery() {
        return this.f47014p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f47001O;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f47009W;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f46994H : getContext().getText(this.f47009W.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.f46991E;
    }

    int getSuggestionRowLayout() {
        return this.f46990D;
    }

    public AbstractC17346a getSuggestionsAdapter() {
        return this.f46999M;
    }

    @Override // androidx.appcompat.view.c
    public void onActionViewCollapsed() {
        P("", false);
        clearFocus();
        V(true);
        this.f47014p.setImeOptions(this.f47008V);
        this.f47007U = false;
    }

    @Override // androidx.appcompat.view.c
    public void onActionViewExpanded() {
        if (this.f47007U) {
            return;
        }
        this.f47007U = true;
        int imeOptions = this.f47014p.getImeOptions();
        this.f47008V = imeOptions;
        this.f47014p.setImeOptions(imeOptions | 33554432);
        this.f47014p.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f47011b0);
        post(this.f47012c0);
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
        V(fVar.f47033c);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (this.f47003Q || !isFocusable()) {
            return false;
        }
        if (F()) {
            return super.requestFocus(i10, rect);
        }
        boolean zRequestFocus = this.f47014p.requestFocus(i10, rect);
        if (zRequestFocus) {
            V(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f47010a0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            J();
        } else {
            L();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f46997K == z10) {
            return;
        }
        this.f46997K = z10;
        V(z10);
        R();
    }

    public void setImeOptions(int i10) {
        this.f47014p.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f47014p.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f47004R = i10;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f46995I = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f46996J = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f47001O = charSequence;
        R();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.f47002P = z10;
        AbstractC17346a abstractC17346a = this.f46999M;
        if (abstractC17346a instanceof G) {
            ((G) abstractC17346a).x(z10 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f47009W = searchableInfo;
        if (searchableInfo != null) {
            S();
            R();
        }
        boolean zE = E();
        this.f47005S = zE;
        if (zE) {
            this.f47014p.setPrivateImeOptions("nm");
        }
        V(F());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f47000N = z10;
        V(F());
    }

    public void setSuggestionsAdapter(AbstractC17346a abstractC17346a) {
        this.f46999M = abstractC17346a;
        this.f47014p.setAdapter(abstractC17346a);
    }

    static boolean G(Context context) {
        if (context.getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    private void R() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f47014p;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(D(queryHint));
    }

    private void T() {
        int i10;
        if (H() && (this.f47018t.getVisibility() == 0 || this.f47020v.getVisibility() == 0)) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f47016r.setVisibility(i10);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C14581d.f136318e);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C14581d.f136319f);
    }

    protected void K(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void N() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        V(F());
        O();
        if (this.f47014p.hasFocus()) {
            B();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            C(this.f47014p, this.f47022x);
            Rect rect = this.f47023y;
            Rect rect2 = this.f47022x;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            g gVar = this.f47021w;
            if (gVar == null) {
                g gVar2 = new g(this.f47023y, this.f47022x, this.f47014p);
                this.f47021w = gVar2;
                setTouchDelegate(gVar2);
                return;
            }
            gVar.a(this.f47023y, this.f47022x);
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
                if (mode == 1073741824 && (i12 = this.f47004R) > 0) {
                    size = Math.min(i12, size);
                }
            } else {
                size = this.f47004R;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            }
        } else {
            int i13 = this.f47004R;
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
        fVar.f47033c = F();
        return fVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        O();
    }
}
