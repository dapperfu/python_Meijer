package com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.internal.sdk.extensions.PointExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 &2\u00020\u0001:\u0007&'()*+,B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001c\u0010\u001dR$\u0010%\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006-"}, d2 = {"Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/BinsView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/BinsView$Grid;", "grid", "Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/BinsView$Settings;", "settings", "", "initialize", "(Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/BinsView$Grid;Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/BinsView$Settings;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/BinsView$EditListener;", "p", "Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/BinsView$EditListener;", "getOnEditListener", "()Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/BinsView$EditListener;", "setOnEditListener", "(Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/BinsView$EditListener;)V", "onEditListener", "Companion", "EditListener", "com/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/a", "Grid", "Item", "Settings", "TouchedElement", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class BinsView extends FrameLayout {
    public static final float BIN_LABEL_Z_INDEX_DP = 5.0f;
    public static final int DEFAULT_SUB_BACKGROUND_COLOR = -13204481;
    public static final int DEFAULT_TOTE_BACKGROUND_COLOR = -15710303;
    public static final int FONT_SIZE_MINI_SP = 10;
    public static final int FONT_SIZE_SP = 12;
    public static final float GRABBED_VIEW_ALPHA = 0.5f;
    public static final float GRABBED_VIEW_ELEVATION_DP = 4.0f;
    public static final int LABEL_HEIGHT_DP = 20;
    public static final int LABEL_HORIZONTAL_PADDING_DP = 8;
    public static final int LABEL_VERTICAL_PADDING_DP = 2;
    public static final int LABEL_WIDTH_DP = 80;
    public static final String POSITION_TOKEN = "{position}";
    public static final float SUB_RADIUS_DP = 12.0f;
    public static final float SUB_SIZE_DP = 66.0f;
    public static final float SUB_X_DP = 16.0f;
    public static final float SUB_Y_DP = 30.0f;
    public static final int TOTE_HEIGHT_DP = 120;
    public static final float TOTE_RADIUS_DP = 16.0f;
    public static final int TOTE_SPACING_DP = 20;
    public static final int TOTE_WIDTH_DP = 150;
    public static final int UI_ELEMENT_ON_DARK_COLOR = -1972243;
    public static final int UI_ELEMENT_ON_LIGHT_COLOR = -15134680;

    /* renamed from: a, reason: collision with root package name */
    private final int f124407a;

    /* renamed from: b, reason: collision with root package name */
    private final int f124408b;

    /* renamed from: c, reason: collision with root package name */
    private final int f124409c;

    /* renamed from: d, reason: collision with root package name */
    private final int f124410d;

    /* renamed from: e, reason: collision with root package name */
    private final int f124411e;

    /* renamed from: f, reason: collision with root package name */
    private final float f124412f;

    /* renamed from: g, reason: collision with root package name */
    private final float f124413g;

    /* renamed from: h, reason: collision with root package name */
    private final float f124414h;

    /* renamed from: i, reason: collision with root package name */
    private final RectF f124415i;

    /* renamed from: j, reason: collision with root package name */
    private final RectF f124416j;

    /* renamed from: k, reason: collision with root package name */
    private final BinDrawable f124417k;

    /* renamed from: l, reason: collision with root package name */
    private List f124418l;

    /* renamed from: m, reason: collision with root package name */
    private final SparseArray f124419m;

    /* renamed from: n, reason: collision with root package name */
    private final SparseArray f124420n;

    /* renamed from: o, reason: collision with root package name */
    private Grid f124421o;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private EditListener onEditListener;

    /* renamed from: q, reason: collision with root package name */
    private TouchedElement f124423q;

    /* renamed from: r, reason: collision with root package name */
    private Integer f124424r;

    /* renamed from: s, reason: collision with root package name */
    private float f124425s;

    /* renamed from: t, reason: collision with root package name */
    private float f124426t;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/BinsView$EditListener;", "", "onSubSwapped", "", "fromIndex", "", "toIndex", "onToteSwapped", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface EditListener {
        void onSubSwapped(int fromIndex, int toIndex);

        void onToteSwapped(int fromIndex, int toIndex);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u000f\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001f\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/BinsView$Grid;", "", "", "rows", "columns", "", "Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/BinsView$Item;", "items", "<init>", "(IILjava/util/List;)V", "index", "itemAtIndex", "(I)Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/BinsView$Item;", "fromIndex", "toIndex", "", "swapTote", "(II)V", "swapSub", "a", "I", "getRows", "()I", "b", "getColumns", "d", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Grid {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int rows;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int columns;

        /* renamed from: c, reason: collision with root package name */
        private final List f124429c;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List items;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/BinsView$Grid$Companion;", "", "Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/BinsView$Grid;", "emptyGrid", "()Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/BinsView$Grid;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
        public static final class Companion {
            public final Grid emptyGrid() {
                return new Grid(0, 0, CollectionsKt.m());
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        public Grid(int i10, int i11, List<Item> items) {
            Intrinsics.j(items, "items");
            this.rows = i10;
            this.columns = i11;
            List listM1 = CollectionsKt.m1(items);
            this.f124429c = listM1;
            this.items = listM1;
        }

        public final int getColumns() {
            return this.columns;
        }

        public final List<Item> getItems() {
            return this.items;
        }

        public final int getRows() {
            return this.rows;
        }

        public final Item itemAtIndex(int index) {
            return (Item) this.items.get(index);
        }

        public final void swapSub(int fromIndex, int toIndex) {
            Item item;
            Item item2 = (Item) this.f124429c.get(fromIndex);
            if (item2 == null || (item = (Item) this.f124429c.get(toIndex)) == null) {
                return;
            }
            this.f124429c.set(fromIndex, new Item(item2.getToteText(), item.getSubText()));
            this.f124429c.set(toIndex, new Item(item.getToteText(), item2.getSubText()));
        }

        public final void swapTote(int fromIndex, int toIndex) {
            Item item = (Item) this.f124429c.get(fromIndex);
            List list = this.f124429c;
            list.set(fromIndex, list.get(toIndex));
            this.f124429c.set(toIndex, item);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/BinsView$Item;", "", "", "toteText", "subText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getToteText", "()Ljava/lang/String;", "b", "getSubText", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Item {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String toteText;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String subText;

        public Item(String toteText, String str) {
            Intrinsics.j(toteText, "toteText");
            this.toteText = toteText;
            this.subText = str;
        }

        public final String getSubText() {
            return this.subText;
        }

        public final String getToteText() {
            return this.toteText;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/BinsView$Settings;", "", "", "toteTextFormat", "", "toteColor", "subColor", "<init>", "(Ljava/lang/String;II)V", "a", "Ljava/lang/String;", "getToteTextFormat", "()Ljava/lang/String;", "b", "I", "getToteColor", "()I", "c", "getSubColor", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Settings {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String toteTextFormat;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int toteColor;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int subColor;

        public Settings(String toteTextFormat, int i10, int i11) {
            Intrinsics.j(toteTextFormat, "toteTextFormat");
            this.toteTextFormat = toteTextFormat;
            this.toteColor = i10;
            this.subColor = i11;
        }

        public final int getSubColor() {
            return this.subColor;
        }

        public final int getToteColor() {
            return this.toteColor;
        }

        public final String getToteTextFormat() {
            return this.toteTextFormat;
        }
    }

    public interface TouchedElement {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/BinsView$TouchedElement$SubHandle;", "Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/BinsView$TouchedElement;", "", "index", "Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/SubView;", "subView", "<init>", "(ILcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/SubView;)V", "a", "I", "getIndex", "()I", "b", "Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/SubView;", "getSubView", "()Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/SubView;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
        public static final class SubHandle implements TouchedElement {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final int index;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final SubView subView;

            public SubHandle(int i10, SubView subView) {
                Intrinsics.j(subView, "subView");
                this.index = i10;
                this.subView = subView;
            }

            public final int getIndex() {
                return this.index;
            }

            public final SubView getSubView() {
                return this.subView;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/BinsView$TouchedElement$ToteHandle;", "Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/BinsView$TouchedElement;", "", "index", "Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/ToteView;", "view", "<init>", "(ILcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/ToteView;)V", "a", "I", "getIndex", "()I", "b", "Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/ToteView;", "getView", "()Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/ToteView;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
        public static final class ToteHandle implements TouchedElement {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final int index;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final ToteView view;

            public ToteHandle(int i10, ToteView view) {
                Intrinsics.j(view, "view");
                this.index = i10;
                this.view = view;
            }

            public final int getIndex() {
                return this.index;
            }

            public final ToteView getView() {
                return this.view;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/BinsView$TouchedElement$Nothing;", "Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/BinsView$TouchedElement;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
        public static final class Nothing implements TouchedElement {
            public static final Nothing INSTANCE = new Nothing();

            private Nothing() {
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BinsView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.j(context, "context");
    }

    private final void a(final SubView subView, int i10, final Function0 function0) {
        int columns = i10 % this.f124421o.getColumns();
        int columns2 = i10 / this.f124421o.getColumns();
        float x10 = subView.getX();
        float y10 = subView.getY();
        int i11 = this.f124407a;
        int i12 = this.f124409c;
        float f10 = ((i11 + i12) * columns) + this.f124412f;
        float f11 = ((this.f124408b + i12) * columns2) + this.f124413g;
        final a aVar = new a(x10, f10);
        final a aVar2 = new a(y10, f11);
        final a aVar3 = new a(subView.getElevation(), 0.0f);
        final a aVar4 = new a(subView.getAlpha(), 1.0f);
        float fDistance = PointExtensionsKt.distance(new Point(x10, y10), new Point(f10, f11));
        Context context = getContext();
        Intrinsics.i(context, "getContext(...)");
        long jP = RangesKt.p((long) PixelExtensionsKt.dpFromPx(fDistance, context), 100L, 250L);
        Object tag = subView.getTag();
        ValueAnimator valueAnimator = tag instanceof ValueAnimator ? (ValueAnimator) tag : null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.setDuration(jP);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.l
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                BinsView.a(valueAnimatorOfFloat, subView, aVar, aVar2, aVar3, aVar4, valueAnimator2);
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView$animateSubViewToPosition$3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                Intrinsics.j(animation, "animation");
                animation.removeAllListeners();
                ValueAnimator valueAnimator2 = valueAnimatorOfFloat;
                Intrinsics.h(valueAnimator2, "null cannot be cast to non-null type android.animation.ValueAnimator");
                valueAnimator2.removeAllUpdateListeners();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.j(animation, "animation");
                function0.invoke();
                subView.setTag(null);
                animation.removeAllListeners();
                ValueAnimator valueAnimator2 = valueAnimatorOfFloat;
                Intrinsics.h(valueAnimator2, "null cannot be cast to non-null type android.animation.ValueAnimator");
                valueAnimator2.removeAllUpdateListeners();
            }
        });
        subView.setTag(valueAnimatorOfFloat);
        valueAnimatorOfFloat.start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BinsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.j(context, "context");
    }

    public static final void access$displayToteSubs(BinsView binsView) {
        com.scandit.datacapture.barcode.internal.module.extensions.c.a(binsView.f124420n, d.f124473a);
        com.scandit.datacapture.barcode.internal.module.extensions.c.a(binsView.f124419m, e.f124474a);
    }

    public static final void access$swapSubIndex(BinsView binsView, int i10, int i11) {
        ToteView toteView = (ToteView) binsView.f124419m.get(i10);
        ToteView toteView2 = (ToteView) binsView.f124419m.get(i11);
        String subBarcode = toteView.getSubBarcode();
        toteView.setSubBarcode(toteView2.getSubBarcode());
        toteView2.setSubBarcode(subBarcode);
        SubView subView = (SubView) binsView.f124420n.get(i10);
        SubView subView2 = (SubView) binsView.f124420n.get(i11);
        binsView.f124420n.put(i11, subView);
        binsView.f124420n.put(i10, subView2);
        binsView.f124421o.swapSub(i10, i11);
        EditListener editListener = binsView.onEditListener;
        if (editListener != null) {
            editListener.onSubSwapped(i10, i11);
        }
    }

    public static final void access$swapToteIndex(BinsView binsView, int i10, int i11) {
        ToteView toteView = (ToteView) binsView.f124419m.get(i10);
        ToteView toteView2 = (ToteView) binsView.f124419m.get(i11);
        binsView.f124419m.put(i11, toteView);
        binsView.f124419m.put(i10, toteView2);
        SubView subView = (SubView) binsView.f124420n.get(i10);
        SubView subView2 = (SubView) binsView.f124420n.get(i11);
        binsView.f124420n.put(i11, subView);
        binsView.f124420n.put(i10, subView2);
        binsView.f124421o.swapTote(i10, i11);
        EditListener editListener = binsView.onEditListener;
        if (editListener != null) {
            editListener.onToteSwapped(i10, i11);
        }
    }

    public final EditListener getOnEditListener() {
        return this.onEditListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initialize(Grid grid, Settings settings) {
        String subText;
        int i10;
        boolean z10;
        Typeface typefaceCreate;
        Intrinsics.j(grid, "grid");
        Intrinsics.j(settings, "settings");
        this.f124421o = grid;
        Iterator it = this.f124418l.iterator();
        while (it.hasNext()) {
            removeView((TextView) it.next());
        }
        Context context = getContext();
        Intrinsics.i(context, "getContext(...)");
        int iPxFromDp = PixelExtensionsKt.pxFromDp(80, context);
        Context context2 = getContext();
        Intrinsics.i(context2, "getContext(...)");
        int iPxFromDp2 = PixelExtensionsKt.pxFromDp(20, context2);
        int i11 = (this.f124407a - iPxFromDp) / 2;
        Context context3 = getContext();
        Intrinsics.i(context3, "getContext(...)");
        float fPxFromDp = PixelExtensionsKt.pxFromDp(5.0f, context3);
        int i12 = 0;
        IntRange intRangeX = RangesKt.x(0, a());
        ArrayList arrayList = new ArrayList(CollectionsKt.x(intRangeX, 10));
        Iterator<Integer> it2 = intRangeX.iterator();
        while (it2.hasNext()) {
            int iNextInt = ((IntIterator) it2).nextInt();
            int columns = iNextInt % this.f124421o.getColumns();
            int columns2 = iNextInt / this.f124421o.getColumns();
            TextView textView = new TextView(getContext());
            textView.setGravity(17);
            int i13 = this.f124411e;
            textView.setPadding(i13, i12, i13, i12);
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 26) {
                i10 = i11;
                textView.setAutoSizeTextTypeUniformWithConfiguration(10, 12, 1, 2);
            } else {
                i10 = i11;
                textView.setTextSize(2, 12.0f);
            }
            if (i14 >= 28) {
                z10 = 0;
                typefaceCreate = Typeface.create(null, 600, false);
            } else {
                z10 = 0;
                typefaceCreate = Typeface.DEFAULT_BOLD;
            }
            textView.setTypeface(typefaceCreate);
            textView.setSingleLine();
            String toteTextFormat = settings.getToteTextFormat();
            String strValueOf = String.valueOf(iNextInt + 1);
            textView.setText(StringsKt.d0(toteTextFormat, POSITION_TOKEN, z10, 2, null) ? StringsKt.C1(StringsKt.Q(toteTextFormat, POSITION_TOKEN, strValueOf, false, 4, null)).toString() : StringsKt.C1(toteTextFormat).toString() + ' ' + strValueOf);
            ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(iPxFromDp, iPxFromDp2);
            textView.setX(((this.f124407a + this.f124409c) * columns) + i10);
            textView.setY((this.f124408b + this.f124409c) * columns2);
            textView.setZ(fPxFromDp);
            addView(textView, layoutParams);
            arrayList.add(textView);
            i12 = z10;
            i11 = i10;
        }
        int i15 = i12;
        this.f124418l = arrayList;
        com.scandit.datacapture.barcode.internal.module.extensions.c.a(this.f124419m, new h(this));
        com.scandit.datacapture.barcode.internal.module.extensions.c.a(this.f124420n, new i(this));
        this.f124419m.clear();
        this.f124420n.clear();
        int iA = a();
        for (int i16 = i15; i16 < iA; i16++) {
            int columns3 = i16 % this.f124421o.getColumns();
            int columns4 = i16 / this.f124421o.getColumns();
            Item itemItemAtIndex = this.f124421o.itemAtIndex(i16);
            if (itemItemAtIndex != null) {
                SparseArray sparseArray = this.f124419m;
                Context context4 = getContext();
                Intrinsics.i(context4, "getContext(...)");
                ToteView toteView = new ToteView(context4, null, 0, 6, null);
                toteView.setToteColor(settings.getToteColor());
                toteView.setSubColor(settings.getSubColor());
                toteView.setMainBarcode(itemItemAtIndex.getToteText());
                toteView.setSubBarcode(itemItemAtIndex.getSubText());
                ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.f124407a, this.f124408b);
                toteView.setX((this.f124407a + this.f124409c) * columns3);
                toteView.setY((this.f124408b + this.f124409c) * columns4);
                addView(toteView, layoutParams2);
                Unit unit = Unit.f143329a;
                sparseArray.put(i16, toteView);
            }
        }
        int iA2 = a();
        for (int i17 = i15; i17 < iA2; i17++) {
            Item itemItemAtIndex2 = this.f124421o.itemAtIndex(i17);
            if (itemItemAtIndex2 != null && (subText = itemItemAtIndex2.getSubText()) != null && subText.length() != 0) {
                SparseArray sparseArray2 = this.f124420n;
                Context context5 = getContext();
                Intrinsics.i(context5, "getContext(...)");
                SubView subView = new SubView(context5, null, 0, 6, null);
                subView.setColor(settings.getSubColor());
                subView.setText(itemItemAtIndex2.getSubText());
                subView.setAlpha(0.0f);
                int i18 = this.f124410d;
                addView(subView, new FrameLayout.LayoutParams(i18, i18));
                Unit unit2 = Unit.f143329a;
                sparseArray2.put(i17, subView);
            }
        }
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.j(canvas, "canvas");
        int iA = a();
        for (int i10 = 0; i10 < iA; i10++) {
            int columns = i10 % this.f124421o.getColumns();
            int columns2 = i10 / this.f124421o.getColumns();
            canvas.save();
            int i11 = this.f124407a;
            int i12 = this.f124409c;
            canvas.translate(columns * (i11 + i12), columns2 * (this.f124408b + i12));
            this.f124417k.draw(canvas);
            canvas.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0202  */
    @Override // android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setOnEditListener(EditListener editListener) {
        this.onEditListener = editListener;
    }

    public /* synthetic */ BinsView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(((this.f124421o.getColumns() - 1) * this.f124409c) + (this.f124421o.getColumns() * this.f124407a), ((this.f124421o.getRows() - 1) * this.f124409c) + (this.f124421o.getRows() * this.f124408b));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BinsView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.j(context, "context");
        int iPxFromDp = PixelExtensionsKt.pxFromDp(TOTE_WIDTH_DP, context);
        this.f124407a = iPxFromDp;
        int iPxFromDp2 = PixelExtensionsKt.pxFromDp(TOTE_HEIGHT_DP, context);
        this.f124408b = iPxFromDp2;
        this.f124409c = PixelExtensionsKt.pxFromDp(20, context);
        int iPxFromDp3 = (int) PixelExtensionsKt.pxFromDp(66.0f, context);
        this.f124410d = iPxFromDp3;
        this.f124411e = PixelExtensionsKt.pxFromDp(8, context);
        float fPxFromDp = PixelExtensionsKt.pxFromDp(16.0f, context);
        this.f124412f = fPxFromDp;
        float fPxFromDp2 = PixelExtensionsKt.pxFromDp(30.0f, context);
        this.f124413g = fPxFromDp2;
        this.f124414h = PixelExtensionsKt.pxFromDp(4.0f, context);
        this.f124415i = new RectF(0.0f, 0.0f, iPxFromDp, iPxFromDp2);
        float f10 = iPxFromDp3;
        this.f124416j = new RectF(fPxFromDp, fPxFromDp2, fPxFromDp + f10, f10 + fPxFromDp2);
        BinDrawable binDrawable = new BinDrawable(context);
        binDrawable.setBounds(0, 0, iPxFromDp, iPxFromDp2);
        this.f124417k = binDrawable;
        this.f124418l = CollectionsKt.m();
        this.f124419m = new SparseArray();
        this.f124420n = new SparseArray();
        this.f124421o = Grid.INSTANCE.emptyGrid();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        this.f124423q = TouchedElement.Nothing.INSTANCE;
    }

    private final void a(final ToteView toteView, int i10, final Function0 function0) {
        int columns = i10 % this.f124421o.getColumns();
        int columns2 = i10 / this.f124421o.getColumns();
        float x10 = toteView.getX();
        float y10 = toteView.getY();
        int i11 = this.f124407a;
        int i12 = this.f124409c;
        float f10 = (i11 + i12) * columns;
        float f11 = (this.f124408b + i12) * columns2;
        final a aVar = new a(x10, f10);
        final a aVar2 = new a(y10, f11);
        final a aVar3 = new a(toteView.getElevation(), 0.0f);
        final a aVar4 = new a(toteView.getAlpha(), 1.0f);
        float fDistance = PointExtensionsKt.distance(new Point(x10, y10), new Point(f10, f11));
        Context context = getContext();
        Intrinsics.i(context, "getContext(...)");
        long jP = RangesKt.p((long) PixelExtensionsKt.dpFromPx(fDistance, context), 100L, 250L);
        Object tag = toteView.getTag();
        ValueAnimator valueAnimator = tag instanceof ValueAnimator ? (ValueAnimator) tag : null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.setDuration(jP);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                BinsView.a(valueAnimatorOfFloat, toteView, aVar, aVar2, aVar3, aVar4, valueAnimator2);
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView$animateToteViewToPosition$3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                Intrinsics.j(animation, "animation");
                animation.removeAllListeners();
                ValueAnimator valueAnimator2 = valueAnimatorOfFloat;
                Intrinsics.h(valueAnimator2, "null cannot be cast to non-null type android.animation.ValueAnimator");
                valueAnimator2.removeAllUpdateListeners();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.j(animation, "animation");
                function0.invoke();
                toteView.setTag(null);
                animation.removeAllListeners();
                ValueAnimator valueAnimator2 = valueAnimatorOfFloat;
                Intrinsics.h(valueAnimator2, "null cannot be cast to non-null type android.animation.ValueAnimator");
                valueAnimator2.removeAllUpdateListeners();
            }
        });
        toteView.setTag(valueAnimatorOfFloat);
        valueAnimatorOfFloat.start();
    }

    private final int a() {
        return this.f124421o.getColumns() * this.f124421o.getRows();
    }

    private final Integer a(FrameLayout frameLayout) {
        int width = (frameLayout.getWidth() / 2) + ((int) frameLayout.getX());
        int height = (frameLayout.getHeight() / 2) + ((int) frameLayout.getY());
        int i10 = this.f124409c;
        int i11 = i10 / 2;
        int i12 = (width + i11) / (this.f124407a + i10);
        int i13 = (i11 + height) / (this.f124408b + i10);
        if (i12 < 0 || i12 >= this.f124421o.getColumns() || i13 < 0 || i13 >= this.f124421o.getRows()) {
            return null;
        }
        return Integer.valueOf((this.f124421o.getColumns() * i13) + i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ValueAnimator valueAnimator, ToteView view, a xTransition, a yTransition, a elevationTransition, a alphaTransition, ValueAnimator it) {
        Intrinsics.j(view, "$view");
        Intrinsics.j(xTransition, "$xTransition");
        Intrinsics.j(yTransition, "$yTransition");
        Intrinsics.j(elevationTransition, "$elevationTransition");
        Intrinsics.j(alphaTransition, "$alphaTransition");
        Intrinsics.j(it, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.h(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        view.setX(xTransition.a(fFloatValue));
        view.setY(yTransition.a(fFloatValue));
        view.setElevation(elevationTransition.a(fFloatValue));
        view.setAlpha(alphaTransition.a(fFloatValue));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ValueAnimator valueAnimator, SubView view, a xTransition, a yTransition, a elevationTransition, a alphaTransition, ValueAnimator it) {
        Intrinsics.j(view, "$view");
        Intrinsics.j(xTransition, "$xTransition");
        Intrinsics.j(yTransition, "$yTransition");
        Intrinsics.j(elevationTransition, "$elevationTransition");
        Intrinsics.j(alphaTransition, "$alphaTransition");
        Intrinsics.j(it, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.h(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        view.setX(xTransition.a(fFloatValue));
        view.setY(yTransition.a(fFloatValue));
        view.setElevation(elevationTransition.a(fFloatValue));
        view.setAlpha(alphaTransition.a(fFloatValue));
    }
}
