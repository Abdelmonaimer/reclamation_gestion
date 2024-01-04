package com.pfa.springjwt.models;

import jakarta.persistence.*;

@Entity
@Table(name = "reclamation")
public class Reclamation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String motif;
    private boolean criticite;
    private String commentaire;
    private String motifMgr;
    private String status;
    @ManyToOne
    private PieceJointe pieceJointe;
    @OneToOne
    private Services service;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public boolean isCriticite() {
        return criticite;
    }

    public void setCriticite(boolean criticite) {
        this.criticite = criticite;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public PieceJointe getPieceJointe() {
        return pieceJointe;
    }

    public void setPieceJointe(PieceJointe pieceJointe) {
        this.pieceJointe = pieceJointe;
    }

    public Services getService() {
        return service;
    }

    public void setService(Services service) {
        this.service = service;
    }

    public String getMotifMgr() {
        return motifMgr;
    }

    public void setMotifMgr(String motifMgr) {
        this.motifMgr = motifMgr;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Reclamation(Long id, String motif, boolean criticite, String commentaire, String status, PieceJointe pieceJointe,
                       Services service) {
		this.id = id;
		this.motif = motif;
		this.criticite = criticite;
		this.commentaire = commentaire;
        this.status = status;
		this.pieceJointe = pieceJointe;
		this.service = service;
	}

	public Reclamation() {
	}
    
    
}
