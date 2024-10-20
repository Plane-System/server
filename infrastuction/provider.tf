# Bucket to store the website

resource "google_storage_bucket" "website"{
  name     = "example-website-by-rishab"
  location = ""
}