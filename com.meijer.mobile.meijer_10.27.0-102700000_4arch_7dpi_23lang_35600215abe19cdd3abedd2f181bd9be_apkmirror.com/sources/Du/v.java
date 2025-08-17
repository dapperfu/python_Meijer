package Du;

import Du.a;
import Eu.b;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.t;
import io.constructor.BuildConfig;
import io.constructor.data.DataManager;
import io.constructor.data.local.PreferencesHelper;
import io.constructor.data.memory.ConfigMemoryHolder;
import io.constructor.data.model.autocomplete.AutocompleteResponse;
import io.constructor.data.model.browse.BrowseResponse;
import io.constructor.data.model.browse.BrowseResultClickRequestBody;
import io.constructor.data.model.browse.BrowseResultLoadRequestBody;
import io.constructor.data.model.common.ResultGroup;
import io.constructor.data.model.common.TrackingItem;
import io.constructor.data.model.common.VariationsMap;
import io.constructor.data.model.conversion.ConversionRequestBody;
import io.constructor.data.model.purchase.PurchaseItem;
import io.constructor.data.model.purchase.PurchaseRequestBody;
import io.constructor.data.model.search.SearchResponse;
import iv.C14764a;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÅ\u0003\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00130&2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\"\b\u0002\u0010\u0014\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000f0\u0013\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00062.\b\u0002\u0010%\u001a(\u0012\u0004\u0012\u00020\u0006\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000f0\u00130\u000f\u0018\u00010\u0018H\u0002¢\u0006\u0004\b'\u0010(JI\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00182\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00182\u0014\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0018H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010\u0003J\u001f\u00103\u001a\u00020-2\b\u00100\u001a\u0004\u0018\u00010/2\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u0004¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0006¢\u0006\u0004\b7\u00108J\u0099\u0001\u0010:\u001a\u0002092\u0006\u0010\u001d\u001a\u00020\u00062\"\b\u0002\u0010\u0014\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000f0\u0013\u0018\u00010\u000f2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162.\b\u0002\u0010%\u001a(\u0012\u0004\u0012\u00020\u0006\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000f0\u00130\u000f\u0018\u00010\u0018H\u0086@ø\u0001\u0000¢\u0006\u0004\b:\u0010;JÛ\u0001\u0010=\u001a\u00020<2\u0006\u0010\u001d\u001a\u00020\u00062\"\b\u0002\u0010\u0014\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000f0\u0013\u0018\u00010\u000f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b=\u0010>Jã\u0001\u0010B\u001a\u00020A2\u0006\u0010?\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u00062\"\b\u0002\u0010\u0014\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000f0\u0013\u0018\u00010\u000f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u000f\u0010E\u001a\u00020DH\u0000¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020-2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\bG\u0010HJ\u0019\u0010I\u001a\u00020D2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\bI\u0010JJ=\u0010P\u001a\u00020-2\u0006\u0010K\u001a\u00020\u00062\u0006\u0010L\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010N\u001a\u0004\u0018\u00010M2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\bP\u0010QJ?\u0010R\u001a\u00020D2\u0006\u0010K\u001a\u00020\u00062\u0006\u0010L\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010N\u001a\u0004\u0018\u00010M2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\bR\u0010SJ'\u0010T\u001a\u00020-2\u0006\u0010K\u001a\u00020\u00062\u0006\u0010L\u001a\u00020\u00062\b\u0010N\u001a\u0004\u0018\u00010M¢\u0006\u0004\bT\u0010UJ)\u0010V\u001a\u00020D2\u0006\u0010K\u001a\u00020\u00062\u0006\u0010L\u001a\u00020\u00062\b\u0010N\u001a\u0004\u0018\u00010MH\u0000¢\u0006\u0004\bV\u0010WJ/\u0010[\u001a\u00020-2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010X\u001a\u00020\u00042\u0010\b\u0002\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010Y¢\u0006\u0004\b[\u0010\\J1\u0010]\u001a\u00020D2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010X\u001a\u00020\u00042\u0010\b\u0002\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010YH\u0000¢\u0006\u0004\b]\u0010^J?\u0010a\u001a\u00020-2\u0006\u0010_\u001a\u00020\u00062\u0006\u0010`\u001a\u00020\u00062\b\b\u0002\u0010K\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\ba\u0010bJK\u0010d\u001a\u00020D2\u0006\u0010_\u001a\u00020\u00062\u0006\u0010`\u001a\u00020\u00062\b\u0010c\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010K\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\bd\u0010eJy\u0010k\u001a\u00020-2\u0006\u0010_\u001a\u00020\u00062\u0006\u0010`\u001a\u00020\u00062\b\u0010g\u001a\u0004\u0018\u00010f2\b\b\u0002\u0010K\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010i\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010j\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0018¢\u0006\u0004\bk\u0010lJ\u0085\u0001\u0010m\u001a\u00020D2\u0006\u0010_\u001a\u00020\u00062\u0006\u0010`\u001a\u00020\u00062\b\u0010c\u001a\u0004\u0018\u00010\u00062\b\u0010g\u001a\u0004\u0018\u00010f2\b\b\u0002\u0010K\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010i\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010j\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0018H\u0000¢\u0006\u0004\bm\u0010nJQ\u0010p\u001a\u00020-2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00060Y2\b\u0010g\u001a\u0004\u0018\u00010f2\u0006\u0010o\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0018¢\u0006\u0004\bp\u0010qJS\u0010t\u001a\u00020D2\f\u0010s\u001a\b\u0012\u0004\u0012\u00020r0Y2\b\u0010g\u001a\u0004\u0018\u00010f2\u0006\u0010o\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0018H\u0000¢\u0006\u0004\bt\u0010uJa\u0010w\u001a\u00020-2\u0006\u0010?\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u00062\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060Y2\u0006\u0010X\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010v\u001a\u00020\u00062\u0016\b\u0002\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0018¢\u0006\u0004\bw\u0010xJg\u0010y\u001a\u00020D2\u0006\u0010?\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u00062\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010Y2\u0006\u0010X\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010v\u001a\u00020\u00062\u0016\b\u0002\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0018H\u0000¢\u0006\u0004\by\u0010zJ]\u0010|\u001a\u00020-2\u0006\u0010?\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u00062\u0006\u0010`\u001a\u00020\u00062\u0006\u0010{\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0018¢\u0006\u0004\b|\u0010}Jk\u0010~\u001a\u00020D2\u0006\u0010?\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u00062\u0006\u0010`\u001a\u00020\u00062\n\b\u0002\u0010c\u001a\u0004\u0018\u00010\u00062\u0006\u0010{\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0018H\u0000¢\u0006\u0004\b~\u0010\u007fR\u001a\u0010\u0083\u0001\u001a\u00030\u0080\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001a\u0010\u0087\u0001\u001a\u00030\u0084\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001a\u0010\u008b\u0001\u001a\u00030\u0088\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0018\u00100\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001a\u0010\u0091\u0001\u001a\u00030\u008e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\"\u0010\u0096\u0001\u001a\r \u0093\u0001*\u0005\u0018\u00010\u0092\u00010\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R@\u0010\u009a\u0001\u001a+\u0012\r\u0012\u000b \u0093\u0001*\u0004\u0018\u00010\u00160\u0016 \u0093\u0001*\u0014\u0012\r\u0012\u000b \u0093\u0001*\u0004\u0018\u00010\u00160\u0016\u0018\u00010\u0097\u00010\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R!\u0010 \u0001\u001a\u00030\u009b\u00018@X\u0080\u0084\u0002¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R&\u0010¤\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020-0¡\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R,\u0010¨\u0001\u001a\u0004\u0018\u00010\u00062\t\u0010¥\u0001\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b¦\u0001\u00108\"\u0005\b§\u0001\u0010H\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006©\u0001"}, d2 = {"LDu/v;", "", "<init>", "()V", "", "groupIdInt", "", "groupId", "groupDisplayName", "page", "offset", "perPage", "sortBy", "sortOrder", "sectionName", "", "hiddenFacets", "groupsSortBy", "groupsSortOrder", "Lkotlin/Pair;", "facets", "hiddenFields", "Lio/constructor/data/model/common/VariationsMap;", "variationsMap", "", "numResultsPerSection", "resultId", "numResults", "itemId", "term", "itemIds", "ids", "", "showHiddenFacets", "groupsMaxDepth", "groupIdFilter", "preFilterExpression", "sectionFacets", "Ljava/util/ArrayList;", "C", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lio/constructor/data/model/common/VariationsMap;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/util/ArrayList;", "defaultAnalyticsTags", "analyticsTags", "I", "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "", "A0", "Landroid/content/Context;", "context", "LDu/w;", "constructorIoConfig", "H", "(Landroid/content/Context;LDu/w;)V", "G", "()I", "A", "()Ljava/lang/String;", "Lio/constructor/data/model/autocomplete/AutocompleteResponse;", "w", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Lio/constructor/data/model/common/VariationsMap;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/constructor/data/model/search/SearchResponse;", "E", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lio/constructor/data/model/common/VariationsMap;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "filterName", "filterValue", "Lio/constructor/data/model/browse/BrowseResponse;", "y", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lio/constructor/data/model/common/VariationsMap;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/reactivex/b;", "D0", "()Lio/reactivex/b;", "e0", "(Ljava/lang/String;)V", "h0", "(Ljava/lang/String;)Lio/reactivex/b;", "searchTerm", "originalQuery", "Lio/constructor/data/model/common/ResultGroup;", "resultGroup", "resultID", "K", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/constructor/data/model/common/ResultGroup;Ljava/lang/String;)V", "O", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/constructor/data/model/common/ResultGroup;Ljava/lang/String;)Lio/reactivex/b;", "w0", "(Ljava/lang/String;Ljava/lang/String;Lio/constructor/data/model/common/ResultGroup;)V", "z0", "(Ljava/lang/String;Ljava/lang/String;Lio/constructor/data/model/common/ResultGroup;)Lio/reactivex/b;", "resultCount", "", "customerIds", "s0", "(Ljava/lang/String;I[Ljava/lang/String;)V", "v0", "(Ljava/lang/String;I[Ljava/lang/String;)Lio/reactivex/b;", "itemName", "customerId", "n0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "variationId", "r0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/b;", "", "revenue", "conversionType", "isCustomType", "displayName", "Z", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;)V", "d0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/b;", "orderID", "i0", "([Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lio/constructor/data/model/purchase/PurchaseItem;", "items", "m0", "([Lio/constructor/data/model/purchase/PurchaseItem;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/b;", "url", "U", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Y", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/b;", "resultPositionOnPage", "P", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "T", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/b;", "Lio/constructor/data/DataManager;", "b", "Lio/constructor/data/DataManager;", "dataManager", "Lio/constructor/data/local/PreferencesHelper;", "c", "Lio/constructor/data/local/PreferencesHelper;", "preferenceHelper", "Lio/constructor/data/memory/ConfigMemoryHolder;", "d", "Lio/constructor/data/memory/ConfigMemoryHolder;", "configMemoryHolder", "e", "Landroid/content/Context;", "LNu/a;", "f", "LNu/a;", "disposable", "Lcom/squareup/moshi/t;", "kotlin.jvm.PlatformType", "g", "Lcom/squareup/moshi/t;", "moshi", "Lcom/squareup/moshi/h;", "h", "Lcom/squareup/moshi/h;", "jsonAdapter", "LEu/a;", "i", "Lkotlin/Lazy;", "B", "()LEu/a;", "component", "Lkotlin/Function1;", "j", "Lkotlin/jvm/functions/Function1;", "sessionIncrementHandler", "value", "getUserId", "J", "userId", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes4.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static DataManager dataManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static PreferencesHelper preferenceHelper;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static ConfigMemoryHolder configMemoryHolder;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static Context context;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final com.squareup.moshi.t moshi;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final com.squareup.moshi.h<VariationsMap> jsonAdapter;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final Lazy component;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static Function1<? super String, Unit> sessionIncrementHandler;

    /* renamed from: a, reason: collision with root package name */
    public static final v f7377a = new v();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static Nu.a disposable = new Nu.a();

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class b extends Lambda implements Function1<String, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f7388f = new b();

        b() {
            super(1);
        }

        public final void a(String it) {
            Intrinsics.j(it, "it");
            v.f7377a.A0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            a(str);
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B0() {
    }

    private final ArrayList<Pair<String, String>> C(Integer groupIdInt, String groupId, String groupDisplayName, Integer page, Integer offset, Integer perPage, String sortBy, String sortOrder, String sectionName, List<String> hiddenFacets, String groupsSortBy, String groupsSortOrder, List<? extends Pair<String, ? extends List<String>>> facets, List<String> hiddenFields, VariationsMap variationsMap, Map<String, Integer> numResultsPerSection, String resultId, Integer numResults, String itemId, String term, List<String> itemIds, List<String> ids, Boolean showHiddenFacets, Integer groupsMaxDepth, String groupIdFilter, String preFilterExpression, Map<String, ? extends List<? extends Pair<String, ? extends List<String>>>> sectionFacets) {
        List<Pair> listF;
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        if (groupIdInt != null) {
            arrayList.add(TuplesKt.a(Gu.a.f("filters[group_id]"), String.valueOf(groupIdInt.intValue())));
        }
        if (facets != null) {
            Iterator<T> it = facets.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                for (String str : (Iterable) pair.d()) {
                    String str2 = String.format("filters[%s]", Arrays.copyOf(new Object[]{pair.c()}, 1));
                    Intrinsics.i(str2, "format(this, *args)");
                    arrayList.add(TuplesKt.a(Gu.a.f(str2), Gu.a.f(str)));
                }
            }
            Unit unit = Unit.f142422a;
        }
        if (hiddenFields != null) {
            for (String str3 : hiddenFields) {
                String str4 = String.format("fmt_options[%s]", Arrays.copyOf(new Object[]{"hidden_fields"}, 1));
                Intrinsics.i(str4, "format(this, *args)");
                arrayList.add(TuplesKt.a(Gu.a.f(str4), Gu.a.f(str3)));
            }
            Unit unit2 = Unit.f142422a;
        }
        if (variationsMap != null) {
            String str5 = null;
            if (variationsMap.getFilterBy() != null) {
                String filterBy = variationsMap.getFilterBy();
                variationsMap.setFilterBy(null);
                str5 = filterBy;
            }
            String json = jsonAdapter.toJson(variationsMap);
            Intrinsics.i(json, "jsonAdapter.toJson(variationsMap)");
            String strQ = StringsKt.Q(json, "groupBy", "group_by", false, 4, null);
            if (str5 != null) {
                strQ = new Regex("\\}$").k(strQ, ",\"filter_by\":" + str5 + "}");
            }
            arrayList.add(TuplesKt.a(Gu.a.f("variations_map"), Gu.a.f(strQ)));
            variationsMap.setFilterBy(str5);
            Unit unit3 = Unit.f142422a;
        }
        if (numResultsPerSection != null) {
            for (Map.Entry<String, Integer> entry : numResultsPerSection.entrySet()) {
                arrayList.add(new Pair<>("num_results_" + ((Object) entry.getKey()), String.valueOf(entry.getValue().intValue())));
            }
            Unit unit4 = Unit.f142422a;
        }
        if (page != null) {
            arrayList.add(TuplesKt.a(Gu.a.f("page"), Gu.a.f(page.toString())));
        }
        if (offset != null) {
            arrayList.add(TuplesKt.a(Gu.a.f("offset"), Gu.a.f(offset.toString())));
        }
        if (perPage != null) {
            arrayList.add(TuplesKt.a(Gu.a.f("num_results_per_page"), Gu.a.f(perPage.toString())));
        }
        if (sortBy != null) {
            arrayList.add(TuplesKt.a(Gu.a.f("sort_by"), Gu.a.f(sortBy)));
        }
        if (sortOrder != null) {
            arrayList.add(TuplesKt.a(Gu.a.f("sort_order"), Gu.a.f(sortOrder)));
        }
        if (sectionName != null) {
            arrayList.add(TuplesKt.a(Gu.a.f("section"), Gu.a.f(sectionName.toString())));
        }
        if (hiddenFacets != null) {
            for (String str6 : hiddenFacets) {
                String str7 = String.format("fmt_options[%s]", Arrays.copyOf(new Object[]{"hidden_facets"}, 1));
                Intrinsics.i(str7, "format(this, *args)");
                arrayList.add(TuplesKt.a(Gu.a.f(str7), Gu.a.f(str6)));
            }
            Unit unit5 = Unit.f142422a;
        }
        if (showHiddenFacets != null) {
            String str8 = String.format("fmt_options[%s]", Arrays.copyOf(new Object[]{"show_hidden_facets"}, 1));
            Intrinsics.i(str8, "format(this, *args)");
            arrayList.add(TuplesKt.a(Gu.a.f(str8), Gu.a.f(showHiddenFacets.toString())));
        }
        if (groupsSortBy != null) {
            String str9 = String.format("fmt_options[%s]", Arrays.copyOf(new Object[]{"groups_sort_by"}, 1));
            Intrinsics.i(str9, "format(this, *args)");
            arrayList.add(TuplesKt.a(Gu.a.f(str9), Gu.a.f(groupsSortBy)));
        }
        if (groupsSortOrder != null) {
            String str10 = String.format("fmt_options[%s]", Arrays.copyOf(new Object[]{"groups_sort_order"}, 1));
            Intrinsics.i(str10, "format(this, *args)");
            arrayList.add(TuplesKt.a(Gu.a.f(str10), Gu.a.f(groupsSortOrder)));
        }
        if (resultId != null) {
            arrayList.add(TuplesKt.a(Gu.a.f("result_id"), Gu.a.f(resultId)));
        }
        if (groupId != null) {
            arrayList.add(TuplesKt.a(Gu.a.f("group[group_id]"), groupId));
        }
        if (groupIdFilter != null) {
            arrayList.add(TuplesKt.a(Gu.a.f("filters[group_id]"), groupIdFilter));
        }
        if (groupsMaxDepth != null) {
            int iIntValue = groupsMaxDepth.intValue();
            String str11 = String.format("fmt_options[%s]", Arrays.copyOf(new Object[]{"groups_max_depth"}, 1));
            Intrinsics.i(str11, "format(this, *args)");
            arrayList.add(TuplesKt.a(Gu.a.f(str11), Gu.a.f(String.valueOf(iIntValue))));
        }
        if (groupDisplayName != null) {
            arrayList.add(TuplesKt.a(Gu.a.f("group[display_name]"), Gu.a.f(groupDisplayName)));
        }
        if (numResults != null) {
            arrayList.add(TuplesKt.a(Gu.a.f("num_results"), Gu.a.f(numResults.toString())));
        }
        if (itemId != null) {
            arrayList.add(TuplesKt.a(Gu.a.f("item_id"), Gu.a.f(itemId.toString())));
        }
        if (term != null) {
            arrayList.add(TuplesKt.a(Gu.a.f("term"), Gu.a.f(term.toString())));
        }
        if (itemIds != null) {
            Iterator<T> it2 = itemIds.iterator();
            while (it2.hasNext()) {
                arrayList.add(TuplesKt.a(Gu.a.f("item_id"), Gu.a.f((String) it2.next())));
            }
            Unit unit6 = Unit.f142422a;
        }
        if (ids != null) {
            Iterator<T> it3 = ids.iterator();
            while (it3.hasNext()) {
                arrayList.add(TuplesKt.a(Gu.a.f("ids"), Gu.a.f((String) it3.next())));
            }
            Unit unit7 = Unit.f142422a;
        }
        if (preFilterExpression != null) {
            arrayList.add(TuplesKt.a(Gu.a.f("pre_filter_expression"), Gu.a.f(preFilterExpression)));
        }
        if (sectionFacets == null || (listF = MapsKt.F(sectionFacets)) == null) {
            return arrayList;
        }
        for (Pair pair2 : listF) {
            for (Pair pair3 : (Iterable) pair2.d()) {
                for (String str12 : (Iterable) pair3.d()) {
                    String str13 = String.format("filters[%s][%s]", Arrays.copyOf(new Object[]{pair2.c(), pair3.c()}, 2));
                    Intrinsics.i(str13, "format(this, *args)");
                    arrayList.add(TuplesKt.a(Gu.a.f(str13), Gu.a.f(str12)));
                }
            }
        }
        Unit unit8 = Unit.f142422a;
        return arrayList;
    }

    static /* synthetic */ ArrayList D(v vVar, Integer num, String str, String str2, Integer num2, Integer num3, Integer num4, String str3, String str4, String str5, List list, String str6, String str7, List list2, List list3, VariationsMap variationsMap, Map map, String str8, Integer num5, String str9, String str10, List list4, List list5, Boolean bool, Integer num6, String str11, String str12, Map map2, int i10, Object obj) {
        return vVar.C((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : num2, (i10 & 16) != 0 ? null : num3, (i10 & 32) != 0 ? null : num4, (i10 & 64) != 0 ? null : str3, (i10 & 128) != 0 ? null : str4, (i10 & 256) != 0 ? null : str5, (i10 & 512) != 0 ? null : list, (i10 & 1024) != 0 ? null : str6, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? null : str7, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : list2, (i10 & 8192) != 0 ? null : list3, (i10 & 16384) != 0 ? null : variationsMap, (i10 & 32768) != 0 ? null : map, (i10 & 65536) != 0 ? null : str8, (i10 & 131072) != 0 ? null : num5, (i10 & 262144) != 0 ? null : str9, (i10 & 524288) != 0 ? null : str10, (i10 & 1048576) != 0 ? null : list4, (i10 & 2097152) != 0 ? null : list5, (i10 & 4194304) != 0 ? null : bool, (i10 & 8388608) != 0 ? null : num6, (i10 & 16777216) != 0 ? null : str11, (i10 & 33554432) != 0 ? null : str12, (i10 & 67108864) != 0 ? null : map2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0() {
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEu/a;", "kotlin.jvm.PlatformType", "<anonymous>", "()LEu/a;"}, k = 3, mv = {1, 5, 1})
    static final class a extends Lambda implements Function0<Eu.a> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f7387f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Eu.a invoke() {
            b.a aVarD = Eu.b.d();
            Context context = v.context;
            if (context == null) {
                Intrinsics.y("context");
                context = null;
            }
            return aVarD.a(new Fu.c(context)).b();
        }
    }

    static {
        com.squareup.moshi.t tVarD = new t.a().d();
        moshi = tVarD;
        jsonAdapter = tVarD.c(VariationsMap.class);
        component = LazyKt.b(a.f7387f);
        sessionIncrementHandler = b.f7388f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C0(Throwable th2) {
        Gu.a.d(f7377a, "Session Start event error: " + th2.getMessage());
    }

    private final Map<String, String> I(Map<String, String> defaultAnalyticsTags, Map<String, String> analyticsTags) {
        return (analyticsTags == null || analyticsTags.isEmpty()) ? defaultAnalyticsTags : (defaultAnalyticsTags == null || defaultAnalyticsTags.isEmpty()) ? analyticsTags : MapsKt.u(defaultAnalyticsTags, analyticsTags);
    }

    public static /* synthetic */ void L(v vVar, String str, String str2, String str3, ResultGroup resultGroup, String str4, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            resultGroup = null;
        }
        if ((i10 & 16) != 0) {
            str4 = null;
        }
        vVar.K(str, str2, str3, resultGroup, str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(String searchTerm) {
        Intrinsics.j(searchTerm, "$searchTerm");
        Context context2 = context;
        if (context2 == null) {
            Intrinsics.y("context");
            context2 = null;
        }
        a.Companion companion = Du.a.INSTANCE;
        Gu.a.c(context2, companion.a(), TuplesKt.a(companion.d(), searchTerm));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(Throwable th2) {
        Gu.a.d(f7377a, "Autocomplete Select error: " + th2.getMessage());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void Q(v vVar, String str, String str2, String str3, int i10, String str4, String str5, Map map, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            str4 = null;
        }
        if ((i11 & 32) != 0) {
            str5 = null;
        }
        if ((i11 & 64) != 0) {
            map = null;
        }
        vVar.P(str, str2, str3, i10, str4, str5, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(Throwable th2) {
        Gu.a.d(f7377a, "Browse Result Click error: " + th2.getMessage());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void V(v vVar, String str, String str2, String[] strArr, int i10, String str3, String str4, Map map, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            str3 = null;
        }
        if ((i11 & 32) != 0) {
            str4 = "Not Available";
        }
        if ((i11 & 64) != 0) {
            map = null;
        }
        vVar.U(str, str2, strArr, i10, str3, str4, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(Throwable th2) {
        Gu.a.d(f7377a, "Browse Results Loaded error: " + th2.getMessage());
    }

    public static /* synthetic */ void a0(v vVar, String str, String str2, Double d10, String str3, String str4, String str5, Boolean bool, String str6, Map map, int i10, Object obj) {
        Map map2;
        v vVar2;
        String str7;
        String str8;
        Double d11;
        String str9 = (i10 & 8) != 0 ? "TERM_UNKNOWN" : str3;
        String str10 = (i10 & 16) != 0 ? null : str4;
        String str11 = (i10 & 32) != 0 ? null : str5;
        Boolean bool2 = (i10 & 64) != 0 ? null : bool;
        String str12 = (i10 & 128) != 0 ? null : str6;
        if ((i10 & 256) != 0) {
            map2 = null;
            str7 = str;
            str8 = str2;
            d11 = d10;
            vVar2 = vVar;
        } else {
            map2 = map;
            vVar2 = vVar;
            str7 = str;
            str8 = str2;
            d11 = d10;
        }
        vVar2.Z(str7, str8, d11, str9, str10, str11, bool2, str12, map2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(Throwable th2) {
        Gu.a.d(f7377a, "Conversion error: " + th2.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(Throwable th2) {
        Gu.a.d(f7377a, "Input Focus event error: " + th2.getMessage());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void j0(v vVar, String[] strArr, Double d10, String str, String str2, Map map, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        if ((i10 & 16) != 0) {
            map = null;
        }
        vVar.i0(strArr, d10, str, str2, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l0(Throwable th2) {
        Gu.a.d(f7377a, "Purchase error: " + th2.getMessage());
    }

    public static /* synthetic */ void o0(v vVar, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = "TERM_UNKNOWN";
        }
        vVar.n0(str, str2, str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q0(Throwable th2) {
        Gu.a.d(f7377a, "Search Result Click error: " + th2.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(Throwable th2) {
        Gu.a.d(f7377a, "Search Results Loaded error: " + th2.getMessage());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object x(v vVar, String str, List list, Integer num, List list2, VariationsMap variationsMap, Map map, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            list2 = null;
        }
        if ((i10 & 16) != 0) {
            variationsMap = null;
        }
        if ((i10 & 32) != 0) {
            map = null;
        }
        return vVar.w(str, list, num, list2, variationsMap, map, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(String searchTerm) {
        Intrinsics.j(searchTerm, "$searchTerm");
        Context context2 = context;
        if (context2 == null) {
            Intrinsics.y("context");
            context2 = null;
        }
        a.Companion companion = Du.a.INSTANCE;
        Gu.a.c(context2, companion.a(), TuplesKt.a(companion.d(), searchTerm));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y0(Throwable th2) {
        Gu.a.d(f7377a, "Search Submit error: " + th2.getMessage());
    }

    public final String A() {
        PreferencesHelper preferencesHelper = preferenceHelper;
        if (preferencesHelper == null) {
            Intrinsics.y("preferenceHelper");
            preferencesHelper = null;
        }
        return preferencesHelper.getId();
    }

    public final Eu.a B() {
        Object value = component.getValue();
        Intrinsics.i(value, "<get-component>(...)");
        return (Eu.a) value;
    }

    public final io.reactivex.b D0() {
        DataManager dataManager2 = dataManager;
        if (dataManager2 == null) {
            Intrinsics.y("dataManager");
            dataManager2 = null;
        }
        return dataManager2.trackSessionStart(new Pair[]{TuplesKt.a("action", "session_start")});
    }

    public final int G() {
        PreferencesHelper preferencesHelper = preferenceHelper;
        if (preferencesHelper == null) {
            Intrinsics.y("preferenceHelper");
            preferencesHelper = null;
        }
        return PreferencesHelper.getSessionId$default(preferencesHelper, null, false, 3, null);
    }

    public final void H(Context context2, ConstructorIoConfig constructorIoConfig) {
        Intrinsics.j(constructorIoConfig, "constructorIoConfig");
        if (context2 == null) {
            throw new IllegalStateException("context is null, please init library using ConstructorIo.with(context)");
        }
        Context applicationContext = context2.getApplicationContext();
        Intrinsics.i(applicationContext, "context.applicationContext");
        context = applicationContext;
        ConfigMemoryHolder configMemoryHolderC = B().c();
        configMemoryHolder = configMemoryHolderC;
        PreferencesHelper preferencesHelper = null;
        if (configMemoryHolderC == null) {
            Intrinsics.y("configMemoryHolder");
            configMemoryHolderC = null;
        }
        configMemoryHolderC.setAutocompleteResultCount(constructorIoConfig.b());
        ConfigMemoryHolder configMemoryHolder2 = configMemoryHolder;
        if (configMemoryHolder2 == null) {
            Intrinsics.y("configMemoryHolder");
            configMemoryHolder2 = null;
        }
        configMemoryHolder2.setTestCellParams(constructorIoConfig.j());
        ConfigMemoryHolder configMemoryHolder3 = configMemoryHolder;
        if (configMemoryHolder3 == null) {
            Intrinsics.y("configMemoryHolder");
            configMemoryHolder3 = null;
        }
        configMemoryHolder3.setSegments(constructorIoConfig.f());
        ConfigMemoryHolder configMemoryHolder4 = configMemoryHolder;
        if (configMemoryHolder4 == null) {
            Intrinsics.y("configMemoryHolder");
            configMemoryHolder4 = null;
        }
        configMemoryHolder4.setDefaultAnalyticsTags(constructorIoConfig.c());
        PreferencesHelper preferencesHelperB = B().b();
        preferenceHelper = preferencesHelperB;
        if (preferencesHelperB == null) {
            Intrinsics.y("preferenceHelper");
            preferencesHelperB = null;
        }
        preferencesHelperB.setApiKey(constructorIoConfig.getApiKey());
        PreferencesHelper preferencesHelper2 = preferenceHelper;
        if (preferencesHelper2 == null) {
            Intrinsics.y("preferenceHelper");
            preferencesHelper2 = null;
        }
        preferencesHelper2.setServiceUrl(constructorIoConfig.getServiceUrl());
        PreferencesHelper preferencesHelper3 = preferenceHelper;
        if (preferencesHelper3 == null) {
            Intrinsics.y("preferenceHelper");
            preferencesHelper3 = null;
        }
        preferencesHelper3.setQuizzesServiceUrl(constructorIoConfig.getQuizzesServiceUrl());
        PreferencesHelper preferencesHelper4 = preferenceHelper;
        if (preferencesHelper4 == null) {
            Intrinsics.y("preferenceHelper");
            preferencesHelper4 = null;
        }
        preferencesHelper4.setPort(constructorIoConfig.getServicePort());
        PreferencesHelper preferencesHelper5 = preferenceHelper;
        if (preferencesHelper5 == null) {
            Intrinsics.y("preferenceHelper");
            preferencesHelper5 = null;
        }
        preferencesHelper5.setScheme(constructorIoConfig.getServiceScheme());
        PreferencesHelper preferencesHelper6 = preferenceHelper;
        if (preferencesHelper6 == null) {
            Intrinsics.y("preferenceHelper");
            preferencesHelper6 = null;
        }
        preferencesHelper6.setDefaultItemSection(constructorIoConfig.getDefaultItemSection());
        PreferencesHelper preferencesHelper7 = preferenceHelper;
        if (preferencesHelper7 == null) {
            Intrinsics.y("preferenceHelper");
            preferencesHelper7 = null;
        }
        String id2 = preferencesHelper7.getId();
        Intrinsics.g(id2);
        if (StringsKt.r0(id2)) {
            PreferencesHelper preferencesHelper8 = preferenceHelper;
            if (preferencesHelper8 == null) {
                Intrinsics.y("preferenceHelper");
            } else {
                preferencesHelper = preferencesHelper8;
            }
            String string = UUID.randomUUID().toString();
            Intrinsics.i(string, "randomUUID().toString()");
            preferencesHelper.setId(string);
        }
        dataManager = B().a();
    }

    public final void J(String str) {
        ConfigMemoryHolder configMemoryHolder2 = configMemoryHolder;
        if (configMemoryHolder2 == null) {
            Intrinsics.y("configMemoryHolder");
            configMemoryHolder2 = null;
        }
        configMemoryHolder2.setUserId(str);
    }

    public final void K(final String searchTerm, String originalQuery, String sectionName, ResultGroup resultGroup, String resultID) {
        Intrinsics.j(searchTerm, "searchTerm");
        Intrinsics.j(originalQuery, "originalQuery");
        Intrinsics.j(sectionName, "sectionName");
        disposable.a(O(searchTerm, originalQuery, sectionName, resultGroup, resultID).i(C14764a.b()).g(new Pu.a() { // from class: Du.p
            @Override // Pu.a
            public final void run() {
                v.M(searchTerm);
            }
        }, new Pu.g() { // from class: Du.q
            @Override // Pu.g
            public final void accept(Object obj) {
                v.N((Throwable) obj);
            }
        }));
    }

    public final io.reactivex.b O(String searchTerm, String originalQuery, String sectionName, ResultGroup resultGroup, String resultID) {
        Intrinsics.j(searchTerm, "searchTerm");
        Intrinsics.j(originalQuery, "originalQuery");
        Intrinsics.j(sectionName, "sectionName");
        PreferencesHelper preferencesHelper = preferenceHelper;
        DataManager dataManager2 = null;
        if (preferencesHelper == null) {
            Intrinsics.y("preferenceHelper");
            preferencesHelper = null;
        }
        PreferencesHelper.getSessionId$default(preferencesHelper, sessionIncrementHandler, false, 2, null);
        ArrayList arrayListD = D(this, null, resultGroup == null ? null : resultGroup.getGroupId(), resultGroup == null ? null : resultGroup.getDisplayName(), null, null, null, null, null, null, null, null, null, null, null, null, null, resultID, null, null, null, null, null, null, null, null, null, null, 134152185, null);
        DataManager dataManager3 = dataManager;
        if (dataManager3 == null) {
            Intrinsics.y("dataManager");
        } else {
            dataManager2 = dataManager3;
        }
        Pair<String, String>[] pairArr = {TuplesKt.a("section", sectionName), TuplesKt.a("original_query", originalQuery), TuplesKt.a("tr", "click")};
        Object[] array = arrayListD.toArray(new Pair[0]);
        if (array != null) {
            return dataManager2.trackAutocompleteSelect(searchTerm, pairArr, (Pair[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public final void P(String filterName, String filterValue, String customerId, int resultPositionOnPage, String sectionName, String resultID, Map<String, String> analyticsTags) {
        Intrinsics.j(filterName, "filterName");
        Intrinsics.j(filterValue, "filterValue");
        Intrinsics.j(customerId, "customerId");
        disposable.a(T(filterName, filterValue, customerId, null, resultPositionOnPage, sectionName, resultID, analyticsTags).i(C14764a.b()).g(new Pu.a() { // from class: Du.r
            @Override // Pu.a
            public final void run() {
                v.R();
            }
        }, new Pu.g() { // from class: Du.s
            @Override // Pu.g
            public final void accept(Object obj) {
                v.S((Throwable) obj);
            }
        }));
    }

    public final io.reactivex.b T(String filterName, String filterValue, String customerId, String variationId, int resultPositionOnPage, String sectionName, String resultID, Map<String, String> analyticsTags) {
        String defaultItemSection;
        Intrinsics.j(filterName, "filterName");
        Intrinsics.j(filterValue, "filterValue");
        Intrinsics.j(customerId, "customerId");
        PreferencesHelper preferencesHelper = preferenceHelper;
        if (preferencesHelper == null) {
            Intrinsics.y("preferenceHelper");
            preferencesHelper = null;
        }
        PreferencesHelper.getSessionId$default(preferencesHelper, sessionIncrementHandler, false, 2, null);
        if (sectionName == null) {
            PreferencesHelper preferencesHelper2 = preferenceHelper;
            if (preferencesHelper2 == null) {
                Intrinsics.y("preferenceHelper");
                preferencesHelper2 = null;
            }
            defaultItemSection = preferencesHelper2.getDefaultItemSection();
        } else {
            defaultItemSection = sectionName;
        }
        PreferencesHelper preferencesHelper3 = preferenceHelper;
        if (preferencesHelper3 == null) {
            Intrinsics.y("preferenceHelper");
            preferencesHelper3 = null;
        }
        String id2 = preferencesHelper3.getId();
        PreferencesHelper preferencesHelper4 = preferenceHelper;
        if (preferencesHelper4 == null) {
            Intrinsics.y("preferenceHelper");
            preferencesHelper4 = null;
        }
        int sessionId$default = PreferencesHelper.getSessionId$default(preferencesHelper4, null, false, 3, null);
        PreferencesHelper preferencesHelper5 = preferenceHelper;
        if (preferencesHelper5 == null) {
            Intrinsics.y("preferenceHelper");
            preferencesHelper5 = null;
        }
        String apiKey = preferencesHelper5.getApiKey();
        ConfigMemoryHolder configMemoryHolder2 = configMemoryHolder;
        if (configMemoryHolder2 == null) {
            Intrinsics.y("configMemoryHolder");
            configMemoryHolder2 = null;
        }
        String userId = configMemoryHolder2.getUserId();
        ConfigMemoryHolder configMemoryHolder3 = configMemoryHolder;
        if (configMemoryHolder3 == null) {
            Intrinsics.y("configMemoryHolder");
            configMemoryHolder3 = null;
        }
        List<String> segments = configMemoryHolder3.getSegments();
        ConfigMemoryHolder configMemoryHolder4 = configMemoryHolder;
        if (configMemoryHolder4 == null) {
            Intrinsics.y("configMemoryHolder");
            configMemoryHolder4 = null;
        }
        BrowseResultClickRequestBody browseResultClickRequestBody = new BrowseResultClickRequestBody(filterName, filterValue, customerId, variationId, resultPositionOnPage, BuildConfig.CLIENT_VERSION, id2, sessionId$default, apiKey, userId, segments, I(configMemoryHolder4.getDefaultAnalyticsTags(), analyticsTags), Boolean.TRUE, defaultItemSection, Long.valueOf(System.currentTimeMillis()), resultID);
        DataManager dataManager2 = dataManager;
        if (dataManager2 == null) {
            Intrinsics.y("dataManager");
            dataManager2 = null;
        }
        return DataManager.trackBrowseResultClick$default(dataManager2, browseResultClickRequestBody, new Pair[]{TuplesKt.a("section", defaultItemSection)}, null, 4, null);
    }

    public final void U(String filterName, String filterValue, String[] itemIds, int resultCount, String sectionName, String url, Map<String, String> analyticsTags) {
        Intrinsics.j(filterName, "filterName");
        Intrinsics.j(filterValue, "filterValue");
        Intrinsics.j(itemIds, "itemIds");
        Intrinsics.j(url, "url");
        disposable.a(Y(filterName, filterValue, itemIds, resultCount, sectionName, url, analyticsTags).i(C14764a.b()).g(new Pu.a() { // from class: Du.i
            @Override // Pu.a
            public final void run() {
                v.W();
            }
        }, new Pu.g() { // from class: Du.j
            @Override // Pu.g
            public final void accept(Object obj) {
                v.X((Throwable) obj);
            }
        }));
    }

    public final io.reactivex.b Y(String filterName, String filterValue, String[] itemIds, int resultCount, String sectionName, String url, Map<String, String> analyticsTags) {
        String defaultItemSection;
        ArrayList arrayList;
        Intrinsics.j(filterName, "filterName");
        Intrinsics.j(filterValue, "filterValue");
        Intrinsics.j(url, "url");
        PreferencesHelper preferencesHelper = preferenceHelper;
        if (preferencesHelper == null) {
            Intrinsics.y("preferenceHelper");
            preferencesHelper = null;
        }
        PreferencesHelper.getSessionId$default(preferencesHelper, sessionIncrementHandler, false, 2, null);
        if (sectionName == null) {
            PreferencesHelper preferencesHelper2 = preferenceHelper;
            if (preferencesHelper2 == null) {
                Intrinsics.y("preferenceHelper");
                preferencesHelper2 = null;
            }
            defaultItemSection = preferencesHelper2.getDefaultItemSection();
        } else {
            defaultItemSection = sectionName;
        }
        if (itemIds == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(itemIds.length);
            int length = itemIds.length;
            int i10 = 0;
            while (i10 < length) {
                String str = itemIds[i10];
                i10++;
                arrayList.add(new TrackingItem(str, null));
            }
        }
        PreferencesHelper preferencesHelper3 = preferenceHelper;
        if (preferencesHelper3 == null) {
            Intrinsics.y("preferenceHelper");
            preferencesHelper3 = null;
        }
        String id2 = preferencesHelper3.getId();
        PreferencesHelper preferencesHelper4 = preferenceHelper;
        if (preferencesHelper4 == null) {
            Intrinsics.y("preferenceHelper");
            preferencesHelper4 = null;
        }
        int sessionId$default = PreferencesHelper.getSessionId$default(preferencesHelper4, null, false, 3, null);
        PreferencesHelper preferencesHelper5 = preferenceHelper;
        if (preferencesHelper5 == null) {
            Intrinsics.y("preferenceHelper");
            preferencesHelper5 = null;
        }
        String apiKey = preferencesHelper5.getApiKey();
        ConfigMemoryHolder configMemoryHolder2 = configMemoryHolder;
        if (configMemoryHolder2 == null) {
            Intrinsics.y("configMemoryHolder");
            configMemoryHolder2 = null;
        }
        String userId = configMemoryHolder2.getUserId();
        ConfigMemoryHolder configMemoryHolder3 = configMemoryHolder;
        if (configMemoryHolder3 == null) {
            Intrinsics.y("configMemoryHolder");
            configMemoryHolder3 = null;
        }
        List<String> segments = configMemoryHolder3.getSegments();
        ConfigMemoryHolder configMemoryHolder4 = configMemoryHolder;
        if (configMemoryHolder4 == null) {
            Intrinsics.y("configMemoryHolder");
            configMemoryHolder4 = null;
        }
        BrowseResultLoadRequestBody browseResultLoadRequestBody = new BrowseResultLoadRequestBody(filterName, filterValue, arrayList, resultCount, url, BuildConfig.CLIENT_VERSION, id2, sessionId$default, apiKey, userId, segments, I(configMemoryHolder4.getDefaultAnalyticsTags(), analyticsTags), Boolean.TRUE, defaultItemSection, Long.valueOf(System.currentTimeMillis()));
        DataManager dataManager2 = dataManager;
        if (dataManager2 == null) {
            Intrinsics.y("dataManager");
            dataManager2 = null;
        }
        return dataManager2.trackBrowseResultsLoaded(browseResultLoadRequestBody, new Pair[0]);
    }

    public final void Z(String itemName, String customerId, Double revenue, String searchTerm, String sectionName, String conversionType, Boolean isCustomType, String displayName, Map<String, String> analyticsTags) {
        Intrinsics.j(itemName, "itemName");
        Intrinsics.j(customerId, "customerId");
        Intrinsics.j(searchTerm, "searchTerm");
        disposable.a(d0(itemName, customerId, null, revenue, searchTerm, sectionName, conversionType, isCustomType, displayName, analyticsTags).i(C14764a.b()).g(new Pu.a() { // from class: Du.t
            @Override // Pu.a
            public final void run() {
                v.b0();
            }
        }, new Pu.g() { // from class: Du.u
            @Override // Pu.g
            public final void accept(Object obj) {
                v.c0((Throwable) obj);
            }
        }));
    }

    public final io.reactivex.b d0(String itemName, String customerId, String variationId, Double revenue, String searchTerm, String sectionName, String conversionType, Boolean isCustomType, String displayName, Map<String, String> analyticsTags) {
        String defaultItemSection;
        Intrinsics.j(itemName, "itemName");
        Intrinsics.j(customerId, "customerId");
        Intrinsics.j(searchTerm, "searchTerm");
        PreferencesHelper preferencesHelper = preferenceHelper;
        if (preferencesHelper == null) {
            Intrinsics.y("preferenceHelper");
            preferencesHelper = null;
        }
        PreferencesHelper.getSessionId$default(preferencesHelper, sessionIncrementHandler, false, 2, null);
        if (sectionName == null) {
            PreferencesHelper preferencesHelper2 = preferenceHelper;
            if (preferencesHelper2 == null) {
                Intrinsics.y("preferenceHelper");
                preferencesHelper2 = null;
            }
            defaultItemSection = preferencesHelper2.getDefaultItemSection();
        } else {
            defaultItemSection = sectionName;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.f142841a;
        String str = String.format("%.2f", Arrays.copyOf(new Object[]{revenue}, 1));
        Intrinsics.i(str, "format(format, *args)");
        PreferencesHelper preferencesHelper3 = preferenceHelper;
        if (preferencesHelper3 == null) {
            Intrinsics.y("preferenceHelper");
            preferencesHelper3 = null;
        }
        String id2 = preferencesHelper3.getId();
        PreferencesHelper preferencesHelper4 = preferenceHelper;
        if (preferencesHelper4 == null) {
            Intrinsics.y("preferenceHelper");
            preferencesHelper4 = null;
        }
        int sessionId$default = PreferencesHelper.getSessionId$default(preferencesHelper4, null, false, 3, null);
        PreferencesHelper preferencesHelper5 = preferenceHelper;
        if (preferencesHelper5 == null) {
            Intrinsics.y("preferenceHelper");
            preferencesHelper5 = null;
        }
        String apiKey = preferencesHelper5.getApiKey();
        ConfigMemoryHolder configMemoryHolder2 = configMemoryHolder;
        if (configMemoryHolder2 == null) {
            Intrinsics.y("configMemoryHolder");
            configMemoryHolder2 = null;
        }
        String userId = configMemoryHolder2.getUserId();
        ConfigMemoryHolder configMemoryHolder3 = configMemoryHolder;
        if (configMemoryHolder3 == null) {
            Intrinsics.y("configMemoryHolder");
            configMemoryHolder3 = null;
        }
        List<String> segments = configMemoryHolder3.getSegments();
        ConfigMemoryHolder configMemoryHolder4 = configMemoryHolder;
        if (configMemoryHolder4 == null) {
            Intrinsics.y("configMemoryHolder");
            configMemoryHolder4 = null;
        }
        ConversionRequestBody conversionRequestBody = new ConversionRequestBody(searchTerm, customerId, variationId, itemName, str, conversionType, isCustomType, displayName, BuildConfig.CLIENT_VERSION, id2, sessionId$default, apiKey, userId, segments, I(configMemoryHolder4.getDefaultAnalyticsTags(), analyticsTags), Boolean.TRUE, defaultItemSection, Long.valueOf(System.currentTimeMillis()));
        DataManager dataManager2 = dataManager;
        if (dataManager2 == null) {
            Intrinsics.y("dataManager");
            dataManager2 = null;
        }
        return dataManager2.trackConversion(conversionRequestBody, new Pair[0]);
    }

    public final io.reactivex.b h0(String term) {
        PreferencesHelper preferencesHelper = preferenceHelper;
        DataManager dataManager2 = null;
        if (preferencesHelper == null) {
            Intrinsics.y("preferenceHelper");
            preferencesHelper = null;
        }
        PreferencesHelper.getSessionId$default(preferencesHelper, sessionIncrementHandler, false, 2, null);
        DataManager dataManager3 = dataManager;
        if (dataManager3 == null) {
            Intrinsics.y("dataManager");
        } else {
            dataManager2 = dataManager3;
        }
        return dataManager2.trackInputFocus(term, new Pair[]{TuplesKt.a("action", "focus")});
    }

    public final void i0(String[] customerIds, Double revenue, String orderID, String sectionName, Map<String, String> analyticsTags) {
        Intrinsics.j(customerIds, "customerIds");
        Intrinsics.j(orderID, "orderID");
        ArrayList arrayList = new ArrayList(customerIds.length);
        int length = customerIds.length;
        int i10 = 0;
        while (i10 < length) {
            String str = customerIds[i10];
            i10++;
            arrayList.add(new PurchaseItem(str, null, 0, 6, null));
        }
        Object[] array = arrayList.toArray(new PurchaseItem[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        disposable.a(m0((PurchaseItem[]) array, revenue, orderID, sectionName, analyticsTags).i(C14764a.b()).g(new Pu.a() { // from class: Du.g
            @Override // Pu.a
            public final void run() {
                v.k0();
            }
        }, new Pu.g() { // from class: Du.h
            @Override // Pu.g
            public final void accept(Object obj) {
                v.l0((Throwable) obj);
            }
        }));
    }

    public final io.reactivex.b m0(PurchaseItem[] items, Double revenue, String orderID, String sectionName, Map<String, String> analyticsTags) {
        String defaultItemSection;
        Intrinsics.j(items, "items");
        Intrinsics.j(orderID, "orderID");
        ArrayList arrayList = new ArrayList();
        int length = items.length;
        int i10 = 0;
        while (i10 < length) {
            PurchaseItem purchaseItem = items[i10];
            i10++;
            int quantity = purchaseItem.getQuantity();
            int i11 = 0;
            while (i11 < quantity) {
                i11++;
                arrayList.add(purchaseItem);
            }
        }
        PreferencesHelper preferencesHelper = preferenceHelper;
        if (preferencesHelper == null) {
            Intrinsics.y("preferenceHelper");
            preferencesHelper = null;
        }
        PreferencesHelper.getSessionId$default(preferencesHelper, sessionIncrementHandler, false, 2, null);
        if (sectionName == null) {
            PreferencesHelper preferencesHelper2 = preferenceHelper;
            if (preferencesHelper2 == null) {
                Intrinsics.y("preferenceHelper");
                preferencesHelper2 = null;
            }
            defaultItemSection = preferencesHelper2.getDefaultItemSection();
        } else {
            defaultItemSection = sectionName;
        }
        List listS = CollectionsKt.s(TuplesKt.a("section", defaultItemSection));
        PreferencesHelper preferencesHelper3 = preferenceHelper;
        if (preferencesHelper3 == null) {
            Intrinsics.y("preferenceHelper");
            preferencesHelper3 = null;
        }
        String id2 = preferencesHelper3.getId();
        PreferencesHelper preferencesHelper4 = preferenceHelper;
        if (preferencesHelper4 == null) {
            Intrinsics.y("preferenceHelper");
            preferencesHelper4 = null;
        }
        Integer numValueOf = Integer.valueOf(PreferencesHelper.getSessionId$default(preferencesHelper4, null, false, 3, null));
        ConfigMemoryHolder configMemoryHolder2 = configMemoryHolder;
        if (configMemoryHolder2 == null) {
            Intrinsics.y("configMemoryHolder");
            configMemoryHolder2 = null;
        }
        String userId = configMemoryHolder2.getUserId();
        ConfigMemoryHolder configMemoryHolder3 = configMemoryHolder;
        if (configMemoryHolder3 == null) {
            Intrinsics.y("configMemoryHolder");
            configMemoryHolder3 = null;
        }
        List<String> segments = configMemoryHolder3.getSegments();
        ConfigMemoryHolder configMemoryHolder4 = configMemoryHolder;
        if (configMemoryHolder4 == null) {
            Intrinsics.y("configMemoryHolder");
            configMemoryHolder4 = null;
        }
        Map<String, String> mapI = I(configMemoryHolder4.getDefaultAnalyticsTags(), analyticsTags);
        PreferencesHelper preferencesHelper5 = preferenceHelper;
        if (preferencesHelper5 == null) {
            Intrinsics.y("preferenceHelper");
            preferencesHelper5 = null;
        }
        DataManager dataManager2 = null;
        PurchaseRequestBody purchaseRequestBody = new PurchaseRequestBody(arrayList, orderID, revenue, BuildConfig.CLIENT_VERSION, id2, numValueOf, userId, segments, mapI, preferencesHelper5.getApiKey(), Boolean.TRUE, Long.valueOf(System.currentTimeMillis()));
        DataManager dataManager3 = dataManager;
        if (dataManager3 == null) {
            Intrinsics.y("dataManager");
        } else {
            dataManager2 = dataManager3;
        }
        Object[] array = listS.toArray(new Pair[0]);
        if (array != null) {
            return dataManager2.trackPurchase(purchaseRequestBody, (Pair[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public final void n0(String itemName, String customerId, String searchTerm, String sectionName, String resultID) {
        Intrinsics.j(itemName, "itemName");
        Intrinsics.j(customerId, "customerId");
        Intrinsics.j(searchTerm, "searchTerm");
        disposable.a(r0(itemName, customerId, null, searchTerm, sectionName, resultID).i(C14764a.b()).g(new Pu.a() { // from class: Du.e
            @Override // Pu.a
            public final void run() {
                v.p0();
            }
        }, new Pu.g() { // from class: Du.f
            @Override // Pu.g
            public final void accept(Object obj) {
                v.q0((Throwable) obj);
            }
        }));
    }

    public final io.reactivex.b r0(String itemName, String customerId, String variationId, String searchTerm, String sectionName, String resultID) {
        String defaultItemSection;
        Intrinsics.j(itemName, "itemName");
        Intrinsics.j(customerId, "customerId");
        Intrinsics.j(searchTerm, "searchTerm");
        PreferencesHelper preferencesHelper = preferenceHelper;
        DataManager dataManager2 = null;
        if (preferencesHelper == null) {
            Intrinsics.y("preferenceHelper");
            preferencesHelper = null;
        }
        PreferencesHelper.getSessionId$default(preferencesHelper, sessionIncrementHandler, false, 2, null);
        ArrayList arrayListD = D(this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, resultID, null, null, null, null, null, null, null, null, null, null, 134152191, null);
        if (sectionName == null) {
            PreferencesHelper preferencesHelper2 = preferenceHelper;
            if (preferencesHelper2 == null) {
                Intrinsics.y("preferenceHelper");
                preferencesHelper2 = null;
            }
            defaultItemSection = preferencesHelper2.getDefaultItemSection();
        } else {
            defaultItemSection = sectionName;
        }
        DataManager dataManager3 = dataManager;
        if (dataManager3 == null) {
            Intrinsics.y("dataManager");
        } else {
            dataManager2 = dataManager3;
        }
        Pair<String, String>[] pairArr = {TuplesKt.a("section", defaultItemSection)};
        Object[] array = arrayListD.toArray(new Pair[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        return dataManager2.trackSearchResultClick(itemName, customerId, variationId, searchTerm, pairArr, (Pair[]) array);
    }

    public final void s0(String term, int resultCount, String[] customerIds) {
        Intrinsics.j(term, "term");
        disposable.a(v0(term, resultCount, customerIds).i(C14764a.b()).g(new Pu.a() { // from class: Du.k
            @Override // Pu.a
            public final void run() {
                v.t0();
            }
        }, new Pu.g() { // from class: Du.l
            @Override // Pu.g
            public final void accept(Object obj) {
                v.u0((Throwable) obj);
            }
        }));
    }

    public final io.reactivex.b v0(String term, int resultCount, String[] customerIds) {
        Intrinsics.j(term, "term");
        PreferencesHelper preferencesHelper = preferenceHelper;
        DataManager dataManager2 = null;
        if (preferencesHelper == null) {
            Intrinsics.y("preferenceHelper");
            preferencesHelper = null;
        }
        PreferencesHelper.getSessionId$default(preferencesHelper, sessionIncrementHandler, false, 2, null);
        DataManager dataManager3 = dataManager;
        if (dataManager3 == null) {
            Intrinsics.y("dataManager");
        } else {
            dataManager2 = dataManager3;
        }
        return dataManager2.trackSearchResultsLoaded(term, resultCount, customerIds, new Pair[]{TuplesKt.a("action", "search-results")});
    }

    public final void w0(final String searchTerm, String originalQuery, ResultGroup resultGroup) {
        Intrinsics.j(searchTerm, "searchTerm");
        Intrinsics.j(originalQuery, "originalQuery");
        disposable.a(z0(searchTerm, originalQuery, resultGroup).i(C14764a.b()).g(new Pu.a() { // from class: Du.b
            @Override // Pu.a
            public final void run() {
                v.x0(searchTerm);
            }
        }, new Pu.g() { // from class: Du.m
            @Override // Pu.g
            public final void accept(Object obj) {
                v.y0((Throwable) obj);
            }
        }));
    }

    public final io.reactivex.b z0(String searchTerm, String originalQuery, ResultGroup resultGroup) {
        Intrinsics.j(searchTerm, "searchTerm");
        Intrinsics.j(originalQuery, "originalQuery");
        PreferencesHelper preferencesHelper = preferenceHelper;
        DataManager dataManager2 = null;
        if (preferencesHelper == null) {
            Intrinsics.y("preferenceHelper");
            preferencesHelper = null;
        }
        PreferencesHelper.getSessionId$default(preferencesHelper, sessionIncrementHandler, false, 2, null);
        ArrayList arrayListD = D(this, null, resultGroup == null ? null : resultGroup.getGroupId(), resultGroup == null ? null : resultGroup.getDisplayName(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134217721, null);
        DataManager dataManager3 = dataManager;
        if (dataManager3 == null) {
            Intrinsics.y("dataManager");
        } else {
            dataManager2 = dataManager3;
        }
        Pair<String, String>[] pairArr = {TuplesKt.a("original_query", originalQuery), TuplesKt.a("tr", "search")};
        Object[] array = arrayListD.toArray(new Pair[0]);
        if (array != null) {
            return dataManager2.trackSearchSubmit(searchTerm, pairArr, (Pair[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    private v() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A0() {
        disposable.a(D0().i(C14764a.b()).g(new Pu.a() { // from class: Du.n
            @Override // Pu.a
            public final void run() {
                v.B0();
            }
        }, new Pu.g() { // from class: Du.o
            @Override // Pu.g
            public final void accept(Object obj) {
                v.C0((Throwable) obj);
            }
        }));
    }

    public final Object E(String str, List<? extends Pair<String, ? extends List<String>>> list, Integer num, Integer num2, Integer num3, String str2, String str3, String str4, List<String> list2, List<String> list3, String str5, String str6, VariationsMap variationsMap, String str7, Continuation<? super SearchResponse> continuation) throws UnsupportedEncodingException {
        ArrayList arrayListD = D(this, num3, null, null, num, null, num2, str2, str3, str4, list3, str5, str6, list, list2, variationsMap, null, null, null, null, null, null, null, null, null, null, str7, null, 100630550, null);
        DataManager dataManager2 = dataManager;
        if (dataManager2 == null) {
            Intrinsics.y("dataManager");
            dataManager2 = null;
        }
        String strF = Gu.a.f(str);
        Object[] array = arrayListD.toArray(new Pair[0]);
        if (array != null) {
            return dataManager2.getSearchResultsCRT(strF, (Pair[]) array, continuation);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public final void e0(String term) {
        disposable.a(h0(term).i(C14764a.b()).g(new Pu.a() { // from class: Du.c
            @Override // Pu.a
            public final void run() {
                v.f0();
            }
        }, new Pu.g() { // from class: Du.d
            @Override // Pu.g
            public final void accept(Object obj) {
                v.g0((Throwable) obj);
            }
        }));
    }

    public final Object w(String str, List<? extends Pair<String, ? extends List<String>>> list, Integer num, List<String> list2, VariationsMap variationsMap, Map<String, ? extends List<? extends Pair<String, ? extends List<String>>>> map, Continuation<? super AutocompleteResponse> continuation) throws UnsupportedEncodingException {
        Set<Map.Entry<String, Integer>> setEntrySet;
        ArrayList arrayListD = D(this, num, null, null, null, null, null, null, null, null, null, null, null, list, list2, variationsMap, null, null, null, null, null, null, null, null, null, null, null, map, 67080190, null);
        ConfigMemoryHolder configMemoryHolder2 = configMemoryHolder;
        DataManager dataManager2 = null;
        if (configMemoryHolder2 == null) {
            Intrinsics.y("configMemoryHolder");
            configMemoryHolder2 = null;
        }
        Map<String, Integer> autocompleteResultCount = configMemoryHolder2.getAutocompleteResultCount();
        if (autocompleteResultCount != null && (setEntrySet = autocompleteResultCount.entrySet()) != null) {
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                arrayListD.add(new Pair("num_results_" + entry.getKey(), String.valueOf(((Number) entry.getValue()).intValue())));
            }
        }
        DataManager dataManager3 = dataManager;
        if (dataManager3 == null) {
            Intrinsics.y("dataManager");
        } else {
            dataManager2 = dataManager3;
        }
        String strF = Gu.a.f(str);
        Object[] array = arrayListD.toArray(new Pair[0]);
        if (array != null) {
            return dataManager2.getAutocompleteResultsCRT(strF, (Pair[]) array, continuation);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public final Object y(String str, String str2, List<? extends Pair<String, ? extends List<String>>> list, Integer num, Integer num2, Integer num3, String str3, String str4, String str5, List<String> list2, List<String> list3, String str6, String str7, VariationsMap variationsMap, String str8, Continuation<? super BrowseResponse> continuation) {
        ArrayList arrayListD = D(this, num3, null, null, num, null, num2, str3, str4, str5, list3, str6, str7, list, list2, variationsMap, null, null, null, null, null, null, null, null, null, null, str8, null, 100630550, null);
        DataManager dataManager2 = dataManager;
        if (dataManager2 == null) {
            Intrinsics.y("dataManager");
            dataManager2 = null;
        }
        Object[] array = arrayListD.toArray(new Pair[0]);
        if (array != null) {
            return dataManager2.getBrowseResultsCRT(str, str2, (Pair[]) array, continuation);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}
