package fi;

import a3.B;
import a3.v;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.C6083i;
import androidx.media3.exoplayer.source.ads.a;
import androidx.media3.ui.PlayerView;
import androidx.view.InterfaceC6015f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l3.C15361e;
import tv.InterfaceC17140B;
import tv.S;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lfi/k;", "Landroidx/lifecycle/f;", "Landroid/content/Context;", "context", "", "adTagUrl", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "Landroidx/media3/exoplayer/ExoPlayer;", "player", "Landroid/net/Uri;", "contextUri", "", "e", "(Landroidx/media3/exoplayer/ExoPlayer;Landroid/net/Uri;)V", "Landroidx/media3/ui/PlayerView;", "playerView", "c", "(Landroidx/media3/ui/PlayerView;Landroid/net/Uri;)Landroidx/media3/exoplayer/ExoPlayer;", "f", "a", "Landroid/content/Context;", "b", "Ljava/lang/String;", "Ll3/e;", "Ll3/e;", "imaAdsLoader", "Ltv/B;", "", "d", "Ltv/B;", "isAdReady", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"DeprecatedCall"})
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class k implements InterfaceC6015f {

    /* renamed from: e, reason: collision with root package name */
    public static final int f131168e = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String adTagUrl;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C15361e imaAdsLoader;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private InterfaceC17140B<Boolean> isAdReady;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"fi/k$a", "La3/B$d;", "", "playbackState", "", "H0", "(I)V", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements B.d {
        @Override // a3.B.d
        public void H0(int playbackState) {
            if (playbackState == 3) {
                k.this.isAdReady.setValue(Boolean.TRUE);
            }
        }

        a() {
        }
    }

    public k(Context context, String adTagUrl) {
        Intrinsics.j(context, "context");
        Intrinsics.j(adTagUrl, "adTagUrl");
        this.context = context;
        this.adTagUrl = adTagUrl;
        C15361e c15361eA = new C15361e.b(context).a();
        Intrinsics.i(c15361eA, "build(...)");
        this.imaAdsLoader = c15361eA;
        this.isAdReady = S.a(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.media3.exoplayer.source.ads.a d(k kVar, v.b it) {
        Intrinsics.j(it, "it");
        return kVar.imaAdsLoader;
    }

    private final void e(ExoPlayer player, Uri contextUri) {
        v vVarA = new v.c().i(contextUri).b(new v.b.a(Uri.parse(this.adTagUrl)).c()).a();
        Intrinsics.i(vVarA, "build(...)");
        player.Q(vVarA);
        player.g();
        player.l(new a());
    }

    public final ExoPlayer c(PlayerView playerView, Uri contextUri) {
        Intrinsics.j(playerView, "playerView");
        Intrinsics.j(contextUri, "contextUri");
        C6083i c6083iU = new C6083i(this.context.getApplicationContext()).u(new a.b() { // from class: fi.j
            @Override // androidx.media3.exoplayer.source.ads.a.b
            public final androidx.media3.exoplayer.source.ads.a a(v.b bVar) {
                return k.d(this.f131167a, bVar);
            }
        }, playerView);
        Intrinsics.i(c6083iU, "setLocalAdInsertionComponents(...)");
        ExoPlayer exoPlayerF = new ExoPlayer.b(playerView.getContext()).g(c6083iU).f();
        Intrinsics.i(exoPlayerF, "build(...)");
        playerView.setPlayer(exoPlayerF);
        this.imaAdsLoader.n(exoPlayerF);
        e(exoPlayerF, contextUri);
        return exoPlayerF;
    }

    public final void f(ExoPlayer player, Uri contextUri) {
        Intrinsics.j(player, "player");
        Intrinsics.j(contextUri, "contextUri");
        this.imaAdsLoader.l();
        this.imaAdsLoader.n(player);
        e(player, contextUri);
    }
}
