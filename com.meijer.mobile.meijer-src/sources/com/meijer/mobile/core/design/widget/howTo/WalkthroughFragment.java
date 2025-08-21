package com.meijer.mobile.core.design.widget.howTo;

import Oj.q;
import Vj.WalkthroughPage;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.fullstory.FS;
import com.meijer.mobile.core.design.widget.howTo.WalkthroughFragment;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import x4.InterfaceC18089i;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0002\u0011\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/core/design/widget/howTo/WalkthroughFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "LVj/e;", "a", "LVj/e;", "walkthroughPage", "LOj/q;", "b", "LOj/q;", "binding", "c", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class WalkthroughFragment extends Fragment {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f96925d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private WalkthroughPage walkthroughPage;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private q binding;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/core/design/widget/howTo/WalkthroughFragment$a;", "", "", "url", "", "l0", "(Ljava/lang/String;)V", "Landroid/widget/TextView;", "textView", "I", "(Landroid/widget/TextView;)V", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        void I(TextView textView);

        void l0(String url);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/meijer/mobile/core/design/widget/howTo/WalkthroughFragment$b;", "", "<init>", "()V", "LVj/e;", "walkthroughPage", "Lcom/meijer/mobile/core/design/widget/howTo/WalkthroughFragment;", "a", "(LVj/e;)Lcom/meijer/mobile/core/design/widget/howTo/WalkthroughFragment;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.core.design.widget.howTo.WalkthroughFragment$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final WalkthroughFragment a(WalkthroughPage walkthroughPage) {
            Intrinsics.j(walkthroughPage, "walkthroughPage");
            WalkthroughFragment walkthroughFragment = new WalkthroughFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("walkthrough_argument_key", walkthroughPage);
            walkthroughFragment.setArguments(bundle);
            return walkthroughFragment;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.j(inflater, "inflater");
        q qVarM0 = q.M0(inflater, container, false);
        this.binding = qVarM0;
        q qVar = null;
        if (qVarM0 == null) {
            Intrinsics.x("binding");
            qVarM0 = null;
        }
        ImageView imageView = qVarM0.f24405B;
        WalkthroughPage walkthroughPage = this.walkthroughPage;
        if (walkthroughPage == null) {
            Intrinsics.x("walkthroughPage");
            walkthroughPage = null;
        }
        FS.Resources_setImageResource(imageView, walkthroughPage.getImage());
        q qVar2 = this.binding;
        if (qVar2 == null) {
            Intrinsics.x("binding");
            qVar2 = null;
        }
        TextView textView = qVar2.f24407D;
        WalkthroughPage walkthroughPage2 = this.walkthroughPage;
        if (walkthroughPage2 == null) {
            Intrinsics.x("walkthroughPage");
            walkthroughPage2 = null;
        }
        textView.setText(walkthroughPage2.g());
        q qVar3 = this.binding;
        if (qVar3 == null) {
            Intrinsics.x("binding");
            qVar3 = null;
        }
        TextView textView2 = qVar3.f24404A;
        WalkthroughPage walkthroughPage3 = this.walkthroughPage;
        if (walkthroughPage3 == null) {
            Intrinsics.x("walkthroughPage");
            walkthroughPage3 = null;
        }
        textView2.setText(walkthroughPage3.getSubtitle());
        WalkthroughPage walkthroughPage4 = this.walkthroughPage;
        if (walkthroughPage4 == null) {
            Intrinsics.x("walkthroughPage");
            walkthroughPage4 = null;
        }
        if (walkthroughPage4.getLearnMoreLink() != 0) {
            q qVar4 = this.binding;
            if (qVar4 == null) {
                Intrinsics.x("binding");
                qVar4 = null;
            }
            qVar4.f24406C.setVisibility(0);
            q qVar5 = this.binding;
            if (qVar5 == null) {
                Intrinsics.x("binding");
                qVar5 = null;
            }
            qVar5.f24406C.setOnClickListener(new View.OnClickListener() { // from class: Vj.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WalkthroughFragment.v0(this.f39972a, view);
                }
            });
        }
        WalkthroughPage walkthroughPage5 = this.walkthroughPage;
        if (walkthroughPage5 == null) {
            Intrinsics.x("walkthroughPage");
            walkthroughPage5 = null;
        }
        if (walkthroughPage5.getHasLinkifiedDesc()) {
            InterfaceC18089i parentFragment = getParentFragment();
            a aVar = parentFragment instanceof a ? (a) parentFragment : null;
            if (aVar != null) {
                q qVar6 = this.binding;
                if (qVar6 == null) {
                    Intrinsics.x("binding");
                    qVar6 = null;
                }
                TextView walkthroughDescr = qVar6.f24404A;
                Intrinsics.i(walkthroughDescr, "walkthroughDescr");
                aVar.I(walkthroughDescr);
            }
        }
        q qVar7 = this.binding;
        if (qVar7 == null) {
            Intrinsics.x("binding");
        } else {
            qVar = qVar7;
        }
        View root = qVar.getRoot();
        Intrinsics.i(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(WalkthroughFragment walkthroughFragment, View view) {
        a aVar;
        InterfaceC18089i parentFragment = walkthroughFragment.getParentFragment();
        WalkthroughPage walkthroughPage = null;
        if (parentFragment instanceof a) {
            aVar = (a) parentFragment;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            WalkthroughPage walkthroughPage2 = walkthroughFragment.walkthroughPage;
            if (walkthroughPage2 == null) {
                Intrinsics.x("walkthroughPage");
            } else {
                walkthroughPage = walkthroughPage2;
            }
            String string = walkthroughFragment.getString(walkthroughPage.getLearnMoreLink());
            Intrinsics.i(string, "getString(...)");
            aVar.l0(string);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        Object obj;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                obj = (Parcelable) arguments.getParcelable("walkthrough_argument_key", WalkthroughPage.class);
            } else {
                Parcelable parcelable = arguments.getParcelable("walkthrough_argument_key");
                if (!(parcelable instanceof WalkthroughPage)) {
                    parcelable = null;
                }
                obj = (WalkthroughPage) parcelable;
            }
            Intrinsics.g(obj);
            this.walkthroughPage = (WalkthroughPage) obj;
        }
    }
}
