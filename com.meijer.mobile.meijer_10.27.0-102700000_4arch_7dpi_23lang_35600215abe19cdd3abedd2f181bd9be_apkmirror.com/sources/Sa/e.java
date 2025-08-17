package Sa;

import Ra.l;
import Ra.n;
import Ra.p;
import Ra.q;
import Ra.v;
import Ra.w;
import Ra.y;
import Ra.z;
import android.content.Context;
import android.graphics.RectF;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.flipp.sfml.views.CollapsibleLinearLayout;
import com.flipp.sfml.views.SourceImageView;
import com.flipp.sfml.views.ZoomScrollView;
import com.google.android.flexbox.FlexboxLayout;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes4.dex */
public class e extends Qa.d {
    public void f(View view, v vVar, w wVar, RectF rectF) {
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (vVar instanceof n) {
            n nVar = (n) vVar;
            float fQ = nVar.q();
            float fL = nVar.l();
            RectF rectFK = wVar.k();
            float width = view.getWidth() / fQ;
            float height = view.getHeight() / fL;
            rectF.set(Math.max((rectFK.left - nVar.n().left) * width, 0.0f), Math.max((rectFK.top - nVar.n().top) * height, 0.0f), Math.min((rectFK.right - nVar.n().left) * width, view.getWidth()), Math.min((rectFK.bottom - nVar.n().top) * height, view.getHeight()));
        }
    }

    protected ViewGroup.MarginLayoutParams m(ViewGroup viewGroup, int i10, int i11, RectF rectF) {
        ViewGroup.MarginLayoutParams aVar;
        if (i10 == -3) {
            i10 = -2;
        }
        if (i11 == -3) {
            i11 = -2;
        }
        if ((viewGroup instanceof ScrollView) || (viewGroup instanceof HorizontalScrollView) || (viewGroup instanceof FrameLayout)) {
            aVar = new FrameLayout.LayoutParams(i10, i11);
        } else if (viewGroup instanceof LinearLayout) {
            aVar = new LinearLayout.LayoutParams(i10, i11);
        } else if (viewGroup instanceof ConstraintLayout) {
            aVar = new ConstraintLayout.b(i10, i11);
        } else {
            if (!(viewGroup instanceof FlexboxLayout)) {
                throw new IllegalArgumentException("unknown parent type " + viewGroup);
            }
            aVar = new FlexboxLayout.a(i10, i11);
        }
        if (rectF != null) {
            aVar.leftMargin = (int) rectF.left;
            aVar.topMargin = (int) rectF.top;
            aVar.rightMargin = (int) rectF.right;
            aVar.bottomMargin = (int) rectF.bottom;
        }
        return aVar;
    }

    protected List<Ra.b> r(n nVar) {
        ArrayList arrayList = null;
        if (nVar == null) {
            return null;
        }
        List<w> listK = nVar.k();
        if (listK != null && !listK.isEmpty()) {
            arrayList = new ArrayList();
            Iterator<w> it = listK.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().i());
            }
        }
        return arrayList;
    }

    protected List<Ra.b> s(p pVar) {
        List<v> listU;
        if (pVar != null && (listU = pVar.u()) != null && !listU.isEmpty()) {
            v vVar = listU.get(0);
            if (vVar instanceof n) {
                return r((n) vVar);
            }
            if (vVar instanceof y) {
                return u((y) vVar);
            }
        }
        return null;
    }

    private View a(View view, int i10, int i11, double d10) {
        ConstraintLayout constraintLayout = (ConstraintLayout) i(view.getContext(), null);
        androidx.constraintlayout.widget.c cVar = (androidx.constraintlayout.widget.c) constraintLayout.getTag(Ra.g.f31993h);
        if (i10 == -3) {
            cVar.v(view.getId(), Double.toString(d10));
            cVar.k(view.getId(), 0);
        } else if (i10 != -2) {
            if (i10 != -1) {
                cVar.n(view.getId(), i10);
            } else {
                cVar.i(view.getId(), 2, 0, 2, 0);
                cVar.i(view.getId(), 1, 0, 1, 0);
            }
        }
        if (i11 == -3) {
            cVar.v(view.getId(), Double.toString(d10 != 0.0d ? 1.0d / d10 : d10));
            cVar.l(view.getId(), 0);
        } else if (i11 != -2) {
            if (i11 != -1) {
                cVar.m(view.getId(), i11);
            } else {
                cVar.i(view.getId(), 3, 0, 3, 0);
                cVar.i(view.getId(), 4, 0, 4, 0);
            }
        }
        constraintLayout.addView(view, m(constraintLayout, i10, i11, null));
        return constraintLayout;
    }

    protected void d(View view, l lVar) {
        Long lJ;
        if (lVar == null || view == null || (lJ = lVar.j()) == null) {
            return;
        }
        view.setTag(Ra.g.f31995j, lJ);
    }

    public a e(View view, float f10, float f11) {
        b bVar = new b();
        if (view instanceof SourceImageView) {
            v currentSource = ((SourceImageView) view).getCurrentSource();
            if (currentSource instanceof n) {
                for (w wVar : ((n) currentSource).k()) {
                    RectF rectF = new RectF();
                    f(view, currentSource, wVar, rectF);
                    rectF.set(rectF.left + f10, rectF.top + f11, rectF.right + f10, rectF.bottom + f11);
                    bVar.a(new d(rectF, wVar.i()));
                }
            } else if (currentSource instanceof y) {
                bVar.a(new d(new RectF(view.getLeft() + f10, view.getTop() + f11, view.getRight() + f10, view.getBottom() + f11), ((y) currentSource).j()));
            }
        } else {
            Object tag = view.getTag(Ra.g.f31994i);
            if (tag instanceof List) {
                List list = (List) tag;
                if (list.size() == 1 && (list.get(0) instanceof Ra.b)) {
                    return new d(new RectF(view.getLeft() + f10, view.getTop() + f11, view.getRight() + f10, view.getBottom() + f11), (Ra.b) list.get(0));
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    a aVarE = e(viewGroup.getChildAt(i10), view.getLeft() + f10, view.getTop() + f11);
                    if (aVarE != null) {
                        bVar.a(aVarE);
                    }
                }
            }
        }
        if (bVar.e()) {
            return null;
        }
        return bVar.d().size() == 1 ? bVar.d().get(0) : bVar;
    }

    public RectF g(RectF rectF) {
        float f10 = rectF.left;
        float f11 = rectF.right;
        float f12 = rectF.top;
        float f13 = f12 - rectF.bottom;
        float f14 = -f12;
        rectF.set(f10, f14, f11, f13 + f14);
        return rectF;
    }

    protected CollapsibleLinearLayout h(Context context, RectF rectF, String str) {
        CollapsibleLinearLayout collapsibleLinearLayout = new CollapsibleLinearLayout(context);
        b(collapsibleLinearLayout);
        x(collapsibleLinearLayout, rectF);
        collapsibleLinearLayout.setTriggerTitle(str);
        return collapsibleLinearLayout;
    }

    protected View i(Context context, RectF rectF) {
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        constraintLayout.setConstraintSet(cVar);
        constraintLayout.setTag(Ra.g.f31993h, cVar);
        x(constraintLayout, rectF);
        return constraintLayout;
    }

    protected View j(Context context, int i10, RectF rectF) {
        FlexboxLayout flexboxLayout = new FlexboxLayout(context);
        flexboxLayout.setClipToPadding(false);
        if (i10 == 0) {
            flexboxLayout.setFlexDirection(0);
        } else {
            flexboxLayout.setFlexDirection(2);
        }
        b(flexboxLayout);
        x(flexboxLayout, rectF);
        return flexboxLayout;
    }

    protected View k(Context context, List<v> list, RectF rectF, ZoomScrollView zoomScrollView, SourceImageView.e eVar, SourceImageView.c cVar, SourceImageView.d dVar, f fVar) {
        SourceImageView sourceImageView = new SourceImageView(context);
        b(sourceImageView);
        sourceImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        sourceImageView.setSources(list);
        sourceImageView.A(eVar);
        sourceImageView.A(fVar);
        sourceImageView.setClipStateDelegate(cVar);
        sourceImageView.setMatchupDelegate(dVar);
        if (zoomScrollView != null) {
            zoomScrollView.i(sourceImageView);
        }
        x(sourceImageView, rectF);
        return sourceImageView;
    }

    protected View n(Context context, int i10, RectF rectF) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(i10);
        b(linearLayout);
        x(linearLayout, rectF);
        return linearLayout;
    }

    protected View p(Context context, String str, RectF rectF, boolean z10) {
        TextView textView = new TextView(context);
        textView.setText(str);
        if (z10) {
            textView.setLayerType(1, null);
        }
        x(textView, rectF);
        return textView;
    }

    protected List<Ra.b> q(l lVar) {
        if (lVar instanceof q) {
            return t((q) lVar);
        }
        if (lVar instanceof p) {
            return s((p) lVar);
        }
        return null;
    }

    protected List<Ra.b> t(q qVar) {
        if (qVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(qVar.u());
        return arrayList;
    }

    protected List<Ra.b> u(y yVar) {
        if (yVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(yVar.j());
        return arrayList;
    }

    public void v(View view, int[] iArr) {
        if (iArr == null || iArr.length < 2) {
            throw new IllegalArgumentException("inOutLocation must be an array of two integers");
        }
        if (view == null) {
            throw new IllegalArgumentException("view must not be null");
        }
        iArr[1] = 0;
        iArr[0] = 0;
        float f10 = 0;
        float[] fArr = {f10, 0};
        fArr[0] = f10 + view.getLeft();
        fArr[1] = fArr[1] + view.getTop();
        for (Object parent = view.getParent(); parent instanceof View; parent = ((View) parent).getParent()) {
            fArr[0] = fArr[0] + r6.getLeft();
            fArr[1] = fArr[1] + r6.getTop();
        }
        iArr[0] = Math.round(fArr[0]);
        iArr[1] = Math.round(fArr[1]);
    }

    protected void x(View view, RectF rectF) {
        if (rectF != null) {
            view.setPadding((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
    }

    private void b(View view) {
        view.setId(View.generateViewId());
    }

    protected void c(ViewGroup viewGroup, View view, l lVar) {
        int i10;
        int i11;
        if (lVar.p() == -3 || lVar.m() == -3) {
            Object tag = view.getTag();
            int iP = lVar.p();
            int iM = lVar.m();
            if (lVar.q()) {
                if (iP == -3) {
                    i10 = iP;
                    i11 = -1;
                } else {
                    i11 = iM;
                    i10 = -1;
                }
            } else {
                i10 = iP;
                i11 = iM;
            }
            view = a(view, i10, i11, lVar.k());
            view.setTag(tag);
        }
        ViewGroup.MarginLayoutParams marginLayoutParamsM = m(viewGroup, lVar.p(), lVar.m(), lVar.n());
        if ((marginLayoutParamsM instanceof FlexboxLayout.a) && lVar.q()) {
            ((FlexboxLayout.a) marginLayoutParamsM).a(lVar.l());
        }
        viewGroup.addView(view, marginLayoutParamsM);
    }

    protected View l(Context context, ZoomScrollView zoomScrollView, SourceImageView.c cVar, SourceImageView.d dVar, boolean z10) {
        View viewInflate = LayoutInflater.from(context).inflate(Ra.h.f31999b, (ViewGroup) null);
        SourceImageView sourceImageView = (SourceImageView) viewInflate.findViewById(Ra.g.f31988c);
        sourceImageView.setClipStateDelegate(cVar);
        sourceImageView.setMatchupDelegate(dVar);
        if (zoomScrollView != null) {
            zoomScrollView.i(sourceImageView);
        }
        if (z10) {
            viewInflate.findViewById(Ra.g.f31992g).setLayerType(1, null);
            viewInflate.findViewById(Ra.g.f31991f).setLayerType(1, null);
            viewInflate.findViewById(Ra.g.f31989d).setLayerType(1, null);
            viewInflate.findViewById(Ra.g.f31990e).setLayerType(1, null);
        }
        return viewInflate;
    }

    public View o(Context context) {
        return LayoutInflater.from(context).inflate(Ra.h.f32000c, (ViewGroup) null);
    }

    public z w(InputStream inputStream) throws Exception {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, null);
        xmlPullParserNewPullParser.nextTag();
        return new z(xmlPullParserNewPullParser);
    }

    protected void y(View view, l lVar) {
        List<Ra.b> listQ = q(lVar);
        if (listQ != null && !listQ.isEmpty()) {
            view.setTag(Ra.g.f31994i, listQ);
        }
    }
}
