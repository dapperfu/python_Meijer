package com.google.android.libraries.places.widget.internal.photoviewer;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.annotation.RecentlyNonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.a;
import androidx.core.view.ViewCompat;
import androidx.core.view.j;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.r;
import androidx.viewpager2.widget.ViewPager2;
import c2.d;
import com.bumptech.glide.b;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.internal.zzof;
import com.google.android.libraries.places.internal.zzoq;
import com.google.android.libraries.places.widget.internal.photoviewer.PlacesLightboxActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p2.G;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 H2\u00020\u00012\u00020\u0002:\u0003IJHB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u0014J\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u0014J\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\"\u0010!J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b#\u0010\u0014J\u0017\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u001fH\u0002¢\u0006\u0004\b%\u0010&J%\u0010+\u001a\u00020\u00072\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010*\u001a\u00020\u001fH\u0002¢\u0006\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u00106\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010<R+\u0010D\u001a\u00020\u001f2\u0006\u0010>\u001a\u00020\u001f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010&R\u0016\u0010F\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006K"}, d2 = {"Lcom/google/android/libraries/places/widget/internal/photoviewer/PlacesLightboxActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/google/android/libraries/places/widget/internal/photoviewer/PhotoViewerFragment$PhotoNavigationListener;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "onGoToPreviousImage", "onGoToNextImage", "onDestroy", "finish", "openUserProfile", "Landroid/view/View;", "anchorView", "showPopupMenu", "(Landroid/view/View;)V", "", "uri", "openUriInBrowser", "(Ljava/lang/String;)V", "view", "adjustBottomMarginForEdgeToEdge", "adjustStartMargin", "adjustEndMargin", "Lc2/d;", "insets", "", "getStartInset", "(Lc2/d;Landroid/view/View;)I", "getEndInset", "adjustIndicatorMargins", "selectedItem", "updateUI", "(I)V", "", "Lcom/google/android/libraries/places/widget/model/PhotoPageData;", "photoPageDataList", "initialIndex", "hookupThePhotos", "(Ljava/util/List;I)V", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "Landroid/widget/ImageView;", "userProfileImageView", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "userName", "Landroid/widget/TextView;", "pageDataList", "Ljava/util/List;", "Lcom/google/android/libraries/places/widget/internal/placedetails/AnalyticsReporter;", "analyticsReporter", "Lcom/google/android/libraries/places/widget/internal/placedetails/AnalyticsReporter;", "numberOfPhotosShownInGallery", "I", "previousPhotoIndex", "<set-?>", "themeResId$delegate", "Lkotlin/properties/ReadWriteProperty;", "getThemeResId", "()I", "setThemeResId", "themeResId", "Lcom/google/android/libraries/places/widget/internal/photoviewer/PlacesLightboxActivity$ThemeDimensionHelper;", "themeDimensionHelper", "Lcom/google/android/libraries/places/widget/internal/photoviewer/PlacesLightboxActivity$ThemeDimensionHelper;", "Companion", "ParcelablePhotoPageDataList", "ThemeDimensionHelper", "java.com.google.android.libraries.places.widget.internal.photoviewer_ui_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlacesLightboxActivity extends AppCompatActivity implements zzc {
    private ViewPager2 zzb;
    private ImageView zzc;
    private TextView zzd;
    private List zze;
    private com.google.android.libraries.places.widget.internal.placedetails.zzp zzf;
    private int zzg;
    private int zzh = -1;
    private final ReadWriteProperty zzi = Delegates.f142874a.a();
    private zzv zzj;
    static final /* synthetic */ KProperty[] zza = {Reflection.f(new MutablePropertyReference1Impl(PlacesLightboxActivity.class, "themeResId", "getThemeResId()I", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/google/android/libraries/places/widget/internal/photoviewer/PlacesLightboxActivity$Companion;", "", "<init>", "()V", "EXTRA_PHOTO_PAGE_DATA_LIST", "", "EXTRA_START_INDEX", "EXTRA_ANALYTICS_REPORTER", "EXTRA_NUMBER_OF_PHOTOS_SHOWN_IN_GALLERY", "EXTRA_THEME_RES_ID", "EXTRA_PREVIOUS_PHOTO_INDEX", "NO_PREVIOUS_PHOTO_INDEX", "", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "index", "pageDataList", "Lcom/google/android/libraries/places/widget/internal/photoviewer/PlacesLightboxActivity$ParcelablePhotoPageDataList;", "theme", "analyticsReporter", "Lcom/google/android/libraries/places/widget/internal/placedetails/AnalyticsReporter;", "java.com.google.android.libraries.places.widget.internal.photoviewer_ui_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
            throw null;
        }

        public /* synthetic */ Companion(@RecentlyNonNull DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws Resources.NotFoundException {
        RecyclerView.h adapter;
        this.zzg = savedInstanceState != null ? savedInstanceState.getInt("extra-number-of-photos-shown-in-gallery") : 0;
        this.zzh = savedInstanceState != null ? savedInstanceState.getInt("extra-previous-photo-index") : -1;
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.zzi.setValue(this, zza[0], Integer.valueOf(extras.getInt("extra-theme-res-id")));
        setTheme(zzg());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_lightbox_activity);
        this.zzj = new zzv(this, zzg());
        a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.k();
        }
        r.b(this, null, null, 3, null);
        this.zzb = (ViewPager2) findViewById(R.id.photo_pager);
        this.zzc = (ImageView) findViewById(R.id.profile_image);
        this.zzd = (TextView) findViewById(R.id.user_name);
        PageSelectionIndicator pageSelectionIndicator = (PageSelectionIndicator) findViewById(R.id.selection_indicator);
        View viewFindViewById = findViewById(R.id.close_button);
        View viewFindViewById2 = findViewById(R.id.more_button);
        View viewFindViewById3 = findViewById(R.id.user_profile_container);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.photoviewer.zzu
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view) {
                PlacesLightboxActivity.zza(this.zza, view);
            }
        });
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.photoviewer.zzn
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view) {
                Intrinsics.g(view);
                final PlacesLightboxActivity placesLightboxActivity = this.zza;
                PopupMenu popupMenu = new PopupMenu(placesLightboxActivity, view);
                popupMenu.getMenuInflater().inflate(R.menu.photo_more_menu, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.google.android.libraries.places.widget.internal.photoviewer.zzp
                    @Override // android.widget.PopupMenu.OnMenuItemClickListener
                    public final /* synthetic */ boolean onMenuItemClick(MenuItem menuItem) {
                        return PlacesLightboxActivity.zzk(placesLightboxActivity, menuItem);
                    }
                });
                popupMenu.show();
            }
        });
        viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.photoviewer.zzo
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view) {
                this.zza.zzh();
            }
        });
        Intrinsics.g(pageSelectionIndicator);
        zzv zzvVar = this.zzj;
        if (zzvVar == null) {
            Intrinsics.y("themeDimensionHelper");
            zzvVar = null;
        }
        final float fZza = zzvVar.zza();
        ViewCompat.A0(pageSelectionIndicator, new G() { // from class: com.google.android.libraries.places.widget.internal.photoviewer.zzt
            @Override // p2.G
            public final /* synthetic */ j onApplyWindowInsets(View view, j jVar) {
                PlacesLightboxActivity.zzf(this.zza, fZza, view, jVar);
                return jVar;
            }
        });
        Intrinsics.g(viewFindViewById);
        zzv zzvVar2 = this.zzj;
        if (zzvVar2 == null) {
            Intrinsics.y("themeDimensionHelper");
            zzvVar2 = null;
        }
        final float fZza2 = zzvVar2.zza();
        ViewCompat.A0(viewFindViewById, new G() { // from class: com.google.android.libraries.places.widget.internal.photoviewer.zzs
            @Override // p2.G
            public final /* synthetic */ j onApplyWindowInsets(View view, j jVar) {
                PlacesLightboxActivity.zze(this.zza, fZza2, view, jVar);
                return jVar;
            }
        });
        Intrinsics.g(viewFindViewById3);
        zzv zzvVar3 = this.zzj;
        if (zzvVar3 == null) {
            Intrinsics.y("themeDimensionHelper");
            zzvVar3 = null;
        }
        final float fZza3 = zzvVar3.zza();
        ViewCompat.A0(viewFindViewById3, new G() { // from class: com.google.android.libraries.places.widget.internal.photoviewer.zzr
            @Override // p2.G
            public final /* synthetic */ j onApplyWindowInsets(View view, j jVar) {
                PlacesLightboxActivity.zzd(this.zza, fZza3, view, jVar);
                return jVar;
            }
        });
        final View viewFindViewById4 = findViewById(R.id.google_maps_logo);
        Intrinsics.i(viewFindViewById4, "findViewById(...)");
        int iZzg = zzg();
        int[] PlacesMaterialThemeAttrs = R.styleable.PlacesMaterialThemeAttrs;
        Intrinsics.i(PlacesMaterialThemeAttrs, "PlacesMaterialThemeAttrs");
        TypedArray typedArrayObtainStyledAttributes = obtainStyledAttributes(iZzg, PlacesMaterialThemeAttrs);
        zzv zzvVar4 = this.zzj;
        if (zzvVar4 == null) {
            Intrinsics.y("themeDimensionHelper");
            zzvVar4 = null;
        }
        final float fZzb = zzvVar4.zzb();
        ViewCompat.A0(viewFindViewById4, new G() { // from class: com.google.android.libraries.places.widget.internal.photoviewer.zzq
            @Override // p2.G
            public final /* synthetic */ j onApplyWindowInsets(View view, j insets) {
                PlacesLightboxActivity.Companion companion = PlacesLightboxActivity.INSTANCE;
                Intrinsics.j(view, "<unused var>");
                Intrinsics.j(insets, "insets");
                ViewGroup.LayoutParams layoutParams = viewFindViewById4.getLayoutParams();
                Intrinsics.h(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, insets.f(j.n.i()).f61365d + ((int) fZzb));
                return insets;
            }
        });
        typedArrayObtainStyledAttributes.recycle();
        ViewPager2 viewPager2 = this.zzb;
        if (viewPager2 == null) {
            Intrinsics.y("viewPager");
            viewPager2 = null;
        }
        viewPager2.setOffscreenPageLimit(4);
        ViewPager2 viewPager22 = this.zzb;
        if (viewPager22 == null) {
            Intrinsics.y("viewPager");
            viewPager22 = null;
        }
        viewPager22.g(new zzw(this));
        ViewPager2 viewPager23 = this.zzb;
        if (viewPager23 == null) {
            Intrinsics.y("viewPager");
            viewPager23 = null;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.i(supportFragmentManager, "getSupportFragmentManager(...)");
        viewPager23.setAdapter(new zzk(supportFragmentManager, getLifecycle()));
        Bundle extras2 = getIntent().getExtras();
        if (extras2 != null) {
            int i10 = extras2.getInt("extra-start-index", 0);
            this.zzf = (com.google.android.libraries.places.widget.internal.placedetails.zzp) zzof.zza(extras2, "extra-analytics-reporter", com.google.android.libraries.places.widget.internal.placedetails.zzp.class);
            List listZza = ((zzm) zzof.zza(extras2, "extra-photo-page-data-list", zzm.class)).zza();
            this.zze = listZza;
            if (listZza == null) {
                Intrinsics.y("pageDataList");
                listZza = null;
            }
            ViewPager2 viewPager24 = (ViewPager2) findViewById(R.id.photo_pager);
            if (viewPager24 != null && (adapter = viewPager24.getAdapter()) != null && (adapter instanceof zzk)) {
                zzk zzkVar = (zzk) adapter;
                zzkVar.zza(listZza);
                zzkVar.notifyDataSetChanged();
                ViewPager2 viewPager25 = this.zzb;
                if (viewPager25 == null) {
                    Intrinsics.y("viewPager");
                    viewPager25 = null;
                }
                viewPager25.j(i10, false);
                zzj(i10);
            }
            ViewPager2 viewpager2 = this.zzb;
            if (viewpager2 == null) {
                Intrinsics.y("viewPager");
                viewpager2 = null;
            }
            com.google.android.libraries.places.widget.internal.placedetails.zzp analyticsReporter = this.zzf;
            if (analyticsReporter == null) {
                Intrinsics.y("analyticsReporter");
                analyticsReporter = null;
            }
            Intrinsics.j(viewpager2, "viewpager2");
            Intrinsics.j(analyticsReporter, "analyticsReporter");
            RecyclerView.h adapter2 = viewpager2.getAdapter();
            Integer numValueOf = adapter2 != null ? Integer.valueOf(adapter2.getTotalNumberOfTabs()) : null;
            if (numValueOf == null) {
                analyticsReporter.zzk();
            } else {
                pageSelectionIndicator.removeAllViews();
                int iIntValue = numValueOf.intValue();
                for (int i11 = 0; i11 < iIntValue; i11++) {
                    View viewInflate = LayoutInflater.from(pageSelectionIndicator.getContext()).inflate(R.layout.page_indicator, (ViewGroup) pageSelectionIndicator, false);
                    Intrinsics.h(viewInflate, "null cannot be cast to non-null type android.view.View");
                    pageSelectionIndicator.addView(viewInflate);
                }
                viewpager2.g(new zzb(pageSelectionIndicator));
            }
            pageSelectionIndicator.zza(i10);
        }
    }

    static /* synthetic */ void zza(PlacesLightboxActivity placesLightboxActivity, View view) {
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar = placesLightboxActivity.zzf;
        if (zzpVar == null) {
            Intrinsics.y("analyticsReporter");
            zzpVar = null;
        }
        zzpVar.zzh();
        placesLightboxActivity.finish();
    }

    static /* synthetic */ j zzd(PlacesLightboxActivity placesLightboxActivity, float f10, View v10, j insets) {
        Intrinsics.j(v10, "v");
        Intrinsics.j(insets, "insets");
        d dVarF = insets.f(j.n.i());
        Intrinsics.i(dVarF, "getInsets(...)");
        ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(zzm(dVarF, v10) + ((int) f10));
        v10.setLayoutParams(marginLayoutParams);
        return insets;
    }

    static /* synthetic */ j zze(PlacesLightboxActivity placesLightboxActivity, float f10, View v10, j insets) {
        Intrinsics.j(v10, "v");
        Intrinsics.j(insets, "insets");
        d dVarF = insets.f(j.n.i());
        Intrinsics.i(dVarF, "getInsets(...)");
        ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd(zzl(dVarF, v10) + ((int) f10));
        v10.setLayoutParams(marginLayoutParams);
        return insets;
    }

    static /* synthetic */ j zzf(PlacesLightboxActivity placesLightboxActivity, float f10, View v10, j insets) {
        Intrinsics.j(v10, "v");
        Intrinsics.j(insets, "insets");
        d dVarF = insets.f(j.n.i());
        Intrinsics.i(dVarF, "getInsets(...)");
        ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = dVarF.f61363b;
        int i10 = (int) f10;
        marginLayoutParams.setMarginStart(zzm(dVarF, v10) + i10);
        marginLayoutParams.setMarginEnd(zzl(dVarF, v10) + i10);
        v10.setLayoutParams(marginLayoutParams);
        return insets;
    }

    private final int zzg() {
        return ((Number) this.zzi.getValue(this, zza[0])).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzh() {
        String strZzf;
        List list = this.zze;
        ViewPager2 viewPager2 = null;
        if (list == null) {
            Intrinsics.y("pageDataList");
            list = null;
        }
        ViewPager2 viewPager22 = this.zzb;
        if (viewPager22 == null) {
            Intrinsics.y("viewPager");
        } else {
            viewPager2 = viewPager22;
        }
        com.google.android.libraries.places.widget.model.zzi zziVar = (com.google.android.libraries.places.widget.model.zzi) CollectionsKt.v0(list, viewPager2.getCurrentItem());
        if (zziVar == null || (strZzf = zziVar.zzf()) == null) {
            return;
        }
        zzi(strZzf);
    }

    private final void zzi(String str) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException unused) {
            new zzoq(this, zzg()).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj(int i10) {
        List list = this.zze;
        ImageView imageView = null;
        if (list == null) {
            Intrinsics.y("pageDataList");
            list = null;
        }
        com.google.android.libraries.places.widget.model.zzi zziVar = (com.google.android.libraries.places.widget.model.zzi) CollectionsKt.v0(list, i10);
        if (zziVar != null) {
            TextView textView = this.zzd;
            if (textView == null) {
                Intrinsics.y("userName");
                textView = null;
            }
            textView.setText(zziVar.zzd());
            com.bumptech.glide.j jVarC = b.v(this).i(zziVar.zze()).c();
            ImageView imageView2 = this.zzc;
            if (imageView2 == null) {
                Intrinsics.y("userProfileImageView");
            } else {
                imageView = imageView2;
            }
            jVarC.C0(imageView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzk(PlacesLightboxActivity placesLightboxActivity, MenuItem menuItem) {
        String strZzc;
        Intrinsics.j(menuItem, "menuItem");
        if (menuItem.getItemId() != R.id.report_a_photo) {
            return false;
        }
        List list = placesLightboxActivity.zze;
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar = null;
        if (list == null) {
            Intrinsics.y("pageDataList");
            list = null;
        }
        ViewPager2 viewPager2 = placesLightboxActivity.zzb;
        if (viewPager2 == null) {
            Intrinsics.y("viewPager");
            viewPager2 = null;
        }
        com.google.android.libraries.places.widget.model.zzi zziVar = (com.google.android.libraries.places.widget.model.zzi) CollectionsKt.v0(list, viewPager2.getCurrentItem());
        if (zziVar != null && (strZzc = zziVar.zzc()) != null) {
            com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar2 = placesLightboxActivity.zzf;
            if (zzpVar2 == null) {
                Intrinsics.y("analyticsReporter");
            } else {
                zzpVar = zzpVar2;
            }
            zzpVar.zzi();
            placesLightboxActivity.zzi(strZzc);
        }
        return true;
    }

    @Override // com.google.android.libraries.places.widget.internal.photoviewer.zzc
    public void onGoToNextImage() {
        ViewPager2 viewPager2 = this.zzb;
        ViewPager2 viewPager22 = null;
        if (viewPager2 == null) {
            Intrinsics.y("viewPager");
            viewPager2 = null;
        }
        List list = this.zze;
        if (list == null) {
            Intrinsics.y("pageDataList");
            list = null;
        }
        int size = list.size() - 1;
        ViewPager2 viewPager23 = this.zzb;
        if (viewPager23 == null) {
            Intrinsics.y("viewPager");
        } else {
            viewPager22 = viewPager23;
        }
        viewPager2.j(Math.min(size, viewPager22.getCurrentItem() + 1), false);
    }

    @Override // com.google.android.libraries.places.widget.internal.photoviewer.zzc
    public void onGoToPreviousImage() {
        ViewPager2 viewPager2 = this.zzb;
        ViewPager2 viewPager22 = null;
        if (viewPager2 == null) {
            Intrinsics.y("viewPager");
            viewPager2 = null;
        }
        ViewPager2 viewPager23 = this.zzb;
        if (viewPager23 == null) {
            Intrinsics.y("viewPager");
        } else {
            viewPager22 = viewPager23;
        }
        viewPager2.j(Math.max(0, viewPager22.getCurrentItem() - 1), false);
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(@RecentlyNonNull Bundle outState) {
        Intrinsics.j(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putInt("extra-number-of-photos-shown-in-gallery", this.zzg);
        outState.putInt("extra-previous-photo-index", this.zzh);
    }

    private static final int zzl(d dVar, View view) {
        if (view.getLayoutDirection() == 1) {
            return dVar.f61362a;
        }
        return dVar.f61364c;
    }

    private static final int zzm(d dVar, View view) {
        if (view.getLayoutDirection() == 1) {
            return dVar.f61364c;
        }
        return dVar.f61362a;
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar = this.zzf;
        if (zzpVar == null) {
            Intrinsics.y("analyticsReporter");
            zzpVar = null;
        }
        zzpVar.zzj(this.zzg);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        ViewPager2 viewPager2 = this.zzb;
        if (viewPager2 == null) {
            Intrinsics.y("viewPager");
            viewPager2 = null;
        }
        viewPager2.setAdapter(null);
    }
}
