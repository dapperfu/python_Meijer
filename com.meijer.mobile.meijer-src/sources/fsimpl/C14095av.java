package fsimpl;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.TextureView;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import com.fullstory.instrumentation.frameworks.compose.FSComposeDraw;
import com.fullstory.instrumentation.frameworks.compose.FSComposeGraphicsLayer;
import com.fullstory.util.Log;
import com.google.maps.android.BuildConfig;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.function.Consumer;

/* renamed from: fsimpl.av, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14095av {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f132968a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map f132969b = new WeakHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC14101ba f132970c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f132971d;

    public C14095av(InterfaceC14101ba interfaceC14101ba, C14091ar c14091ar) {
        this.f132970c = interfaceC14101ba;
        this.f132971d = c14091ar != null && c14091ar.p();
    }

    private static Drawable a(Drawable drawable) {
        while (drawable instanceof DrawableContainer) {
            drawable = ((DrawableContainer) drawable).getCurrent();
        }
        return drawable;
    }

    private static void a(View view, C14082ai c14082ai) {
        Drawable background = view.getBackground();
        if (background == null) {
            return;
        }
        int scrollX = view.getScrollX();
        int scrollY = view.getScrollY();
        boolean z10 = (scrollX | scrollY) != 0;
        if (z10) {
            c14082ai.translate(scrollX, scrollY);
        }
        a(background, view, c14082ai, true);
        if (z10) {
            c14082ai.translate(-scrollX, -scrollY);
        }
    }

    private static void a(final FSComposeDraw fSComposeDraw, final Object obj, final Object obj2, boolean z10) {
        if (z10) {
            if (obj2 instanceof FSComposeGraphicsLayer) {
                ((FSComposeGraphicsLayer) obj2)._fsGetChildDependenciesTracker()._fsWithTracking(new Consumer() { // from class: fsimpl.av$$ExternalSyntheticLambda0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj3) {
                        C14095av.a(obj3);
                    }
                }, new Runnable() { // from class: fsimpl.av$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        fSComposeDraw._fsComposeDraw(obj, obj2);
                    }
                });
                return;
            } else if (obj2 != null) {
                return;
            }
        }
        fSComposeDraw._fsComposeDraw(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Object obj) {
        if (obj instanceof FSComposeGraphicsLayer) {
            ((FSComposeGraphicsLayer) obj)._fsOnRemovedFromParentLayer();
        }
    }

    private static boolean a(Drawable drawable, View view, C14082ai c14082ai, boolean z10) {
        Drawable drawableA = a(drawable);
        if (drawableA == null) {
            return false;
        }
        if (!(drawableA instanceof LayerDrawable)) {
            if (gb.a(drawableA)) {
                c14082ai.a(drawableA, view, z10);
                return true;
            }
            if (!z10) {
                return false;
            }
            drawableA.draw(c14082ai);
            return true;
        }
        Drawable drawableFindDrawableByLayerId = drawableA instanceof RippleDrawable ? ((RippleDrawable) drawableA).findDrawableByLayerId(android.R.id.mask) : null;
        LayerDrawable layerDrawable = (LayerDrawable) drawableA;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        boolean z11 = false;
        for (int i10 = 0; i10 < numberOfLayers; i10++) {
            Drawable drawable2 = layerDrawable.getDrawable(i10);
            if ((drawableFindDrawableByLayerId == null || drawable2 != drawableFindDrawableByLayerId) && a(drawable2, view, c14082ai, z10)) {
                z11 = true;
            }
        }
        return z11;
    }

    private static boolean a(View view) {
        return (view.willNotDraw() && view.getBackground() == null) ? false : true;
    }

    private static boolean a(Class cls, TextureView textureView) {
        try {
            for (Field field : cls.getDeclaredFields()) {
                if (field.getType() == String.class) {
                    field.setAccessible(true);
                    Object objA = fT.a(field, textureView);
                    if ((objA instanceof String) && "GL-Map".equals((String) objA)) {
                        return true;
                    }
                }
            }
        } catch (Throwable th2) {
        }
        return false;
    }

    private static boolean a(String str) {
        return str != null && str.contains("Google") && str.contains("Map");
    }

    private TextureView b(View view) {
        if (this.f132971d && (view instanceof TextureView)) {
            TextureView textureView = (TextureView) view;
            Class<?> cls = textureView.getClass();
            if (!cls.isAssignableFrom(TextureView.class)) {
                Map map = f132969b;
                Boolean bool = (Boolean) map.get(cls);
                if (bool != null) {
                    if (bool.booleanValue()) {
                        return textureView;
                    }
                    return null;
                }
                String name = textureView.getClass().getName();
                Boolean bool2 = ((name.startsWith("com.google.") && name.contains(".maps.")) || a(ge.a(textureView)) || a(cls, textureView)) ? Boolean.TRUE : Boolean.FALSE;
                map.put(cls, bool2);
                if (bool2.booleanValue()) {
                    return textureView;
                }
            }
        }
        return null;
    }

    private boolean b(View view, C14082ai c14082ai) {
        if (view instanceof ImageView) {
            return a(((ImageView) view).getDrawable(), view, c14082ai, false);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(android.view.View r16, java.lang.Object r17, fsimpl.C14249v r18, fsimpl.C14082ai r19, fsimpl.W r20, fsimpl.bU r21) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fsimpl.C14095av.a(android.view.View, java.lang.Object, fsimpl.v, fsimpl.ai, fsimpl.W, fsimpl.bU):int");
    }

    public int a(FSComposeDraw fSComposeDraw, C14249v c14249v, Object obj, C14082ai c14082ai, Object obj2, boolean z10, RectF rectF, C14138ck c14138ck) {
        C14228fu.a("renderNode", new Object[0]);
        c14082ai.a(rectF.left, rectF.top, c14249v.e(fSComposeDraw));
        c14082ai.drawRect(rectF, (Paint) null);
        if (c14138ck.B()) {
            a(fSComposeDraw, obj, obj2, z10);
        } else {
            fSComposeDraw._fsComposeDraw(obj);
        }
        return this.f132970c.a(gd.c(fSComposeDraw), c14082ai.h());
    }

    public int a(aF aFVar, C14082ai c14082ai, RectF rectF) {
        C14228fu.a("renderIntermediate", new Object[0]);
        c14082ai.i();
        c14082ai.drawRect(rectF, (Paint) null);
        return this.f132970c.a(gd.c(aFVar), c14082ai.j());
    }

    public void a(CompoundButton compoundButton, Drawable drawable, C14082ai c14082ai) {
        int height;
        if (!gb.a(drawable)) {
            Log.d("current drawable for checkbox was not a vector. falling back to standard drawing." + (drawable != null ? drawable.getClass().getName() : BuildConfig.TRAVIS));
            AbstractC14235h.a(compoundButton, c14082ai);
            return;
        }
        int gravity = compoundButton.getGravity() & 112;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        switch (gravity) {
            case 16:
                height = (c14082ai.getHeight() - intrinsicHeight) / 2;
                break;
            case BinsView.LABEL_WIDTH_DP /* 80 */:
                height = c14082ai.getHeight() - intrinsicHeight;
                break;
            default:
                height = 0;
                break;
        }
        int i10 = intrinsicHeight + height;
        int width = compoundButton.isLayoutRtl() ? c14082ai.getWidth() - intrinsicWidth : 0;
        if (compoundButton.isLayoutRtl()) {
            intrinsicWidth = c14082ai.getWidth();
        }
        drawable.setBounds(width, height, intrinsicWidth, i10);
        Drawable background = compoundButton.getBackground();
        if (background != null) {
            background.setHotspotBounds(width, height, intrinsicWidth, i10);
            if (gb.a(background)) {
                c14082ai.a(background, (View) compoundButton, true);
            }
        }
        AbstractC14235h.a(compoundButton, c14082ai);
        int scrollX = compoundButton.getScrollX();
        int scrollY = compoundButton.getScrollY();
        if (scrollX == 0 && scrollY == 0) {
            c14082ai.a(drawable, (View) compoundButton, false);
            return;
        }
        c14082ai.translate(scrollX, scrollY);
        c14082ai.a(drawable, (View) compoundButton, false);
        c14082ai.translate(-scrollX, -scrollY);
    }
}
