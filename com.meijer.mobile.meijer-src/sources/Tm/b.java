package Tm;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.fullstory.FS;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.meijer.Q;
import com.meijer.mobile.meijer.activity.find.viewmodel.ProductImageViewModel;
import com.meijer.mobile.widget.ZoomableImageView;
import ek.C13806b;
import ek.C13813i;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001!B1\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010!\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010\"J'\u0010#\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001dH\u0016¢\u0006\u0004\b#\u0010\"J\u000f\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020&2\u0006\u0010 \u001a\u00020\u001dH\u0016¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u000f¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010-R\u0016\u0010\t\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010-R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00104\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\"\u00109\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010706058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00108R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010:¨\u0006;"}, d2 = {"LTm/b;", "Landroidx/viewpager/widget/a;", "", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/l1;", "imageList", "", "initialPosition", "", "loadHiResImage", "loadGrayScaleImage", "<init>", "(Ljava/util/List;IZZ)V", "Landroid/widget/ImageView;", "view", "setGrayScale", "", "z", "(Landroid/widget/ImageView;Z)V", "x", "(Ljava/util/List;)V", "w", "(Z)V", "LTm/b$a;", "listener", "y", "(LTm/b$a;)V", "Landroid/view/ViewGroup;", "container", "position", "", "h", "(Landroid/view/ViewGroup;I)Ljava/lang/Object;", "object", "a", "(Landroid/view/ViewGroup;ILjava/lang/Object;)V", "o", "d", "()I", "Landroid/view/View;", "i", "(Landroid/view/View;Ljava/lang/Object;)Z", "v", "()V", "c", "I", "Z", "e", "", "f", "Ljava/util/List;", "g", "Landroid/widget/ImageView;", "mainImage", "Landroid/util/SparseArray;", "Ljava/lang/ref/WeakReference;", "Lcom/meijer/mobile/widget/ZoomableImageView;", "Landroid/util/SparseArray;", "zoomableImageViewMap", "LTm/b$a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class b extends androidx.viewpager.widget.a {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int initialPosition;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean loadHiResImage;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean loadGrayScaleImage;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<ProductImageViewModel> imageList;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private ImageView mainImage;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final SparseArray<WeakReference<ZoomableImageView>> zoomableImageViewMap;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private a listener;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"LTm/b$a;", "", "", "position", "", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/l1;", "imagesList", "", "H0", "(ILjava/util/List;)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        void H0(int position, List<ProductImageViewModel> imagesList);
    }

    public /* synthetic */ b(List list, int i10, boolean z10, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? 0 : i10, z10, z11);
    }

    public static void __fsTypeCheck_830345f71974688714f59639779dd32c(AppCompatImageView appCompatImageView, int i10) {
        if (appCompatImageView instanceof ImageView) {
            FS.Resources_setImageResource(appCompatImageView, i10);
        } else {
            appCompatImageView.setImageResource(i10);
        }
    }

    @Override // androidx.viewpager.widget.a
    public boolean i(View view, Object object) {
        Intrinsics.j(view, "view");
        Intrinsics.j(object, "object");
        return view == object;
    }

    @JvmOverloads
    public b(List<ProductImageViewModel> imageList, int i10, boolean z10, boolean z11) {
        Intrinsics.j(imageList, "imageList");
        this.initialPosition = i10;
        this.loadHiResImage = z10;
        this.loadGrayScaleImage = z11;
        this.imageList = CollectionsKt.m1(imageList);
        this.zoomableImageViewMap = new SparseArray<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(b bVar, int i10, View view) {
        a aVar = bVar.listener;
        if (aVar != null) {
            aVar.H0(i10, bVar.imageList);
        }
    }

    private final void z(ImageView view, boolean setGrayScale) {
        if (view == null) {
            return;
        }
        if (!setGrayScale) {
            view.setColorFilter((ColorFilter) null);
            view.setImageAlpha(l3.f93323c);
        } else {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.66f);
            view.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            view.setImageAlpha(85);
        }
    }

    @Override // androidx.viewpager.widget.a
    public void a(ViewGroup container, int position, Object object) {
        Intrinsics.j(container, "container");
        Intrinsics.j(object, "object");
        container.removeView((View) object);
    }

    @Override // androidx.viewpager.widget.a
    public int d() {
        return this.imageList.size();
    }

    @Override // androidx.viewpager.widget.a
    public Object h(ViewGroup container, final int position) {
        Intrinsics.j(container, "container");
        ProductImageViewModel productImageViewModel = this.imageList.get(position);
        ZoomableImageView zoomableImageView = new ZoomableImageView(container.getContext());
        zoomableImageView.n();
        zoomableImageView.setLayoutParams(new ViewGroup.LayoutParams(container.getContext().getResources().getDimensionPixelSize(Q.f99515d), -1));
        if (position == this.initialPosition) {
            this.mainImage = zoomableImageView;
        }
        boolean z10 = this.loadGrayScaleImage;
        if (z10) {
            z(zoomableImageView, z10);
        }
        zoomableImageView.setContentDescription(productImageViewModel.E0());
        C13806b.f(zoomableImageView, productImageViewModel.a(), null, null, 6, null);
        container.addView(zoomableImageView);
        zoomableImageView.setOnClickListener(new View.OnClickListener() { // from class: Tm.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b.u(this.f36445a, position, view);
            }
        });
        this.zoomableImageViewMap.put(position, new WeakReference<>(zoomableImageView));
        return zoomableImageView;
    }

    @Override // androidx.viewpager.widget.a
    public void o(ViewGroup container, int position, Object object) {
        Intrinsics.j(container, "container");
        Intrinsics.j(object, "object");
        super.o(container, position, object);
        if (this.imageList.isEmpty()) {
            return;
        }
        ProductImageViewModel productImageViewModel = this.imageList.get(position);
        ZoomableImageView zoomableImageView = (ZoomableImageView) object;
        if (position != this.initialPosition || this.loadHiResImage) {
            zoomableImageView.setContentDescription(productImageViewModel.E0());
            C13806b.f(zoomableImageView, productImageViewModel.c(), null, null, 6, null);
            if (zoomableImageView.getDrawable() == null) {
                __fsTypeCheck_830345f71974688714f59639779dd32c(zoomableImageView, C13813i.f130214a);
            }
        }
    }

    public final void v() {
        ImageView imageView = this.mainImage;
        if (imageView == null || this.imageList.isEmpty()) {
            return;
        }
        imageView.setContentDescription(this.imageList.get(this.initialPosition).E0());
        C13806b.f(imageView, this.imageList.get(this.initialPosition).c(), null, null, 6, null);
    }

    public final void w(boolean setGrayScale) {
        this.loadGrayScaleImage = setGrayScale;
        SparseArray<WeakReference<ZoomableImageView>> sparseArray = this.zoomableImageViewMap;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArray.keyAt(i10);
            z(sparseArray.valueAt(i10).get(), setGrayScale);
        }
    }

    public final void x(List<ProductImageViewModel> imageList) {
        Intrinsics.j(imageList, "imageList");
        this.imageList.clear();
        this.imageList.addAll(imageList);
        j();
    }

    public final void y(a listener) {
        this.listener = listener;
    }
}
