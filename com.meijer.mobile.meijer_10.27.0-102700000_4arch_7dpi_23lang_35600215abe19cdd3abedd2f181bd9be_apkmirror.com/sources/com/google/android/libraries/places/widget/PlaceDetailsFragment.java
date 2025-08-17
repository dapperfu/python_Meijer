package com.google.android.libraries.places.widget;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.RecentlyNonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.view.AbstractC5985A;
import androidx.view.AbstractC6023l;
import androidx.view.C6031t;
import androidx.view.f0;
import androidx.viewpager2.widget.ViewPager2;
import com.fullstory.FS;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.internal.zzaiw;
import com.google.android.libraries.places.internal.zzaiz;
import com.google.android.libraries.places.internal.zzajb;
import com.google.android.libraries.places.internal.zzod;
import com.google.android.libraries.places.internal.zzoe;
import com.google.android.libraries.places.internal.zzof;
import com.google.android.libraries.places.internal.zzon;
import com.google.android.libraries.places.internal.zzoo;
import com.google.android.libraries.places.internal.zzoy;
import com.google.android.libraries.places.widget.internal.photoviewer.PlacesLightboxActivity;
import com.google.android.libraries.places.widget.internal.placedetails.zzbb;
import com.google.android.libraries.places.widget.internal.placedetails.zzbc;
import com.google.android.libraries.places.widget.internal.placedetails.zzbi;
import com.google.android.libraries.places.widget.internal.placedetails.zzbj;
import com.google.android.libraries.places.widget.internal.placedetails.zzbk;
import com.google.android.libraries.places.widget.internal.placedetails.zzbl;
import com.google.android.libraries.places.widget.internal.placedetails.zzbm;
import com.google.android.libraries.places.widget.internal.placedetails.zzbn;
import com.google.android.libraries.places.widget.internal.placedetails.zzbo;
import com.google.android.libraries.places.widget.internal.placedetails.zzbp;
import com.google.android.libraries.places.widget.internal.placedetails.zzcf;
import com.google.android.libraries.places.widget.model.Orientation;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.d;
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
import qv.C16648k;

@Metadata(d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 x2\u00020\u0001:\u0003vwxB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J$\u0010<\u001a\u00020\u00052\u0006\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@2\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u001a\u0010A\u001a\u0002092\u0006\u0010B\u001a\u00020\u00052\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\b\u0010C\u001a\u000209H\u0002J\u0010\u0010D\u001a\u0002092\u0006\u0010E\u001a\u00020FH\u0007J\u0010\u0010G\u001a\u0002092\u0006\u0010H\u001a\u00020FH\u0007J\u0010\u0010I\u001a\u0002092\u0006\u0010J\u001a\u00020KH\u0007J\u0010\u0010L\u001a\u0002092\u0006\u0010M\u001a\u00020.H\u0007J\b\u0010N\u001a\u00020OH\u0002J\b\u0010P\u001a\u000209H\u0002J\b\u0010Q\u001a\u000209H\u0002J\u0010\u0010T\u001a\u0002092\u0006\u0010U\u001a\u000200H\u0002J\u0010\u0010V\u001a\u0002092\u0006\u0010W\u001a\u00020XH\u0002J\b\u0010Y\u001a\u000209H\u0002J\u0014\u0010Z\u001a\u0002092\n\u0010[\u001a\u00060\\j\u0002`]H\u0002J\"\u0010^\u001a\u0002092\u0006\u0010B\u001a\u00020\u00052\b\u0010_\u001a\u0004\u0018\u00010`2\u0006\u0010a\u001a\u00020bH\u0002J1\u0010c\u001a\u0002092\u0006\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020\b2\u0012\u0010g\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050h\"\u00020\u0005H\u0002¢\u0006\u0002\u0010iJ\u0010\u0010j\u001a\u0002092\u0006\u0010f\u001a\u00020\bH\u0002J\u000e\u0010k\u001a\b\u0012\u0004\u0012\u00020*0%H\u0002J\u0010\u0010l\u001a\u0002092\u0006\u0010W\u001a\u00020XH\u0002J\b\u0010m\u001a\u000209H\u0002J\u0010\u0010n\u001a\u0002092\u0006\u0010B\u001a\u00020\u0005H\u0002J\f\u0010o\u001a\u00020p*\u00020#H\u0002J\f\u0010q\u001a\u00020r*\u00020&H\u0002J\u0010\u0010s\u001a\u0002092\u0006\u0010t\u001a\u00020uH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020*0%X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R+\u00101\u001a\u0002002\u0006\u0010/\u001a\u0002008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u000e\u0010R\u001a\u00020SX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006y"}, d2 = {"Lcom/google/android/libraries/places/widget/PlaceDetailsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "collageLayout", "Landroid/view/View;", "collageCardView", "image", "Landroid/widget/ImageView;", "image2", "image3", "displayName", "Landroid/widget/TextView;", "summary", "summaryAndTabsDivider", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "tabsAndTabContentDivider", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "pagerAdapter", "Lcom/google/android/libraries/places/widget/internal/placedetails/TabsPagerAdapter;", "loadingProgressBar", "Landroid/widget/ProgressBar;", "loadingFailedMessage", "metadataViewController", "Lcom/google/android/libraries/places/widget/internal/placedetails/MetadataViewController;", "attributionImage", "legalDisclosuresIcon", "numberOfPhotosChipLabel", "numberOfPhotosChip", "loadFailureUi", "image2CardView", "image3CardView", "orientation", "Lcom/google/android/libraries/places/widget/model/Orientation;", "content", "", "Lcom/google/android/libraries/places/widget/PlaceDetailsFragment$Content;", "analyticsReporter", "Lcom/google/android/libraries/places/widget/internal/placedetails/AnalyticsReporter;", "fieldsToLoad", "Lcom/google/android/libraries/places/api/model/Place$Field;", "viewModel", "Lcom/google/android/libraries/places/widget/internal/placedetails/PlaceDetailsViewModel;", "_placeLoadListener", "Lcom/google/android/libraries/places/widget/PlaceLoadListener;", "<set-?>", "", "themeResId", "getThemeResId", "()I", "setThemeResId", "(I)V", "themeResId$delegate", "Lkotlin/properties/ReadWriteProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "updateNumberOfPhotosChipLabel", "loadWithPlaceId", "placeId", "", "loadWithResourceName", "resourceName", "loadWithCoordinates", "coordinates", "Lcom/google/android/gms/maps/model/LatLng;", "setPlaceLoadListener", "listener", "createRequestConfigs", "Lcom/google/android/libraries/places/widget/internal/placedetails/PlaceDetailsViewModel$RequestConfiguration;", "showLoadingState", "updateImageButton", "onClickListener", "Landroid/view/View$OnClickListener;", "startPhotoPager", "index", "updateUi", "place", "Lcom/google/android/libraries/places/api/model/Place;", "hideAllContent", "onPlaceLoadFailed", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "setContent", "text", "", "contentSelected", "", "updateImage", "placeImage", "Lcom/google/android/libraries/places/widget/internal/placedetails/PlaceImage;", "imageView", "wrapperViews", "", "(Lcom/google/android/libraries/places/widget/internal/placedetails/PlaceImage;Landroid/widget/ImageView;[Landroid/view/View;)V", "handleFailureForViewTarget", "contentToPlaceFields", "setUpTabs", "onTabsContentUpdated", "updatePagerViewHeight", "toAnalyticsOrientation", "Lcom/google/common/logging/location/PlacesProto$PlaceDetailsWidgetProto$PlaceDetailsWidgetOrientation;", "toAnalyticsContent", "Lcom/google/common/logging/location/PlacesProto$PlaceDetailsWidgetProto$PlaceDetailsWidgetContent;", "setTestComponent", "component", "Lcom/google/android/libraries/places/widget/internal/inject/PlacesWidgetComponent;", "Content", "ParcelableContentList", "Companion", "java.com.google.android.libraries.places.widget_place_details_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlaceDetailsFragment extends Fragment {
    private List zzA;
    private zzbi zzB;
    private PlaceLoadListener zzC;
    private final ReadWriteProperty zzD = Delegates.f142874a.a();
    private final View.OnClickListener zzE = new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zzab
        @Override // android.view.View.OnClickListener
        public final /* synthetic */ void onClick(View view) {
            PlaceDetailsFragment.zzf(this.zza, view);
        }
    };
    private View zzb;
    private View zzc;
    private ImageView zzd;
    private ImageView zze;
    private ImageView zzf;
    private TextView zzg;
    private TextView zzh;
    private View zzi;
    private TabLayout zzj;
    private View zzk;
    private ViewPager2 zzl;
    private zzcf zzm;
    private ProgressBar zzn;
    private TextView zzo;
    private com.google.android.libraries.places.widget.internal.placedetails.zzaa zzp;
    private ImageView zzq;
    private ImageView zzr;
    private TextView zzs;
    private View zzt;
    private View zzu;
    private View zzv;
    private View zzw;
    private Orientation zzx;
    private List zzy;
    private com.google.android.libraries.places.widget.internal.placedetails.zzp zzz;
    static final /* synthetic */ KProperty[] zza = {Reflection.f(new MutablePropertyReference1Impl(PlaceDetailsFragment.class, "themeResId", "getThemeResId()I", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    public static final List<Content> STANDARD_CONTENT = CollectionsKt.p(Content.MEDIA, Content.ADDRESS, Content.RATING, Content.TYPE, Content.PRICE, Content.ACCESSIBLE_ENTRANCE_ICON, Content.SUMMARY, Content.OPENING_HOURS, Content.WEBSITE, Content.PHONE_NUMBER, Content.TYPE_SPECIFIC_HIGHLIGHTS, Content.REVIEWS, Content.FEATURES);

    @JvmField
    public static final List<Content> ALL_CONTENT = CollectionsKt.j1(Content.getEntries());

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0003\u0010\u0018\u001a\u00020\u0019H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0003R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0003R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0003R\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/google/android/libraries/places/widget/PlaceDetailsFragment$Companion;", "", "<init>", "()V", "TAG", "", "VIEW_PAGER_FRAGMENT_TAG_PREFIX", "RESOURCE_NAME_PREFIX", "getRESOURCE_NAME_PREFIX$annotations", "ARG_ORIENTATION", "getARG_ORIENTATION$annotations", "ARG_CONTENT", "getARG_CONTENT$annotations", "ARG_THEME_RES_ID", "getARG_THEME_RES_ID$annotations", "STANDARD_CONTENT", "", "Lcom/google/android/libraries/places/widget/PlaceDetailsFragment$Content;", "ALL_CONTENT", "newInstance", "Lcom/google/android/libraries/places/widget/PlaceDetailsFragment;", "content", "orientation", "Lcom/google/android/libraries/places/widget/model/Orientation;", "theme", "", "java.com.google.android.libraries.places.widget_place_details_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
            throw null;
        }

        @JvmStatic
        @JvmOverloads
        public final PlaceDetailsFragment newInstance(@RecentlyNonNull List<? extends Content> content) {
            Intrinsics.j(content, "content");
            return newInstance$default(this, content, null, 0, 6, null);
        }

        public /* synthetic */ Companion(@RecentlyNonNull DefaultConstructorMarker defaultConstructorMarker) {
        }

        @RecentlyNonNull
        public static /* synthetic */ PlaceDetailsFragment newInstance$default(@RecentlyNonNull Companion companion, @RecentlyNonNull List list, @RecentlyNonNull Orientation orientation, int i10, int i11, @RecentlyNonNull Object obj) {
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
        public final PlaceDetailsFragment newInstance(@RecentlyNonNull List<? extends Content> content, @RecentlyNonNull Orientation orientation) {
            Intrinsics.j(content, "content");
            Intrinsics.j(orientation, "orientation");
            return newInstance$default(this, content, orientation, 0, 4, null);
        }

        @JvmStatic
        @JvmOverloads
        public final PlaceDetailsFragment newInstance(@RecentlyNonNull List<? extends Content> content, @RecentlyNonNull Orientation orientation, int theme) {
            Intrinsics.j(content, "content");
            Intrinsics.j(orientation, "orientation");
            PlaceDetailsFragment placeDetailsFragment = new PlaceDetailsFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("arg-content", new zzs(content));
            bundle.putParcelable("arg-orientation", orientation);
            bundle.putInt("arg-theme-res-id", theme);
            placeDetailsFragment.setArguments(bundle);
            return placeDetailsFragment;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/google/android/libraries/places/widget/PlaceDetailsFragment$Content;", "", "<init>", "(Ljava/lang/String;I)V", "MEDIA", "ADDRESS", "RATING", "PRICE", "TYPE", "ACCESSIBLE_ENTRANCE_ICON", "OPEN_NOW_STATUS", "SUMMARY", "OPENING_HOURS", "WEBSITE", "PHONE_NUMBER", "TYPE_SPECIFIC_HIGHLIGHTS", "REVIEWS", "PLUS_CODE", "FEATURES", "java.com.google.android.libraries.places.widget_place_details_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Content {

        @RecentlyNonNull
        public static final Content ACCESSIBLE_ENTRANCE_ICON;

        @RecentlyNonNull
        public static final Content ADDRESS;

        @RecentlyNonNull
        public static final Content FEATURES;

        @RecentlyNonNull
        public static final Content MEDIA;

        @RecentlyNonNull
        public static final Content OPENING_HOURS;

        @RecentlyNonNull
        public static final Content OPEN_NOW_STATUS;

        @RecentlyNonNull
        public static final Content PHONE_NUMBER;

        @RecentlyNonNull
        public static final Content PLUS_CODE;

        @RecentlyNonNull
        public static final Content PRICE;

        @RecentlyNonNull
        public static final Content RATING;

        @RecentlyNonNull
        public static final Content REVIEWS;

        @RecentlyNonNull
        public static final Content SUMMARY;

        @RecentlyNonNull
        public static final Content TYPE;

        @RecentlyNonNull
        public static final Content TYPE_SPECIFIC_HIGHLIGHTS;

        @RecentlyNonNull
        public static final Content WEBSITE;
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
            Content content8 = new Content("SUMMARY", 7);
            SUMMARY = content8;
            Content content9 = new Content("OPENING_HOURS", 8);
            OPENING_HOURS = content9;
            Content content10 = new Content("WEBSITE", 9);
            WEBSITE = content10;
            Content content11 = new Content("PHONE_NUMBER", 10);
            PHONE_NUMBER = content11;
            Content content12 = new Content("TYPE_SPECIFIC_HIGHLIGHTS", 11);
            TYPE_SPECIFIC_HIGHLIGHTS = content12;
            Content content13 = new Content("REVIEWS", 12);
            REVIEWS = content13;
            Content content14 = new Content("PLUS_CODE", 13);
            PLUS_CODE = content14;
            Content content15 = new Content("FEATURES", 14);
            FEATURES = content15;
            Content[] contentArr = {content, content2, content3, content4, content5, content6, content7, content8, content9, content10, content11, content12, content13, content14, content15};
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
    public static final PlaceDetailsFragment newInstance(@RecentlyNonNull List<? extends Content> list) {
        return INSTANCE.newInstance(list);
    }

    public final void setPlaceLoadListener(@RecentlyNonNull PlaceLoadListener listener) {
        Intrinsics.j(listener, "listener");
        this.zzC = listener;
    }

    @JvmStatic
    @JvmOverloads
    public static final PlaceDetailsFragment newInstance(@RecentlyNonNull List<? extends Content> list, @RecentlyNonNull Orientation orientation) {
        return INSTANCE.newInstance(list, orientation);
    }

    public static final /* synthetic */ void zza(@RecentlyNonNull final PlaceDetailsFragment placeDetailsFragment, @RecentlyNonNull Place place) {
        com.google.android.libraries.places.widget.internal.placedetails.zzaa zzaaVar;
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar;
        ProgressBar progressBar = placeDetailsFragment.zzn;
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar2 = null;
        if (progressBar == null) {
            Intrinsics.y("loadingProgressBar");
            progressBar = null;
        }
        progressBar.setVisibility(8);
        TextView textView = placeDetailsFragment.zzg;
        if (textView == null) {
            Intrinsics.y("displayName");
            textView = null;
        }
        placeDetailsFragment.zzt(textView, place.getDisplayName(), true);
        com.google.android.libraries.places.widget.internal.placedetails.zzaa zzaaVar2 = placeDetailsFragment.zzp;
        if (zzaaVar2 == null) {
            Intrinsics.y("metadataViewController");
            zzaaVar = null;
        } else {
            zzaaVar = zzaaVar2;
        }
        List list = placeDetailsFragment.zzy;
        if (list == null) {
            Intrinsics.y("content");
            list = null;
        }
        boolean zContains = list.contains(Content.RATING);
        List list2 = placeDetailsFragment.zzy;
        if (list2 == null) {
            Intrinsics.y("content");
            list2 = null;
        }
        boolean zContains2 = list2.contains(Content.TYPE);
        List list3 = placeDetailsFragment.zzy;
        if (list3 == null) {
            Intrinsics.y("content");
            list3 = null;
        }
        boolean zContains3 = list3.contains(Content.PRICE);
        List list4 = placeDetailsFragment.zzy;
        if (list4 == null) {
            Intrinsics.y("content");
            list4 = null;
        }
        boolean zContains4 = list4.contains(Content.ACCESSIBLE_ENTRANCE_ICON);
        List list5 = placeDetailsFragment.zzy;
        if (list5 == null) {
            Intrinsics.y("content");
            list5 = null;
        }
        boolean zContains5 = list5.contains(Content.OPEN_NOW_STATUS);
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar3 = placeDetailsFragment.zzz;
        if (zzpVar3 == null) {
            Intrinsics.y("analyticsReporter");
            zzpVar = null;
        } else {
            zzpVar = zzpVar3;
        }
        zzaaVar.zza(place, zContains, zContains2, zContains3, zContains4, zContains5, zzpVar);
        com.google.android.libraries.places.widget.internal.placedetails.zzaa zzaaVar3 = placeDetailsFragment.zzp;
        if (zzaaVar3 == null) {
            Intrinsics.y("metadataViewController");
            zzaaVar3 = null;
        }
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar4 = placeDetailsFragment.zzz;
        if (zzpVar4 == null) {
            Intrinsics.y("analyticsReporter");
            zzpVar4 = null;
        }
        zzaaVar3.zzb(place, zzpVar4);
        TextView textView2 = placeDetailsFragment.zzh;
        if (textView2 == null) {
            Intrinsics.y("summary");
            textView2 = null;
        }
        String editorialSummary = place.getEditorialSummary();
        List list6 = placeDetailsFragment.zzy;
        if (list6 == null) {
            Intrinsics.y("content");
            list6 = null;
        }
        placeDetailsFragment.zzt(textView2, editorialSummary, list6.contains(Content.SUMMARY));
        FragmentManager childFragmentManager = placeDetailsFragment.getChildFragmentManager();
        Intrinsics.i(childFragmentManager, "getChildFragmentManager(...)");
        AbstractC6023l lifecycle = placeDetailsFragment.getLifecycle();
        Intrinsics.i(lifecycle, "<get-lifecycle>(...)");
        Context contextRequireContext = placeDetailsFragment.requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        List list7 = placeDetailsFragment.zzy;
        if (list7 == null) {
            Intrinsics.y("content");
            list7 = null;
        }
        boolean zContains6 = list7.contains(Content.FEATURES);
        List list8 = placeDetailsFragment.zzy;
        if (list8 == null) {
            Intrinsics.y("content");
            list8 = null;
        }
        placeDetailsFragment.zzm = new zzcf(childFragmentManager, lifecycle, contextRequireContext, zContains6, list8.contains(Content.OPENING_HOURS), place, placeDetailsFragment.zzo());
        ViewPager2 viewPager2 = placeDetailsFragment.zzl;
        if (viewPager2 == null) {
            Intrinsics.y("viewPager");
            viewPager2 = null;
        }
        zzcf zzcfVar = placeDetailsFragment.zzm;
        if (zzcfVar == null) {
            Intrinsics.y("pagerAdapter");
            zzcfVar = null;
        }
        viewPager2.setAdapter(zzcfVar);
        ViewPager2 viewPager22 = placeDetailsFragment.zzl;
        if (viewPager22 == null) {
            Intrinsics.y("viewPager");
            viewPager22 = null;
        }
        viewPager22.g(new zzaf(placeDetailsFragment));
        zzcf zzcfVar2 = placeDetailsFragment.zzm;
        if (zzcfVar2 == null) {
            Intrinsics.y("pagerAdapter");
            zzcfVar2 = null;
        }
        int totalNumberOfTabs = zzcfVar2.getTotalNumberOfTabs();
        if (totalNumberOfTabs < 2) {
            TabLayout tabLayout = placeDetailsFragment.zzj;
            if (tabLayout == null) {
                Intrinsics.y("tabLayout");
                tabLayout = null;
            }
            tabLayout.setVisibility(8);
            View view = placeDetailsFragment.zzk;
            if (view == null) {
                Intrinsics.y("tabsAndTabContentDivider");
                view = null;
            }
            view.setVisibility(8);
        } else {
            TabLayout tabLayout2 = placeDetailsFragment.zzj;
            if (tabLayout2 == null) {
                Intrinsics.y("tabLayout");
                tabLayout2 = null;
            }
            tabLayout2.setVisibility(0);
            View view2 = placeDetailsFragment.zzk;
            if (view2 == null) {
                Intrinsics.y("tabsAndTabContentDivider");
                view2 = null;
            }
            view2.setVisibility(0);
        }
        if (totalNumberOfTabs == 0) {
            ViewPager2 viewPager23 = placeDetailsFragment.zzl;
            if (viewPager23 == null) {
                Intrinsics.y("viewPager");
                viewPager23 = null;
            }
            viewPager23.setVisibility(8);
            View view3 = placeDetailsFragment.zzi;
            if (view3 == null) {
                Intrinsics.y("summaryAndTabsDivider");
                view3 = null;
            }
            view3.setVisibility(8);
        } else {
            ViewPager2 viewPager24 = placeDetailsFragment.zzl;
            if (viewPager24 == null) {
                Intrinsics.y("viewPager");
                viewPager24 = null;
            }
            viewPager24.setVisibility(0);
            View view4 = placeDetailsFragment.zzi;
            if (view4 == null) {
                Intrinsics.y("summaryAndTabsDivider");
                view4 = null;
            }
            view4.setVisibility(0);
        }
        TabLayout tabLayout3 = placeDetailsFragment.zzj;
        if (tabLayout3 == null) {
            Intrinsics.y("tabLayout");
            tabLayout3 = null;
        }
        ViewPager2 viewPager25 = placeDetailsFragment.zzl;
        if (viewPager25 == null) {
            Intrinsics.y("viewPager");
            viewPager25 = null;
        }
        new d(tabLayout3, viewPager25, new d.b() { // from class: com.google.android.libraries.places.widget.zzz
            @Override // com.google.android.material.tabs.d.b
            public final /* synthetic */ void onConfigureTab(TabLayout.f fVar, int i10) {
                PlaceDetailsFragment.zzm(this.zza, fVar, i10);
            }
        }).a();
        ImageView imageView = placeDetailsFragment.zzd;
        if (imageView == null) {
            Intrinsics.y("image");
            imageView = null;
        }
        View.OnClickListener onClickListener = placeDetailsFragment.zzE;
        imageView.setOnClickListener(onClickListener);
        ImageView imageView2 = placeDetailsFragment.zze;
        if (imageView2 == null) {
            Intrinsics.y("image2");
            imageView2 = null;
        }
        imageView2.setOnClickListener(onClickListener);
        ImageView imageView3 = placeDetailsFragment.zzf;
        if (imageView3 == null) {
            Intrinsics.y("image3");
            imageView3 = null;
        }
        imageView3.setOnClickListener(onClickListener);
        Place.Builder builder = Place.builder();
        builder.setId(place.getId());
        builder.setViewport(place.getViewport());
        builder.setLocation(place.getLocation());
        Place placeBuild = builder.build();
        PlaceLoadListener placeLoadListener = placeDetailsFragment.zzC;
        if (placeLoadListener != null) {
            Intrinsics.g(placeBuild);
            placeLoadListener.onSuccess(placeBuild);
        }
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar5 = placeDetailsFragment.zzz;
        if (zzpVar5 == null) {
            Intrinsics.y("analyticsReporter");
        } else {
            zzpVar2 = zzpVar5;
        }
        zzpVar2.zzc();
    }

    public static final /* synthetic */ void zzb(@RecentlyNonNull PlaceDetailsFragment placeDetailsFragment, @RecentlyNonNull Exception exc) {
        ProgressBar progressBar = placeDetailsFragment.zzn;
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar = null;
        if (progressBar == null) {
            Intrinsics.y("loadingProgressBar");
            progressBar = null;
        }
        progressBar.setVisibility(8);
        View view = placeDetailsFragment.zzb;
        if (view == null) {
            Intrinsics.y("collageLayout");
            view = null;
        }
        view.setVisibility(8);
        TextView textView = placeDetailsFragment.zzo;
        if (textView == null) {
            Intrinsics.y("loadingFailedMessage");
            textView = null;
        }
        textView.setVisibility(0);
        PlaceLoadListener placeLoadListener = placeDetailsFragment.zzC;
        if (placeLoadListener != null) {
            placeLoadListener.onFailure(exc);
        }
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar2 = placeDetailsFragment.zzz;
        if (zzpVar2 == null) {
            Intrinsics.y("analyticsReporter");
        } else {
            zzpVar = zzpVar2;
        }
        zzpVar.zzd();
    }

    public static final /* synthetic */ void zze(@RecentlyNonNull PlaceDetailsFragment placeDetailsFragment, @RecentlyNonNull ImageView imageView) {
        ImageView imageView2 = placeDetailsFragment.zzd;
        View view = null;
        if (imageView2 == null) {
            Intrinsics.y("image");
            imageView2 = null;
        }
        if (Intrinsics.e(imageView, imageView2)) {
            View view2 = placeDetailsFragment.zzu;
            if (view2 == null) {
                Intrinsics.y("loadFailureUi");
                view2 = null;
            }
            view2.setVisibility(0);
            View view3 = placeDetailsFragment.zzv;
            if (view3 == null) {
                Intrinsics.y("image2CardView");
                view3 = null;
            }
            view3.setVisibility(8);
            View view4 = placeDetailsFragment.zzw;
            if (view4 == null) {
                Intrinsics.y("image3CardView");
            } else {
                view = view4;
            }
            view.setVisibility(8);
            return;
        }
        ImageView imageView3 = placeDetailsFragment.zze;
        if (imageView3 == null) {
            Intrinsics.y("image2");
            imageView3 = null;
        }
        if (Intrinsics.e(imageView, imageView3)) {
            View view5 = placeDetailsFragment.zzv;
            if (view5 == null) {
                Intrinsics.y("image2CardView");
                view5 = null;
            }
            view5.setVisibility(8);
            View view6 = placeDetailsFragment.zzw;
            if (view6 == null) {
                Intrinsics.y("image3CardView");
            } else {
                view = view6;
            }
            view.setVisibility(8);
            return;
        }
        ImageView imageView4 = placeDetailsFragment.zzf;
        if (imageView4 == null) {
            Intrinsics.y("image3");
            imageView4 = null;
        }
        if (Intrinsics.e(imageView, imageView4)) {
            View view7 = placeDetailsFragment.zzw;
            if (view7 == null) {
                Intrinsics.y("image3CardView");
            } else {
                view = view7;
            }
            view.setVisibility(8);
        }
    }

    static /* synthetic */ void zzf(PlaceDetailsFragment placeDetailsFragment, View view) {
        ImageView imageView = placeDetailsFragment.zzd;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.y("image");
            imageView = null;
        }
        if (Intrinsics.e(view, imageView)) {
            placeDetailsFragment.zzr(0);
            return;
        }
        ImageView imageView3 = placeDetailsFragment.zze;
        if (imageView3 == null) {
            Intrinsics.y("image2");
            imageView3 = null;
        }
        if (Intrinsics.e(view, imageView3)) {
            placeDetailsFragment.zzr(1);
            return;
        }
        ImageView imageView4 = placeDetailsFragment.zzf;
        if (imageView4 == null) {
            Intrinsics.y("image3");
        } else {
            imageView2 = imageView4;
        }
        if (Intrinsics.e(view, imageView2)) {
            placeDetailsFragment.zzr(2);
        }
    }

    static /* synthetic */ void zzg(PlaceDetailsFragment placeDetailsFragment, View view) {
        ArrayList arrayList = new ArrayList();
        List list = placeDetailsFragment.zzy;
        List list2 = null;
        if (list == null) {
            Intrinsics.y("content");
            list = null;
        }
        if (list.contains(Content.REVIEWS)) {
            arrayList.add(zzon.zza);
            arrayList.add(zzon.zzc);
        } else {
            List list3 = placeDetailsFragment.zzy;
            if (list3 == null) {
                Intrinsics.y("content");
            } else {
                list2 = list3;
            }
            if (list2.contains(Content.RATING)) {
                arrayList.add(zzon.zza);
            }
        }
        Context contextRequireContext = placeDetailsFragment.requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        new zzoo(contextRequireContext, placeDetailsFragment.zzo(), arrayList).show();
    }

    static /* synthetic */ Unit zzi(PlaceDetailsFragment placeDetailsFragment, zzbp zzbpVar) {
        List<PhotoMetadata> photoMetadatas;
        zzbi zzbiVar = placeDetailsFragment.zzB;
        ImageView imageView = null;
        if (zzbiVar == null) {
            Intrinsics.y("viewModel");
            zzbiVar = null;
        }
        Place place = (Place) zzbiVar.zza().e();
        int size = (place == null || (photoMetadatas = place.getPhotoMetadatas()) == null) ? 0 : photoMetadatas.size();
        if (size == 0) {
            View view = placeDetailsFragment.zzt;
            if (view == null) {
                Intrinsics.y("numberOfPhotosChip");
                view = null;
            }
            view.setVisibility(8);
        } else {
            TextView textView = placeDetailsFragment.zzs;
            if (textView == null) {
                Intrinsics.y("numberOfPhotosChipLabel");
                textView = null;
            }
            textView.setText(placeDetailsFragment.getResources().getQuantityString(R.plurals.place_details_photo_count, size, Integer.valueOf(size)));
            View view2 = placeDetailsFragment.zzt;
            if (view2 == null) {
                Intrinsics.y("numberOfPhotosChip");
                view2 = null;
            }
            view2.setVisibility(0);
        }
        Intrinsics.g(zzbpVar);
        ImageView imageView2 = placeDetailsFragment.zzd;
        if (imageView2 == null) {
            Intrinsics.y("image");
            imageView2 = null;
        }
        View view3 = placeDetailsFragment.zzc;
        if (view3 == null) {
            Intrinsics.y("collageCardView");
            view3 = null;
        }
        ImageView imageView3 = placeDetailsFragment.zzd;
        if (imageView3 == null) {
            Intrinsics.y("image");
        } else {
            imageView = imageView3;
        }
        Object parent = imageView.getParent();
        Intrinsics.h(parent, "null cannot be cast to non-null type android.view.View");
        placeDetailsFragment.zzu(zzbpVar, imageView2, view3, (View) parent);
        return Unit.f142422a;
    }

    static /* synthetic */ void zzl(PlaceDetailsFragment placeDetailsFragment, zzbp zzbpVar, View[] viewArr, ImageView imageView) {
        List list = placeDetailsFragment.zzy;
        Orientation orientation = null;
        if (list == null) {
            Intrinsics.y("content");
            list = null;
        }
        if (list.contains(Content.MEDIA)) {
            if (zzbpVar instanceof zzbl) {
                C16648k.d(C6031t.a(placeDetailsFragment), null, null, new zzah(placeDetailsFragment, zzbpVar, imageView, null), 3, null);
                return;
            }
            if (zzbpVar instanceof zzbm) {
                for (View view : viewArr) {
                    view.setVisibility(0);
                }
                imageView.setImageDrawable(placeDetailsFragment.getResources().getDrawable(R.drawable.place_details_image_loading_background, new ContextThemeWrapper(placeDetailsFragment.requireContext(), placeDetailsFragment.zzo()).getTheme()));
                return;
            }
            if (zzbpVar instanceof zzbn) {
                for (View view2 : viewArr) {
                    view2.setVisibility(8);
                }
                return;
            }
            if (!(zzbpVar instanceof zzbo) && !(zzbpVar instanceof zzbk)) {
                throw new NoWhenBranchMatchedException();
            }
            Orientation orientation2 = placeDetailsFragment.zzx;
            if (orientation2 == null) {
                Intrinsics.y("orientation");
            } else {
                orientation = orientation2;
            }
            imageView.setImageDrawable(placeDetailsFragment.getResources().getDrawable(orientation == Orientation.HORIZONTAL ? R.drawable.place_details_placeholder_horizontal : R.drawable.place_details_placeholder_vertical, placeDetailsFragment.requireContext().getTheme()));
        }
    }

    static /* synthetic */ void zzm(PlaceDetailsFragment placeDetailsFragment, TabLayout.f tab, int i10) {
        Intrinsics.j(tab, "tab");
        zzcf zzcfVar = placeDetailsFragment.zzm;
        String string = null;
        if (zzcfVar == null) {
            Intrinsics.y("pagerAdapter");
            zzcfVar = null;
        }
        int itemViewType = zzcfVar.getItemViewType(i10);
        if (itemViewType == 1) {
            string = placeDetailsFragment.getString(R.string.place_details_overview_tab_name);
        } else if (itemViewType == 2) {
            string = placeDetailsFragment.getString(R.string.place_details_reviews_tab_name);
        } else if (itemViewType == 3) {
            string = placeDetailsFragment.getString(R.string.place_details_about_tab_name);
        }
        tab.r(string);
    }

    private final int zzo() {
        return ((Number) this.zzD.getValue(this, zza[0])).intValue();
    }

    private final zzbc zzp() {
        List list = this.zzy;
        List list2 = null;
        if (list == null) {
            Intrinsics.y("content");
            list = null;
        }
        boolean zContains = list.contains(Content.MEDIA);
        List list3 = this.zzA;
        if (list3 == null) {
            Intrinsics.y("fieldsToLoad");
        } else {
            list2 = list3;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        return zzbb.zza(zContains, list2, contextRequireContext);
    }

    private final void zzr(int i10) {
        zzbi zzbiVar = this.zzB;
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar = null;
        if (zzbiVar == null) {
            Intrinsics.y("viewModel");
            zzbiVar = null;
        }
        ArrayList arrayListZzj = zzbiVar.zzj();
        if (arrayListZzj.isEmpty()) {
            return;
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        PlacesLightboxActivity.Companion companion = PlacesLightboxActivity.INSTANCE;
        Context context = requireContext();
        Intrinsics.i(context, "requireContext(...)");
        com.google.android.libraries.places.widget.internal.photoviewer.zzm pageDataList = new com.google.android.libraries.places.widget.internal.photoviewer.zzm(arrayListZzj);
        int iZzo = zzo();
        com.google.android.libraries.places.widget.internal.placedetails.zzp analyticsReporter = this.zzz;
        if (analyticsReporter == null) {
            Intrinsics.y("analyticsReporter");
            analyticsReporter = null;
        }
        Intrinsics.j(context, "context");
        Intrinsics.j(pageDataList, "pageDataList");
        Intrinsics.j(analyticsReporter, "analyticsReporter");
        Intent intent = new Intent(context, (Class<?>) PlacesLightboxActivity.class);
        intent.putExtra("extra-photo-page-data-list", pageDataList);
        intent.putExtra("extra-start-index", i10);
        intent.putExtra("extra-theme-res-id", iZzo);
        intent.putExtra("extra-analytics-reporter", analyticsReporter);
        fragmentActivityRequireActivity.startActivity(intent);
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar2 = this.zzz;
        if (zzpVar2 == null) {
            Intrinsics.y("analyticsReporter");
        } else {
            zzpVar = zzpVar2;
        }
        zzpVar.zzg();
    }

    private final void zzs() {
        TextView textView = this.zzg;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.y("displayName");
            textView = null;
        }
        textView.setVisibility(8);
        com.google.android.libraries.places.widget.internal.placedetails.zzaa zzaaVar = this.zzp;
        if (zzaaVar == null) {
            Intrinsics.y("metadataViewController");
            zzaaVar = null;
        }
        zzaaVar.zzc();
        TextView textView3 = this.zzh;
        if (textView3 == null) {
            Intrinsics.y("summary");
            textView3 = null;
        }
        textView3.setVisibility(8);
        View view = this.zzi;
        if (view == null) {
            Intrinsics.y("summaryAndTabsDivider");
            view = null;
        }
        view.setVisibility(8);
        TabLayout tabLayout = this.zzj;
        if (tabLayout == null) {
            Intrinsics.y("tabLayout");
            tabLayout = null;
        }
        tabLayout.setVisibility(8);
        View view2 = this.zzk;
        if (view2 == null) {
            Intrinsics.y("tabsAndTabContentDivider");
            view2 = null;
        }
        view2.setVisibility(8);
        ViewPager2 viewPager2 = this.zzl;
        if (viewPager2 == null) {
            Intrinsics.y("viewPager");
            viewPager2 = null;
        }
        viewPager2.setVisibility(8);
        ProgressBar progressBar = this.zzn;
        if (progressBar == null) {
            Intrinsics.y("loadingProgressBar");
            progressBar = null;
        }
        progressBar.setVisibility(8);
        TextView textView4 = this.zzo;
        if (textView4 == null) {
            Intrinsics.y("loadingFailedMessage");
        } else {
            textView2 = textView4;
        }
        textView2.setVisibility(8);
    }

    private final void zzt(View view, CharSequence charSequence, boolean z10) {
        if (!z10 || charSequence == null || StringsKt.r0(charSequence)) {
            view.setVisibility(8);
            return;
        }
        if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
        view.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv() {
        ViewPager2 viewPager2 = this.zzl;
        if (viewPager2 == null) {
            Intrinsics.y("viewPager");
            viewPager2 = null;
        }
        int currentItem = viewPager2.getCurrentItem();
        FragmentManager childFragmentManager = getChildFragmentManager();
        StringBuilder sb2 = new StringBuilder(String.valueOf(currentItem).length() + 1);
        sb2.append("f");
        sb2.append(currentItem);
        Fragment fragmentFindFragmentByTag = childFragmentManager.findFragmentByTag(sb2.toString());
        final View view = fragmentFindFragmentByTag != null ? fragmentFindFragmentByTag.getView() : null;
        if (view != null) {
            view.post(new Runnable() { // from class: com.google.android.libraries.places.widget.zzaa
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    PlaceDetailsFragment.zzn(view, this);
                }
            });
            return;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(currentItem).length() + 34);
        sb3.append("Tab at position ");
        sb3.append(currentItem);
        sb3.append(" is not ready yet.");
        FS.log_d("PlaceDetailsFragment", sb3.toString());
    }

    public final void loadWithCoordinates(@RecentlyNonNull LatLng coordinates) {
        Intrinsics.j(coordinates, "coordinates");
        zzq();
        zzbi zzbiVar = this.zzB;
        if (zzbiVar == null) {
            Intrinsics.y("viewModel");
            zzbiVar = null;
        }
        zzbiVar.zzg(coordinates, zzp());
    }

    public final void loadWithPlaceId(@RecentlyNonNull String placeId) {
        Intrinsics.j(placeId, "placeId");
        zzq();
        zzbi zzbiVar = this.zzB;
        if (zzbiVar == null) {
            Intrinsics.y("viewModel");
            zzbiVar = null;
        }
        zzbiVar.zzf(placeId, zzp());
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
        this.zzy = ((zzs) zzof.zza(bundleRequireArguments, "arg-content", zzs.class)).zza();
        zzbj zzbjVar = new zzbj();
        List list = this.zzy;
        Orientation orientation = null;
        if (list == null) {
            Intrinsics.y("content");
            list = null;
        }
        if (list.contains(Content.MEDIA)) {
            zzbjVar.zza();
        }
        List list2 = this.zzy;
        if (list2 == null) {
            Intrinsics.y("content");
            list2 = null;
        }
        if (list2.contains(Content.ADDRESS)) {
            zzbjVar.zzb();
        }
        List list3 = this.zzy;
        if (list3 == null) {
            Intrinsics.y("content");
            list3 = null;
        }
        if (list3.contains(Content.RATING)) {
            zzbjVar.zzc();
        }
        List list4 = this.zzy;
        if (list4 == null) {
            Intrinsics.y("content");
            list4 = null;
        }
        if (list4.contains(Content.PRICE)) {
            zzbjVar.zzd();
        }
        List list5 = this.zzy;
        if (list5 == null) {
            Intrinsics.y("content");
            list5 = null;
        }
        if (list5.contains(Content.TYPE)) {
            zzbjVar.zze();
        }
        List list6 = this.zzy;
        if (list6 == null) {
            Intrinsics.y("content");
            list6 = null;
        }
        if (list6.contains(Content.ACCESSIBLE_ENTRANCE_ICON)) {
            zzbjVar.zzf();
        }
        List list7 = this.zzy;
        if (list7 == null) {
            Intrinsics.y("content");
            list7 = null;
        }
        if (list7.contains(Content.OPEN_NOW_STATUS)) {
            zzbjVar.zzg();
        }
        List list8 = this.zzy;
        if (list8 == null) {
            Intrinsics.y("content");
            list8 = null;
        }
        if (list8.contains(Content.SUMMARY)) {
            zzbjVar.zzh();
        }
        List list9 = this.zzy;
        if (list9 == null) {
            Intrinsics.y("content");
            list9 = null;
        }
        if (list9.contains(Content.OPENING_HOURS)) {
            zzbjVar.zzg();
        }
        List list10 = this.zzy;
        if (list10 == null) {
            Intrinsics.y("content");
            list10 = null;
        }
        if (list10.contains(Content.WEBSITE)) {
            zzbjVar.zzi();
        }
        List list11 = this.zzy;
        if (list11 == null) {
            Intrinsics.y("content");
            list11 = null;
        }
        if (list11.contains(Content.PHONE_NUMBER)) {
            zzbjVar.zzj();
        }
        List list12 = this.zzy;
        if (list12 == null) {
            Intrinsics.y("content");
            list12 = null;
        }
        if (list12.contains(Content.TYPE_SPECIFIC_HIGHLIGHTS)) {
            zzbjVar.zzk();
        }
        List list13 = this.zzy;
        if (list13 == null) {
            Intrinsics.y("content");
            list13 = null;
        }
        if (list13.contains(Content.REVIEWS)) {
            zzbjVar.zzl();
        }
        List list14 = this.zzy;
        if (list14 == null) {
            Intrinsics.y("content");
            list14 = null;
        }
        if (list14.contains(Content.PLUS_CODE)) {
            zzbjVar.zzm();
        }
        List list15 = this.zzy;
        if (list15 == null) {
            Intrinsics.y("content");
            list15 = null;
        }
        if (list15.contains(Content.FEATURES)) {
            zzbjVar.zzn();
        }
        this.zzA = zzbjVar.zzo();
        Bundle bundleRequireArguments2 = requireArguments();
        Intrinsics.i(bundleRequireArguments2, "requireArguments(...)");
        this.zzx = (Orientation) zzof.zza(bundleRequireArguments2, "arg-orientation", Orientation.class);
        this.zzD.setValue(this, zza[0], Integer.valueOf(requireArguments().getInt("arg-theme-res-id")));
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), zzo());
        Orientation orientation2 = this.zzx;
        if (orientation2 == null) {
            Intrinsics.y("orientation");
        } else {
            orientation = orientation2;
        }
        if (orientation == Orientation.HORIZONTAL) {
            FS.log_w("PlaceDetailsFragment", "Horizontal orientation is not yet available.");
        }
        View viewInflate = inflater.cloneInContext(contextThemeWrapper).inflate(R.layout.place_details_vertical_fragment, container, false);
        Intrinsics.g(viewInflate);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@RecentlyNonNull View view, Bundle savedInstanceState) throws Resources.NotFoundException {
        zzaiw zzaiwVar;
        Intrinsics.j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.zzb = view.findViewById(R.id.place_collage_card);
        this.zzc = view.findViewById(R.id.place_collage);
        this.zzd = (ImageView) view.findViewById(R.id.place_image);
        this.zze = (ImageView) view.findViewById(R.id.place_image2);
        this.zzf = (ImageView) view.findViewById(R.id.place_image3);
        this.zzg = (TextView) view.findViewById(R.id.place_name);
        this.zzh = (TextView) view.findViewById(R.id.place_summary);
        this.zzi = view.findViewById(R.id.summary_and_tabs_divider);
        this.zzl = (ViewPager2) view.findViewById(R.id.tabs_view_pager);
        this.zzk = view.findViewById(R.id.tabs_and_tab_content_divider);
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tab_layout);
        this.zzj = tabLayout;
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar = null;
        if (tabLayout == null) {
            Intrinsics.y("tabLayout");
            tabLayout = null;
        }
        tabLayout.setTabGravity(0);
        this.zzn = (ProgressBar) view.findViewById(R.id.loading_indicator);
        this.zzo = (TextView) view.findViewById(R.id.loading_failed_message);
        this.zzq = (ImageView) view.findViewById(R.id.google_maps_attribution);
        this.zzr = (ImageView) view.findViewById(R.id.legal_disclosures_icon);
        this.zzs = (TextView) view.findViewById(R.id.place_image_card_number_of_photos_text);
        this.zzt = view.findViewById(R.id.place_image_card_number_of_photos);
        this.zzu = view.findViewById(R.id.place_collage_error);
        this.zzv = view.findViewById(R.id.place_image_card2);
        this.zzw = view.findViewById(R.id.place_image_card3);
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        int iZzo = zzo();
        zzbi zzbiVar = this.zzB;
        if (zzbiVar == null) {
            Intrinsics.y("viewModel");
            zzbiVar = null;
        }
        zzoy zzoyVarZze = zzbiVar.zze();
        this.zzp = new com.google.android.libraries.places.widget.internal.placedetails.zzaa(view, contextRequireContext, iZzo, zzoyVarZze != null ? zzoyVarZze.zzb() : null);
        zzs();
        zzoe zzoeVar = zzoe.zza;
        Context contextRequireContext2 = requireContext();
        Intrinsics.i(contextRequireContext2, "requireContext(...)");
        int iZza = zzod.zza(contextRequireContext2, zzo());
        ImageView imageView = this.zzq;
        if (imageView == null) {
            Intrinsics.y("attributionImage");
            imageView = null;
        }
        imageView.setColorFilter(iZza);
        ImageView imageView2 = this.zzr;
        if (imageView2 == null) {
            Intrinsics.y("legalDisclosuresIcon");
            imageView2 = null;
        }
        imageView2.setColorFilter(iZza);
        ImageView imageView3 = this.zzr;
        if (imageView3 == null) {
            Intrinsics.y("legalDisclosuresIcon");
            imageView3 = null;
        }
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zzt
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view2) {
                PlaceDetailsFragment.zzg(this.zza, view2);
            }
        });
        zzbi zzbiVar2 = this.zzB;
        if (zzbiVar2 == null) {
            Intrinsics.y("viewModel");
            zzbiVar2 = null;
        }
        zzbiVar2.zza().i(getViewLifecycleOwner(), new zzae(new zzac(this)));
        zzbi zzbiVar3 = this.zzB;
        if (zzbiVar3 == null) {
            Intrinsics.y("viewModel");
            zzbiVar3 = null;
        }
        zzbiVar3.zzb().i(getViewLifecycleOwner(), new zzae(new zzad(this)));
        zzbi zzbiVar4 = this.zzB;
        if (zzbiVar4 == null) {
            Intrinsics.y("viewModel");
            zzbiVar4 = null;
        }
        zzbiVar4.zzd().i(getViewLifecycleOwner(), new zzae(new Function1() { // from class: com.google.android.libraries.places.widget.zzu
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj) {
                return PlaceDetailsFragment.zzh(this.zza, (Unit) obj);
            }
        }));
        zzbi zzbiVar5 = this.zzB;
        if (zzbiVar5 == null) {
            Intrinsics.y("viewModel");
            zzbiVar5 = null;
        }
        ((AbstractC5985A) zzbiVar5.zzc().get(0)).i(getViewLifecycleOwner(), new zzae(new Function1() { // from class: com.google.android.libraries.places.widget.zzv
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj) {
                return PlaceDetailsFragment.zzi(this.zza, (zzbp) obj);
            }
        }));
        zzbi zzbiVar6 = this.zzB;
        if (zzbiVar6 == null) {
            Intrinsics.y("viewModel");
            zzbiVar6 = null;
        }
        ((AbstractC5985A) zzbiVar6.zzc().get(1)).i(getViewLifecycleOwner(), new zzae(new Function1() { // from class: com.google.android.libraries.places.widget.zzw
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj) {
                return PlaceDetailsFragment.zzj(this.zza, (zzbp) obj);
            }
        }));
        zzbi zzbiVar7 = this.zzB;
        if (zzbiVar7 == null) {
            Intrinsics.y("viewModel");
            zzbiVar7 = null;
        }
        ((AbstractC5985A) zzbiVar7.zzc().get(2)).i(getViewLifecycleOwner(), new zzae(new Function1() { // from class: com.google.android.libraries.places.widget.zzx
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj) {
                return PlaceDetailsFragment.zzk(this.zza, (zzbp) obj);
            }
        }));
        zzajb zzajbVar = zzajb.VARIANT_FULL;
        Orientation orientation = this.zzx;
        if (orientation == null) {
            Intrinsics.y("orientation");
            orientation = null;
        }
        zzaiz zzaizVar = orientation == Orientation.VERTICAL ? zzaiz.ORIENTATION_VERTICAL : zzaiz.ORIENTATION_HORIZONTAL;
        List list = this.zzy;
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
                case 7:
                    zzaiwVar = zzaiw.SUMMARY;
                    break;
                case 8:
                    zzaiwVar = zzaiw.OPENING_HOURS;
                    break;
                case 9:
                    zzaiwVar = zzaiw.WEBSITE;
                    break;
                case 10:
                    zzaiwVar = zzaiw.PHONE_NUMBER;
                    break;
                case 11:
                    zzaiwVar = zzaiw.TYPE_SPECIFIC_HIGHLIGHTS;
                    break;
                case 12:
                    zzaiwVar = zzaiw.REVIEWS;
                    break;
                case 13:
                    zzaiwVar = zzaiw.PLUS_CODE;
                    break;
                case 14:
                    zzaiwVar = zzaiw.FEATURES;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(zzaiwVar);
        }
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar2 = new com.google.android.libraries.places.widget.internal.placedetails.zzp(zzajbVar, zzaizVar, arrayList);
        this.zzz = zzpVar2;
        zzbi zzbiVar8 = this.zzB;
        if (zzbiVar8 == null) {
            Intrinsics.y("viewModel");
            zzbiVar8 = null;
        }
        zzpVar2.zza(zzbiVar8.zzi());
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar3 = this.zzz;
        if (zzpVar3 == null) {
            Intrinsics.y("analyticsReporter");
        } else {
            zzpVar = zzpVar3;
        }
        zzpVar.zzb();
    }

    @JvmStatic
    @JvmOverloads
    public static final PlaceDetailsFragment newInstance(@RecentlyNonNull List<? extends Content> list, @RecentlyNonNull Orientation orientation, int i10) {
        return INSTANCE.newInstance(list, orientation, i10);
    }

    static /* synthetic */ Unit zzh(PlaceDetailsFragment placeDetailsFragment, Unit unit) {
        placeDetailsFragment.zzv();
        return Unit.f142422a;
    }

    static /* synthetic */ Unit zzj(PlaceDetailsFragment placeDetailsFragment, zzbp zzbpVar) {
        Intrinsics.g(zzbpVar);
        ImageView imageView = placeDetailsFragment.zze;
        View view = null;
        if (imageView == null) {
            Intrinsics.y("image2");
            imageView = null;
        }
        View view2 = placeDetailsFragment.zzv;
        if (view2 == null) {
            Intrinsics.y("image2CardView");
        } else {
            view = view2;
        }
        placeDetailsFragment.zzu(zzbpVar, imageView, view);
        return Unit.f142422a;
    }

    static /* synthetic */ Unit zzk(PlaceDetailsFragment placeDetailsFragment, zzbp zzbpVar) {
        Intrinsics.g(zzbpVar);
        ImageView imageView = placeDetailsFragment.zzf;
        View view = null;
        if (imageView == null) {
            Intrinsics.y("image3");
            imageView = null;
        }
        View view2 = placeDetailsFragment.zzw;
        if (view2 == null) {
            Intrinsics.y("image3CardView");
        } else {
            view = view2;
        }
        placeDetailsFragment.zzu(zzbpVar, imageView, view);
        return Unit.f142422a;
    }

    static /* synthetic */ void zzn(View view, PlaceDetailsFragment placeDetailsFragment) {
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        ViewPager2 viewPager2 = placeDetailsFragment.zzl;
        ViewPager2 viewPager22 = null;
        if (viewPager2 == null) {
            Intrinsics.y("viewPager");
            viewPager2 = null;
        }
        if (viewPager2.getLayoutParams().height != view.getMeasuredHeight()) {
            ViewPager2 viewPager23 = placeDetailsFragment.zzl;
            if (viewPager23 == null) {
                Intrinsics.y("viewPager");
                viewPager23 = null;
            }
            ViewGroup.LayoutParams layoutParams = viewPager23.getLayoutParams();
            layoutParams.height = view.getMeasuredHeight();
            ViewPager2 viewPager24 = placeDetailsFragment.zzl;
            if (viewPager24 == null) {
                Intrinsics.y("viewPager");
            } else {
                viewPager22 = viewPager24;
            }
            viewPager22.setLayoutParams(layoutParams);
        }
    }

    private final void zzq() {
        zzs();
        ProgressBar progressBar = this.zzn;
        View view = null;
        if (progressBar == null) {
            Intrinsics.y("loadingProgressBar");
            progressBar = null;
        }
        progressBar.setVisibility(0);
        List list = this.zzy;
        if (list == null) {
            Intrinsics.y("content");
            list = null;
        }
        if (list.contains(Content.MEDIA)) {
            View view2 = this.zzb;
            if (view2 == null) {
                Intrinsics.y("collageLayout");
            } else {
                view = view2;
            }
            view.setVisibility(0);
        }
    }

    private final void zzu(final zzbp zzbpVar, final ImageView imageView, final View... viewArr) {
        requireView().post(new Runnable() { // from class: com.google.android.libraries.places.widget.zzy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                PlaceDetailsFragment.zzl(this.zza, zzbpVar, viewArr, imageView);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Application application = requireActivity().getApplication();
        Intrinsics.i(application, "getApplication(...)");
        this.zzB = (zzbi) new f0(this, com.google.android.libraries.places.widget.internal.placedetails.zzat.zza(application)).a(zzbi.class);
    }
}
