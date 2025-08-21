package com.bazaarvoice.bvandroidsdk;

import java.util.List;
import og.InterfaceC16127c;

/* loaded from: classes4.dex */
public class CurationsFeedItem {
    protected String _platform;
    protected CurationsAuthor author;
    protected String channel;
    protected String classification;

    @InterfaceC16127c("coordinates")
    protected CurationsCoordinate coordinate;
    protected String explicit_permission_status;
    String externalIdInQuery;
    protected List<String> featured_groups;
    protected List<String> groups;

    /* renamed from: id, reason: collision with root package name */
    protected String f63844id;
    boolean impressed;
    protected String language;
    protected List<CurationsLink> links;
    protected String permalink;
    protected List<CurationsPhoto> photos;
    protected String place;
    protected Integer praises;
    protected String product_id;
    protected List<CurationsProduct> products;
    protected String rating;
    protected CurationsAuthor reply_to;
    protected String sourceClient;
    protected List<String> tags;
    protected String teaser;
    protected String text;
    protected Long timestamp;
    protected String token;
    protected List<CurationsVideo> videos;

    public CurationsAuthor getAuthor() {
        return this.author;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getClassification() {
        return this.classification;
    }

    public CurationsCoordinate getCoordinate() {
        return this.coordinate;
    }

    public String getExplicitPermissionStatus() {
        return this.explicit_permission_status;
    }

    String getExternalIdInQuery() {
        return this.externalIdInQuery;
    }

    public List<String> getFeaturedGroups() {
        return this.featured_groups;
    }

    public List<String> getGroups() {
        return this.groups;
    }

    public String getId() {
        return this.f63844id;
    }

    public String getLanguage() {
        return this.language;
    }

    public List<CurationsLink> getLinks() {
        return this.links;
    }

    public String getPermalink() {
        return this.permalink;
    }

    public List<CurationsPhoto> getPhotos() {
        return this.photos;
    }

    public String getPlace() {
        return this.place;
    }

    public String getPlatform() {
        return this._platform;
    }

    public Integer getPraises() {
        return this.praises;
    }

    public String getProductId() {
        return this.product_id;
    }

    public List<CurationsProduct> getProducts() {
        return this.products;
    }

    public String getRating() {
        return this.rating;
    }

    public CurationsAuthor getReplyTo() {
        return this.reply_to;
    }

    public String getSourceClient() {
        return this.sourceClient;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public String getTeaser() {
        return this.teaser;
    }

    public String getText() {
        return this.text;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getToken() {
        return this.token;
    }

    public List<CurationsVideo> getVideos() {
        return this.videos;
    }

    protected void setProducts(List<CurationsProduct> list) {
        this.products = list;
    }
}
