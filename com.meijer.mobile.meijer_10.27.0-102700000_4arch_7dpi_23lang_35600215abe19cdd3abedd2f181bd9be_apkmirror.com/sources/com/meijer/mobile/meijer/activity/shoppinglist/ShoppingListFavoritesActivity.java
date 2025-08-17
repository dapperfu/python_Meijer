package com.meijer.mobile.meijer.activity.shoppinglist;

import Co.ProductFullDetails;
import Fq.FavoriteListItem;
import Fq.ShoppingListItem;
import Gn.ShoppingListTypeAheadResultItem;
import Gn.u0;
import Mn.AbstractC4207b0;
import ak.AbstractC5607a;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.view.C6031t;
import com.google.android.material.appbar.MaterialToolbar;
import com.meijer.mobile.meijer.Q;
import com.meijer.mobile.meijer.T;
import com.meijer.mobile.meijer.V;
import com.meijer.mobile.meijer.W;
import com.meijer.mobile.meijer.X;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.shoppinglist.view.ShoppingListFavoritesView;
import g.AbstractC14147c;
import g.C14145a;
import g.InterfaceC14146b;
import hi.C14476c;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.AbstractC16618K;
import qv.C16644i;
import qv.C16648k;
import qv.E0;
import qv.InterfaceC16622O;
import rr.C16831b;
import yl.AbstractC18227f;

@Metadata(d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 §\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0006¨\u0001©\u0001ª\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0007J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0007J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0007J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0007J\u001d\u0010\u001d\u001a\u00020\r2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u001d\u0010$\u001a\u00020\r2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b$\u0010\u001eJ\u0017\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u001fH\u0002¢\u0006\u0004\b&\u0010\"J\u001f\u0010(\u001a\u00020\r2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0002¢\u0006\u0004\b(\u0010\u001eJ\u0017\u0010)\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b)\u0010\"J\u001d\u0010,\u001a\u00020\r2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u001aH\u0002¢\u0006\u0004\b,\u0010\u001eJ\u0017\u0010-\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b-\u0010\"J\u0019\u00100\u001a\u00020\r2\b\u0010/\u001a\u0004\u0018\u00010.H\u0014¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\r2\u0006\u00102\u001a\u00020.H\u0014¢\u0006\u0004\b3\u00101J\u000f\u00104\u001a\u00020\rH\u0014¢\u0006\u0004\b4\u0010\u0007J\u000f\u00105\u001a\u00020\rH\u0014¢\u0006\u0004\b5\u0010\u0007J\u000f\u00106\u001a\u00020\rH\u0014¢\u0006\u0004\b6\u0010\u0007J\u000f\u00107\u001a\u00020\rH\u0014¢\u0006\u0004\b7\u0010\u0007J\u0017\u0010:\u001a\u00020\u00132\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020\u00132\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\rH\u0016¢\u0006\u0004\b@\u0010\u0007J\u0017\u0010A\u001a\u00020\r2\u0006\u0010=\u001a\u00020*H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\rH\u0016¢\u0006\u0004\bC\u0010\u0007J\u001f\u0010E\u001a\u00020\r2\u000e\u0010D\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0016¢\u0006\u0004\bE\u0010\u001eJ\u000f\u0010F\u001a\u00020\rH\u0016¢\u0006\u0004\bF\u0010\u0007J3\u0010O\u001a\u00020\r2\n\u0010H\u001a\u0006\u0012\u0002\b\u00030G2\u0006\u0010J\u001a\u00020I2\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bO\u0010PJ\u001b\u0010Q\u001a\u00020\r2\n\u0010H\u001a\u0006\u0012\u0002\b\u00030GH\u0016¢\u0006\u0004\bQ\u0010RJ\u001d\u0010U\u001a\u00020\r2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020S0\u001aH\u0016¢\u0006\u0004\bU\u0010\u001eR\"\u0010]\u001a\u00020V8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010e\u001a\u00020^8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\"\u0010m\u001a\u00020f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR(\u0010v\u001a\u00020n8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\bo\u0010p\u0012\u0004\bu\u0010\u0007\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\u001a\u0010z\u001a\u00060wR\u00020\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bx\u0010yR\u001a\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020|0{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010~R\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010~R\u0019\u0010\u0084\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0019\u0010\u0086\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0083\u0001R\u0019\u0010\u0088\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0083\u0001R\u001a\u0010\u008c\u0001\u001a\u00030\u0089\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\u0090\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001a\u0010\u0094\u0001\u001a\u00030\u0091\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001f\u0010\u0099\u0001\u001a\n\u0012\u0005\u0012\u00030\u0096\u00010\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0017\u0010\u009c\u0001\u001a\u00020K8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R/\u0010¢\u0001\u001a\u001a\u0012\u0007\u0012\u0005\u0018\u00010\u009e\u00010\u009d\u0001j\f\u0012\u0007\u0012\u0005\u0018\u00010\u009e\u0001`\u009f\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001R\u0018\u0010¦\u0001\u001a\u00030£\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¤\u0001\u0010¥\u0001¨\u0006«\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/shoppinglist/ShoppingListFavoritesActivity;", "Lcom/meijer/mobile/meijer/activity/shoppinglist/ShoppingListBaseActivity;", "Lcom/meijer/mobile/meijer/activity/shoppinglist/view/ShoppingListFavoritesView$a;", "Landroid/widget/AdapterView$OnItemSelectedListener;", "LGn/u0$a;", "LAj/b;", "<init>", "()V", "Landroid/widget/EditText;", "V1", "()Landroid/widget/EditText;", "Lg/a;", "result", "", "e2", "(Lg/a;)V", "q2", "p2", "r2", "", "X1", "()Z", "s2", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "W1", "Y1", "", "LFq/a;", "currentFavoritesList", "m2", "(Ljava/util/List;)V", "", "error", "l2", "(Ljava/lang/Throwable;)V", "updatedList", "h2", "throwable", "f2", "favoritesList", "o2", "n2", "LFq/c;", "shoppingListItems", "j2", "i2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "onStart", "onResume", "onPause", "onDestroy", "Landroid/view/Menu;", "menu", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onScan", "h", "(LFq/c;)V", "B0", "selection", "e", "y0", "Landroid/widget/AdapterView;", "parent", "Landroid/view/View;", "view", "", "position", "", PreferencesHelper.PREF_ID, "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "onNothingSelected", "(Landroid/widget/AdapterView;)V", "LGn/v0;", "typeAheadResults", "f0", "LEq/b;", "w", "LEq/b;", "d2", "()LEq/b;", "setShoppingListRepository", "(LEq/b;)V", "shoppingListRepository", "LEq/a;", "x", "LEq/a;", "b2", "()LEq/a;", "setFavoritesListRepository", "(LEq/a;)V", "favoritesListRepository", "LRo/c;", "y", "LRo/c;", "c2", "()LRo/c;", "setProductsRepository", "(LRo/c;)V", "productsRepository", "Lqv/K;", "z", "Lqv/K;", "getIoDispatcher", "()Lqv/K;", "setIoDispatcher", "(Lqv/K;)V", "getIoDispatcher$annotations", "ioDispatcher", "Lcom/meijer/mobile/meijer/activity/shoppinglist/ShoppingListFavoritesActivity$b;", "A", "Lcom/meijer/mobile/meijer/activity/shoppinglist/ShoppingListFavoritesActivity$b;", "selectionSpinnerAdapter", "", "LCo/h;", "B", "Ljava/util/List;", "itemsPendingAdd", "C", "D", "E", "Z", "isAddingFavoritesItemsList", "F", "isDeletingFavoriteItem", "G", "isFetchingFavoritesList", "LGn/u0;", "H", "LGn/u0;", "shoppingListTypeAheadItem", "LNu/a;", "I", "LNu/a;", "disposables", "LMn/b0;", "J", "LMn/b0;", "binding", "Lg/c;", "Landroid/content/Intent;", "K", "Lg/c;", "scannerResultLauncher", "a2", "()I", "dropDownWidth", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "Z1", "()Ljava/util/HashSet;", "descriptionSet", "Landroidx/appcompat/widget/Toolbar;", "v", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "L", "b", "c", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class ShoppingListFavoritesActivity extends Hilt_ShoppingListFavoritesActivity implements ShoppingListFavoritesView.a, AdapterView.OnItemSelectedListener, u0.a, Aj.b {

    /* renamed from: M, reason: collision with root package name */
    public static final int f112373M = 8;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private b selectionSpinnerAdapter;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private boolean isAddingFavoritesItemsList;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private boolean isDeletingFavoriteItem;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private boolean isFetchingFavoritesList;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private u0 shoppingListTypeAheadItem;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private AbstractC4207b0 binding;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public Eq.b shoppingListRepository;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public Eq.a favoritesListRepository;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public Ro.c productsRepository;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public AbstractC16618K ioDispatcher;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final List<ProductFullDetails> itemsPendingAdd = new ArrayList();

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private List<FavoriteListItem> favoritesList = CollectionsKt.m();

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private List<FavoriteListItem> selection = CollectionsKt.m();

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final Nu.a disposables = new Nu.a();

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Intent> scannerResultLauncher = registerForActivityResult(new h.i(), new k());

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/shoppinglist/ShoppingListFavoritesActivity$b;", "Landroid/widget/ArrayAdapter;", "", "Landroid/content/Context;", "context", "<init>", "(Lcom/meijer/mobile/meijer/activity/shoppinglist/ShoppingListFavoritesActivity;Landroid/content/Context;)V", "", "position", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getDropDownView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "getView", "count", "", "a", "(I)V", "", "getItemId", "(I)J", "", "Ljava/util/List;", "itemIds", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class b extends ArrayAdapter<String> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private List<Long> itemIds;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ShoppingListFavoritesActivity f112390b;

        public final void a(int count) {
            setNotifyOnChange(false);
            clear();
            this.itemIds.clear();
            AbstractC5607a abstractC5607aB = AbstractC5607a.INSTANCE.b(X.f99449h, count, new Object[0]);
            Context context = getContext();
            Intrinsics.i(context, "getContext(...)");
            add(abstractC5607aB.b(context));
            this.itemIds.add(0L);
            if (!this.f112390b.X1()) {
                add(this.f112390b.getString(Y.f100182le));
                this.itemIds.add(1L);
            }
            if (count > 0) {
                add(this.f112390b.getString(Y.f100131j3));
                this.itemIds.add(2L);
            }
            setNotifyOnChange(true);
            notifyDataSetChanged();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ShoppingListFavoritesActivity shoppingListFavoritesActivity, Context context) {
            super(context, V.f99354V0);
            Intrinsics.j(context, "context");
            this.f112390b = shoppingListFavoritesActivity;
            this.itemIds = new ArrayList();
        }

        @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
        public View getDropDownView(int position, View convertView, ViewGroup parent) {
            c cVar;
            Intrinsics.j(parent, "parent");
            View viewInflate = convertView == null ? LayoutInflater.from(getContext()).inflate(V.f99352U0, parent, false) : convertView;
            if (convertView == null) {
                Intrinsics.g(viewInflate);
                cVar = new c(viewInflate);
                viewInflate.setTag(cVar);
            } else {
                Object tag = convertView.getTag();
                Intrinsics.h(tag, "null cannot be cast to non-null type com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListFavoritesActivity.ViewHolder");
                cVar = (c) tag;
            }
            cVar.titleView.setText((CharSequence) getItem(position));
            Intrinsics.g(viewInflate);
            return viewInflate;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int position) {
            Long l10 = (Long) CollectionsKt.v0(this.itemIds, position);
            if (l10 != null) {
                return l10.longValue();
            }
            return 0L;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int position, View convertView, ViewGroup parent) {
            c cVar;
            Intrinsics.j(parent, "parent");
            View viewInflate = convertView == null ? LayoutInflater.from(getContext()).inflate(V.f99354V0, parent, false) : convertView;
            if (convertView == null) {
                Intrinsics.g(viewInflate);
                cVar = new c(viewInflate);
                viewInflate.setTag(cVar);
            } else {
                Object tag = convertView.getTag();
                Intrinsics.h(tag, "null cannot be cast to non-null type com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListFavoritesActivity.ViewHolder");
                cVar = (c) tag;
            }
            cVar.titleView.setText((CharSequence) getItem(position));
            Intrinsics.g(viewInflate);
            return viewInflate;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/meijer/mobile/meijer/activity/shoppinglist/ShoppingListFavoritesActivity$c;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "titleView", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final TextView titleView;

        public c(View view) {
            Intrinsics.j(view, "view");
            View viewFindViewById = view.findViewById(T.f98963T8);
            Intrinsics.i(viewFindViewById, "findViewById(...)");
            this.titleView = (TextView) viewFindViewById;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListFavoritesActivity", f = "ShoppingListFavoritesActivity.kt", l = {361}, m = "addSelectedFavoritesToShoppingList")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f112392a;

        /* renamed from: b, reason: collision with root package name */
        Object f112393b;

        /* renamed from: c, reason: collision with root package name */
        Object f112394c;

        /* renamed from: d, reason: collision with root package name */
        Object f112395d;

        /* renamed from: e, reason: collision with root package name */
        int f112396e;

        /* renamed from: f, reason: collision with root package name */
        int f112397f;

        /* renamed from: g, reason: collision with root package name */
        int f112398g;

        /* renamed from: h, reason: collision with root package name */
        int f112399h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f112400i;

        /* renamed from: k, reason: collision with root package name */
        int f112402k;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f112400i = obj;
            this.f112402k |= Integer.MIN_VALUE;
            return ShoppingListFavoritesActivity.this.W1(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListFavoritesActivity$deleteSelectedFavorites$1", f = "ShoppingListFavoritesActivity.kt", l = {380}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f112403a;

        /* renamed from: b, reason: collision with root package name */
        Object f112404b;

        /* renamed from: c, reason: collision with root package name */
        Object f112405c;

        /* renamed from: d, reason: collision with root package name */
        Object f112406d;

        /* renamed from: e, reason: collision with root package name */
        int f112407e;

        /* renamed from: f, reason: collision with root package name */
        int f112408f;

        /* renamed from: g, reason: collision with root package name */
        int f112409g;

        /* renamed from: h, reason: collision with root package name */
        int f112410h;

        /* renamed from: i, reason: collision with root package name */
        int f112411i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f112412j;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = ShoppingListFavoritesActivity.this.new e(continuation);
            eVar.f112412j = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f112411i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f112412j;
                    ShoppingListFavoritesActivity shoppingListFavoritesActivity = ShoppingListFavoritesActivity.this;
                    Result.Companion companion = Result.INSTANCE;
                    Eq.a aVarB2 = shoppingListFavoritesActivity.b2();
                    List<FavoriteListItem> list = shoppingListFavoritesActivity.selection;
                    this.f112412j = interfaceC16622O;
                    this.f112403a = interfaceC16622O;
                    this.f112404b = this;
                    this.f112405c = this;
                    this.f112406d = interfaceC16622O;
                    this.f112407e = 0;
                    this.f112408f = 0;
                    this.f112409g = 0;
                    this.f112410h = 0;
                    this.f112411i = 1;
                    obj = aVarB2.k(list, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(obj);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            ShoppingListFavoritesActivity shoppingListFavoritesActivity2 = ShoppingListFavoritesActivity.this;
            if (Result.h(objB)) {
                shoppingListFavoritesActivity2.m2((List) objB);
            }
            ShoppingListFavoritesActivity shoppingListFavoritesActivity3 = ShoppingListFavoritesActivity.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                shoppingListFavoritesActivity3.l2(thE);
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListFavoritesActivity$handleScannerResult$2", f = "ShoppingListFavoritesActivity.kt", l = {252}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112414a;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ShoppingListFavoritesActivity.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f112414a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                ShoppingListFavoritesActivity shoppingListFavoritesActivity = ShoppingListFavoritesActivity.this;
                this.f112414a = 1;
                if (shoppingListFavoritesActivity.s2(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListFavoritesActivity$onAddItem$1", f = "ShoppingListFavoritesActivity.kt", l = {428}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f112416a;

        /* renamed from: b, reason: collision with root package name */
        Object f112417b;

        /* renamed from: c, reason: collision with root package name */
        Object f112418c;

        /* renamed from: d, reason: collision with root package name */
        Object f112419d;

        /* renamed from: e, reason: collision with root package name */
        int f112420e;

        /* renamed from: f, reason: collision with root package name */
        int f112421f;

        /* renamed from: g, reason: collision with root package name */
        int f112422g;

        /* renamed from: h, reason: collision with root package name */
        int f112423h;

        /* renamed from: i, reason: collision with root package name */
        int f112424i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f112425j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ FavoriteListItem f112427l;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            g gVar = ShoppingListFavoritesActivity.this.new g(this.f112427l, continuation);
            gVar.f112425j = obj;
            return gVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(FavoriteListItem favoriteListItem, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f112427l = favoriteListItem;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f112424i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f112425j;
                    ShoppingListFavoritesActivity shoppingListFavoritesActivity = ShoppingListFavoritesActivity.this;
                    FavoriteListItem favoriteListItem = this.f112427l;
                    Result.Companion companion = Result.INSTANCE;
                    Eq.a aVarB2 = shoppingListFavoritesActivity.b2();
                    this.f112425j = interfaceC16622O;
                    this.f112416a = interfaceC16622O;
                    this.f112417b = this;
                    this.f112418c = this;
                    this.f112419d = interfaceC16622O;
                    this.f112420e = 0;
                    this.f112421f = 0;
                    this.f112422g = 0;
                    this.f112423h = 0;
                    this.f112424i = 1;
                    obj = aVarB2.c(favoriteListItem, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(obj);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            ShoppingListFavoritesActivity shoppingListFavoritesActivity2 = ShoppingListFavoritesActivity.this;
            if (Result.h(objB)) {
                shoppingListFavoritesActivity2.h2((List) objB);
            }
            ShoppingListFavoritesActivity shoppingListFavoritesActivity3 = ShoppingListFavoritesActivity.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                shoppingListFavoritesActivity3.f2(thE);
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListFavoritesActivity$onAddToShoppingList$1", f = "ShoppingListFavoritesActivity.kt", l = {480}, m = "invokeSuspend")
    static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112428a;

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ShoppingListFavoritesActivity.this.new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f112428a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                ShoppingListFavoritesActivity shoppingListFavoritesActivity = ShoppingListFavoritesActivity.this;
                this.f112428a = 1;
                if (shoppingListFavoritesActivity.W1(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/meijer/mobile/meijer/activity/shoppinglist/ShoppingListFavoritesActivity$i", "Lrr/b;", "", "string", "", "start", "before", "count", "", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i extends C16831b {
        i() {
        }

        @Override // rr.C16831b, android.text.TextWatcher
        public void onTextChanged(CharSequence string, int start, int before, int count) {
            Intrinsics.j(string, "string");
            u0 u0Var = ShoppingListFavoritesActivity.this.shoppingListTypeAheadItem;
            if (u0Var == null) {
                Intrinsics.y("shoppingListTypeAheadItem");
                u0Var = null;
            }
            u0Var.A0(string.toString());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListFavoritesActivity$onResume$1", f = "ShoppingListFavoritesActivity.kt", l = {177}, m = "invokeSuspend")
    static final class j extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112431a;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ShoppingListFavoritesActivity.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f112431a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                ShoppingListFavoritesActivity shoppingListFavoritesActivity = ShoppingListFavoritesActivity.this;
                this.f112431a = 1;
                if (shoppingListFavoritesActivity.s2(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class k implements InterfaceC14146b, FunctionAdapter {
        k() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, ShoppingListFavoritesActivity.this, ShoppingListFavoritesActivity.class, "handleScannerResult", "handleScannerResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14145a p02) {
            Intrinsics.j(p02, "p0");
            ShoppingListFavoritesActivity.this.e2(p02);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListFavoritesActivity$updateFavoritesList$2", f = "ShoppingListFavoritesActivity.kt", l = {337, 339}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class l extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f112434a;

        /* renamed from: b, reason: collision with root package name */
        Object f112435b;

        /* renamed from: c, reason: collision with root package name */
        Object f112436c;

        /* renamed from: d, reason: collision with root package name */
        Object f112437d;

        /* renamed from: e, reason: collision with root package name */
        Object f112438e;

        /* renamed from: f, reason: collision with root package name */
        int f112439f;

        /* renamed from: g, reason: collision with root package name */
        int f112440g;

        /* renamed from: h, reason: collision with root package name */
        int f112441h;

        /* renamed from: i, reason: collision with root package name */
        int f112442i;

        /* renamed from: j, reason: collision with root package name */
        int f112443j;

        /* renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f112444k;

        l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            l lVar = ShoppingListFavoritesActivity.this.new l(continuation);
            lVar.f112444k = obj;
            return lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((l) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            ShoppingListFavoritesActivity shoppingListFavoritesActivity;
            List list;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f112443j;
            try {
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        shoppingListFavoritesActivity = (ShoppingListFavoritesActivity) this.f112435b;
                        ResultKt.b(obj);
                        list = (List) obj;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    shoppingListFavoritesActivity = (ShoppingListFavoritesActivity) this.f112435b;
                    ResultKt.b(obj);
                    list = (List) obj;
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f112444k;
                if (!ShoppingListFavoritesActivity.this.isFetchingFavoritesList) {
                    ShoppingListFavoritesActivity.this.isFetchingFavoritesList = true;
                    AbstractC4207b0 abstractC4207b0 = ShoppingListFavoritesActivity.this.binding;
                    if (abstractC4207b0 == null) {
                        Intrinsics.y("binding");
                        abstractC4207b0 = null;
                    }
                    abstractC4207b0.f20481C.S(Y.f99564Fe, true);
                    ShoppingListFavoritesActivity shoppingListFavoritesActivity2 = ShoppingListFavoritesActivity.this;
                    Result.Companion companion2 = Result.INSTANCE;
                    if (shoppingListFavoritesActivity2.itemsPendingAdd.isEmpty()) {
                        Eq.a aVarB2 = shoppingListFavoritesActivity2.b2();
                        this.f112444k = interfaceC16622O;
                        this.f112434a = interfaceC16622O;
                        this.f112435b = shoppingListFavoritesActivity2;
                        this.f112436c = this;
                        this.f112437d = this;
                        this.f112438e = interfaceC16622O;
                        this.f112439f = 0;
                        this.f112440g = 0;
                        this.f112441h = 0;
                        this.f112442i = 0;
                        this.f112443j = 1;
                        obj = aVarB2.g(true, this);
                        if (obj != objF) {
                            shoppingListFavoritesActivity = shoppingListFavoritesActivity2;
                            list = (List) obj;
                        }
                    } else {
                        Eq.a aVarB22 = shoppingListFavoritesActivity2.b2();
                        List<? extends mk.c> list2 = shoppingListFavoritesActivity2.itemsPendingAdd;
                        this.f112444k = interfaceC16622O;
                        this.f112434a = interfaceC16622O;
                        this.f112435b = shoppingListFavoritesActivity2;
                        this.f112436c = this;
                        this.f112437d = this;
                        this.f112438e = interfaceC16622O;
                        this.f112439f = 0;
                        this.f112440g = 0;
                        this.f112441h = 0;
                        this.f112442i = 0;
                        this.f112443j = 2;
                        obj = aVarB22.e(list2, this);
                        if (obj != objF) {
                            shoppingListFavoritesActivity = shoppingListFavoritesActivity2;
                            list = (List) obj;
                        }
                    }
                    return objF;
                }
                return Unit.f142422a;
            }
            shoppingListFavoritesActivity.itemsPendingAdd.clear();
            objB = Result.b(list);
            ShoppingListFavoritesActivity shoppingListFavoritesActivity3 = ShoppingListFavoritesActivity.this;
            if (Result.h(objB)) {
                shoppingListFavoritesActivity3.o2((List) objB);
            }
            ShoppingListFavoritesActivity shoppingListFavoritesActivity4 = ShoppingListFavoritesActivity.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                shoppingListFavoritesActivity4.n2(thE);
            }
            return Unit.f142422a;
        }
    }

    private final void j2(List<ShoppingListItem> shoppingListItems) {
        this.isAddingFavoritesItemsList = false;
        Iterator<T> it = this.selection.iterator();
        while (it.hasNext()) {
            ((FavoriteListItem) it.next()).j(true);
        }
        AbstractC4207b0 abstractC4207b0 = this.binding;
        AbstractC4207b0 abstractC4207b02 = null;
        if (abstractC4207b0 == null) {
            Intrinsics.y("binding");
            abstractC4207b0 = null;
        }
        abstractC4207b0.f20479A.i(false);
        p2();
        AbstractC4207b0 abstractC4207b03 = this.binding;
        if (abstractC4207b03 == null) {
            Intrinsics.y("binding");
        } else {
            abstractC4207b02 = abstractC4207b03;
        }
        abstractC4207b02.f20481C.X(false, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m2(List<FavoriteListItem> currentFavoritesList) {
        this.isDeletingFavoriteItem = false;
        this.favoritesList = currentFavoritesList;
        p2();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> parent) {
        Intrinsics.j(parent, "parent");
    }

    private final EditText V1() {
        AbstractC4207b0 abstractC4207b0 = this.binding;
        if (abstractC4207b0 == null) {
            Intrinsics.y("binding");
            abstractC4207b0 = null;
        }
        View viewFindViewById = abstractC4207b0.f20479A.getAddItemView().findViewById(T.f99200q);
        Intrinsics.i(viewFindViewById, "findViewById(...)");
        return (EditText) viewFindViewById;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W1(kotlin.coroutines.Continuation<? super kotlin.Unit> r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListFavoritesActivity.d
            if (r0 == 0) goto L13
            r0 = r9
            com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListFavoritesActivity$d r0 = (com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListFavoritesActivity.d) r0
            int r1 = r0.f112402k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f112402k = r1
            goto L18
        L13:
            com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListFavoritesActivity$d r0 = new com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListFavoritesActivity$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f112400i
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f112402k
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r1 = r0.f112395d
            com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListFavoritesActivity r1 = (com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListFavoritesActivity) r1
            java.lang.Object r1 = r0.f112394c
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f112393b
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f112392a
            com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListFavoritesActivity r1 = (com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListFavoritesActivity) r1
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Exception -> L3a
            goto L95
        L3a:
            r9 = move-exception
            goto L9a
        L3c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L44:
            kotlin.ResultKt.b(r9)
            boolean r9 = r8.isAddingFavoritesItemsList
            if (r9 != 0) goto Le0
            boolean r9 = r8.hasNetworkConnection()
            if (r9 == 0) goto Le0
            r8.isAddingFavoritesItemsList = r3
            Mn.b0 r9 = r8.binding
            if (r9 != 0) goto L5d
            java.lang.String r9 = "binding"
            kotlin.jvm.internal.Intrinsics.y(r9)
            r9 = 0
        L5d:
            com.meijer.mobile.ui.legacy.progressview.ProgressView r9 = r9.f20481C
            ak.a$a r2 = ak.AbstractC5607a.INSTANCE
            int r5 = com.meijer.mobile.meijer.X.f99451j
            java.util.List<Fq.a> r6 = r8.selection
            int r6 = r6.size()
            java.lang.Object[] r7 = new java.lang.Object[r4]
            ak.a r2 = r2.b(r5, r6, r7)
            r9.U(r2, r3)
            kotlin.Result$Companion r9 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3a
            Eq.b r9 = r8.d2()     // Catch: java.lang.Exception -> L3a
            java.util.List r2 = J1(r8)     // Catch: java.lang.Exception -> L3a
            r0.f112392a = r8     // Catch: java.lang.Exception -> L3a
            r0.f112393b = r0     // Catch: java.lang.Exception -> L3a
            r0.f112394c = r0     // Catch: java.lang.Exception -> L3a
            r0.f112395d = r8     // Catch: java.lang.Exception -> L3a
            r0.f112396e = r4     // Catch: java.lang.Exception -> L3a
            r0.f112397f = r4     // Catch: java.lang.Exception -> L3a
            r0.f112398g = r4     // Catch: java.lang.Exception -> L3a
            r0.f112399h = r4     // Catch: java.lang.Exception -> L3a
            r0.f112402k = r3     // Catch: java.lang.Exception -> L3a
            java.lang.Object r9 = r9.c(r2, r0)     // Catch: java.lang.Exception -> L3a
            if (r9 != r1) goto L95
            return r1
        L95:
            java.lang.Object r9 = kotlin.Result.b(r9)     // Catch: java.lang.Exception -> L3a
            goto Lab
        L9a:
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            qv.E0.i(r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r9 = kotlin.ResultKt.a(r9)
            java.lang.Object r9 = kotlin.Result.b(r9)
        Lab:
            boolean r0 = kotlin.Result.h(r9)
            if (r0 == 0) goto Lb7
            r0 = r9
            java.util.List r0 = (java.util.List) r0
            r8.j2(r0)
        Lb7:
            java.lang.Throwable r9 = kotlin.Result.e(r9)
            if (r9 == 0) goto Lc0
            r8.i2(r9)
        Lc0:
            gi.a r9 = r8.getAnalyticsEngine()
            java.lang.String r0 = "event: add item to list"
            hi.h$a r0 = hi.C14476c.a(r0)
            java.lang.String r1 = "shopping list: favorites: action sheet"
            hi.i$c r1 = hi.C14476c.c(r1)
            java.lang.String r2 = "shopping list"
            hi.i$e r2 = hi.C14476c.g(r2)
            r5 = 2
            hi.i[] r5 = new hi.AbstractC14482i[r5]
            r5[r4] = r1
            r5[r3] = r2
            r9.b(r0, r5)
        Le0:
            kotlin.Unit r9 = kotlin.Unit.f142422a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListFavoritesActivity.W1(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean X1() {
        return this.selection.size() == this.favoritesList.size();
    }

    private final void Y1() {
        if (!this.isDeletingFavoriteItem) {
            this.isDeletingFavoriteItem = true;
            AbstractC4207b0 abstractC4207b0 = null;
            C16648k.d(C6031t.a(this), null, null, new e(null), 3, null);
            AbstractC4207b0 abstractC4207b02 = this.binding;
            if (abstractC4207b02 == null) {
                Intrinsics.y("binding");
            } else {
                abstractC4207b0 = abstractC4207b02;
            }
            abstractC4207b0.f20479A.i(false);
        }
        getAnalyticsEngine().b(C14476c.a("event: remove item(s) from favorites"), C14476c.c("shopping list: favorites: action sheet"), C14476c.g("shopping list"));
    }

    private final HashSet<String> Z1() {
        List<FavoriteListItem> list = this.favoritesList;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((FavoriteListItem) it.next()).b());
        }
        return CollectionsKt.h1(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f2(Throwable throwable) {
        uw.a.INSTANCE.f(throwable, "Delete item to FavoritesList failed", new Object[0]);
        this.isDeletingFavoriteItem = false;
        new Pj.j(this, Y.f99460A5, new Object[0]).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h2(List<FavoriteListItem> updatedList) {
        this.favoritesList = updatedList;
        p2();
    }

    private final void i2(Throwable error) {
        uw.a.INSTANCE.f(error, "Add items to ShoppingList Failed", new Object[0]);
        this.isAddingFavoritesItemsList = false;
        AbstractC4207b0 abstractC4207b0 = this.binding;
        if (abstractC4207b0 == null) {
            Intrinsics.y("binding");
            abstractC4207b0 = null;
        }
        abstractC4207b0.f20481C.W(false);
        new Pj.j(this, pk.f.f155797k, new Object[0]).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l2(Throwable error) {
        uw.a.INSTANCE.f(error, "Delete Items from FavoritesList failed", new Object[0]);
        this.isDeletingFavoriteItem = false;
        new Pj.j(this, Y.f99479B5, new Object[0]).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n2(Throwable error) {
        uw.a.INSTANCE.f(error, "Failed to update favorites list", new Object[0]);
        if (this.isFetchingFavoritesList) {
            this.isFetchingFavoritesList = false;
            AbstractC4207b0 abstractC4207b0 = this.binding;
            if (abstractC4207b0 == null) {
                Intrinsics.y("binding");
                abstractC4207b0 = null;
            }
            abstractC4207b0.f20481C.X(false, false);
            new Pj.j(this, pk.f.f155797k, new Object[0]).g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o2(List<FavoriteListItem> favoritesList) {
        if (favoritesList == null) {
            favoritesList = CollectionsKt.m();
        }
        this.favoritesList = favoritesList;
        this.isFetchingFavoritesList = false;
        AbstractC4207b0 abstractC4207b0 = this.binding;
        AbstractC4207b0 abstractC4207b02 = null;
        if (abstractC4207b0 == null) {
            Intrinsics.y("binding");
            abstractC4207b0 = null;
        }
        abstractC4207b0.f20481C.X(false, true);
        p2();
        AbstractC4207b0 abstractC4207b03 = this.binding;
        if (abstractC4207b03 == null) {
            Intrinsics.y("binding");
        } else {
            abstractC4207b02 = abstractC4207b03;
        }
        abstractC4207b02.f20479A.setSelectedFavorites(this.selection);
    }

    private final void p2() {
        AbstractC4207b0 abstractC4207b0 = this.binding;
        if (abstractC4207b0 == null) {
            Intrinsics.y("binding");
            abstractC4207b0 = null;
        }
        abstractC4207b0.f20479A.setFavorites(this.favoritesList);
        r2();
    }

    private final void q2() {
        this.selectionSpinnerAdapter = new b(this, this);
        AbstractC4207b0 abstractC4207b0 = this.binding;
        AbstractC4207b0 abstractC4207b02 = null;
        if (abstractC4207b0 == null) {
            Intrinsics.y("binding");
            abstractC4207b0 = null;
        }
        Spinner spinner = abstractC4207b0.f20480B;
        b bVar = this.selectionSpinnerAdapter;
        if (bVar == null) {
            Intrinsics.y("selectionSpinnerAdapter");
            bVar = null;
        }
        spinner.setAdapter((SpinnerAdapter) bVar);
        AbstractC4207b0 abstractC4207b03 = this.binding;
        if (abstractC4207b03 == null) {
            Intrinsics.y("binding");
            abstractC4207b03 = null;
        }
        abstractC4207b03.f20480B.setOnItemSelectedListener(this);
        AbstractC4207b0 abstractC4207b04 = this.binding;
        if (abstractC4207b04 == null) {
            Intrinsics.y("binding");
        } else {
            abstractC4207b02 = abstractC4207b04;
        }
        abstractC4207b02.f20480B.setMinimumWidth(a2());
    }

    @Override // com.meijer.mobile.meijer.activity.shoppinglist.view.BaseShoppingListView.a
    public void B0() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.meijer.mobile.meijer.activity.shoppinglist.e
            @Override // java.lang.Runnable
            public final void run() {
                ShoppingListFavoritesActivity.g2(this.f112457a);
            }
        });
    }

    public final Eq.a b2() {
        Eq.a aVar = this.favoritesListRepository;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.y("favoritesListRepository");
        return null;
    }

    public final Ro.c c2() {
        Ro.c cVar = this.productsRepository;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.y("productsRepository");
        return null;
    }

    public final Eq.b d2() {
        Eq.b bVar = this.shoppingListRepository;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.y("shoppingListRepository");
        return null;
    }

    @Override // com.meijer.mobile.meijer.activity.shoppinglist.view.ShoppingListFavoritesView.a
    public void e(List<FavoriteListItem> selection) {
        if (selection == null) {
            selection = CollectionsKt.m();
        }
        this.selection = selection;
        r2();
    }

    @Override // Gn.u0.a
    public void f0(List<ShoppingListTypeAheadResultItem> typeAheadResults) {
        Intrinsics.j(typeAheadResults, "typeAheadResults");
        AbstractC4207b0 abstractC4207b0 = this.binding;
        if (abstractC4207b0 == null) {
            Intrinsics.y("binding");
            abstractC4207b0 = null;
        }
        abstractC4207b0.f20479A.setTypeAheadResults(typeAheadResults);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    @Override // com.meijer.mobile.meijer.activity.shoppinglist.view.BaseShoppingListView.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(Fq.ShoppingListItem r58) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListFavoritesActivity.h(Fq.c):void");
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.j(menu, "menu");
        getMenuInflater().inflate(W.f99439a, menu);
        MenuItem menuItemFindItem = menu.findItem(T.f99123j);
        MenuItem menuItemFindItem2 = menu.findItem(T.f99134k);
        AbstractC4207b0 abstractC4207b0 = this.binding;
        if (abstractC4207b0 == null) {
            Intrinsics.y("binding");
            abstractC4207b0 = null;
        }
        if (abstractC4207b0.f20479A.b()) {
            menuItemFindItem.setVisible(false);
            menuItemFindItem2.setVisible(true);
        } else {
            menuItemFindItem.setVisible(true);
        }
        menuItemFindItem.setEnabled(!this.selection.isEmpty());
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        u0 u0Var = this.shoppingListTypeAheadItem;
        if (u0Var == null) {
            Intrinsics.y("shoppingListTypeAheadItem");
            u0Var = null;
        }
        u0Var.P();
        super.onDestroy();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id2) {
        Intrinsics.j(parent, "parent");
        Intrinsics.j(view, "view");
        AbstractC4207b0 abstractC4207b0 = null;
        if (id2 == 1) {
            AbstractC4207b0 abstractC4207b02 = this.binding;
            if (abstractC4207b02 == null) {
                Intrinsics.y("binding");
                abstractC4207b02 = null;
            }
            abstractC4207b02.f20479A.i(true);
        } else if (id2 == 2) {
            AbstractC4207b0 abstractC4207b03 = this.binding;
            if (abstractC4207b03 == null) {
                Intrinsics.y("binding");
                abstractC4207b03 = null;
            }
            abstractC4207b03.f20479A.i(false);
        }
        AbstractC4207b0 abstractC4207b04 = this.binding;
        if (abstractC4207b04 == null) {
            Intrinsics.y("binding");
        } else {
            abstractC4207b0 = abstractC4207b04;
        }
        abstractC4207b0.f20480B.setSelection(0);
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.j(item, "item");
        int itemId = item.getItemId();
        if (itemId == T.f99123j) {
            Y1();
            return true;
        }
        if (itemId != T.f99134k) {
            return super.onOptionsItemSelected(item);
        }
        AbstractC4207b0 abstractC4207b0 = this.binding;
        if (abstractC4207b0 == null) {
            Intrinsics.y("binding");
            abstractC4207b0 = null;
        }
        abstractC4207b0.f20479A.a();
        return true;
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        Intrinsics.j(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putParcelableArray("selection", (Parcelable[]) this.selection.toArray(new FavoriteListItem[0]));
    }

    @Override // com.meijer.mobile.meijer.activity.shoppinglist.view.BaseShoppingListView.a
    public void onScan() {
        this.scannerResultLauncher.a(Al.h.k(this, false, false, getFeatureManager().e(AbstractC18227f.L.f170551h)));
    }

    @Override // Aj.b
    public Toolbar v() {
        AbstractC4207b0 abstractC4207b0 = this.binding;
        if (abstractC4207b0 == null) {
            Intrinsics.y("binding");
            abstractC4207b0 = null;
        }
        MaterialToolbar appBar = abstractC4207b0.f20482z;
        Intrinsics.i(appBar, "appBar");
        return appBar;
    }

    private final int a2() {
        int dimension = (int) getResources().getDimension(Q.f98659e);
        TextView textView = new TextView(this);
        textView.setPadding(dimension, 0, dimension, 0);
        textView.setTextSize(0, getResources().getDimensionPixelSize(Q.f98660f));
        textView.setText("XXXXXXXXXXXXX");
        textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(textView.getMeasuredHeight(), Integer.MIN_VALUE));
        return textView.getMeasuredWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e2(g.C14145a r8) {
        /*
            r7 = this;
            int r0 = r8.getResultCode()
            r1 = -1
            if (r0 != r1) goto L99
            android.content.Intent r8 = r8.getData()
            r0 = 0
            if (r8 == 0) goto L28
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            java.lang.String r3 = "scanned_items"
            if (r1 < r2) goto L1d
            java.lang.Class<Co.h> r1 = Co.ProductFullDetails.class
            java.util.ArrayList r8 = com.meijer.mobile.coupon.list.C11610b.a(r8, r3, r1)
            goto L21
        L1d:
            java.util.ArrayList r8 = r8.getParcelableArrayListExtra(r3)
        L21:
            if (r8 == 0) goto L28
            java.util.List r8 = kotlin.collections.CollectionsKt.j1(r8)
            goto L29
        L28:
            r8 = r0
        L29:
            if (r8 != 0) goto L2f
            java.util.List r8 = kotlin.collections.CollectionsKt.m()
        L2f:
            java.util.HashSet r1 = r7.Z1()
            java.util.Set r1 = kotlin.collections.CollectionsKt.o1(r1)
            java.util.List<Co.h> r2 = r7.itemsPendingAdd
            r2.clear()
            java.util.List<Co.h> r2 = r7.itemsPendingAdd
            r3 = r8
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L4a:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L65
            java.lang.Object r5 = r3.next()
            r6 = r5
            Co.h r6 = (Co.ProductFullDetails) r6
            java.lang.String r6 = r6.getName()
            boolean r6 = r1.contains(r6)
            if (r6 != 0) goto L4a
            r4.add(r5)
            goto L4a
        L65:
            r2.addAll(r4)
            java.util.List<Co.h> r1 = r7.itemsPendingAdd
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L89
            ak.a$a r0 = ak.AbstractC5607a.INSTANCE
            int r1 = com.meijer.mobile.meijer.X.f99450i
            int r8 = r8.size()
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            ak.a r8 = r0.b(r1, r8, r3)
            java.lang.String r8 = r8.b(r7)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            Ds.m.c(r7, r8, r0)
            return
        L89:
            androidx.lifecycle.m r1 = androidx.view.C6031t.a(r7)
            com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListFavoritesActivity$f r4 = new com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListFavoritesActivity$f
            r4.<init>(r0)
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            qv.C16644i.d(r1, r2, r3, r4, r5, r6)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListFavoritesActivity.e2(g.a):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g2(ShoppingListFavoritesActivity shoppingListFavoritesActivity) {
        shoppingListFavoritesActivity.r2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k2(ShoppingListFavoritesActivity shoppingListFavoritesActivity) {
        if (!shoppingListFavoritesActivity.onNavigateUp()) {
            shoppingListFavoritesActivity.finish();
        }
        return Unit.f142422a;
    }

    private final void r2() {
        invalidateOptionsMenu();
        b bVar = this.selectionSpinnerAdapter;
        if (bVar == null) {
            Intrinsics.y("selectionSpinnerAdapter");
            bVar = null;
        }
        bVar.a(this.selection.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s2(Continuation<? super Unit> continuation) {
        Object objG = C16644i.g(continuation.getContext(), new l(null), continuation);
        if (objG == IntrinsicsKt.f()) {
            return objG;
        }
        return Unit.f142422a;
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        List<FavoriteListItem> listM;
        super.onCreate(savedInstanceState);
        AbstractC4207b0 abstractC4207b0K0 = AbstractC4207b0.K0(getLayoutInflater());
        this.binding = abstractC4207b0K0;
        b bVar = null;
        if (abstractC4207b0K0 == null) {
            Intrinsics.y("binding");
            abstractC4207b0K0 = null;
        }
        setContentView(Zr.a.j(abstractC4207b0K0.getRoot(), false, 1, null));
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.t(false);
        }
        Aj.b.O0(this, 0, 0, new Function0() { // from class: com.meijer.mobile.meijer.activity.shoppinglist.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShoppingListFavoritesActivity.k2(this.f112458a);
            }
        }, 3, null);
        q2();
        AbstractC4207b0 abstractC4207b0 = this.binding;
        if (abstractC4207b0 == null) {
            Intrinsics.y("binding");
            abstractC4207b0 = null;
        }
        ShoppingListFavoritesView shoppingListFavoritesView = abstractC4207b0.f20479A;
        shoppingListFavoritesView.d(this, getAnalyticsEngine());
        shoppingListFavoritesView.setListener((ShoppingListFavoritesView.a) this);
        if (savedInstanceState != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                listM = savedInstanceState.getParcelableArrayList("selection", FavoriteListItem.class);
            } else {
                listM = savedInstanceState.getParcelableArrayList("selection");
            }
        } else {
            listM = null;
        }
        if (listM == null) {
            listM = CollectionsKt.m();
        }
        this.selection = listM;
        b bVar2 = this.selectionSpinnerAdapter;
        if (bVar2 == null) {
            Intrinsics.y("selectionSpinnerAdapter");
        } else {
            bVar = bVar2;
        }
        bVar.a(0);
        this.shoppingListTypeAheadItem = new u0(getAppBackgroundManager(), c2(), false, C1().b());
        V1().addTextChangedListener(new i());
        getAnalyticsEngine().b(C14476c.h("shopping list: favorite"), C14476c.g("shopping list"));
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.isFetchingFavoritesList = false;
        this.isAddingFavoritesItemsList = false;
        this.isDeletingFavoriteItem = false;
        AbstractC4207b0 abstractC4207b0 = this.binding;
        if (abstractC4207b0 == null) {
            Intrinsics.y("binding");
            abstractC4207b0 = null;
        }
        abstractC4207b0.f20481C.W(false);
        this.disposables.d();
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        u0 u0Var = null;
        C16648k.d(C6031t.a(this), null, null, new j(null), 3, null);
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            currentFocus.clearFocus();
        }
        u0 u0Var2 = this.shoppingListTypeAheadItem;
        if (u0Var2 == null) {
            Intrinsics.y("shoppingListTypeAheadItem");
        } else {
            u0Var = u0Var2;
        }
        u0Var.Q();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        u0 u0Var = this.shoppingListTypeAheadItem;
        if (u0Var == null) {
            Intrinsics.y("shoppingListTypeAheadItem");
            u0Var = null;
        }
        u0Var.O(this);
    }

    @Override // com.meijer.mobile.meijer.activity.shoppinglist.view.ShoppingListFavoritesView.a
    public void y0() {
        C16648k.d(C6031t.a(this), null, null, new h(null), 3, null);
    }
}
