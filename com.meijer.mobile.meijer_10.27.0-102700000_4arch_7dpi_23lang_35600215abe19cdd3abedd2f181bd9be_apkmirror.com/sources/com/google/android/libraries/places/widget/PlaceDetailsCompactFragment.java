package com.google.android.libraries.places.widget;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.RecentlyNonNull;
import androidx.fragment.app.Fragment;
import androidx.view.AbstractC5985A;
import androidx.view.AbstractC6024m;
import androidx.view.C6031t;
import androidx.view.f0;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.android.libraries.places.internal.zzaiw;
import com.google.android.libraries.places.internal.zzaiz;
import com.google.android.libraries.places.internal.zzajb;
import com.google.android.libraries.places.internal.zzod;
import com.google.android.libraries.places.internal.zzoe;
import com.google.android.libraries.places.internal.zzof;
import com.google.android.libraries.places.internal.zzon;
import com.google.android.libraries.places.internal.zzoo;
import com.google.android.libraries.places.internal.zzoy;
import com.google.android.libraries.places.widget.internal.placedetails.zzbb;
import com.google.android.libraries.places.widget.internal.placedetails.zzbc;
import com.google.android.libraries.places.widget.internal.placedetails.zzbi;
import com.google.android.libraries.places.widget.internal.placedetails.zzbj;
import com.google.android.libraries.places.widget.internal.placedetails.zzbp;
import com.google.android.libraries.places.widget.model.Orientation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 b2\u00020\u0001:\u0003`abB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105H\u0016J$\u00106\u001a\u00020\t2\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:2\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u001a\u0010;\u001a\u0002032\u0006\u0010<\u001a\u00020\t2\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u0010\u0010=\u001a\u0002032\u0006\u0010>\u001a\u00020?H\u0007J\u0010\u0010@\u001a\u0002032\u0006\u0010A\u001a\u00020?H\u0007J\u0010\u0010B\u001a\u0002032\u0006\u0010C\u001a\u00020DH\u0007J\u000e\u0010E\u001a\u0002032\u0006\u0010F\u001a\u00020GJ\u000e\u0010H\u001a\u0002032\u0006\u0010\u0006\u001a\u00020IJ\b\u0010J\u001a\u000203H\u0002J\u0010\u0010K\u001a\u0002032\u0006\u0010L\u001a\u00020*H\u0007J\b\u0010M\u001a\u00020NH\u0002J\u0010\u0010O\u001a\u0002032\u0006\u0010F\u001a\u00020GH\u0002J\u0014\u0010P\u001a\u0002032\n\u0010Q\u001a\u00060Rj\u0002`SH\u0002J\u0018\u0010T\u001a\u0002032\u0006\u0010U\u001a\u00020!2\u0006\u0010V\u001a\u00020!H\u0002J\b\u0010W\u001a\u000203H\u0002J\u000e\u0010X\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001aH\u0002J\f\u0010Y\u001a\u00020Z*\u00020\u0018H\u0002J\f\u0010[\u001a\u00020\\*\u00020\u001bH\u0002J\u0010\u0010]\u001a\u0002032\u0006\u0010^\u001a\u00020_H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001aX\u0082.¢\u0006\u0002\n\u0000R+\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020!8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u00020,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u0006c"}, d2 = {"Lcom/google/android/libraries/places/widget/PlaceDetailsCompactFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "viewModel", "Lcom/google/android/libraries/places/widget/internal/placedetails/PlaceDetailsViewModel;", "image", "Landroid/widget/ImageView;", "imageContainer", "Landroid/view/View;", "imageLoadingFailureText", "Landroid/widget/TextView;", "displayName", PlaceTypes.ADDRESS, "legalDisclosuresIcon", "openInMaps", "loadingProgressBar", "Landroid/widget/ProgressBar;", "loadingFailedMessage", "metadataViewController", "Lcom/google/android/libraries/places/widget/internal/placedetails/MetadataViewController;", "compactViewController", "Lcom/google/android/libraries/places/widget/internal/placedetails/PlaceDetailsCompactViewController;", "orientation", "Lcom/google/android/libraries/places/widget/model/Orientation;", "content", "", "Lcom/google/android/libraries/places/widget/PlaceDetailsCompactFragment$Content;", "analyticsReporter", "Lcom/google/android/libraries/places/widget/internal/placedetails/AnalyticsReporter;", "fieldsToLoad", "Lcom/google/android/libraries/places/api/model/Place$Field;", "<set-?>", "", "themeResId", "getThemeResId", "()I", "setThemeResId", "(I)V", "themeResId$delegate", "Lkotlin/properties/ReadWriteProperty;", "placeLoadListener", "Lcom/google/android/libraries/places/widget/PlaceLoadListener;", "hasSpaceForImage", "", "preferTruncation", "getPreferTruncation", "()Z", "setPreferTruncation", "(Z)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "loadWithPlaceId", "placeId", "", "loadWithResourceName", "resourceName", "loadWithCoordinates", "coordinates", "Lcom/google/android/gms/maps/model/LatLng;", "renderPlace", "place", "Lcom/google/android/libraries/places/api/model/Place;", "renderPlaceImage", "Lcom/google/android/libraries/places/widget/internal/placedetails/PlaceImage;", "showLoadingState", "setPlaceLoadListener", "listener", "createRequestConfigs", "Lcom/google/android/libraries/places/widget/internal/placedetails/PlaceDetailsViewModel$RequestConfiguration;", "updateUi", "onPlaceLoadFailed", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "setUpLegalDisclosures", "lineHeight", "color", "hideAllContent", "contentToPlaceFields", "toAnalyticsOrientation", "Lcom/google/common/logging/location/PlacesProto$PlaceDetailsWidgetProto$PlaceDetailsWidgetOrientation;", "toAnalyticsContent", "Lcom/google/common/logging/location/PlacesProto$PlaceDetailsWidgetProto$PlaceDetailsWidgetContent;", "setTestComponent", "component", "Lcom/google/android/libraries/places/widget/internal/inject/PlacesWidgetComponent;", "Content", "ParcelableContentList", "Companion", "java.com.google.android.libraries.places.widget_place_details_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlaceDetailsCompactFragment extends Fragment {
    private zzbi zzb;
    private ImageView zzc;
    private View zzd;
    private TextView zze;
    private TextView zzf;
    private ImageView zzg;
    private View zzh;
    private ProgressBar zzi;
    private TextView zzj;
    private com.google.android.libraries.places.widget.internal.placedetails.zzaa zzk;
    private com.google.android.libraries.places.widget.internal.placedetails.zzar zzl;
    private Orientation zzm;
    private List zzn;
    private com.google.android.libraries.places.widget.internal.placedetails.zzp zzo;
    private List zzp;
    private final ReadWriteProperty zzq = Delegates.f142874a.a();
    private PlaceLoadListener zzr;
    private boolean zzs;
    private boolean zzt;
    static final /* synthetic */ KProperty[] zza = {Reflection.f(new MutablePropertyReference1Impl(PlaceDetailsCompactFragment.class, "themeResId", "getThemeResId()I", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    public static final List<Content> STANDARD_CONTENT = CollectionsKt.p(Content.MEDIA, Content.RATING, Content.TYPE, Content.PRICE, Content.ACCESSIBLE_ENTRANCE_ICON, Content.OPEN_NOW_STATUS);

    @JvmField
    public static final List<Content> ALL_CONTENT = CollectionsKt.j1(Content.getEntries());

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0003\u0010\u0019\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0003R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0003R\u0016\u0010\f\u001a\u00020\b8\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0003R\u0016\u0010\u000e\u001a\u00020\b8\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0003R\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/google/android/libraries/places/widget/PlaceDetailsCompactFragment$Companion;", "", "<init>", "()V", "REVIEW_DISCLOSURE_MIN_TOUCH_TARGET_WIDTH_DP", "", "REVIEW_DISCLOSURE_MIN_TOUCH_TARGET_HEIGHT_DP", "RESOURCE_NAME_PREFIX", "", "getRESOURCE_NAME_PREFIX$annotations", "ARG_ORIENTATION", "getARG_ORIENTATION$annotations", "ARG_CONTENT", "getARG_CONTENT$annotations", "ARG_THEME_RES_ID", "getARG_THEME_RES_ID$annotations", "STANDARD_CONTENT", "", "Lcom/google/android/libraries/places/widget/PlaceDetailsCompactFragment$Content;", "ALL_CONTENT", "newInstance", "Lcom/google/android/libraries/places/widget/PlaceDetailsCompactFragment;", "content", "orientation", "Lcom/google/android/libraries/places/widget/model/Orientation;", "theme", "java.com.google.android.libraries.places.widget_place_details_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
            throw null;
        }

        @JvmStatic
        @JvmOverloads
        public final PlaceDetailsCompactFragment newInstance(@RecentlyNonNull List<? extends Content> content) {
            Intrinsics.j(content, "content");
            return newInstance$default(this, content, null, 0, 6, null);
        }

        public /* synthetic */ Companion(@RecentlyNonNull DefaultConstructorMarker defaultConstructorMarker) {
        }

        @RecentlyNonNull
        public static /* synthetic */ PlaceDetailsCompactFragment newInstance$default(@RecentlyNonNull Companion companion, @RecentlyNonNull List list, @RecentlyNonNull Orientation orientation, int i10, int i11, @RecentlyNonNull Object obj) {
            if ((i11 & 2) != 0) {
                orientation = Orientation.VERTICAL;
            }
            if ((i11 & 4) != 0) {
                i10 = R.style.PlacesMaterialTheme;
            }
            return companion.newInstance(list, orientation, i10);
        }

        @JvmStatic
        @JvmOverloads
        public final PlaceDetailsCompactFragment newInstance(@RecentlyNonNull List<? extends Content> content, @RecentlyNonNull Orientation orientation) {
            Intrinsics.j(content, "content");
            Intrinsics.j(orientation, "orientation");
            return newInstance$default(this, content, orientation, 0, 4, null);
        }

        @JvmStatic
        @JvmOverloads
        public final PlaceDetailsCompactFragment newInstance(@RecentlyNonNull List<? extends Content> content, @RecentlyNonNull Orientation orientation, int theme) {
            Intrinsics.j(content, "content");
            Intrinsics.j(orientation, "orientation");
            PlaceDetailsCompactFragment placeDetailsCompactFragment = new PlaceDetailsCompactFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("arg-orientation", orientation);
            bundle.putParcelable("arg-content", new zzk(content));
            bundle.putInt("arg-theme-res-id", theme);
            placeDetailsCompactFragment.setArguments(bundle);
            return placeDetailsCompactFragment;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/google/android/libraries/places/widget/PlaceDetailsCompactFragment$Content;", "", "<init>", "(Ljava/lang/String;I)V", "MEDIA", "ADDRESS", "RATING", "PRICE", "TYPE", "ACCESSIBLE_ENTRANCE_ICON", "OPEN_NOW_STATUS", "java.com.google.android.libraries.places.widget_place_details_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Content {

        @RecentlyNonNull
        public static final Content ACCESSIBLE_ENTRANCE_ICON;

        @RecentlyNonNull
        public static final Content ADDRESS;

        @RecentlyNonNull
        public static final Content MEDIA;

        @RecentlyNonNull
        public static final Content OPEN_NOW_STATUS;

        @RecentlyNonNull
        public static final Content PRICE;

        @RecentlyNonNull
        public static final Content RATING;

        @RecentlyNonNull
        public static final Content TYPE;
        private static final /* synthetic */ Content[] zza;
        private static final /* synthetic */ EnumEntries zzb;

        public static EnumEntries<Content> getEntries() {
            return zzb;
        }

        static {
            Content content = new Content("MEDIA", 0);
            MEDIA = content;
            Content content2 = new Content("ADDRESS", 1);
            ADDRESS = content2;
            Content content3 = new Content("RATING", 2);
            RATING = content3;
            Content content4 = new Content("PRICE", 3);
            PRICE = content4;
            Content content5 = new Content("TYPE", 4);
            TYPE = content5;
            Content content6 = new Content("ACCESSIBLE_ENTRANCE_ICON", 5);
            ACCESSIBLE_ENTRANCE_ICON = content6;
            Content content7 = new Content("OPEN_NOW_STATUS", 6);
            OPEN_NOW_STATUS = content7;
            Content[] contentArr = {content, content2, content3, content4, content5, content6, content7};
            zza = contentArr;
            zzb = EnumEntriesKt.a(contentArr);
        }

        @RecentlyNonNull
        public static Content valueOf(@RecentlyNonNull String str) {
            return (Content) Enum.valueOf(Content.class, str);
        }

        @RecentlyNonNull
        public static Content[] values() {
            return (Content[]) zza.clone();
        }

        private Content(String str, int i10) {
        }
    }

    @JvmStatic
    @JvmOverloads
    public static final PlaceDetailsCompactFragment newInstance(@RecentlyNonNull List<? extends Content> list) {
        return INSTANCE.newInstance(list);
    }

    /* renamed from: getPreferTruncation, reason: from getter */
    public final boolean getZzt() {
        return this.zzt;
    }

    public final void setPlaceLoadListener(@RecentlyNonNull PlaceLoadListener listener) {
        Intrinsics.j(listener, "listener");
        this.zzr = listener;
    }

    public final void setPreferTruncation(boolean z10) {
        this.zzt = z10;
    }

    @JvmStatic
    @JvmOverloads
    public static final PlaceDetailsCompactFragment newInstance(@RecentlyNonNull List<? extends Content> list, @RecentlyNonNull Orientation orientation) {
        return INSTANCE.newInstance(list, orientation);
    }

    public static final /* synthetic */ void zza(@RecentlyNonNull PlaceDetailsCompactFragment placeDetailsCompactFragment, @RecentlyNonNull Place place) {
        com.google.android.libraries.places.widget.internal.placedetails.zzaa zzaaVar;
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar;
        ProgressBar progressBar = placeDetailsCompactFragment.zzi;
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar2 = null;
        if (progressBar == null) {
            Intrinsics.y("loadingProgressBar");
            progressBar = null;
        }
        progressBar.setVisibility(8);
        com.google.android.libraries.places.widget.internal.placedetails.zzar zzarVar = placeDetailsCompactFragment.zzl;
        if (zzarVar == null) {
            Intrinsics.y("compactViewController");
            zzarVar = null;
        }
        zzarVar.zzb(place, placeDetailsCompactFragment.zzt);
        com.google.android.libraries.places.widget.internal.placedetails.zzaa zzaaVar2 = placeDetailsCompactFragment.zzk;
        if (zzaaVar2 == null) {
            Intrinsics.y("metadataViewController");
            zzaaVar = null;
        } else {
            zzaaVar = zzaaVar2;
        }
        List list = placeDetailsCompactFragment.zzn;
        if (list == null) {
            Intrinsics.y("content");
            list = null;
        }
        boolean zContains = list.contains(Content.RATING);
        List list2 = placeDetailsCompactFragment.zzn;
        if (list2 == null) {
            Intrinsics.y("content");
            list2 = null;
        }
        boolean zContains2 = list2.contains(Content.TYPE);
        List list3 = placeDetailsCompactFragment.zzn;
        if (list3 == null) {
            Intrinsics.y("content");
            list3 = null;
        }
        boolean zContains3 = list3.contains(Content.PRICE);
        List list4 = placeDetailsCompactFragment.zzn;
        if (list4 == null) {
            Intrinsics.y("content");
            list4 = null;
        }
        boolean zContains4 = list4.contains(Content.ACCESSIBLE_ENTRANCE_ICON);
        List list5 = placeDetailsCompactFragment.zzn;
        if (list5 == null) {
            Intrinsics.y("content");
            list5 = null;
        }
        boolean zContains5 = list5.contains(Content.OPEN_NOW_STATUS);
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar3 = placeDetailsCompactFragment.zzo;
        if (zzpVar3 == null) {
            Intrinsics.y("analyticsReporter");
            zzpVar = null;
        } else {
            zzpVar = zzpVar3;
        }
        zzaaVar.zza(place, zContains, zContains2, zContains3, zContains4, zContains5, zzpVar);
        com.google.android.libraries.places.widget.internal.placedetails.zzaa zzaaVar3 = placeDetailsCompactFragment.zzk;
        if (zzaaVar3 == null) {
            Intrinsics.y("metadataViewController");
            zzaaVar3 = null;
        }
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar4 = placeDetailsCompactFragment.zzo;
        if (zzpVar4 == null) {
            Intrinsics.y("analyticsReporter");
            zzpVar4 = null;
        }
        zzaaVar3.zzb(place, zzpVar4);
        Place.Builder builder = Place.builder();
        builder.setId(place.getId());
        builder.setViewport(place.getViewport());
        builder.setLocation(place.getLocation());
        Place placeBuild = builder.build();
        PlaceLoadListener placeLoadListener = placeDetailsCompactFragment.zzr;
        if (placeLoadListener != null) {
            Intrinsics.g(placeBuild);
            placeLoadListener.onSuccess(placeBuild);
        }
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar5 = placeDetailsCompactFragment.zzo;
        if (zzpVar5 == null) {
            Intrinsics.y("analyticsReporter");
        } else {
            zzpVar2 = zzpVar5;
        }
        zzpVar2.zzc();
    }

    public static final /* synthetic */ void zzb(@RecentlyNonNull PlaceDetailsCompactFragment placeDetailsCompactFragment, @RecentlyNonNull Exception exc) {
        ProgressBar progressBar = placeDetailsCompactFragment.zzi;
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar = null;
        if (progressBar == null) {
            Intrinsics.y("loadingProgressBar");
            progressBar = null;
        }
        progressBar.setVisibility(8);
        ImageView imageView = placeDetailsCompactFragment.zzc;
        if (imageView == null) {
            Intrinsics.y("image");
            imageView = null;
        }
        imageView.setVisibility(8);
        TextView textView = placeDetailsCompactFragment.zzj;
        if (textView == null) {
            Intrinsics.y("loadingFailedMessage");
            textView = null;
        }
        textView.setVisibility(0);
        PlaceLoadListener placeLoadListener = placeDetailsCompactFragment.zzr;
        if (placeLoadListener != null) {
            placeLoadListener.onFailure(exc);
        }
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar2 = placeDetailsCompactFragment.zzo;
        if (zzpVar2 == null) {
            Intrinsics.y("analyticsReporter");
        } else {
            zzpVar = zzpVar2;
        }
        zzpVar.zzd();
    }

    static /* synthetic */ Unit zzd(PlaceDetailsCompactFragment placeDetailsCompactFragment, zzbp zzbpVar) {
        com.google.android.libraries.places.widget.internal.placedetails.zzar zzarVar = placeDetailsCompactFragment.zzl;
        List list = null;
        if (zzarVar == null) {
            Intrinsics.y("compactViewController");
            zzarVar = null;
        }
        Intrinsics.g(zzbpVar);
        boolean z10 = placeDetailsCompactFragment.zzs;
        List list2 = placeDetailsCompactFragment.zzn;
        if (list2 == null) {
            Intrinsics.y("content");
        } else {
            list = list2;
        }
        zzarVar.zzc(zzbpVar, z10, list.contains(Content.MEDIA));
        return Unit.f142422a;
    }

    private final int zzf() {
        return ((Number) this.zzq.getValue(this, zza[0])).intValue();
    }

    private final zzbc zzg() {
        List list = this.zzn;
        List list2 = null;
        if (list == null) {
            Intrinsics.y("content");
            list = null;
        }
        boolean zContains = list.contains(Content.MEDIA);
        List list3 = this.zzp;
        if (list3 == null) {
            Intrinsics.y("fieldsToLoad");
        } else {
            list2 = list3;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        return zzbb.zza(zContains, list2, contextRequireContext);
    }

    private final void zzh() {
        ImageView imageView = this.zzc;
        com.google.android.libraries.places.widget.internal.placedetails.zzaa zzaaVar = null;
        if (imageView == null) {
            Intrinsics.y("image");
            imageView = null;
        }
        imageView.setVisibility(8);
        View view = this.zzd;
        if (view == null) {
            Intrinsics.y("imageContainer");
            view = null;
        }
        view.setVisibility(8);
        TextView textView = this.zze;
        if (textView == null) {
            Intrinsics.y("displayName");
            textView = null;
        }
        textView.setVisibility(8);
        TextView textView2 = this.zzf;
        if (textView2 == null) {
            Intrinsics.y(PlaceTypes.ADDRESS);
            textView2 = null;
        }
        textView2.setVisibility(8);
        View view2 = this.zzh;
        if (view2 == null) {
            Intrinsics.y("openInMaps");
            view2 = null;
        }
        view2.setVisibility(8);
        ProgressBar progressBar = this.zzi;
        if (progressBar == null) {
            Intrinsics.y("loadingProgressBar");
            progressBar = null;
        }
        progressBar.setVisibility(8);
        TextView textView3 = this.zzj;
        if (textView3 == null) {
            Intrinsics.y("loadingFailedMessage");
            textView3 = null;
        }
        textView3.setVisibility(8);
        com.google.android.libraries.places.widget.internal.placedetails.zzaa zzaaVar2 = this.zzk;
        if (zzaaVar2 == null) {
            Intrinsics.y("metadataViewController");
        } else {
            zzaaVar = zzaaVar2;
        }
        zzaaVar.zzc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzi(PlaceDetailsCompactFragment placeDetailsCompactFragment, View view) {
        Context contextRequireContext = placeDetailsCompactFragment.requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        int iZzf = placeDetailsCompactFragment.zzf();
        List list = placeDetailsCompactFragment.zzn;
        if (list == null) {
            Intrinsics.y("content");
            list = null;
        }
        new zzoo(contextRequireContext, iZzf, list.contains(Content.RATING) ? CollectionsKt.e(zzon.zza) : CollectionsKt.m()).show();
    }

    public final void loadWithCoordinates(@RecentlyNonNull LatLng coordinates) {
        Intrinsics.j(coordinates, "coordinates");
        zzbi zzbiVar = this.zzb;
        if (zzbiVar == null) {
            Intrinsics.y("viewModel");
            zzbiVar = null;
        }
        zzbiVar.zzg(coordinates, zzg());
    }

    public final void loadWithPlaceId(@RecentlyNonNull String placeId) {
        Intrinsics.j(placeId, "placeId");
        zzh();
        ProgressBar progressBar = this.zzi;
        zzbi zzbiVar = null;
        if (progressBar == null) {
            Intrinsics.y("loadingProgressBar");
            progressBar = null;
        }
        progressBar.setVisibility(0);
        zzbi zzbiVar2 = this.zzb;
        if (zzbiVar2 == null) {
            Intrinsics.y("viewModel");
        } else {
            zzbiVar = zzbiVar2;
        }
        zzbiVar.zzf(placeId, zzg());
    }

    public final void loadWithResourceName(@RecentlyNonNull String resourceName) {
        Intrinsics.j(resourceName, "resourceName");
        loadWithPlaceId(StringsKt.J0(resourceName, "place/"));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(@RecentlyNonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.j(inflater, "inflater");
        Bundle bundleRequireArguments = requireArguments();
        Intrinsics.i(bundleRequireArguments, "requireArguments(...)");
        Orientation orientation = (Orientation) zzof.zza(bundleRequireArguments, "arg-orientation", Orientation.class);
        this.zzm = orientation;
        Orientation orientation2 = null;
        if (orientation == null) {
            Intrinsics.y("orientation");
            orientation = null;
        }
        int i10 = orientation == Orientation.VERTICAL ? R.layout.place_details_compact_vertical_fragment : R.layout.place_details_compact_horizontal_fragment;
        Bundle bundleRequireArguments2 = requireArguments();
        Intrinsics.i(bundleRequireArguments2, "requireArguments(...)");
        this.zzn = ((zzk) zzof.zza(bundleRequireArguments2, "arg-content", zzk.class)).zza();
        zzbj zzbjVar = new zzbj();
        List list = this.zzn;
        if (list == null) {
            Intrinsics.y("content");
            list = null;
        }
        if (list.contains(Content.MEDIA)) {
            zzbjVar.zza();
        }
        List list2 = this.zzn;
        if (list2 == null) {
            Intrinsics.y("content");
            list2 = null;
        }
        if (list2.contains(Content.ADDRESS)) {
            zzbjVar.zzb();
        }
        List list3 = this.zzn;
        if (list3 == null) {
            Intrinsics.y("content");
            list3 = null;
        }
        if (list3.contains(Content.RATING)) {
            zzbjVar.zzc();
        }
        List list4 = this.zzn;
        if (list4 == null) {
            Intrinsics.y("content");
            list4 = null;
        }
        if (list4.contains(Content.PRICE)) {
            zzbjVar.zzd();
        }
        List list5 = this.zzn;
        if (list5 == null) {
            Intrinsics.y("content");
            list5 = null;
        }
        if (list5.contains(Content.TYPE)) {
            zzbjVar.zze();
        }
        List list6 = this.zzn;
        if (list6 == null) {
            Intrinsics.y("content");
            list6 = null;
        }
        if (list6.contains(Content.ACCESSIBLE_ENTRANCE_ICON)) {
            zzbjVar.zzf();
        }
        List list7 = this.zzn;
        if (list7 == null) {
            Intrinsics.y("content");
            list7 = null;
        }
        if (list7.contains(Content.OPEN_NOW_STATUS)) {
            zzbjVar.zzg();
        }
        this.zzp = zzbjVar.zzo();
        this.zzq.setValue(this, zza[0], Integer.valueOf(requireArguments().getInt("arg-theme-res-id")));
        final View viewInflate = inflater.cloneInContext(new ContextThemeWrapper(getContext(), zzf())).inflate(i10, container, false);
        Orientation orientation3 = this.zzm;
        if (orientation3 == null) {
            Intrinsics.y("orientation");
        } else {
            orientation2 = orientation3;
        }
        if (orientation2 == Orientation.HORIZONTAL) {
            viewInflate.post(new Runnable() { // from class: com.google.android.libraries.places.widget.zzn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    PlaceDetailsCompactFragment.zzc(viewInflate, this);
                }
            });
        } else {
            this.zzs = true;
        }
        Intrinsics.g(viewInflate);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@RecentlyNonNull View view, Bundle savedInstanceState) throws Resources.NotFoundException {
        zzaiw zzaiwVar;
        Intrinsics.j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.zzc = (ImageView) view.findViewById(R.id.place_image);
        this.zzd = view.findViewById(R.id.place_image_container);
        this.zze = (TextView) view.findViewById(R.id.place_name);
        this.zzf = (TextView) view.findViewById(R.id.place_address);
        this.zzg = (ImageView) view.findViewById(R.id.legal_disclosures_icon);
        this.zzh = view.findViewById(R.id.open_in_maps);
        this.zzi = (ProgressBar) view.findViewById(R.id.loading_indicator);
        this.zzj = (TextView) view.findViewById(R.id.loading_failed_message);
        zzoe zzoeVar = zzoe.zza;
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        int iZza = zzod.zza(contextRequireContext, zzf());
        TextView textView = (TextView) view.findViewById(R.id.place_details_attribution);
        textView.setTextColor(iZza);
        int lineHeight = textView.getLineHeight();
        ImageView imageView = this.zzg;
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar = null;
        if (imageView == null) {
            Intrinsics.y("legalDisclosuresIcon");
            imageView = null;
        }
        imageView.getLayoutParams().height = lineHeight;
        ImageView imageView2 = this.zzg;
        if (imageView2 == null) {
            Intrinsics.y("legalDisclosuresIcon");
            imageView2 = null;
        }
        imageView2.getLayoutParams().width = lineHeight;
        ImageView imageView3 = this.zzg;
        if (imageView3 == null) {
            Intrinsics.y("legalDisclosuresIcon");
            imageView3 = null;
        }
        imageView3.setColorFilter(iZza);
        ImageView imageView4 = this.zzg;
        if (imageView4 == null) {
            Intrinsics.y("legalDisclosuresIcon");
            imageView4 = null;
        }
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zzm
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view2) {
                PlaceDetailsCompactFragment.zzi(this.zza, view2);
            }
        });
        float f10 = requireContext().getResources().getDisplayMetrics().density;
        Rect rect = new Rect();
        ImageView imageView5 = this.zzg;
        if (imageView5 == null) {
            Intrinsics.y("legalDisclosuresIcon");
            imageView5 = null;
        }
        imageView5.getHitRect(rect);
        float fHeight = rect.height() / f10;
        float fWidth = rect.width() / f10;
        int i10 = fHeight < 24.0f ? (int) (((24.0f - fHeight) * f10) / 2.0f) : 0;
        int i11 = fWidth < 48.0f ? (int) (((48.0f - fWidth) * f10) / 2.0f) : 0;
        rect.set(rect.left - i11, rect.top - i10, rect.right + i11, rect.bottom + i10);
        View viewRequireView = requireView();
        ImageView imageView6 = this.zzg;
        if (imageView6 == null) {
            Intrinsics.y("legalDisclosuresIcon");
            imageView6 = null;
        }
        viewRequireView.setTouchDelegate(new TouchDelegate(rect, imageView6));
        Context contextRequireContext2 = requireContext();
        Intrinsics.i(contextRequireContext2, "requireContext(...)");
        int iZzf = zzf();
        zzbi zzbiVar = this.zzb;
        if (zzbiVar == null) {
            Intrinsics.y("viewModel");
            zzbiVar = null;
        }
        zzoy zzoyVarZze = zzbiVar.zze();
        this.zzk = new com.google.android.libraries.places.widget.internal.placedetails.zzaa(view, contextRequireContext2, iZzf, zzoyVarZze != null ? zzoyVarZze.zzb() : null);
        Context contextRequireContext3 = requireContext();
        Intrinsics.i(contextRequireContext3, "requireContext(...)");
        zzbi zzbiVar2 = this.zzb;
        if (zzbiVar2 == null) {
            Intrinsics.y("viewModel");
            zzbiVar2 = null;
        }
        zzoy zzoyVarZze2 = zzbiVar2.zze();
        AbstractC6024m abstractC6024mA = C6031t.a(this);
        int iZzf2 = zzf();
        Orientation orientation = this.zzm;
        if (orientation == null) {
            Intrinsics.y("orientation");
            orientation = null;
        }
        com.google.android.libraries.places.widget.internal.placedetails.zzar zzarVar = new com.google.android.libraries.places.widget.internal.placedetails.zzar(view, contextRequireContext3, zzoyVarZze2, abstractC6024mA, iZzf2, orientation);
        this.zzl = zzarVar;
        zzarVar.zza();
        zzh();
        zzajb zzajbVar = zzajb.VARIANT_COMPACT;
        Orientation orientation2 = this.zzm;
        if (orientation2 == null) {
            Intrinsics.y("orientation");
            orientation2 = null;
        }
        zzaiz zzaizVar = orientation2 == Orientation.VERTICAL ? zzaiz.ORIENTATION_VERTICAL : zzaiz.ORIENTATION_HORIZONTAL;
        List list = this.zzn;
        if (list == null) {
            Intrinsics.y("content");
            list = null;
        }
        List<Content> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
        for (Content content : list2) {
            Content content2 = Content.MEDIA;
            switch (content.ordinal()) {
                case 0:
                    zzaiwVar = zzaiw.PHOTO;
                    break;
                case 1:
                    zzaiwVar = zzaiw.ADDRESS;
                    break;
                case 2:
                    zzaiwVar = zzaiw.RATING;
                    break;
                case 3:
                    zzaiwVar = zzaiw.PRICE;
                    break;
                case 4:
                    zzaiwVar = zzaiw.TYPE;
                    break;
                case 5:
                    zzaiwVar = zzaiw.ACCESSIBILITY;
                    break;
                case 6:
                    zzaiwVar = zzaiw.OPEN_NOW_STATUS;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(zzaiwVar);
        }
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar2 = new com.google.android.libraries.places.widget.internal.placedetails.zzp(zzajbVar, zzaizVar, arrayList);
        this.zzo = zzpVar2;
        zzbi zzbiVar3 = this.zzb;
        if (zzbiVar3 == null) {
            Intrinsics.y("viewModel");
            zzbiVar3 = null;
        }
        zzpVar2.zza(zzbiVar3.zzi());
        zzbi zzbiVar4 = this.zzb;
        if (zzbiVar4 == null) {
            Intrinsics.y("viewModel");
            zzbiVar4 = null;
        }
        zzbiVar4.zza().i(getViewLifecycleOwner(), new zzq(new zzo(this)));
        zzbi zzbiVar5 = this.zzb;
        if (zzbiVar5 == null) {
            Intrinsics.y("viewModel");
            zzbiVar5 = null;
        }
        zzbiVar5.zzb().i(getViewLifecycleOwner(), new zzq(new zzp(this)));
        zzbi zzbiVar6 = this.zzb;
        if (zzbiVar6 == null) {
            Intrinsics.y("viewModel");
            zzbiVar6 = null;
        }
        ((AbstractC5985A) zzbiVar6.zzc().get(0)).i(getViewLifecycleOwner(), new zzq(new Function1() { // from class: com.google.android.libraries.places.widget.zzl
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj) {
                return PlaceDetailsCompactFragment.zzd(this.zza, (zzbp) obj);
            }
        }));
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar3 = this.zzo;
        if (zzpVar3 == null) {
            Intrinsics.y("analyticsReporter");
        } else {
            zzpVar = zzpVar3;
        }
        zzpVar.zzb();
    }

    @JvmStatic
    @JvmOverloads
    public static final PlaceDetailsCompactFragment newInstance(@RecentlyNonNull List<? extends Content> list, @RecentlyNonNull Orientation orientation, int i10) {
        return INSTANCE.newInstance(list, orientation, i10);
    }

    static /* synthetic */ void zzc(View view, PlaceDetailsCompactFragment placeDetailsCompactFragment) {
        boolean z10;
        if (view.getMeasuredWidth() / placeDetailsCompactFragment.requireContext().getResources().getDisplayMetrics().density >= 350.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        placeDetailsCompactFragment.zzs = z10;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Application application = requireActivity().getApplication();
        Intrinsics.i(application, "getApplication(...)");
        this.zzb = (zzbi) new f0(this, com.google.android.libraries.places.widget.internal.placedetails.zzat.zza(application)).a(zzbi.class);
    }
}
