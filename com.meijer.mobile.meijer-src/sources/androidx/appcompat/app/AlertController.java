package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import com.fullstory.FS;
import i.C14578a;
import i.C14583f;
import i.C14587j;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class AlertController {

    /* renamed from: A, reason: collision with root package name */
    NestedScrollView f45956A;

    /* renamed from: C, reason: collision with root package name */
    private Drawable f45958C;

    /* renamed from: D, reason: collision with root package name */
    private ImageView f45959D;

    /* renamed from: E, reason: collision with root package name */
    private TextView f45960E;

    /* renamed from: F, reason: collision with root package name */
    private TextView f45961F;

    /* renamed from: G, reason: collision with root package name */
    private View f45962G;

    /* renamed from: H, reason: collision with root package name */
    ListAdapter f45963H;

    /* renamed from: J, reason: collision with root package name */
    private int f45965J;

    /* renamed from: K, reason: collision with root package name */
    private int f45966K;

    /* renamed from: L, reason: collision with root package name */
    int f45967L;

    /* renamed from: M, reason: collision with root package name */
    int f45968M;

    /* renamed from: N, reason: collision with root package name */
    int f45969N;

    /* renamed from: O, reason: collision with root package name */
    int f45970O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f45971P;

    /* renamed from: R, reason: collision with root package name */
    Handler f45973R;

    /* renamed from: a, reason: collision with root package name */
    private final Context f45975a;

    /* renamed from: b, reason: collision with root package name */
    final q f45976b;

    /* renamed from: c, reason: collision with root package name */
    private final Window f45977c;

    /* renamed from: d, reason: collision with root package name */
    private final int f45978d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f45979e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f45980f;

    /* renamed from: g, reason: collision with root package name */
    ListView f45981g;

    /* renamed from: h, reason: collision with root package name */
    private View f45982h;

    /* renamed from: i, reason: collision with root package name */
    private int f45983i;

    /* renamed from: j, reason: collision with root package name */
    private int f45984j;

    /* renamed from: k, reason: collision with root package name */
    private int f45985k;

    /* renamed from: l, reason: collision with root package name */
    private int f45986l;

    /* renamed from: m, reason: collision with root package name */
    private int f45987m;

    /* renamed from: o, reason: collision with root package name */
    Button f45989o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f45990p;

    /* renamed from: q, reason: collision with root package name */
    Message f45991q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f45992r;

    /* renamed from: s, reason: collision with root package name */
    Button f45993s;

    /* renamed from: t, reason: collision with root package name */
    private CharSequence f45994t;

    /* renamed from: u, reason: collision with root package name */
    Message f45995u;

    /* renamed from: v, reason: collision with root package name */
    private Drawable f45996v;

    /* renamed from: w, reason: collision with root package name */
    Button f45997w;

    /* renamed from: x, reason: collision with root package name */
    private CharSequence f45998x;

    /* renamed from: y, reason: collision with root package name */
    Message f45999y;

    /* renamed from: z, reason: collision with root package name */
    private Drawable f46000z;

    /* renamed from: n, reason: collision with root package name */
    private boolean f45988n = false;

    /* renamed from: B, reason: collision with root package name */
    private int f45957B = 0;

    /* renamed from: I, reason: collision with root package name */
    int f45964I = -1;

    /* renamed from: Q, reason: collision with root package name */
    private int f45972Q = 0;

    /* renamed from: S, reason: collision with root package name */
    private final View.OnClickListener f45974S = new a();

    public static class RecycleListView extends ListView {

        /* renamed from: a, reason: collision with root package name */
        private final int f46001a;

        /* renamed from: b, reason: collision with root package name */
        private final int f46002b;

        public void a(boolean z10, boolean z11) {
            if (z11 && z10) {
                return;
            }
            setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f46001a, getPaddingRight(), z11 ? getPaddingBottom() : this.f46002b);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14587j.f136609k2);
            this.f46002b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C14587j.f136614l2, -1);
            this.f46001a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C14587j.f136619m2, -1);
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message messageObtain = (view != alertController.f45989o || (message3 = alertController.f45991q) == null) ? (view != alertController.f45993s || (message2 = alertController.f45995u) == null) ? (view != alertController.f45997w || (message = alertController.f45999y) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f45973R.obtainMessage(1, alertController2.f45976b).sendToTarget();
        }
    }

    public static class b {

        /* renamed from: A, reason: collision with root package name */
        public int f46004A;

        /* renamed from: B, reason: collision with root package name */
        public int f46005B;

        /* renamed from: C, reason: collision with root package name */
        public int f46006C;

        /* renamed from: D, reason: collision with root package name */
        public int f46007D;

        /* renamed from: F, reason: collision with root package name */
        public boolean[] f46009F;

        /* renamed from: G, reason: collision with root package name */
        public boolean f46010G;

        /* renamed from: H, reason: collision with root package name */
        public boolean f46011H;

        /* renamed from: J, reason: collision with root package name */
        public DialogInterface.OnMultiChoiceClickListener f46013J;

        /* renamed from: K, reason: collision with root package name */
        public Cursor f46014K;

        /* renamed from: L, reason: collision with root package name */
        public String f46015L;

        /* renamed from: M, reason: collision with root package name */
        public String f46016M;

        /* renamed from: N, reason: collision with root package name */
        public boolean f46017N;

        /* renamed from: O, reason: collision with root package name */
        public AdapterView.OnItemSelectedListener f46018O;

        /* renamed from: a, reason: collision with root package name */
        public final Context f46020a;

        /* renamed from: b, reason: collision with root package name */
        public final LayoutInflater f46021b;

        /* renamed from: d, reason: collision with root package name */
        public Drawable f46023d;

        /* renamed from: f, reason: collision with root package name */
        public CharSequence f46025f;

        /* renamed from: g, reason: collision with root package name */
        public View f46026g;

        /* renamed from: h, reason: collision with root package name */
        public CharSequence f46027h;

        /* renamed from: i, reason: collision with root package name */
        public CharSequence f46028i;

        /* renamed from: j, reason: collision with root package name */
        public Drawable f46029j;

        /* renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f46030k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f46031l;

        /* renamed from: m, reason: collision with root package name */
        public Drawable f46032m;

        /* renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f46033n;

        /* renamed from: o, reason: collision with root package name */
        public CharSequence f46034o;

        /* renamed from: p, reason: collision with root package name */
        public Drawable f46035p;

        /* renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f46036q;

        /* renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f46038s;

        /* renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f46039t;

        /* renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f46040u;

        /* renamed from: v, reason: collision with root package name */
        public CharSequence[] f46041v;

        /* renamed from: w, reason: collision with root package name */
        public ListAdapter f46042w;

        /* renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f46043x;

        /* renamed from: y, reason: collision with root package name */
        public int f46044y;

        /* renamed from: z, reason: collision with root package name */
        public View f46045z;

        /* renamed from: c, reason: collision with root package name */
        public int f46022c = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f46024e = 0;

        /* renamed from: E, reason: collision with root package name */
        public boolean f46008E = false;

        /* renamed from: I, reason: collision with root package name */
        public int f46012I = -1;

        /* renamed from: P, reason: collision with root package name */
        public boolean f46019P = true;

        /* renamed from: r, reason: collision with root package name */
        public boolean f46037r = true;

        class a extends ArrayAdapter<CharSequence> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f46046a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f46046a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = b.this.f46009F;
                if (zArr != null && zArr[i10]) {
                    this.f46046a.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$b, reason: collision with other inner class name */
        class C0967b extends CursorAdapter {

            /* renamed from: a, reason: collision with root package name */
            private final int f46048a;

            /* renamed from: b, reason: collision with root package name */
            private final int f46049b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ RecycleListView f46050c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AlertController f46051d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0967b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f46050c = recycleListView;
                this.f46051d = alertController;
                Cursor cursor2 = getCursor();
                this.f46048a = cursor2.getColumnIndexOrThrow(b.this.f46015L);
                this.f46049b = cursor2.getColumnIndexOrThrow(b.this.f46016M);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.f46021b.inflate(this.f46051d.f45968M, viewGroup, false);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f46048a));
                RecycleListView recycleListView = this.f46050c;
                int position = cursor.getPosition();
                boolean z10 = true;
                if (cursor.getInt(this.f46049b) != 1) {
                    z10 = false;
                }
                recycleListView.setItemChecked(position, z10);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AlertController f46053a;

            c(AlertController alertController) {
                this.f46053a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                b.this.f46043x.onClick(this.f46053a.f45976b, i10);
                if (b.this.f46011H) {
                    return;
                }
                this.f46053a.f45976b.dismiss();
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f46055a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AlertController f46056b;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f46055a = recycleListView;
                this.f46056b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                boolean[] zArr = b.this.f46009F;
                if (zArr != null) {
                    zArr[i10] = this.f46055a.isItemChecked(i10);
                }
                b.this.f46013J.onClick(this.f46056b.f45976b, i10, this.f46055a.isItemChecked(i10));
            }
        }

        private void b(AlertController alertController) {
            b bVar;
            AlertController alertController2;
            ListAdapter dVar;
            RecycleListView recycleListView = (RecycleListView) this.f46021b.inflate(alertController.f45967L, (ViewGroup) null);
            if (!this.f46010G) {
                bVar = this;
                alertController2 = alertController;
                int i10 = bVar.f46011H ? alertController2.f45969N : alertController2.f45970O;
                if (bVar.f46014K != null) {
                    dVar = new SimpleCursorAdapter(bVar.f46020a, i10, bVar.f46014K, new String[]{bVar.f46015L}, new int[]{R.id.text1});
                } else {
                    dVar = bVar.f46042w;
                    if (dVar == null) {
                        dVar = new d(bVar.f46020a, i10, R.id.text1, bVar.f46041v);
                    }
                }
            } else if (this.f46014K == null) {
                bVar = this;
                dVar = bVar.new a(this.f46020a, alertController.f45968M, R.id.text1, this.f46041v, recycleListView);
                recycleListView = recycleListView;
                alertController2 = alertController;
            } else {
                bVar = this;
                alertController2 = alertController;
                dVar = bVar.new C0967b(bVar.f46020a, bVar.f46014K, false, recycleListView, alertController2);
            }
            alertController2.f45963H = dVar;
            alertController2.f45964I = bVar.f46012I;
            if (bVar.f46043x != null) {
                recycleListView.setOnItemClickListener(new c(alertController2));
            } else if (bVar.f46013J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController2));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = bVar.f46018O;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (bVar.f46011H) {
                recycleListView.setChoiceMode(1);
            } else if (bVar.f46010G) {
                recycleListView.setChoiceMode(2);
            }
            alertController2.f45981g = recycleListView;
        }

        public void a(AlertController alertController) {
            AlertController alertController2;
            View view = this.f46026g;
            if (view != null) {
                alertController.l(view);
            } else {
                CharSequence charSequence = this.f46025f;
                if (charSequence != null) {
                    alertController.q(charSequence);
                }
                Drawable drawable = this.f46023d;
                if (drawable != null) {
                    alertController.n(drawable);
                }
                int i10 = this.f46022c;
                if (i10 != 0) {
                    alertController.m(i10);
                }
                int i11 = this.f46024e;
                if (i11 != 0) {
                    alertController.m(alertController.d(i11));
                }
            }
            CharSequence charSequence2 = this.f46027h;
            if (charSequence2 != null) {
                alertController.o(charSequence2);
            }
            CharSequence charSequence3 = this.f46028i;
            if (charSequence3 == null && this.f46029j == null) {
                alertController2 = alertController;
            } else {
                alertController.k(-1, charSequence3, this.f46030k, null, this.f46029j);
                alertController2 = alertController;
            }
            CharSequence charSequence4 = this.f46031l;
            if (charSequence4 != null || this.f46032m != null) {
                alertController2.k(-2, charSequence4, this.f46033n, null, this.f46032m);
            }
            CharSequence charSequence5 = this.f46034o;
            if (charSequence5 != null || this.f46035p != null) {
                alertController2.k(-3, charSequence5, this.f46036q, null, this.f46035p);
            }
            if (this.f46041v != null || this.f46014K != null || this.f46042w != null) {
                b(alertController2);
            }
            View view2 = this.f46045z;
            if (view2 != null) {
                if (this.f46008E) {
                    alertController2.t(view2, this.f46004A, this.f46005B, this.f46006C, this.f46007D);
                    return;
                } else {
                    alertController2.s(view2);
                    return;
                }
            }
            int i12 = this.f46044y;
            if (i12 != 0) {
                alertController2.r(i12);
            }
        }

        public b(Context context) {
            this.f46020a = context;
            this.f46021b = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    private static final class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<DialogInterface> f46058a;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f46058a.get(), message.what);
            } else {
                if (i10 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }

        public c(DialogInterface dialogInterface) {
            this.f46058a = new WeakReference<>(dialogInterface);
        }
    }

    public Button c(int i10) {
        if (i10 == -3) {
            return this.f45997w;
        }
        if (i10 == -2) {
            return this.f45993s;
        }
        if (i10 != -1) {
            return null;
        }
        return this.f45989o;
    }

    public void m(int i10) {
        this.f45958C = null;
        this.f45957B = i10;
        ImageView imageView = this.f45959D;
        if (imageView != null) {
            if (i10 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                FS.Resources_setImageResource(this.f45959D, this.f45957B);
            }
        }
    }

    public void r(int i10) {
        this.f45982h = null;
        this.f45983i = i10;
        this.f45988n = false;
    }

    private static class d extends ArrayAdapter<CharSequence> {
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }

        public d(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }
    }

    private ViewGroup i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int j() {
        int i10 = this.f45966K;
        return i10 == 0 ? this.f45965J : this.f45972Q == 1 ? i10 : this.f45965J;
    }

    private void p(ViewGroup viewGroup, View view, int i10, int i11) {
        View viewFindViewById = this.f45977c.findViewById(C14583f.f136400v);
        View viewFindViewById2 = this.f45977c.findViewById(C14583f.f136399u);
        ViewCompat.E0(view, i10, i11);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    private void v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f45977c.findViewById(C14583f.f136401w);
        this.f45956A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f45956A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f45961F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f45980f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f45956A.removeView(this.f45961F);
        if (this.f45981g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f45956A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.f45956A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f45981g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void w(ViewGroup viewGroup) {
        View viewInflate = this.f45982h;
        if (viewInflate == null) {
            viewInflate = this.f45983i != 0 ? LayoutInflater.from(this.f45975a).inflate(this.f45983i, viewGroup, false) : null;
        }
        boolean z10 = viewInflate != null;
        if (!z10 || !a(viewInflate)) {
            this.f45977c.setFlags(131072, 131072);
        }
        if (!z10) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f45977c.findViewById(C14583f.f136392n);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f45988n) {
            frameLayout.setPadding(this.f45984j, this.f45985k, this.f45986l, this.f45987m);
        }
        if (this.f45981g != null) {
            ((LinearLayout.LayoutParams) ((LinearLayoutCompat.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    private void x(ViewGroup viewGroup) {
        if (this.f45962G != null) {
            viewGroup.addView(this.f45962G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f45977c.findViewById(C14583f.f136377F).setVisibility(8);
            return;
        }
        this.f45959D = (ImageView) this.f45977c.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.f45979e) || !this.f45971P) {
            this.f45977c.findViewById(C14583f.f136377F).setVisibility(8);
            this.f45959D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f45977c.findViewById(C14583f.f136388j);
        this.f45960E = textView;
        textView.setText(this.f45979e);
        int i10 = this.f45957B;
        if (i10 != 0) {
            FS.Resources_setImageResource(this.f45959D, i10);
            return;
        }
        Drawable drawable = this.f45958C;
        if (drawable != null) {
            this.f45959D.setImageDrawable(drawable);
        } else {
            this.f45960E.setPadding(this.f45959D.getPaddingLeft(), this.f45959D.getPaddingTop(), this.f45959D.getPaddingRight(), this.f45959D.getPaddingBottom());
            this.f45959D.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void y() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f45977c.findViewById(C14583f.f136398t);
        View viewFindViewById4 = viewFindViewById3.findViewById(C14583f.f136378G);
        View viewFindViewById5 = viewFindViewById3.findViewById(C14583f.f136391m);
        View viewFindViewById6 = viewFindViewById3.findViewById(C14583f.f136389k);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(C14583f.f136393o);
        w(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(C14583f.f136378G);
        View viewFindViewById8 = viewGroup.findViewById(C14583f.f136391m);
        View viewFindViewById9 = viewGroup.findViewById(C14583f.f136389k);
        ViewGroup viewGroupI = i(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupI2 = i(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupI3 = i(viewFindViewById9, viewFindViewById6);
        v(viewGroupI2);
        u(viewGroupI3);
        x(viewGroupI);
        boolean z10 = viewGroup.getVisibility() != 8;
        boolean z11 = (viewGroupI == null || viewGroupI.getVisibility() == 8) ? 0 : 1;
        boolean z12 = (viewGroupI3 == null || viewGroupI3.getVisibility() == 8) ? false : true;
        if (!z12 && viewGroupI2 != null && (viewFindViewById2 = viewGroupI2.findViewById(C14583f.f136373B)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z11 != 0) {
            NestedScrollView nestedScrollView = this.f45956A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f45980f == null && this.f45981g == null) ? null : viewGroupI.findViewById(C14583f.f136376E);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupI2 != null && (viewFindViewById = viewGroupI2.findViewById(C14583f.f136374C)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f45981g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z11, z12);
        }
        if (!z10) {
            View view = this.f45981g;
            if (view == null) {
                view = this.f45956A;
            }
            if (view != null) {
                p(viewGroupI2, view, z11 | (z12 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f45981g;
        if (listView2 == null || (listAdapter = this.f45963H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i10 = this.f45964I;
        if (i10 > -1) {
            listView2.setItemChecked(i10, true);
            listView2.setSelection(i10);
        }
    }

    private static boolean z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C14578a.f136291m, typedValue, true);
        return typedValue.data != 0;
    }

    public int d(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f45975a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f45981g;
    }

    public boolean g(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f45956A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public boolean h(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f45956A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public void k(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f45973R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f45998x = charSequence;
            this.f45999y = message;
            this.f46000z = drawable;
        } else if (i10 == -2) {
            this.f45994t = charSequence;
            this.f45995u = message;
            this.f45996v = drawable;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f45990p = charSequence;
            this.f45991q = message;
            this.f45992r = drawable;
        }
    }

    public void l(View view) {
        this.f45962G = view;
    }

    public void n(Drawable drawable) {
        this.f45958C = drawable;
        this.f45957B = 0;
        ImageView imageView = this.f45959D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f45959D.setImageDrawable(drawable);
            }
        }
    }

    public void o(CharSequence charSequence) {
        this.f45980f = charSequence;
        TextView textView = this.f45961F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(CharSequence charSequence) {
        this.f45979e = charSequence;
        TextView textView = this.f45960E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void s(View view) {
        this.f45982h = view;
        this.f45983i = 0;
        this.f45988n = false;
    }

    public void t(View view, int i10, int i11, int i12, int i13) {
        this.f45982h = view;
        this.f45983i = 0;
        this.f45988n = true;
        this.f45984j = i10;
        this.f45985k = i11;
        this.f45986l = i12;
        this.f45987m = i13;
    }

    public AlertController(Context context, q qVar, Window window) {
        this.f45975a = context;
        this.f45976b = qVar;
        this.f45977c = window;
        this.f45973R = new c(qVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C14587j.f136468F, C14578a.f136292n, 0);
        this.f45965J = typedArrayObtainStyledAttributes.getResourceId(C14587j.f136473G, 0);
        this.f45966K = typedArrayObtainStyledAttributes.getResourceId(C14587j.f136483I, 0);
        this.f45967L = typedArrayObtainStyledAttributes.getResourceId(C14587j.f136492K, 0);
        this.f45968M = typedArrayObtainStyledAttributes.getResourceId(C14587j.f136496L, 0);
        this.f45969N = typedArrayObtainStyledAttributes.getResourceId(C14587j.f136504N, 0);
        this.f45970O = typedArrayObtainStyledAttributes.getResourceId(C14587j.f136488J, 0);
        this.f45971P = typedArrayObtainStyledAttributes.getBoolean(C14587j.f136500M, true);
        this.f45978d = typedArrayObtainStyledAttributes.getDimensionPixelSize(C14587j.f136478H, 0);
        typedArrayObtainStyledAttributes.recycle();
        qVar.h(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    private void u(ViewGroup viewGroup) {
        int i10;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f45989o = button;
        button.setOnClickListener(this.f45974S);
        if (TextUtils.isEmpty(this.f45990p) && this.f45992r == null) {
            this.f45989o.setVisibility(8);
            i10 = 0;
        } else {
            this.f45989o.setText(this.f45990p);
            Drawable drawable = this.f45992r;
            if (drawable != null) {
                int i11 = this.f45978d;
                drawable.setBounds(0, 0, i11, i11);
                this.f45989o.setCompoundDrawables(this.f45992r, null, null, null);
            }
            this.f45989o.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f45993s = button2;
        button2.setOnClickListener(this.f45974S);
        if (TextUtils.isEmpty(this.f45994t) && this.f45996v == null) {
            this.f45993s.setVisibility(8);
        } else {
            this.f45993s.setText(this.f45994t);
            Drawable drawable2 = this.f45996v;
            if (drawable2 != null) {
                int i12 = this.f45978d;
                drawable2.setBounds(0, 0, i12, i12);
                this.f45993s.setCompoundDrawables(this.f45996v, null, null, null);
            }
            this.f45993s.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f45997w = button3;
        button3.setOnClickListener(this.f45974S);
        if (TextUtils.isEmpty(this.f45998x) && this.f46000z == null) {
            this.f45997w.setVisibility(8);
        } else {
            this.f45997w.setText(this.f45998x);
            Drawable drawable3 = this.f46000z;
            if (drawable3 != null) {
                int i13 = this.f45978d;
                drawable3.setBounds(0, 0, i13, i13);
                this.f45997w.setCompoundDrawables(this.f46000z, null, null, null);
            }
            this.f45997w.setVisibility(0);
            i10 |= 4;
        }
        if (z(this.f45975a)) {
            if (i10 == 1) {
                b(this.f45989o);
            } else if (i10 == 2) {
                b(this.f45993s);
            } else if (i10 == 4) {
                b(this.f45997w);
            }
        }
        if (i10 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    public void f() {
        this.f45976b.setContentView(j());
        y();
    }
}
