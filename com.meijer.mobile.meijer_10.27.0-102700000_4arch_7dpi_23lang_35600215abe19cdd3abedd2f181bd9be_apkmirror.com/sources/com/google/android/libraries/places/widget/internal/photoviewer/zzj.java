package com.google.android.libraries.places.widget.internal.photoviewer;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.view.C6031t;
import com.bumptech.glide.b;
import com.bumptech.glide.j;
import com.bumptech.glide.k;
import com.fullstory.FS;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.internal.zzmo;
import com.google.android.libraries.places.internal.zzof;
import com.google.android.libraries.places.internal.zzow;
import com.google.android.libraries.places.internal.zzox;
import com.google.android.libraries.places.internal.zzoy;
import kotlin.jvm.internal.Intrinsics;
import m7.C15572g;
import qv.C16648k;

/* loaded from: classes6.dex */
public final class zzj extends Fragment {
    public static final /* synthetic */ int zzb = 0;
    public zzc zza;
    private ImageView zzc;
    private ImageView zzd;
    private com.google.android.libraries.places.widget.model.zzi zze;
    private FrameLayout zzf;
    private zzoy zzg;
    private View zzh;
    private View zzi;

    static /* synthetic */ void zzf(zzj zzjVar, View view) {
        zzjVar.zzi(false);
        zzjVar.zzb().onGoToPreviousImage();
        zzjVar.zzj();
    }

    static /* synthetic */ void zzg(zzj zzjVar, View view) {
        zzjVar.zzi(false);
        zzjVar.zzb().onGoToNextImage();
        zzjVar.zzj();
    }

    public final zzoy zza() {
        return this.zzg;
    }

    public static final /* synthetic */ void zzd(zzj zzjVar) {
        ImageView imageView = zzjVar.zzc;
        FrameLayout frameLayout = null;
        if (imageView == null) {
            Intrinsics.y("image");
            imageView = null;
        }
        imageView.setVisibility(8);
        FrameLayout frameLayout2 = zzjVar.zzf;
        if (frameLayout2 == null) {
            Intrinsics.y("loadingFailedUi");
        } else {
            frameLayout = frameLayout2;
        }
        frameLayout.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzi(boolean z10) {
        View view = this.zzh;
        View view2 = null;
        if (view == null) {
            Intrinsics.y("previousImageButton");
            view = null;
        }
        view.setEnabled(z10);
        View view3 = this.zzi;
        if (view3 == null) {
            Intrinsics.y("nextImageButton");
        } else {
            view2 = view3;
        }
        view2.setEnabled(z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.j(context, "context");
        super.onAttach(context);
        if (!(context instanceof zzc)) {
            FS.log_e("PhotoViewerFragment", "Context must implement PhotoNavigationListener");
            return;
        }
        zzc zzcVar = (zzc) context;
        Intrinsics.j(zzcVar, "<set-?>");
        this.zza = zzcVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.j(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.photo_viewer_fragment, viewGroup, false);
        this.zzd = (ImageView) viewInflate.findViewById(R.id.blurred_background_image);
        this.zzc = (ImageView) viewInflate.findViewById(R.id.photo_viewer_image);
        this.zzf = (FrameLayout) viewInflate.findViewById(R.id.loading_failed_ui);
        this.zzh = viewInflate.findViewById(R.id.previous_image_button);
        this.zzi = viewInflate.findViewById(R.id.next_image_button);
        View view = this.zzh;
        View view2 = null;
        if (view == null) {
            Intrinsics.y("previousImageButton");
            view = null;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.photoviewer.zzg
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view3) {
                zzj.zzf(this.zza, view3);
            }
        });
        View view3 = this.zzi;
        if (view3 == null) {
            Intrinsics.y("nextImageButton");
        } else {
            view2 = view3;
        }
        view2.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.photoviewer.zzd
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view4) {
                zzj.zzg(this.zza, view4);
            }
        });
        Intrinsics.g(viewInflate);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.j(view, "view");
        super.onViewCreated(view, bundle);
        k kVarT = b.t(requireContext());
        com.google.android.libraries.places.widget.model.zzi zziVar = this.zze;
        ImageView imageView = null;
        if (zziVar == null) {
            Intrinsics.y("pageData");
            zziVar = null;
        }
        j<Drawable> jVarI = kVarT.i(zziVar.zzb());
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        j<Drawable> jVarA = jVarI.a(C15572g.p0(new zza(contextRequireContext, 25.0f, 0.125f)));
        ImageView imageView2 = this.zzd;
        if (imageView2 == null) {
            Intrinsics.y("blurredBackground");
        } else {
            imageView = imageView2;
        }
        jVarA.C0(imageView);
        requireView().post(new Runnable() { // from class: com.google.android.libraries.places.widget.internal.photoviewer.zze
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzj zzjVar = this.zza;
                C16648k.d(C6031t.a(zzjVar), null, null, new zzi(zzjVar, null), 3, null);
            }
        });
    }

    public final zzc zzb() {
        zzc zzcVar = this.zza;
        if (zzcVar != null) {
            return zzcVar;
        }
        Intrinsics.y("photoNavigationListener");
        return null;
    }

    private final void zzj() {
        View view = getView();
        if (view != null) {
            view.postDelayed(new Runnable() { // from class: com.google.android.libraries.places.widget.internal.photoviewer.zzf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzi(true);
                }
            }, 300L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.zze = (com.google.android.libraries.places.widget.model.zzi) zzof.zza(arguments, "page_data", com.google.android.libraries.places.widget.model.zzi.class);
        }
        if (this.zzg == null) {
            zzox zzoxVarZza = zzow.zza();
            zzoxVarZza.zzc(requireContext());
            zzoxVarZza.zzb(zzmo.PLACES_UI_KIT);
            this.zzg = zzoxVarZza.zza();
        }
    }
}
