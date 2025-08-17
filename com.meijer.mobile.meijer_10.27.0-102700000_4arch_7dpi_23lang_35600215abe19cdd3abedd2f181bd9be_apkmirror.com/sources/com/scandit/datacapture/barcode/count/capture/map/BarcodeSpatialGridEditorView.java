package com.scandit.datacapture.barcode.count.capture.map;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import com.scandit.datacapture.core.internal.module.ui.NativeToastHintStyle;
import com.scandit.datacapture.core.internal.sdk.ui.hint.HintHolderV2;
import com.scandit.datacapture.core.internal.sdk.ui.hint.HintPresenterV2;
import com.scandit.datacapture.core.internal.sdk.ui.hint.ToastHint;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J/\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGridEditorView;", "Landroid/widget/FrameLayout;", "", "onAttachedToWindow", "()V", "", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGridEditorViewListener;", "Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGridEditorViewListener;", "getListener", "()Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGridEditorViewListener;", "setListener", "(Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGridEditorViewListener;)V", "listener", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class BarcodeSpatialGridEditorView extends FrameLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: i, reason: collision with root package name */
    private static final Lazy f120674i = LazyKt.b(b.f120694a);

    /* renamed from: j, reason: collision with root package name */
    private static final Lazy f120675j = LazyKt.b(a.f120693a);

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeSpatialGrid f120676a;

    /* renamed from: b, reason: collision with root package name */
    private final BarcodeSpatialGridEditorViewSettings f120677b;

    /* renamed from: c, reason: collision with root package name */
    private final BinsView f120678c;

    /* renamed from: d, reason: collision with root package name */
    private final Button f120679d;

    /* renamed from: e, reason: collision with root package name */
    private final Button f120680e;

    /* renamed from: f, reason: collision with root package name */
    private final HintHolderV2 f120681f;

    /* renamed from: g, reason: collision with root package name */
    private final HintPresenterV2 f120682g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private BarcodeSpatialGridEditorViewListener listener;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGridEditorView$Companion;", "", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGrid;", "grid", "Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGridEditorViewSettings;", "settings", "Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGridEditorView;", "newInstance", "(Landroid/content/Context;Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGrid;Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGridEditorViewSettings;)Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGridEditorView;", "", "DELAY_BEFORE_SHOWING_HINT", "J", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final BarcodeSpatialGridEditorView newInstance(Context context, BarcodeSpatialGrid grid, BarcodeSpatialGridEditorViewSettings settings) throws IllegalStateException {
            Intrinsics.j(context, "context");
            Intrinsics.j(grid, "grid");
            Intrinsics.j(settings, "settings");
            return new BarcodeSpatialGridEditorView(context, grid, settings, null);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static final float access$getMIN_BIN_VIEWS_HEIGHT_PX(Companion companion) {
            companion.getClass();
            return ((Number) BarcodeSpatialGridEditorView.f120675j.getValue()).floatValue();
        }

        public static final float access$getSPACE_NEEDED_FOR_BUTTONS_PX(Companion companion) {
            companion.getClass();
            return ((Number) BarcodeSpatialGridEditorView.f120674i.getValue()).floatValue();
        }
    }

    public /* synthetic */ BarcodeSpatialGridEditorView(Context context, BarcodeSpatialGrid barcodeSpatialGrid, BarcodeSpatialGridEditorViewSettings barcodeSpatialGridEditorViewSettings, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, barcodeSpatialGrid, barcodeSpatialGridEditorViewSettings);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(BarcodeSpatialGridEditorView this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        BarcodeSpatialGridEditorViewListener barcodeSpatialGridEditorViewListener = this$0.listener;
        if (barcodeSpatialGridEditorViewListener != null) {
            barcodeSpatialGridEditorViewListener.onEditingFinished(this$0, this$0.f120676a);
        }
    }

    @JvmStatic
    public static final BarcodeSpatialGridEditorView newInstance(Context context, BarcodeSpatialGrid barcodeSpatialGrid, BarcodeSpatialGridEditorViewSettings barcodeSpatialGridEditorViewSettings) throws IllegalStateException {
        return INSTANCE.newInstance(context, barcodeSpatialGrid, barcodeSpatialGridEditorViewSettings);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w10, int h10, int oldw, int oldh) {
        float f10 = h10;
        Companion companion = INSTANCE;
        float fN = RangesKt.n((f10 - Companion.access$getSPACE_NEEDED_FOR_BUTTONS_PX(companion)) / Companion.access$getMIN_BIN_VIEWS_HEIGHT_PX(companion), 0.0f, 1.0f);
        this.f120678c.setScaleX(fN);
        this.f120678c.setScaleY(fN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v7, types: [com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView$Item] */
    private BarcodeSpatialGridEditorView(Context context, BarcodeSpatialGrid barcodeSpatialGrid, BarcodeSpatialGridEditorViewSettings barcodeSpatialGridEditorViewSettings) {
        super(context);
        this.f120676a = barcodeSpatialGrid;
        this.f120677b = barcodeSpatialGridEditorViewSettings;
        if (barcodeSpatialGrid.columns() != 2 || barcodeSpatialGrid.rows() != 4) {
            throw new IllegalArgumentException(("Unsupported grid size - requires a 4x2 grid, was " + barcodeSpatialGrid.rows() + 'x' + barcodeSpatialGrid.columns()).toString());
        }
        HintHolderV2 hintHolderV2Implementation = HintHolderV2.INSTANCE.implementation(context);
        this.f120681f = hintHolderV2Implementation;
        this.f120682g = new HintPresenterV2(hintHolderV2Implementation);
        BinsView.EditListener editListener = new BinsView.EditListener() { // from class: com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridEditorView$editListener$1
            @Override // com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView.EditListener
            public void onSubSwapped(int fromIndex, int toIndex) {
                this.f120684a.f120676a.getF120691a().swapSubsAtCoordinates(fromIndex / this.f120684a.f120676a.columns(), fromIndex % this.f120684a.f120676a.columns(), toIndex / this.f120684a.f120676a.columns(), toIndex % this.f120684a.f120676a.columns());
            }

            @Override // com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView.EditListener
            public void onToteSwapped(int fromIndex, int toIndex) {
                this.f120684a.f120676a.getF120691a().swapElementsAtCoordinates(fromIndex / this.f120684a.f120676a.columns(), fromIndex % this.f120684a.f120676a.columns(), toIndex / this.f120684a.f120676a.columns(), toIndex % this.f120684a.f120676a.columns());
            }
        };
        int i10 = 0;
        setClipChildren(false);
        setClipToPadding(false);
        LayoutInflater.from(context).inflate(R.layout.sc_barcode_spatial_grid_editor, this);
        View viewFindViewById = findViewById(R.id.sc_editor);
        Intrinsics.i(viewFindViewById, "findViewById(...)");
        BinsView binsView = (BinsView) viewFindViewById;
        this.f120678c = binsView;
        binsView.setOnEditListener(editListener);
        View viewFindViewById2 = findViewById(R.id.confirmButton);
        Button button = (Button) viewFindViewById2;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.scandit.datacapture.barcode.count.capture.map.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BarcodeSpatialGridEditorView.a(this.f120699a, view);
            }
        });
        Intrinsics.i(viewFindViewById2, "also(...)");
        this.f120679d = button;
        View viewFindViewById3 = findViewById(R.id.rescanButton);
        Button button2 = (Button) viewFindViewById3;
        button2.setOnClickListener(new View.OnClickListener() { // from class: com.scandit.datacapture.barcode.count.capture.map.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BarcodeSpatialGridEditorView.b(this.f120700a, view);
            }
        });
        Intrinsics.i(viewFindViewById3, "also(...)");
        this.f120680e = button2;
        IntRange intRangeX = RangesKt.x(0, barcodeSpatialGrid.rows());
        ArrayList arrayList = new ArrayList(CollectionsKt.x(intRangeX, 10));
        Iterator<Integer> it = intRangeX.iterator();
        while (it.hasNext()) {
            ((IntIterator) it).nextInt();
            arrayList.add(RangesKt.x(0, barcodeSpatialGrid.columns()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            IntRange intRange = (IntRange) next;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.x(intRange, 10));
            Iterator<Integer> it3 = intRange.iterator();
            while (it3.hasNext()) {
                BarcodeSpatialGridElement barcodeSpatialGridElementElementAt = barcodeSpatialGrid.elementAt(i10, ((IntIterator) it3).nextInt());
                if (barcodeSpatialGridElementElementAt != null) {
                    String data = barcodeSpatialGridElementElementAt.getMainBarcode().getData();
                    data = data == null ? "" : data;
                    Barcode subBarcode = barcodeSpatialGridElementElementAt.getSubBarcode();
                    item = new BinsView.Item(data, subBarcode != null ? subBarcode.getData() : null);
                }
                arrayList3.add(item);
            }
            CollectionsKt.C(arrayList2, arrayList3);
            i10 = i11;
        }
        BinsView.Grid grid = new BinsView.Grid(barcodeSpatialGrid.rows(), barcodeSpatialGrid.columns(), arrayList2);
        BarcodeSpatialGridEditorViewSettings barcodeSpatialGridEditorViewSettings2 = this.f120677b;
        binsView.initialize(grid, new BinsView.Settings(barcodeSpatialGridEditorViewSettings2.getToteTextFormat(), barcodeSpatialGridEditorViewSettings2.getToteColor(), barcodeSpatialGridEditorViewSettings2.getSubColor()));
        this.f120679d.setText(this.f120677b.getFinishMappingButtonText());
        this.f120680e.setText(this.f120677b.getCancelMappingButtonText());
        Object obj = this.f120681f;
        Intrinsics.h(obj, "null cannot be cast to non-null type android.view.View");
        addView((View) obj, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(BarcodeSpatialGridEditorView this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        BarcodeSpatialGridEditorViewListener barcodeSpatialGridEditorViewListener = this$0.listener;
        if (barcodeSpatialGridEditorViewListener != null) {
            barcodeSpatialGridEditorViewListener.onEditingCancelled(this$0);
        }
    }

    public final BarcodeSpatialGridEditorViewListener getListener() {
        return this.listener;
    }

    public final void setListener(BarcodeSpatialGridEditorViewListener barcodeSpatialGridEditorViewListener) {
        this.listener = barcodeSpatialGridEditorViewListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(BarcodeSpatialGridEditorView this$0) {
        Intrinsics.j(this$0, "this$0");
        this$0.f120682g.showToast(new ToastHint(NativeToastHintStyle.SUCCESS, this$0.f120677b.getReorderHintText(), null, true, 4, null));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        postDelayed(new Runnable() { // from class: com.scandit.datacapture.barcode.count.capture.map.f
            @Override // java.lang.Runnable
            public final void run() {
                BarcodeSpatialGridEditorView.a(this.f120698a);
            }
        }, 50L);
    }
}
