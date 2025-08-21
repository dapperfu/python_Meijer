package com.flipp.sfml.views;

import Ta.e;
import Ta.g;
import Ta.v;
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
    protected SourceImageView f65131a;

    /* renamed from: b, reason: collision with root package name */
    protected TextView f65132b;

    /* renamed from: c, reason: collision with root package name */
    protected TextView f65133c;

    /* renamed from: d, reason: collision with root package name */
    protected TextView f65134d;

    /* renamed from: e, reason: collision with root package name */
    protected TextView f65135e;

    /* renamed from: f, reason: collision with root package name */
    protected Ta.b f65136f;

    /* renamed from: g, reason: collision with root package name */
    protected ArrayList<c> f65137g;

    /* renamed from: h, reason: collision with root package name */
    protected GestureDetector f65138h;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final a f65139a;

        /* renamed from: b, reason: collision with root package name */
        private List<v> f65140b;

        /* renamed from: c, reason: collision with root package name */
        private String f65141c;

        /* renamed from: d, reason: collision with root package name */
        private String f65142d;

        /* renamed from: e, reason: collision with root package name */
        private String f65143e;

        /* renamed from: f, reason: collision with root package name */
        private String f65144f;

        /* renamed from: g, reason: collision with root package name */
        private String f65145g;

        /* renamed from: h, reason: collision with root package name */
        private ArrayList<c> f65146h;

        /* renamed from: i, reason: collision with root package name */
        protected Ta.b f65147i;

        private b(a aVar) {
            this.f65139a = aVar;
            this.f65146h = new ArrayList<>();
            this.f65147i = null;
        }

        private SpannableStringBuilder a(Resources resources) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!TextUtils.isEmpty(this.f65143e)) {
                float dimension = resources.getDimension(e.f35982a) / resources.getDimension(e.f35983b);
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append((CharSequence) " ");
                }
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) this.f65143e);
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.setSpan(new RelativeSizeSpan(dimension), length, length2, 33);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(-16777216), length, length2, 33);
            }
            if (!TextUtils.isEmpty(this.f65145g)) {
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append((CharSequence) " ");
                }
                spannableStringBuilder.append((CharSequence) this.f65145g);
            }
            return spannableStringBuilder;
        }

        public b b(c cVar) {
            if (cVar != null) {
                this.f65146h.add(cVar);
            }
            return this;
        }

        public void c() {
            a aVar = this.f65139a;
            aVar.f65136f = this.f65147i;
            Resources resources = aVar.itemView.getContext().getResources();
            List<v> list = this.f65140b;
            if (list == null || list.isEmpty()) {
                this.f65139a.f65131a.setVisibility(8);
            } else {
                this.f65139a.f65131a.setVisibility(0);
            }
            this.f65139a.f65131a.setSources(this.f65140b);
            this.f65139a.c();
            this.f65139a.b(this.f65146h);
            if (TextUtils.isEmpty(this.f65141c)) {
                this.f65139a.f65134d.setVisibility(8);
            } else {
                this.f65139a.f65134d.setVisibility(0);
                this.f65139a.f65134d.setText(this.f65141c);
            }
            SpannableStringBuilder spannableStringBuilderA = a(resources);
            if (spannableStringBuilderA == null || TextUtils.isEmpty(spannableStringBuilderA)) {
                this.f65139a.f65133c.setVisibility(8);
            } else {
                this.f65139a.f65133c.setVisibility(0);
                this.f65139a.f65133c.setText(spannableStringBuilderA);
            }
            this.f65139a.f65132b.setMaxLines(1);
            this.f65139a.f65132b.setText(this.f65142d);
            if (this.f65139a.f65133c.getVisibility() == 8) {
                this.f65139a.f65132b.setMaxLines(3);
            }
            if (TextUtils.isEmpty(this.f65144f)) {
                this.f65139a.f65135e.setVisibility(8);
            } else {
                this.f65139a.f65135e.setVisibility(0);
                this.f65139a.f65135e.setText(this.f65144f);
            }
        }

        public b d(List<v> list) {
            this.f65140b = list;
            return this;
        }

        public b e(Ta.b bVar) {
            this.f65147i = bVar;
            return this;
        }

        public b f(String str) {
            this.f65141c = str;
            return this;
        }

        public b g(String str) {
            this.f65145g = str;
            return this;
        }

        public b h(String str) {
            this.f65144f = str;
            return this;
        }

        public b i(String str) {
            this.f65143e = str;
            return this;
        }

        public b j(String str) {
            this.f65142d = str;
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
        this.f65137g.addAll(list);
    }

    public void c() {
        this.f65137g.clear();
    }

    public b d() {
        return new b();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        Iterator<c> it = this.f65137g.iterator();
        while (it.hasNext()) {
            it.next().f(this);
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        Iterator<c> it = this.f65137g.iterator();
        while (it.hasNext()) {
            it.next().d(this);
        }
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f65138h.onTouchEvent(motionEvent);
    }

    public a(View view) {
        super(view);
        this.f65137g = new ArrayList<>();
        this.f65131a = (SourceImageView) view.findViewById(g.f35988c);
        this.f65132b = (TextView) view.findViewById(g.f35992g);
        this.f65133c = (TextView) view.findViewById(g.f35991f);
        this.f65134d = (TextView) view.findViewById(g.f35989d);
        this.f65135e = (TextView) view.findViewById(g.f35990e);
        this.f65138h = new GestureDetector(view.getContext(), this);
        view.setOnTouchListener(this);
    }
}
