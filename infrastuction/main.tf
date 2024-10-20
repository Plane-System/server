terraform {
  required_providers {
    google = {
      source  = "hashicorp/google"
      version = "5.34.0"
    }
  }
}
#GCP Provider
provider "google" {
  credentials = file(var.gcp_svc_key)
  project = var.gcp_project_id
  region = var.gcp_region
}