package com.google.android.libraries.places.widget;

import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.RecentlyNonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.view.AbstractC6024m;
import androidx.view.C6031t;
import androidx.view.f0;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.SearchByTextRequest;
import com.google.android.libraries.places.api.net.SearchNearbyRequest;
import com.google.android.libraries.places.internal.zzajp;
import com.google.android.libraries.places.internal.zzajr;
import com.google.android.libraries.places.internal.zzaju;
import com.google.android.libraries.places.internal.zzajw;
import com.google.android.libraries.places.internal.zzajz;
import com.google.android.libraries.places.internal.zzod;
import com.google.android.libraries.places.internal.zzoe;
import com.google.android.libraries.places.internal.zzof;
import com.google.android.libraries.places.internal.zzon;
import com.google.android.libraries.places.internal.zzoo;
import com.google.android.libraries.places.internal.zzoy;
import com.google.android.libraries.places.internal.zzpb;
import com.google.android.libraries.places.internal.zzpi;
import com.google.android.libraries.places.internal.zzpk;
import com.google.android.libraries.places.internal.zzpw;
import com.google.android.libraries.places.widget.internal.placedetails.zzbm;
import com.google.android.libraries.places.widget.model.AttributionPosition;
import com.google.android.libraries.places.widget.model.MediaSize;
import com.google.android.libraries.places.widget.model.Orientation;
import ie.C14718a;
import java.util.ArrayList;
import java.util.Iterator;
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

@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 m2\u00020\u0001:\u0003klmB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J$\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010A2\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u001a\u0010B\u001a\u0002092\u0006\u0010C\u001a\u00020=2\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u0010\u0010D\u001a\u0002092\u0006\u0010E\u001a\u00020;H\u0016J\u0010\u0010F\u001a\u0002092\u0006\u0010G\u001a\u00020HH\u0007J\u0010\u0010I\u001a\u0002092\u0006\u0010G\u001a\u00020JH\u0007J\b\u0010K\u001a\u000209H\u0007J\u0010\u0010L\u001a\u0002092\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\b\u0010\u0014\u001a\u000209H\u0002J\b\u0010M\u001a\u000209H\u0002J\b\u0010N\u001a\u000209H\u0002J\u0016\u0010O\u001a\u0002092\f\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0\u0019H\u0002J\"\u0010R\u001a\u0002092\u000e\u0010P\u001a\n\u0012\u0004\u0012\u00020Q\u0018\u00010\u00192\b\u0010S\u001a\u0004\u0018\u00010TH\u0002J\b\u0010U\u001a\u000209H\u0002J\u0018\u0010V\u001a\u0002092\u000e\u0010P\u001a\n\u0012\u0004\u0012\u00020Q\u0018\u00010\u0019H\u0002J\u0016\u0010W\u001a\u0002092\f\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0\u0019H\u0002J\b\u0010X\u001a\u00020\u0017H\u0002J\b\u00104\u001a\u00020\u001cH\u0002J\u0012\u0010Y\u001a\u0002092\b\u0010S\u001a\u0004\u0018\u00010TH\u0002J\u0010\u0010Z\u001a\u00020Q2\u0006\u0010[\u001a\u00020QH\u0002J\u0010\u0010\\\u001a\u0002092\u0006\u0010]\u001a\u00020^H\u0007J\u001c\u0010_\u001a\b\u0012\u0004\u0012\u00020`0\u00192\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\u000e\u0010a\u001a\b\u0012\u0004\u0012\u00020b0\u0019H\u0002J\f\u0010c\u001a\u00020d*\u00020\u0017H\u0002J\f\u0010e\u001a\u00020f*\u00020\u001aH\u0002J\f\u0010g\u001a\u00020h*\u000203H\u0002J\f\u0010i\u001a\u00020j*\u00020-H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082.¢\u0006\u0002\n\u0000R+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010$\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\u001a\u0010,\u001a\u00020-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u000203X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006n"}, d2 = {"Lcom/google/android/libraries/places/widget/PlaceSearchFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "viewModel", "Lcom/google/android/libraries/places/widget/internal/placesearch/PlaceSearchViewModel;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "fragmentAdapter", "Lcom/google/android/libraries/places/widget/internal/placesearch/PlaceSearchAdapter;", "loadingProgressBar", "Landroid/widget/ProgressBar;", "analyticsReporter", "Lcom/google/android/libraries/places/widget/internal/placesearch/AnalyticsReporter;", "listener", "Lcom/google/android/libraries/places/widget/PlaceSearchFragmentListener;", "scrollState", "Landroid/os/Parcelable;", "showLegalDisclosuresDialog", "", "orientation", "Lcom/google/android/libraries/places/widget/model/Orientation;", "content", "", "Lcom/google/android/libraries/places/widget/PlaceSearchFragment$Content;", "<set-?>", "", "themeResId", "getThemeResId", "()I", "setThemeResId", "(I)V", "themeResId$delegate", "Lkotlin/properties/ReadWriteProperty;", "selectable", "getSelectable", "()Z", "setSelectable", "(Z)V", "preferTruncation", "getPreferTruncation", "setPreferTruncation", "attributionPosition", "Lcom/google/android/libraries/places/widget/model/AttributionPosition;", "getAttributionPosition", "()Lcom/google/android/libraries/places/widget/model/AttributionPosition;", "setAttributionPosition", "(Lcom/google/android/libraries/places/widget/model/AttributionPosition;)V", "mediaSize", "Lcom/google/android/libraries/places/widget/model/MediaSize;", "getMediaSize", "()Lcom/google/android/libraries/places/widget/model/MediaSize;", "setMediaSize", "(Lcom/google/android/libraries/places/widget/model/MediaSize;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "onSaveInstanceState", "outState", "configureFromSearchByTextRequest", "request", "Lcom/google/android/libraries/places/api/net/SearchByTextRequest;", "configureFromSearchNearbyRequest", "Lcom/google/android/libraries/places/api/net/SearchNearbyRequest;", "unregisterListener", "registerListener", "updateAttributionAndDisclosureIcon", "showLoadingProgressBar", "onLoadPlaces", "places", "Lcom/google/android/libraries/places/api/model/Place;", "updateUi", "message", "", "updateAttributionPosition", "updateHorizontalGap", "updateRecyclerView", "getPlaceDetailsFragmentOrientation", "showText", "getReturnedPlace", "place", "setTestComponent", "component", "Lcom/google/android/libraries/places/widget/internal/inject/PlacesWidgetComponent;", "contentToPlaceFields", "Lcom/google/android/libraries/places/api/model/Place$Field;", "getPlaceDetailsContent", "Lcom/google/android/libraries/places/widget/PlaceDetailsCompactFragment$Content;", "toAnalyticsOrientation", "Lcom/google/common/logging/location/PlacesProto$PlaceSearchWidgetProto$PlaceSearchWidgetOrientation;", "toAnalyticsContent", "Lcom/google/common/logging/location/PlacesProto$PlaceSearchWidgetProto$PlaceSearchWidgetContent;", "toAnalyticsMediaSize", "Lcom/google/common/logging/location/PlacesProto$PlaceSearchWidgetProto$MediaSize;", "toAnalyticsAttributionPosition", "Lcom/google/common/logging/location/PlacesProto$PlaceWidgetAttributionPosition;", "ParcelableContentList", "Content", "Companion", "java.com.google.android.libraries.places.widget_place_search_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlaceSearchFragment extends Fragment {
    private zzpw zzb;
    private RecyclerView zzc;
    private LinearLayoutManager zzd;
    private zzpi zze;
    private ProgressBar zzf;
    private zzpb zzg;
    private PlaceSearchFragmentListener zzh;
    private Parcelable zzi;
    private boolean zzj;
    private Orientation zzk;
    private List zzl;
    private boolean zzn;
    private boolean zzo;
    static final /* synthetic */ KProperty[] zza = {Reflection.f(new MutablePropertyReference1Impl(PlaceSearchFragment.class, "themeResId", "getThemeResId()I", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    public static final List<Content> STANDARD_CONTENT = CollectionsKt.p(Content.MEDIA, Content.RATING, Content.TYPE, Content.PRICE, Content.ACCESSIBLE_ENTRANCE_ICON);

    @JvmField
    public static final List<Content> ALL_CONTENT = CollectionsKt.j1(Content.getEntries());
    private final ReadWriteProperty zzm = Delegates.f142874a.a();
    private AttributionPosition zzp = AttributionPosition.TOP;
    private MediaSize zzq = MediaSize.SMALL;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0003\u0010 \u001a\u00020!H\u0007R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0003R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0003R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0003R\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0003R\u0016\u0010\u0011\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0003R\u0016\u0010\u0013\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0014\u0010\u0003R\u0016\u0010\u0015\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0016\u0010\u0003R\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/google/android/libraries/places/widget/PlaceSearchFragment$Companion;", "", "<init>", "()V", "ARG_ORIENTATION", "", "getARG_ORIENTATION$annotations", "ARG_CONTENT", "getARG_CONTENT$annotations", "ARG_THEME_RES_ID", "getARG_THEME_RES_ID$annotations", "ARG_PREFER_TRUNCATION", "getARG_PREFER_TRUNCATION$annotations", "ARG_SELECTABLE", "getARG_SELECTABLE$annotations", "ARG_ATTRIBUTION_POSITION", "getARG_ATTRIBUTION_POSITION$annotations", "ARG_MEDIA_SIZE", "getARG_MEDIA_SIZE$annotations", "ARG_SCROLL_STATE", "getARG_SCROLL_STATE$annotations", "ARG_SHOW_LEGAL_DISCLOSURES", "getARG_SHOW_LEGAL_DISCLOSURES$annotations", "STANDARD_CONTENT", "", "Lcom/google/android/libraries/places/widget/PlaceSearchFragment$Content;", "ALL_CONTENT", "newInstance", "Lcom/google/android/libraries/places/widget/PlaceSearchFragment;", "content", "orientation", "Lcom/google/android/libraries/places/widget/model/Orientation;", "theme", "", "java.com.google.android.libraries.places.widget_place_search_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
            throw null;
        }

        @JvmStatic
        @JvmOverloads
        public final PlaceSearchFragment newInstance(@RecentlyNonNull List<? extends Content> content) {
            Intrinsics.j(content, "content");
            return newInstance$default(this, content, null, 0, 6, null);
        }

        public /* synthetic */ Companion(@RecentlyNonNull DefaultConstructorMarker defaultConstructorMarker) {
        }

        @RecentlyNonNull
        public static /* synthetic */ PlaceSearchFragment newInstance$default(@RecentlyNonNull Companion companion, @RecentlyNonNull List list, @RecentlyNonNull Orientation orientation, int i10, int i11, @RecentlyNonNull Object obj) {
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
        public final PlaceSearchFragment newInstance(@RecentlyNonNull List<? extends Content> content, @RecentlyNonNull Orientation orientation) {
            Intrinsics.j(content, "content");
            Intrinsics.j(orientation, "orientation");
            return newInstance$default(this, content, orientation, 0, 4, null);
        }

        @JvmStatic
        @JvmOverloads
        public final PlaceSearchFragment newInstance(@RecentlyNonNull List<? extends Content> content, @RecentlyNonNull Orientation orientation, int theme) {
            Intrinsics.j(content, "content");
            Intrinsics.j(orientation, "orientation");
            PlaceSearchFragment placeSearchFragment = new PlaceSearchFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("arg-orientation", orientation);
            bundle.putParcelable("arg-content", new zzaj(content));
            bundle.putInt("arg-theme-res-id", theme);
            placeSearchFragment.setArguments(bundle);
            return placeSearchFragment;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/google/android/libraries/places/widget/PlaceSearchFragment$Content;", "", "<init>", "(Ljava/lang/String;I)V", "MEDIA", "ADDRESS", "RATING", "PRICE", "TYPE", "ACCESSIBLE_ENTRANCE_ICON", "OPEN_NOW_STATUS", "java.com.google.android.libraries.places.widget_place_search_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    public static final PlaceSearchFragment newInstance(@RecentlyNonNull List<? extends Content> list) {
        return INSTANCE.newInstance(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzm() {
        this.zzj = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzon.zzb);
        List list = this.zzl;
        if (list == null) {
            Intrinsics.y("content");
            list = null;
        }
        if (list.contains(Content.RATING)) {
            arrayList.add(zzon.zza);
        }
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        zzoo zzooVar = new zzoo(contextRequireContext, zzl(), arrayList);
        zzooVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.google.android.libraries.places.widget.zzam
            @Override // android.content.DialogInterface.OnDismissListener
            public final /* synthetic */ void onDismiss(DialogInterface dialogInterface) {
                this.zza.zzj = false;
            }
        });
        zzooVar.show();
    }

    private final void zzn() throws Resources.NotFoundException {
        ProgressBar progressBar = null;
        zzp(null, null);
        ProgressBar progressBar2 = this.zzf;
        if (progressBar2 == null) {
            Intrinsics.y("loadingProgressBar");
        } else {
            progressBar = progressBar2;
        }
        progressBar.setVisibility(0);
    }

    /* renamed from: getPreferTruncation, reason: from getter */
    public final boolean getZzo() {
        return this.zzo;
    }

    /* renamed from: getSelectable, reason: from getter */
    public final boolean getZzn() {
        return this.zzn;
    }

    public final void registerListener(@RecentlyNonNull PlaceSearchFragmentListener listener) {
        Intrinsics.j(listener, "listener");
        this.zzh = listener;
    }

    public final void setAttributionPosition(@RecentlyNonNull AttributionPosition attributionPosition) {
        Intrinsics.j(attributionPosition, "<set-?>");
        this.zzp = attributionPosition;
    }

    public final void setMediaSize(@RecentlyNonNull MediaSize mediaSize) {
        Intrinsics.j(mediaSize, "<set-?>");
        this.zzq = mediaSize;
    }

    public final void setPreferTruncation(boolean z10) {
        this.zzo = z10;
    }

    public final void setSelectable(boolean z10) {
        this.zzn = z10;
    }

    public final void unregisterListener() {
        this.zzh = null;
    }

    /* renamed from: zza, reason: from getter */
    public final AttributionPosition getZzp() {
        return this.zzp;
    }

    @JvmStatic
    @JvmOverloads
    public static final PlaceSearchFragment newInstance(@RecentlyNonNull List<? extends Content> list, @RecentlyNonNull Orientation orientation) {
        return INSTANCE.newInstance(list, orientation);
    }

    static /* synthetic */ Unit zzd(final PlaceSearchFragment placeSearchFragment, final List list) throws Resources.NotFoundException {
        ProgressBar progressBar = null;
        if (list.isEmpty()) {
            placeSearchFragment.zzp(null, placeSearchFragment.requireContext().getString(R.string.place_search_no_places_to_display));
        } else {
            placeSearchFragment.zzp(list, null);
        }
        Intrinsics.g(list);
        Orientation orientation = placeSearchFragment.zzk;
        if (orientation == null) {
            Intrinsics.y("orientation");
            orientation = null;
        }
        Orientation orientation2 = Orientation.VERTICAL;
        if (orientation == orientation2) {
            placeSearchFragment.zzd = new LinearLayoutManager(placeSearchFragment.getContext(), 1, false);
        } else {
            placeSearchFragment.zzd = new LinearLayoutManager(placeSearchFragment.getContext(), 0, false);
        }
        RecyclerView recyclerView = placeSearchFragment.zzc;
        if (recyclerView == null) {
            Intrinsics.y("recyclerView");
            recyclerView = null;
        }
        LinearLayoutManager linearLayoutManager = placeSearchFragment.zzd;
        if (linearLayoutManager == null) {
            Intrinsics.y("layoutManager");
            linearLayoutManager = null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        Orientation orientation3 = orientation2;
        AbstractC6024m abstractC6024mA = C6031t.a(placeSearchFragment);
        Orientation orientation4 = placeSearchFragment.zzk;
        if (orientation4 == null) {
            Intrinsics.y("orientation");
            orientation4 = null;
        }
        Orientation orientation5 = Orientation.HORIZONTAL;
        if (orientation4 != orientation5) {
            orientation3 = orientation5;
        }
        int iZzl = placeSearchFragment.zzl();
        MediaSize mediaSize = placeSearchFragment.zzq;
        Parcelable.Creator<MediaSize> creator = MediaSize.CREATOR;
        Content content = Content.MEDIA;
        Parcelable.Creator<AttributionPosition> creator2 = AttributionPosition.CREATOR;
        int iOrdinal = mediaSize.ordinal();
        int dimensionPixelSize = iOrdinal != 1 ? iOrdinal != 2 ? placeSearchFragment.requireContext().getResources().getDimensionPixelSize(R.dimen.place_search_image_size_small) : placeSearchFragment.requireContext().getResources().getDimensionPixelSize(R.dimen.place_search_image_size_large) : placeSearchFragment.requireContext().getResources().getDimensionPixelSize(R.dimen.place_search_image_size_medium);
        boolean z10 = placeSearchFragment.zzn;
        boolean z11 = placeSearchFragment.zzo;
        zzpw zzpwVar = placeSearchFragment.zzb;
        if (zzpwVar == null) {
            Intrinsics.y("viewModel");
            zzpwVar = null;
        }
        placeSearchFragment.zze = new zzpi(abstractC6024mA, orientation3, iZzl, dimensionPixelSize, z10, z11, list, zzpwVar.zze(), new Function1() { // from class: com.google.android.libraries.places.widget.zzap
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj) {
                return PlaceSearchFragment.zzj(this.zza, list, ((Integer) obj).intValue());
            }
        });
        RecyclerView recyclerView2 = placeSearchFragment.zzc;
        if (recyclerView2 == null) {
            Intrinsics.y("recyclerView");
            recyclerView2 = null;
        }
        zzpi zzpiVar = placeSearchFragment.zze;
        if (zzpiVar == null) {
            Intrinsics.y("fragmentAdapter");
            zzpiVar = null;
        }
        recyclerView2.setAdapter(zzpiVar);
        List list2 = placeSearchFragment.zzl;
        if (list2 == null) {
            Intrinsics.y("content");
            list2 = null;
        }
        if (list2.contains(Content.MEDIA)) {
            zzpi zzpiVar2 = placeSearchFragment.zze;
            if (zzpiVar2 == null) {
                Intrinsics.y("fragmentAdapter");
                zzpiVar2 = null;
            }
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(zzbm.zza);
            }
            zzpiVar2.zzc(arrayList);
        }
        RecyclerView recyclerView3 = placeSearchFragment.zzc;
        if (recyclerView3 == null) {
            Intrinsics.y("recyclerView");
            recyclerView3 = null;
        }
        recyclerView3.setItemViewCacheSize(10);
        Orientation orientation6 = placeSearchFragment.zzk;
        if (orientation6 == null) {
            Intrinsics.y("orientation");
            orientation6 = null;
        }
        if (orientation6 == Orientation.HORIZONTAL) {
            RecyclerView recyclerView4 = placeSearchFragment.zzc;
            if (recyclerView4 == null) {
                Intrinsics.y("recyclerView");
                recyclerView4 = null;
            }
            recyclerView4.addItemDecoration(new zzat(placeSearchFragment));
        } else {
            int iD = C14718a.d(placeSearchFragment.requireView(), R.attr.placesColorOutlineDecorative);
            int dimensionPixelSize2 = placeSearchFragment.requireContext().getResources().getDimensionPixelSize(R.dimen.place_widget_border_width);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(new int[]{iD, iD});
            gradientDrawable.setSize(dimensionPixelSize2, dimensionPixelSize2);
            RecyclerView recyclerView5 = placeSearchFragment.zzc;
            if (recyclerView5 == null) {
                Intrinsics.y("recyclerView");
                recyclerView5 = null;
            }
            Context context = recyclerView5.getContext();
            LinearLayoutManager linearLayoutManager2 = placeSearchFragment.zzd;
            if (linearLayoutManager2 == null) {
                Intrinsics.y("layoutManager");
                linearLayoutManager2 = null;
            }
            i iVar = new i(context, linearLayoutManager2.F2());
            iVar.h(gradientDrawable);
            RecyclerView recyclerView6 = placeSearchFragment.zzc;
            if (recyclerView6 == null) {
                Intrinsics.y("recyclerView");
                recyclerView6 = null;
            }
            recyclerView6.addItemDecoration(iVar);
        }
        RecyclerView recyclerView7 = placeSearchFragment.zzc;
        if (recyclerView7 == null) {
            Intrinsics.y("recyclerView");
            recyclerView7 = null;
        }
        recyclerView7.post(new Runnable() { // from class: com.google.android.libraries.places.widget.zzaq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                PlaceSearchFragment.zzk(this.zza);
            }
        });
        RecyclerView recyclerView8 = placeSearchFragment.zzc;
        if (recyclerView8 == null) {
            Intrinsics.y("recyclerView");
            recyclerView8 = null;
        }
        recyclerView8.addOnScrollListener(new zzau(placeSearchFragment));
        ProgressBar progressBar2 = placeSearchFragment.zzf;
        if (progressBar2 == null) {
            Intrinsics.y("loadingProgressBar");
        } else {
            progressBar = progressBar2;
        }
        progressBar.setVisibility(8);
        placeSearchFragment.zzo(list);
        return Unit.f142422a;
    }

    static /* synthetic */ Unit zze(PlaceSearchFragment placeSearchFragment, List list) {
        zzpi zzpiVar = placeSearchFragment.zze;
        if (zzpiVar == null) {
            Intrinsics.y("fragmentAdapter");
            zzpiVar = null;
        }
        Intrinsics.g(list);
        zzpiVar.zzc(list);
        return Unit.f142422a;
    }

    static /* synthetic */ Unit zzf(PlaceSearchFragment placeSearchFragment, Exception exc) throws Resources.NotFoundException {
        ProgressBar progressBar = placeSearchFragment.zzf;
        zzpb zzpbVar = null;
        if (progressBar == null) {
            Intrinsics.y("loadingProgressBar");
            progressBar = null;
        }
        progressBar.setVisibility(8);
        placeSearchFragment.zzp(null, placeSearchFragment.requireContext().getString(R.string.place_search_loading_failed));
        PlaceSearchFragmentListener placeSearchFragmentListener = placeSearchFragment.zzh;
        if (placeSearchFragmentListener != null) {
            Intrinsics.g(exc);
            placeSearchFragmentListener.onRequestError(exc);
        }
        zzpb zzpbVar2 = placeSearchFragment.zzg;
        if (zzpbVar2 == null) {
            Intrinsics.y("analyticsReporter");
        } else {
            zzpbVar = zzpbVar2;
        }
        zzpbVar.zzf();
        return Unit.f142422a;
    }

    static /* synthetic */ Unit zzj(PlaceSearchFragment placeSearchFragment, List list, int i10) {
        PlaceSearchFragmentListener placeSearchFragmentListener = placeSearchFragment.zzh;
        if (placeSearchFragmentListener != null) {
            placeSearchFragmentListener.onPlaceSelected(zzr((Place) list.get(i10)));
        }
        zzpb zzpbVar = placeSearchFragment.zzg;
        if (zzpbVar == null) {
            Intrinsics.y("analyticsReporter");
            zzpbVar = null;
        }
        zzpbVar.zze();
        return Unit.f142422a;
    }

    static /* synthetic */ void zzk(PlaceSearchFragment placeSearchFragment) {
        Parcelable parcelable = placeSearchFragment.zzi;
        if (parcelable != null) {
            RecyclerView recyclerView = placeSearchFragment.zzc;
            if (recyclerView == null) {
                Intrinsics.y("recyclerView");
                recyclerView = null;
            }
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.s1(parcelable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzl() {
        return ((Number) this.zzm.getValue(this, zza[0])).intValue();
    }

    private final void zzo(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(zzr((Place) it.next()));
        }
        PlaceSearchFragmentListener placeSearchFragmentListener = this.zzh;
        if (placeSearchFragmentListener != null) {
            placeSearchFragmentListener.onLoad(arrayList);
        }
        zzpb zzpbVar = this.zzg;
        if (zzpbVar == null) {
            Intrinsics.y("analyticsReporter");
            zzpbVar = null;
        }
        zzpbVar.zzd();
    }

    private static final List zzq(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Place.Field.DISPLAY_NAME);
        arrayList.add(Place.Field.ID);
        arrayList.add(Place.Field.LOCATION);
        arrayList.add(Place.Field.VIEWPORT);
        if (list.contains(Content.MEDIA)) {
            arrayList.add(Place.Field.PHOTO_METADATAS);
        }
        if (list.contains(Content.ADDRESS)) {
            arrayList.add(Place.Field.FORMATTED_ADDRESS);
        }
        if (list.contains(Content.RATING)) {
            arrayList.add(Place.Field.USER_RATING_COUNT);
            arrayList.add(Place.Field.RATING);
        }
        if (list.contains(Content.PRICE)) {
            arrayList.add(Place.Field.PRICE_LEVEL);
            arrayList.add(Place.Field.PRICE_RANGE);
        }
        if (list.contains(Content.TYPE)) {
            arrayList.add(Place.Field.PRIMARY_TYPE_DISPLAY_NAME);
        }
        if (list.contains(Content.ACCESSIBLE_ENTRANCE_ICON)) {
            arrayList.add(Place.Field.ACCESSIBILITY_OPTIONS);
        }
        if (list.contains(Content.OPEN_NOW_STATUS)) {
            arrayList.add(Place.Field.CURRENT_OPENING_HOURS);
            arrayList.add(Place.Field.UTC_OFFSET);
            arrayList.add(Place.Field.BUSINESS_STATUS);
        }
        return arrayList;
    }

    public final void configureFromSearchByTextRequest(@RecentlyNonNull SearchByTextRequest request) throws Resources.NotFoundException {
        Intrinsics.j(request, "request");
        zzn();
        zzpw zzpwVar = this.zzb;
        zzpb zzpbVar = null;
        if (zzpwVar == null) {
            Intrinsics.y("viewModel");
            zzpwVar = null;
        }
        List list = this.zzl;
        if (list == null) {
            Intrinsics.y("content");
            list = null;
        }
        zzpwVar.zzf(request, zzq(list));
        zzpb zzpbVar2 = this.zzg;
        if (zzpbVar2 == null) {
            Intrinsics.y("analyticsReporter");
        } else {
            zzpbVar = zzpbVar2;
        }
        zzpbVar.zzb(zzajw.SEARCH_BY_TEXT_REQUEST);
    }

    public final void configureFromSearchNearbyRequest(@RecentlyNonNull SearchNearbyRequest request) throws Resources.NotFoundException {
        Intrinsics.j(request, "request");
        zzn();
        zzpw zzpwVar = this.zzb;
        zzpb zzpbVar = null;
        if (zzpwVar == null) {
            Intrinsics.y("viewModel");
            zzpwVar = null;
        }
        List list = this.zzl;
        if (list == null) {
            Intrinsics.y("content");
            list = null;
        }
        zzpwVar.zzg(request, zzq(list));
        zzpb zzpbVar2 = this.zzg;
        if (zzpbVar2 == null) {
            Intrinsics.y("analyticsReporter");
        } else {
            zzpbVar = zzpbVar2;
        }
        zzpbVar.zzb(zzajw.SEARCH_NEARBY_REQUEST);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(@RecentlyNonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.j(inflater, "inflater");
        Bundle bundleRequireArguments = requireArguments();
        Intrinsics.i(bundleRequireArguments, "requireArguments(...)");
        Orientation orientation = (Orientation) zzof.zza(bundleRequireArguments, "arg-orientation", Orientation.class);
        this.zzk = orientation;
        if (orientation == null) {
            Intrinsics.y("orientation");
            orientation = null;
        }
        int i10 = orientation == Orientation.VERTICAL ? R.layout.place_search_vertical_fragment : R.layout.place_search_horizontal_fragment;
        Bundle bundleRequireArguments2 = requireArguments();
        Intrinsics.i(bundleRequireArguments2, "requireArguments(...)");
        this.zzl = ((zzaj) zzof.zza(bundleRequireArguments2, "arg-content", zzaj.class)).zza();
        this.zzm.setValue(this, zza[0], Integer.valueOf(requireArguments().getInt("arg-theme-res-id")));
        View viewInflate = inflater.cloneInContext(new ContextThemeWrapper(getContext(), zzl())).inflate(i10, container, false);
        Intrinsics.i(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@RecentlyNonNull Bundle outState) {
        Intrinsics.j(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putParcelable("arg-media-size", this.zzq);
        outState.putParcelable("arg-attribution-position", this.zzp);
        outState.putBoolean("arg-selectable", this.zzn);
        outState.putBoolean("arg-prefer-truncation", this.zzo);
        outState.putBoolean("arg-show-legal-disclosures", this.zzj);
        RecyclerView recyclerView = this.zzc;
        if (recyclerView == null) {
            Intrinsics.y("recyclerView");
            recyclerView = null;
        }
        RecyclerView.p layoutManager = recyclerView.getLayoutManager();
        Parcelable parcelableT1 = layoutManager != null ? layoutManager.t1() : null;
        if (parcelableT1 != null) {
            outState.putParcelable("arg-scroll-state", parcelableT1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@RecentlyNonNull View view, Bundle savedInstanceState) throws Resources.NotFoundException {
        zzajp zzajpVar;
        zzajz zzajzVar;
        zzajr zzajrVar;
        Intrinsics.j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState != null) {
            this.zzo = savedInstanceState.getBoolean("arg-prefer-truncation");
            this.zzn = savedInstanceState.getBoolean("arg-selectable");
            this.zzq = (MediaSize) zzof.zza(savedInstanceState, "arg-media-size", MediaSize.class);
            this.zzp = (AttributionPosition) zzof.zza(savedInstanceState, "arg-attribution-position", AttributionPosition.class);
            if (savedInstanceState.containsKey("arg-scroll-state")) {
                this.zzi = zzof.zza(savedInstanceState, "arg-scroll-state", Parcelable.class);
            }
            boolean z10 = savedInstanceState.getBoolean("arg-show-legal-disclosures");
            this.zzj = z10;
            if (z10) {
                zzm();
            }
        }
        this.zzf = (ProgressBar) view.findViewById(R.id.loading_indicator);
        this.zzc = (RecyclerView) view.findViewById(R.id.place_search_list_recycler_view);
        Orientation orientation = this.zzk;
        zzpb zzpbVar = null;
        if (orientation == null) {
            Intrinsics.y("orientation");
            orientation = null;
        }
        zzaju zzajuVar = orientation == Orientation.VERTICAL ? zzaju.ORIENTATION_VERTICAL : zzaju.ORIENTATION_HORIZONTAL;
        List list = this.zzl;
        if (list == null) {
            Intrinsics.y("content");
            list = null;
        }
        List<Content> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
        for (Content content : list2) {
            Parcelable.Creator<MediaSize> creator = MediaSize.CREATOR;
            Content content2 = Content.MEDIA;
            Parcelable.Creator<AttributionPosition> creator2 = AttributionPosition.CREATOR;
            switch (content.ordinal()) {
                case 0:
                    zzajrVar = zzajr.PHOTO;
                    break;
                case 1:
                    zzajrVar = zzajr.ADDRESS;
                    break;
                case 2:
                    zzajrVar = zzajr.RATING;
                    break;
                case 3:
                    zzajrVar = zzajr.PRICE;
                    break;
                case 4:
                    zzajrVar = zzajr.TYPE;
                    break;
                case 5:
                    zzajrVar = zzajr.ACCESSIBILITY;
                    break;
                case 6:
                    zzajrVar = zzajr.OPEN_NOW_STATUS;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(zzajrVar);
        }
        boolean z11 = this.zzn;
        boolean z12 = this.zzo;
        MediaSize mediaSize = this.zzq;
        Parcelable.Creator<MediaSize> creator3 = MediaSize.CREATOR;
        Content content3 = Content.MEDIA;
        Parcelable.Creator<AttributionPosition> creator4 = AttributionPosition.CREATOR;
        int iOrdinal = mediaSize.ordinal();
        if (iOrdinal == 0) {
            zzajpVar = zzajp.SMALL;
        } else if (iOrdinal == 1) {
            zzajpVar = zzajp.MEDIUM;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            zzajpVar = zzajp.LARGE;
        }
        zzajp zzajpVar2 = zzajpVar;
        int iOrdinal2 = this.zzp.ordinal();
        if (iOrdinal2 == 0) {
            zzajzVar = zzajz.POSITION_TOP;
        } else {
            if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            zzajzVar = zzajz.POSITION_BOTTOM;
        }
        zzpb zzpbVar2 = new zzpb(zzajuVar, arrayList, z11, z12, zzajpVar2, zzajzVar);
        this.zzg = zzpbVar2;
        zzpw zzpwVar = this.zzb;
        if (zzpwVar == null) {
            Intrinsics.y("viewModel");
            zzpwVar = null;
        }
        zzoy zzoyVarZze = zzpwVar.zze();
        zzpbVar2.zza(zzoyVarZze != null ? zzoyVarZze.zzd() : null);
        zzp(null, "");
        zzpw zzpwVar2 = this.zzb;
        if (zzpwVar2 == null) {
            Intrinsics.y("viewModel");
            zzpwVar2 = null;
        }
        zzpwVar2.zza().i(getViewLifecycleOwner(), new zzas(new Function1() { // from class: com.google.android.libraries.places.widget.zzar
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj) {
                return PlaceSearchFragment.zzd(this.zza, (List) obj);
            }
        }));
        zzpw zzpwVar3 = this.zzb;
        if (zzpwVar3 == null) {
            Intrinsics.y("viewModel");
            zzpwVar3 = null;
        }
        zzpwVar3.zzc().i(getViewLifecycleOwner(), new zzas(new Function1() { // from class: com.google.android.libraries.places.widget.zzak
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj) {
                return PlaceSearchFragment.zze(this.zza, (List) obj);
            }
        }));
        zzpw zzpwVar4 = this.zzb;
        if (zzpwVar4 == null) {
            Intrinsics.y("viewModel");
            zzpwVar4 = null;
        }
        zzpwVar4.zzb().i(getViewLifecycleOwner(), new zzas(new Function1() { // from class: com.google.android.libraries.places.widget.zzal
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj) {
                return PlaceSearchFragment.zzf(this.zza, (Exception) obj);
            }
        }));
        zzpb zzpbVar3 = this.zzg;
        if (zzpbVar3 == null) {
            Intrinsics.y("analyticsReporter");
        } else {
            zzpbVar = zzpbVar3;
        }
        zzpbVar.zzc();
    }

    @JvmStatic
    @JvmOverloads
    public static final PlaceSearchFragment newInstance(@RecentlyNonNull List<? extends Content> list, @RecentlyNonNull Orientation orientation, int i10) {
        return INSTANCE.newInstance(list, orientation, i10);
    }

    private final void zzp(List list, String str) throws Resources.NotFoundException {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        View viewFindViewById;
        View viewFindViewById2;
        int i10;
        int i11;
        int i12;
        int i13;
        LinearLayout linearLayout = (LinearLayout) requireView().findViewById(R.id.place_search_attribution_container_top);
        if (linearLayout != null) {
            if (this.zzp == AttributionPosition.TOP) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            linearLayout.setVisibility(i13);
        }
        LinearLayout linearLayout2 = (LinearLayout) requireView().findViewById(R.id.place_search_attribution_container_bottom);
        if (linearLayout2 != null) {
            if (this.zzp == AttributionPosition.BOTTOM) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            linearLayout2.setVisibility(i12);
        }
        if (list != null && list.size() != 0) {
            View viewFindViewById3 = requireView().findViewById(R.id.place_search_horizontal_top_gap);
            if (viewFindViewById3 != null) {
                if (this.zzp == AttributionPosition.BOTTOM) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                viewFindViewById3.setVisibility(i11);
            }
            View viewFindViewById4 = requireView().findViewById(R.id.place_search_horizontal_bottom_gap);
            if (viewFindViewById4 != null) {
                if (this.zzp == AttributionPosition.TOP) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                viewFindViewById4.setVisibility(i10);
            }
        } else {
            View viewFindViewById5 = requireView().findViewById(R.id.place_search_horizontal_top_gap);
            if (viewFindViewById5 != null) {
                viewFindViewById5.setVisibility(8);
            }
            View viewFindViewById6 = requireView().findViewById(R.id.place_search_horizontal_bottom_gap);
            if (viewFindViewById6 != null) {
                viewFindViewById6.setVisibility(8);
            }
        }
        TextView textView = (TextView) requireView().findViewById(R.id.place_search_text_top);
        TextView textView2 = (TextView) requireView().findViewById(R.id.place_search_text_bottom);
        ImageView imageView4 = null;
        if (str == null) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        } else if (this.zzp == AttributionPosition.TOP) {
            if (textView != null) {
                textView.setText(str);
            } else {
                textView = null;
            }
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        } else {
            if (textView2 != null) {
                textView2.setText(str);
            } else {
                textView2 = null;
            }
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
        zzoe zzoeVar = zzoe.zza;
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        int iZza = zzod.zza(contextRequireContext, zzl());
        View viewFindViewById7 = requireView().findViewById(R.id.place_search_attribution_container_top);
        View viewFindViewById8 = requireView().findViewById(R.id.place_search_attribution_container_bottom);
        if (viewFindViewById7 != null) {
            imageView = (ImageView) viewFindViewById7.findViewById(R.id.place_search_google_maps_attribution_image);
        } else {
            imageView = null;
        }
        if (imageView != null) {
            imageView.setColorFilter(iZza);
        }
        if (viewFindViewById8 != null) {
            imageView2 = (ImageView) viewFindViewById8.findViewById(R.id.place_search_google_maps_attribution_image);
        } else {
            imageView2 = null;
        }
        if (imageView2 != null) {
            imageView2.setColorFilter(iZza);
        }
        if (viewFindViewById7 != null) {
            imageView3 = (ImageView) viewFindViewById7.findViewById(R.id.place_search_disclosure_icon_image);
        } else {
            imageView3 = null;
        }
        if (imageView3 != null) {
            imageView3.setColorFilter(iZza);
        }
        if (viewFindViewById8 != null) {
            imageView4 = (ImageView) viewFindViewById8.findViewById(R.id.place_search_disclosure_icon_image);
        }
        if (imageView4 != null) {
            imageView4.setColorFilter(iZza);
        }
        if (viewFindViewById7 != null && (viewFindViewById2 = viewFindViewById7.findViewById(R.id.place_search_disclosure_icon)) != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zzan
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view) {
                    this.zza.zzm();
                }
            });
        }
        if (viewFindViewById8 != null && (viewFindViewById = viewFindViewById8.findViewById(R.id.place_search_disclosure_icon)) != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zzao
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view) {
                    this.zza.zzm();
                }
            });
        }
    }

    private static final Place zzr(Place place) {
        Place.Builder builder = Place.builder();
        builder.setId(place.getId());
        builder.setLocation(place.getLocation());
        builder.setViewport(place.getViewport());
        Place placeBuild = builder.build();
        Intrinsics.i(placeBuild, "build(...)");
        return placeBuild;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Application application = requireActivity().getApplication();
        Intrinsics.i(application, "getApplication(...)");
        this.zzb = (zzpw) new f0(this, zzpk.zza(application)).a(zzpw.class);
    }
}
