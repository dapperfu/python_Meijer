package com.flipp.sfml.views;

import Ra.e;
import Ra.g;
import Ra.v;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class a extends RecyclerView.F implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    protected SourceImageView f64291a;

    /* renamed from: b, reason: collision with root package name */
    protected TextView f64292b;

    /* renamed from: c, reason: collision with root package name */
    protected TextView f64293c;

    /* renamed from: d, reason: collision with root package name */
    protected TextView f64294d;

    /* renamed from: e, reason: collision with root package name */
    protected TextView f64295e;

    /* renamed from: f, reason: collision with root package name */
    protected Ra.b f64296f;

    /* renamed from: g, reason: collision with root package name */
    protected ArrayList<c> f64297g;

    /* renamed from: h, reason: collision with root package name */
    protected GestureDetector f64298h;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final a f64299a;

        /* renamed from: b, reason: collision with root package name */
        private List<v> f64300b;

        /* renamed from: c, reason: collision with root package name */
        private String f64301c;

        /* renamed from: d, reason: collision with root package name */
        private String f64302d;

        /* renamed from: e, reason: collision with root package name */
        private String f64303e;

        /* renamed from: f, reason: collision with root package name */
        private String f64304f;

        /* renamed from: g, reason: collision with root package name */
        private String f64305g;

        /* renamed from: h, reason: collision with root package name */
        private ArrayList<c> f64306h;

        /* renamed from: i, reason: collision with root package name */
        protected Ra.b f64307i;

        private b(a aVar) {
            this.f64299a = aVar;
            this.f64306h = new ArrayList<>();
            this.f64307i = null;
        }

        private SpannableStringBuilder a(Resources resources) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!TextUtils.isEmpty(this.f64303e)) {
                float dimension = resources.getDimension(e.f31982a) / resources.getDimension(e.f31983b);
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append((CharSequence) " ");
                }
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) this.f64303e);
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.setSpan(new RelativeSizeSpan(dimension), length, length2, 33);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(-16777216), length, length2, 33);
            }
            if (!TextUtils.isEmpty(this.f64305g)) {
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append((CharSequence) " ");
                }
                spannableStringBuilder.append((CharSequence) this.f64305g);
            }
            return spannableStringBuilder;
        }

        public b b(c cVar) {
            if (cVar != null) {
                this.f64306h.add(cVar);
            }
            return this;
        }

        public void c() {
            a aVar = this.f64299a;
            aVar.f64296f = this.f64307i;
            Resources resources = aVar.itemView.getContext().getResources();
            List<v> list = this.f64300b;
            if (list == null || list.isEmpty()) {
                this.f64299a.f64291a.setVisibility(8);
            } else {
                this.f64299a.f64291a.setVisibility(0);
            }
            this.f64299a.f64291a.setSources(this.f64300b);
            this.f64299a.c();
            this.f64299a.b(this.f64306h);
            if (TextUtils.isEmpty(this.f64301c)) {
                this.f64299a.f64294d.setVisibility(8);
            } else {
                this.f64299a.f64294d.setVisibility(0);
                this.f64299a.f64294d.setText(this.f64301c);
            }
            SpannableStringBuilder spannableStringBuilderA = a(resources);
            if (spannableStringBuilderA == null || TextUtils.isEmpty(spannableStringBuilderA)) {
                this.f64299a.f64293c.setVisibility(8);
            } else {
                this.f64299a.f64293c.setVisibility(0);
                this.f64299a.f64293c.setText(spannableStringBuilderA);
            }
            this.f64299a.f64292b.setMaxLines(1);
            this.f64299a.f64292b.setText(this.f64302d);
            if (this.f64299a.f64293c.getVisibility() == 8) {
                this.f64299a.f64292b.setMaxLines(3);
            }
            if (TextUtils.isEmpty(this.f64304f)) {
                this.f64299a.f64295e.setVisibility(8);
            } else {
                this.f64299a.f64295e.setVisibility(0);
                this.f64299a.f64295e.setText(this.f64304f);
            }
        }

        public b d(List<v> list) {
            this.f64300b = list;
            return this;
        }

        public b e(Ra.b bVar) {
            this.f64307i = bVar;
            return this;
        }

        public b f(String str) {
            this.f64301c = str;
            return this;
        }

        public b g(String str) {
            this.f64305g = str;
            return this;
        }

        public b h(String str) {
            this.f64304f = str;
            return this;
        }

        public b i(String str) {
            this.f64303e = str;
            return this;
        }

        public b j(String str) {
            this.f64302d = str;
            return this;
        }
    }

    public interface c {
        void d(a aVar);

        boolean f(a aVar);
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public void b(List<c> list) {
        this.f64297g.addAll(list);
    }

    public void c() {
        this.f64297g.clear();
    }

    public b d() {
        return new b();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        Iterator<c> it = this.f64297g.iterator();
        while (it.hasNext()) {
            it.next().f(this);
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        Iterator<c> it = this.f64297g.iterator();
        while (it.hasNext()) {
            it.next().d(this);
        }
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f64298h.onTouchEvent(motionEvent);
    }

    public a(View view) {
        super(view);
        this.f64297g = new ArrayList<>();
        this.f64291a = (SourceImageView) view.findViewById(g.f31988c);
        this.f64292b = (TextView) view.findViewById(g.f31992g);
        this.f64293c = (TextView) view.findViewById(g.f31991f);
        this.f64294d = (TextView) view.findViewById(g.f31989d);
        this.f64295e = (TextView) view.findViewById(g.f31990e);
        this.f64298h = new GestureDetector(view.getContext(), this);
        view.setOnTouchListener(this);
    }
}
