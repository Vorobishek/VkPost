package domain;

import java.util.Date;

public class VKpost {

    private int postID;
    private int postOwnerId;
    private Date postDate;
    private String postName;
    private String postText;
    private String imageUrl;
    private String imageLogoUrl;

 //objects
    private ThreeDotsInfo threeDotsInfo;
    private ViewsInfo viewsInfo;
    private Geo geo;
    private CommentsInfo commentsInfo;
    private CopyRigth copyRigth;
    private RepostsInfo repostsInfo;
    private LikesInfo likesInfo;

// add from documentation
    private int fromId;
    private int createdBy;
    private int replyOwnerId;
    private int replyPostId;
    private boolean friendsOnly;
    private String postType;
    private int signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPined;
    private boolean markedAsAds;
    private boolean isFavorite;
    private int posponedId;
}
